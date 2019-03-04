package typings
package reactDashNativeDashFsLib.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadFileOptions extends js.Object {
  // iOS only
  var background: js.UndefOr[scala.Boolean] = js.undefined
  var begin: js.UndefOr[DownloadCallbackBegin] = js.undefined
  var connectionTimeout: js.UndefOr[scala.Double] = js.undefined
  // URL to download file from
  var fromUrl: java.lang.String
  // An object of headers to be passed to the server
  var headers: js.UndefOr[Headers] = js.undefined
  var progress: js.UndefOr[DownloadCallbackProgress] = js.undefined
  var progressDivider: js.UndefOr[scala.Double] = js.undefined
  var readTimeout: js.UndefOr[scala.Double] = js.undefined
  // Local filesystem path to save the file to
  var toFile: java.lang.String
}

object DownloadFileOptions {
  @scala.inline
  def apply(
    fromUrl: java.lang.String,
    toFile: java.lang.String,
    background: js.UndefOr[scala.Boolean] = js.undefined,
    begin: DownloadCallbackBegin = null,
    connectionTimeout: scala.Int | scala.Double = null,
    headers: Headers = null,
    progress: DownloadCallbackProgress = null,
    progressDivider: scala.Int | scala.Double = null,
    readTimeout: scala.Int | scala.Double = null
  ): DownloadFileOptions = {
    val __obj = js.Dynamic.literal(fromUrl = fromUrl, toFile = toFile)
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background)
    if (begin != null) __obj.updateDynamic("begin")(begin)
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (progressDivider != null) __obj.updateDynamic("progressDivider")(progressDivider.asInstanceOf[js.Any])
    if (readTimeout != null) __obj.updateDynamic("readTimeout")(readTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileOptions]
  }
}

