package typings.reactDashNativeDashFs.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadResult extends js.Object {
  // The number of bytes written to the file
  var bytesWritten: Double
  // The download job ID, required if one wishes to cancel the download. See `stopDownload`.
  var jobId: Double
  // The HTTP status code
  var statusCode: Double
}

object DownloadResult {
  @scala.inline
  def apply(bytesWritten: Double, jobId: Double, statusCode: Double): DownloadResult = {
    val __obj = js.Dynamic.literal(bytesWritten = bytesWritten, jobId = jobId, statusCode = statusCode)
  
    __obj.asInstanceOf[DownloadResult]
  }
}

