package typings.reactNativeEasyUpgrade.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var downloadApkName: String = js.native
  var downloadDescription: String = js.native
  var downloadDestDirectory: String = js.native
  var downloadTitle: String = js.native
  var iOSAppId: String = js.native
  var iOSAppLookupUrl: String = js.native
  var shouldCheckApkHasDownloaded: Boolean = js.native
  def downloadApkEnd(path: String): js.Any = js.native
  def onError(err: Error): js.Any = js.native
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
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDownloadApkEnd(value: String => js.Any): Self = this.set("downloadApkEnd", js.Any.fromFunction1(value))
    @scala.inline
    def setDownloadApkName(value: String): Self = this.set("downloadApkName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloadDescription(value: String): Self = this.set("downloadDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloadDestDirectory(value: String): Self = this.set("downloadDestDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloadTitle(value: String): Self = this.set("downloadTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setIOSAppId(value: String): Self = this.set("iOSAppId", value.asInstanceOf[js.Any])
    @scala.inline
    def setIOSAppLookupUrl(value: String): Self = this.set("iOSAppLookupUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnError(value: Error => js.Any): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def setShouldCheckApkHasDownloaded(value: Boolean): Self = this.set("shouldCheckApkHasDownloaded", value.asInstanceOf[js.Any])
  }
  
}

