package typings.reactNativeVersionCheck

import typings.reactNativeVersionCheck.anon.AppID
import typings.reactNativeVersionCheck.anon.CurrentVersion
import typings.reactNativeVersionCheck.anon.FetchOptions
import typings.reactNativeVersionCheck.anon.IgnoreErrors
import typings.reactNativeVersionCheck.anon.IsNeeded
import typings.reactNativeVersionCheck.anon.PackageName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
      * Returns url of App Store of app.
      */
    @JSImport("react-native-version-check", "default.getAppStoreUrl")
    @js.native
    def getAppStoreUrl(): js.Promise[String] = js.native
    @JSImport("react-native-version-check", "default.getAppStoreUrl")
    @js.native
    def getAppStoreUrl(option: IgnoreErrors): js.Promise[String] = js.native
    
    /**
      * Returns device's country code of 2 characters.
      */
    @JSImport("react-native-version-check", "default.getCountry")
    @js.native
    def getCountry(): js.Promise[String] = js.native
    
    /**
      * Returns current app build number.
      */
    @JSImport("react-native-version-check", "default.getCurrentBuildNumber")
    @js.native
    def getCurrentBuildNumber(): Double = js.native
    
    /**
      * Returns current app version.
      */
    @JSImport("react-native-version-check", "default.getCurrentVersion")
    @js.native
    def getCurrentVersion(): String = js.native
    
    /**
      * Returns the latest app version parsed from url. Returns null when parsing error occurs.
      */
    @JSImport("react-native-version-check", "default.getLatestVersion")
    @js.native
    def getLatestVersion(): js.Promise[String] = js.native
    @JSImport("react-native-version-check", "default.getLatestVersion")
    @js.native
    def getLatestVersion(option: FetchOptions): js.Promise[String] = js.native
    
    /**
      * Returns package name of app.
      */
    @JSImport("react-native-version-check", "default.getPackageName")
    @js.native
    def getPackageName(): String = js.native
    
    /**
      * Returns url of Play Store of app.
      */
    @JSImport("react-native-version-check", "default.getPlayStoreUrl")
    @js.native
    def getPlayStoreUrl(): js.Promise[String] = js.native
    @JSImport("react-native-version-check", "default.getPlayStoreUrl")
    @js.native
    def getPlayStoreUrl(option: PackageName): js.Promise[String] = js.native
    
    /**
      * Returns url of Play Market or App Store of app.
      */
    @JSImport("react-native-version-check", "default.getStoreUrl")
    @js.native
    def getStoreUrl(): js.Promise[String] = js.native
    @JSImport("react-native-version-check", "default.getStoreUrl")
    @js.native
    def getStoreUrl(option: AppID): js.Promise[String] = js.native
    
    /**
      * Returns an object contains with boolean value whether update needed, current version and latest version.
      * Current and the latest app versions are first split by delimiter, and check each split numbers into depth.
      */
    @JSImport("react-native-version-check", "default.needUpdate")
    @js.native
    def needUpdate(): js.Promise[IsNeeded] = js.native
    @JSImport("react-native-version-check", "default.needUpdate")
    @js.native
    def needUpdate(option: CurrentVersion): js.Promise[IsNeeded] = js.native
  }
}
