package com.semantic.ecare_android_v2.ui;



import com.semantic.ecare_android_v2.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ServerExceptActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serverexept);
				
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		getMenuInflater().inflate(R.menu.rafraichir_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		switch (item.getItemId()){
		case R.id.menu_rafraichir:
			Intent ig = new Intent(getApplicationContext(), SplashScreen.class);
			startActivity(ig);
			finish();
		}
		return super.onOptionsItemSelected(item);
	}
	
	
}
