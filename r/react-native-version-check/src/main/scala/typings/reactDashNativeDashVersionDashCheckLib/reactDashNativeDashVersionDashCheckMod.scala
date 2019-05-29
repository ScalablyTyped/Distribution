package typings
package reactDashNativeDashVersionDashCheckLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-version-check", JSImport.Namespace)
@js.native
object reactDashNativeDashVersionDashCheckMod extends js.Object {
  @JSName("default")
  @js.native
  object defaultNs extends js.Object {
    /**
      * Returns url of App Store of app.
      */
    def getAppStoreUrl(): js.Promise[java.lang.String] = js.native
    def getAppStoreUrl(option: reactDashNativeDashVersionDashCheckLib.Anon_AppID): js.Promise[java.lang.String] = js.native
    /**
      * Returns device's country code of 2 characters.
      */
    def getCountry(): js.Promise[java.lang.String] = js.native
    /**
      * Returns current app build number.
      */
    def getCurrentBuildNumber(): scala.Double = js.native
    /**
      * Returns current app version.
      */
    def getCurrentVersion(): java.lang.String = js.native
    /**
      * Returns the latest app version parsed from url. Returns null when parsing error occurs.
      */
    def getLatestVersion(): js.Promise[java.lang.String] = js.native
    def getLatestVersion(option: reactDashNativeDashVersionDashCheckLib.Anon_FetchOptions): js.Promise[java.lang.String] = js.native
    /**
      * Returns package name of app.
      */
    def getPackageName(): java.lang.String = js.native
    /**
      * Returns url of Play Store of app.
      */
    def getPlayStoreUrl(): js.Promise[java.lang.String] = js.native
    def getPlayStoreUrl(option: reactDashNativeDashVersionDashCheckLib.Anon_IgnoreErrors): js.Promise[java.lang.String] = js.native
    /**
      * Returns url of Play Market or App Store of app.
      */
    def getStoreUrl(): js.Promise[java.lang.String] = js.native
    def getStoreUrl(option: reactDashNativeDashVersionDashCheckLib.Anon_AppID): js.Promise[java.lang.String] = js.native
    /**
      * Returns an object contains with boolean value whether update needed, current version and latest version.
      * Current and the latest app versions are first split by delimiter, and check each split numbers into depth.
      */
    def needUpdate(): js.Promise[reactDashNativeDashVersionDashCheckLib.Anon_CurrentVersionIsNeeded] = js.native
    def needUpdate(option: reactDashNativeDashVersionDashCheckLib.Anon_CurrentVersion): js.Promise[reactDashNativeDashVersionDashCheckLib.Anon_CurrentVersionIsNeeded] = js.native
  }
  
}

