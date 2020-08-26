package typings.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadFileOptions extends js.Object {
  // An object of headers to be passed to the server
  var background: js.UndefOr[Boolean] = js.native
  // supported on Android and iOS
  var backgroundTimeout: js.UndefOr[Double] = js.native
  var begin: js.UndefOr[js.Function1[/* res */ DownloadBeginCallbackResult, Unit]] = js.native
  // Allow the OS to control the timing and speed of the download to improve perceived performance  (iOS only)
  var cacheable: js.UndefOr[Boolean] = js.native
  // only supported on iOS yet
  var connectionTimeout: js.UndefOr[Double] = js.native
  // Continue the download in the background after the app terminates (iOS only)
  var discretionary: js.UndefOr[Boolean] = js.native
  var fromUrl: String = js.native
  // Local filesystem path to save the file to
  var headers: js.UndefOr[Headers] = js.native
  var progress: js.UndefOr[js.Function1[/* res */ DownloadProgressCallbackResult, Unit]] = js.native
  var progressDivider: js.UndefOr[Double] = js.native
  // Whether the download can be stored in the shared NSURLCache (iOS only)
  var progressInterval: js.UndefOr[Double] = js.native
  // only supported on Android yet
  var readTimeout: js.UndefOr[Double] = js.native
  var resumable: js.UndefOr[js.Function0[Unit]] = js.native
  // URL to download file from
  var toFile: String = js.native
}

object DownloadFileOptions {
  @scala.inline
  def apply(fromUrl: String, toFile: String): DownloadFileOptions = {
    val __obj = js.Dynamic.literal(fromUrl = fromUrl.asInstanceOf[js.Any], toFile = toFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileOptions]
  }
  @scala.inline
  implicit class DownloadFileOptionsOps[Self <: DownloadFileOptions] (val x: Self) extends AnyVal {
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
    def setFromUrl(value: String): Self = this.set("fromUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setToFile(value: String): Self = this.set("toFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackground(value: Boolean): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBackgroundTimeout(value: Double): Self = this.set("backgroundTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundTimeout: Self = this.set("backgroundTimeout", js.undefined)
    @scala.inline
    def setBegin(value: /* res */ DownloadBeginCallbackResult => Unit): Self = this.set("begin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBegin: Self = this.set("begin", js.undefined)
    @scala.inline
    def setCacheable(value: Boolean): Self = this.set("cacheable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheable: Self = this.set("cacheable", js.undefined)
    @scala.inline
    def setConnectionTimeout(value: Double): Self = this.set("connectionTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionTimeout: Self = this.set("connectionTimeout", js.undefined)
    @scala.inline
    def setDiscretionary(value: Boolean): Self = this.set("discretionary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscretionary: Self = this.set("discretionary", js.undefined)
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setProgress(value: /* res */ DownloadProgressCallbackResult => Unit): Self = this.set("progress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    @scala.inline
    def setProgressDivider(value: Double): Self = this.set("progressDivider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressDivider: Self = this.set("progressDivider", js.undefined)
    @scala.inline
    def setProgressInterval(value: Double): Self = this.set("progressInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressInterval: Self = this.set("progressInterval", js.undefined)
    @scala.inline
    def setReadTimeout(value: Double): Self = this.set("readTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadTimeout: Self = this.set("readTimeout", js.undefined)
    @scala.inline
    def setResumable(value: () => Unit): Self = this.set("resumable", js.Any.fromFunction0(value))
    @scala.inline
    def deleteResumable: Self = this.set("resumable", js.undefined)
  }
  
}

