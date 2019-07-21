package typings
package reactDashNativeDashEasyDashUpgradeLib.reactDashNativeDashEasyDashUpgradeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppUpgrade extends js.Object {
  val downloadDestDirectory: java.lang.String = js.native
  val downloadDestPath: java.lang.String = js.native
  val downloading: scala.Boolean = js.native
  def checkApkHasDownloaded(): js.Promise[scala.Boolean] = js.native
  def checkApkHasDownloaded(path: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
  	 * Check the ios app version info from app store.
  	 */
  def checkAppVersionIOS(): js.Promise[reactDashNativeDashEasyDashUpgradeLib.Anon_HasNewVersion] = js.native
  /**
  	 * download file
  	 * @param fileUrl
  	 * @param downloadConf
  	 */
  def downloadFile(fileUrl: java.lang.String): scala.Unit = js.native
  def downloadFile(
    fileUrl: java.lang.String,
    downloadConf: reactDashNativeDashEasyDashUpgradeLib.Anon_AllowedInMetered
  ): scala.Unit = js.native
  def getLocalVersionInfo(): reactDashNativeDashEasyDashUpgradeLib.Anon_VERSIONCODE = js.native
  def getNetworkStatus(): js.Promise[java.lang.String] = js.native
  def installApk(): scala.Unit = js.native
  def installApk(apkPath: java.lang.String): scala.Unit = js.native
  /**
  	 * navigate to app store download page.
  	 */
  def navigateToAppStore(): scala.Unit = js.native
  def navigateToAppStore(trackViewUrl: java.lang.String): scala.Unit = js.native
  def startAppUpdate(apkUrl: java.lang.String): scala.Unit = js.native
  def startAppUpdate(apkUrl: java.lang.String, appStoreUrl: java.lang.String): scala.Unit = js.native
  /**
  	 * update app and install
  	 * @param apkUrl
  	 */
  def updateAndroidApp(apkUrl: java.lang.String): js.Promise[scala.Unit] = js.native
}

