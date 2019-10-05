package typings.reactDashNativeDashVersionDashCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-version-check", JSImport.Namespace)
@js.native
object reactDashNativeDashVersionDashCheckMod extends js.Object {
  @js.native
  object default extends js.Object {
    /**
      * Returns url of App Store of app.
      */
    def getAppStoreUrl(): js.Promise[String] = js.native
    def getAppStoreUrl(option: Anon_AppID): js.Promise[String] = js.native
    /**
      * Returns device's country code of 2 characters.
      */
    def getCountry(): js.Promise[String] = js.native
    /**
      * Returns current app build number.
      */
    def getCurrentBuildNumber(): Double = js.native
    /**
      * Returns current app version.
      */
    def getCurrentVersion(): String = js.native
    /**
      * Returns the latest app version parsed from url. Returns null when parsing error occurs.
      */
    def getLatestVersion(): js.Promise[String] = js.native
    def getLatestVersion(option: Anon_FetchOptions): js.Promise[String] = js.native
    /**
      * Returns package name of app.
      */
    def getPackageName(): String = js.native
    /**
      * Returns url of Play Store of app.
      */
    def getPlayStoreUrl(): js.Promise[String] = js.native
    def getPlayStoreUrl(option: Anon_IgnoreErrors): js.Promise[String] = js.native
    /**
      * Returns url of Play Market or App Store of app.
      */
    def getStoreUrl(): js.Promise[String] = js.native
    def getStoreUrl(option: Anon_AppID): js.Promise[String] = js.native
    /**
      * Returns an object contains with boolean value whether update needed, current version and latest version.
      * Current and the latest app versions are first split by delimiter, and check each split numbers into depth.
      */
    def needUpdate(): js.Promise[Anon_CurrentVersionIsNeeded] = js.native
    def needUpdate(option: Anon_CurrentVersion): js.Promise[Anon_CurrentVersionIsNeeded] = js.native
  }
  
}

