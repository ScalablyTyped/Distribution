package typings.reactDashNativeDashEasyDashUpgrade.reactDashNativeDashEasyDashUpgradeMod

import typings.reactDashNativeDashEasyDashUpgrade.Anon_AllowedInMetered
import typings.reactDashNativeDashEasyDashUpgrade.Anon_HasNewVersion
import typings.reactDashNativeDashEasyDashUpgrade.Anon_VERSIONCODE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppUpgrade extends js.Object {
  val downloadDestDirectory: String = js.native
  val downloadDestPath: String = js.native
  val downloading: Boolean = js.native
  def checkApkHasDownloaded(): js.Promise[Boolean] = js.native
  def checkApkHasDownloaded(path: String): js.Promise[Boolean] = js.native
  /**
  	 * Check the ios app version info from app store.
  	 */
  def checkAppVersionIOS(): js.Promise[Anon_HasNewVersion] = js.native
  /**
  	 * download file
  	 * @param fileUrl
  	 * @param downloadConf
  	 */
  def downloadFile(fileUrl: String): Unit = js.native
  def downloadFile(fileUrl: String, downloadConf: Anon_AllowedInMetered): Unit = js.native
  def getLocalVersionInfo(): Anon_VERSIONCODE = js.native
  def getNetworkStatus(): js.Promise[String] = js.native
  def installApk(): Unit = js.native
  def installApk(apkPath: String): Unit = js.native
  /**
  	 * navigate to app store download page.
  	 */
  def navigateToAppStore(): Unit = js.native
  def navigateToAppStore(trackViewUrl: String): Unit = js.native
  def startAppUpdate(apkUrl: String): Unit = js.native
  def startAppUpdate(apkUrl: String, appStoreUrl: String): Unit = js.native
  /**
  	 * update app and install
  	 * @param apkUrl
  	 */
  def updateAndroidApp(apkUrl: String): js.Promise[Unit] = js.native
}

