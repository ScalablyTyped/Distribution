package typings
package reactDashNativeDashEasyDashUpgradeLib.reactDashNativeDashEasyDashUpgradeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var downloadApkName: java.lang.String
  var downloadDescription: java.lang.String
  var downloadDestDirectory: java.lang.String
  var downloadTitle: java.lang.String
  var iOSAppId: java.lang.String
  var iOSAppLookupUrl: java.lang.String
  var shouldCheckApkHasDownloaded: scala.Boolean
  def downloadApkEnd(path: java.lang.String): js.Any
  def onError(err: stdLib.Error): js.Any
}

object Options {
  @scala.inline
  def apply(
    downloadApkEnd: java.lang.String => js.Any,
    downloadApkName: java.lang.String,
    downloadDescription: java.lang.String,
    downloadDestDirectory: java.lang.String,
    downloadTitle: java.lang.String,
    iOSAppId: java.lang.String,
    iOSAppLookupUrl: java.lang.String,
    onError: stdLib.Error => js.Any,
    shouldCheckApkHasDownloaded: scala.Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(downloadApkEnd = js.Any.fromFunction1(downloadApkEnd), downloadApkName = downloadApkName, downloadDescription = downloadDescription, downloadDestDirectory = downloadDestDirectory, downloadTitle = downloadTitle, iOSAppId = iOSAppId, iOSAppLookupUrl = iOSAppLookupUrl, onError = js.Any.fromFunction1(onError), shouldCheckApkHasDownloaded = shouldCheckApkHasDownloaded)
  
    __obj.asInstanceOf[Options]
  }
}

