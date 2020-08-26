package typings.reactNativeEasyUpgrade.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-easy-upgrade.react-native-easy-upgrade.Options> */
@js.native
trait PartialOptions extends js.Object {
  var downloadApkEnd: js.UndefOr[js.Function1[/* path */ String, _]] = js.native
  var downloadApkName: js.UndefOr[String] = js.native
  var downloadDescription: js.UndefOr[String] = js.native
  var downloadDestDirectory: js.UndefOr[String] = js.native
  var downloadTitle: js.UndefOr[String] = js.native
  var iOSAppId: js.UndefOr[String] = js.native
  var iOSAppLookupUrl: js.UndefOr[String] = js.native
  var onError: js.UndefOr[js.Function1[/* err */ Error, _]] = js.native
  var shouldCheckApkHasDownloaded: js.UndefOr[Boolean] = js.native
}

object PartialOptions {
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
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
    def setDownloadApkEnd(value: /* path */ String => _): Self = this.set("downloadApkEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDownloadApkEnd: Self = this.set("downloadApkEnd", js.undefined)
    @scala.inline
    def setDownloadApkName(value: String): Self = this.set("downloadApkName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadApkName: Self = this.set("downloadApkName", js.undefined)
    @scala.inline
    def setDownloadDescription(value: String): Self = this.set("downloadDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadDescription: Self = this.set("downloadDescription", js.undefined)
    @scala.inline
    def setDownloadDestDirectory(value: String): Self = this.set("downloadDestDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadDestDirectory: Self = this.set("downloadDestDirectory", js.undefined)
    @scala.inline
    def setDownloadTitle(value: String): Self = this.set("downloadTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadTitle: Self = this.set("downloadTitle", js.undefined)
    @scala.inline
    def setIOSAppId(value: String): Self = this.set("iOSAppId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIOSAppId: Self = this.set("iOSAppId", js.undefined)
    @scala.inline
    def setIOSAppLookupUrl(value: String): Self = this.set("iOSAppLookupUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIOSAppLookupUrl: Self = this.set("iOSAppLookupUrl", js.undefined)
    @scala.inline
    def setOnError(value: /* err */ Error => _): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setShouldCheckApkHasDownloaded(value: Boolean): Self = this.set("shouldCheckApkHasDownloaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldCheckApkHasDownloaded: Self = this.set("shouldCheckApkHasDownloaded", js.undefined)
  }
  
}

