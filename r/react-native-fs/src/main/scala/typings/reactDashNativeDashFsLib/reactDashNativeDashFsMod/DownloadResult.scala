package typings
package reactDashNativeDashFsLib.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadResult extends js.Object {
  // The number of bytes written to the file
  var bytesWritten: scala.Double
  // The download job ID, required if one wishes to cancel the download. See `stopDownload`.
  var jobId: scala.Double
  // The HTTP status code
  var statusCode: scala.Double
}

object DownloadResult {
  @scala.inline
  def apply(bytesWritten: scala.Double, jobId: scala.Double, statusCode: scala.Double): DownloadResult = {
    val __obj = js.Dynamic.literal(bytesWritten = bytesWritten, jobId = jobId, statusCode = statusCode)
  
    __obj.asInstanceOf[DownloadResult]
  }
}

