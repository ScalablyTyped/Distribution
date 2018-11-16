package typings
package reactDashNativeDashFsLib.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DownloadBeginCallbackResult extends js.Object {
  // The total size in bytes of the download resource
  var contentLength: scala.Double
  // The HTTP response headers from the server
  var headers: Headers
  // The download job ID, required if one wishes to cancel the download. See `stopDownload`.
  var jobId: scala.Double
  // The HTTP status code
  var statusCode: scala.Double
}

