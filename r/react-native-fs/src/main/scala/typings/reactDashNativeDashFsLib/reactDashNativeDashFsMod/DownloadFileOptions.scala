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

