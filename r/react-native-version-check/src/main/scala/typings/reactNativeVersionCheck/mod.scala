package typings.reactNativeVersionCheck

import typings.reactNativeVersionCheck.anon.AppID
import typings.reactNativeVersionCheck.anon.CurrentVersion
import typings.reactNativeVersionCheck.anon.FetchOptions
import typings.reactNativeVersionCheck.anon.IgnoreErrors
import typings.reactNativeVersionCheck.anon.IsNeeded
import typings.reactNativeVersionCheck.anon.PackageName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-version-check", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns url of App Store of app.
      */
    @scala.inline
    def getAppStoreUrl(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppStoreUrl")().asInstanceOf[js.Promise[String]]
    @scala.inline
    def getAppStoreUrl(option: IgnoreErrors): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppStoreUrl")(option.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    /**
      * Returns device's country code of 2 characters.
      */
    @scala.inline
    def getCountry(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountry")().asInstanceOf[js.Promise[String]]
    
    /**
      * Returns current app build number.
      */
    @scala.inline
    def getCurrentBuildNumber(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentBuildNumber")().asInstanceOf[Double]
    
    /**
      * Returns current app version.
      */
    @scala.inline
    def getCurrentVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentVersion")().asInstanceOf[String]
    
    /**
      * Returns the latest app version parsed from url. Returns null when parsing error occurs.
      */
    @scala.inline
    def getLatestVersion(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLatestVersion")().asInstanceOf[js.Promise[String]]
    @scala.inline
    def getLatestVersion(option: FetchOptions): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLatestVersion")(option.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    /**
      * Returns package name of app.
      */
    @scala.inline
    def getPackageName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageName")().asInstanceOf[String]
    
    /**
      * Returns url of Play Store of app.
      */
    @scala.inline
    def getPlayStoreUrl(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlayStoreUrl")().asInstanceOf[js.Promise[String]]
    @scala.inline
    def getPlayStoreUrl(option: PackageName): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlayStoreUrl")(option.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    /**
      * Returns url of Play Market or App Store of app.
      */
    @scala.inline
    def getStoreUrl(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStoreUrl")().asInstanceOf[js.Promise[String]]
    @scala.inline
    def getStoreUrl(option: AppID): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStoreUrl")(option.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    /**
      * Returns an object contains with boolean value whether update needed, current version and latest version.
      * Current and the latest app versions are first split by delimiter, and check each split numbers into depth.
      */
    @scala.inline
    def needUpdate(): js.Promise[IsNeeded] = ^.asInstanceOf[js.Dynamic].applyDynamic("needUpdate")().asInstanceOf[js.Promise[IsNeeded]]
    @scala.inline
    def needUpdate(option: CurrentVersion): js.Promise[IsNeeded] = ^.asInstanceOf[js.Dynamic].applyDynamic("needUpdate")(option.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IsNeeded]]
  }
}
