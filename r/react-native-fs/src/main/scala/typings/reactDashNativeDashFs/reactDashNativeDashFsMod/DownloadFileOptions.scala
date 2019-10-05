package typings.reactDashNativeDashFs.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadFileOptions extends js.Object {
  // iOS only
  var background: js.UndefOr[Boolean] = js.undefined
  var begin: js.UndefOr[DownloadCallbackBegin] = js.undefined
  var connectionTimeout: js.UndefOr[Double] = js.undefined
  // URL to download file from
  var fromUrl: String
  // An object of headers to be passed to the server
  var headers: js.UndefOr[Headers] = js.undefined
  var progress: js.UndefOr[DownloadCallbackProgress] = js.undefined
  var progressDivider: js.UndefOr[Double] = js.undefined
  var readTimeout: js.UndefOr[Double] = js.undefined
  // Local filesystem path to save the file to
  var toFile: String
}

object DownloadFileOptions {
  @scala.inline
  def apply(
    fromUrl: String,
    toFile: String,
    background: js.UndefOr[Boolean] = js.undefined,
    begin: /* res */ DownloadBeginCallbackResult => Unit = null,
    connectionTimeout: Int | Double = null,
    headers: Headers = null,
    progress: /* res */ DownloadProgressCallbackResult => Unit = null,
    progressDivider: Int | Double = null,
    readTimeout: Int | Double = null
  ): DownloadFileOptions = {
    val __obj = js.Dynamic.literal(fromUrl = fromUrl, toFile = toFile)
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background)
    if (begin != null) __obj.updateDynamic("begin")(js.Any.fromFunction1(begin))
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction1(progress))
    if (progressDivider != null) __obj.updateDynamic("progressDivider")(progressDivider.asInstanceOf[js.Any])
    if (readTimeout != null) __obj.updateDynamic("readTimeout")(readTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileOptions]
  }
}

