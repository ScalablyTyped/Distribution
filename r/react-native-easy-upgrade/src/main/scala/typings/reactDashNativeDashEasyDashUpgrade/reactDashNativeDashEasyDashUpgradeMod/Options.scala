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
    val __obj = js.Dynamic.literal(downloadApkEnd = js.Any.fromFunction1(downloadApkEnd), downloadApkName = downloadApkName, downloadDescription = downloadDescription, downloadDestDirectory = downloadDestDirectory, downloadTitle = downloadTitle, iOSAppId = iOSAppId, iOSAppLookupUrl = iOSAppLookupUrl, onError = js.Any.fromFunction1(onError), shouldCheckApkHasDownloaded = shouldCheckApkHasDownloaded)
  
    __obj.asInstanceOf[Options]
  }
}

