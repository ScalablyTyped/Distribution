package typings
package reactDashNativeDashFsLib.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DownloadProgressCallbackResult extends js.Object {
  // The number of bytes written to the file so far
  var bytesWritten: scala.Double
  // The total size in bytes of the download resource
  var contentLength: scala.Double
  // The download job ID, required if one wishes to cancel the download. See `stopDownload`.
  var jobId: scala.Double
}

