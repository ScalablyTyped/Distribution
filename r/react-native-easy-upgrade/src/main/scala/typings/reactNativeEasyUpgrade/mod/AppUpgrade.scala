package typings.reactNativeEasyUpgrade.mod

import typings.reactNativeEasyUpgrade.AnonAllowedInMetered
import typings.reactNativeEasyUpgrade.AnonHasNewVersion
import typings.reactNativeEasyUpgrade.AnonVERSIONCODE
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
  def checkAppVersionIOS(): js.Promise[AnonHasNewVersion] = js.native
  /**
  	 * download file
  	 * @param fileUrl
  	 * @param downloadConf
  	 */
  def downloadFile(fileUrl: String): Unit = js.native
  def downloadFile(fileUrl: String, downloadConf: AnonAllowedInMetered): Unit = js.native
  def getLocalVersionInfo(): AnonVERSIONCODE = js.native
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

