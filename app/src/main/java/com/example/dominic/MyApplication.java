package com.example.dominic;

import android.app.Application;
import android.content.Context;

/**
 * Created by Dominic on 2017/4/15.
 */

public class MyApplication extends Application{

    private static MyApplication sContext;

    public static Context getApplication() {
        return sContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this;
    }
}
