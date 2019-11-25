package typings.reactDashNativeDashEasyDashUpgrade.reactDashNativeDashEasyDashUpgradeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var downloadApkName: String
  var downloadDescription: String
  var downloadDestDirectory: String
  var downloadTitle: String
  var iOSAppId: String
  var iOSAppLookupUrl: String
  var shouldCheckApkHasDownloaded: Boolean
  def downloadApkEnd(path: String): js.Any
  def onError(err: Error): js.Any
}

object Options {
  @scala.inline
  def apply(
    downloadApkEnd: String => js.Any,
    downloadApkName: String,
    downloadDescription: String,
    downloadDestDirectory: String,
    downloadTitle: String,
    iOSAppId: String,
    iOSAppLookupUrl: String,
    onError: Error => js.Any,
    shouldCheckApkHasDownloaded: Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(downloadApkEnd = js.Any.fromFunction1(downloadApkEnd), downloadApkName = downloadApkName.asInstanceOf[js.Any], downloadDescription = downloadDescription.asInstanceOf[js.Any], downloadDestDirectory = downloadDestDirectory.asInstanceOf[js.Any], downloadTitle = downloadTitle.asInstanceOf[js.Any], iOSAppId = iOSAppId.asInstanceOf[js.Any], iOSAppLookupUrl = iOSAppLookupUrl.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError), shouldCheckApkHasDownloaded = shouldCheckApkHasDownloaded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

