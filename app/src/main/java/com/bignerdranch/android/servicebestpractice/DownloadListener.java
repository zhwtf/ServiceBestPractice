package com.bignerdranch.android.servicebestpractice;

/**
 * Created by zhenghao on 2017-11-26.
 */

public interface DownloadListener {
    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();
}
