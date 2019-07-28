package typings.reactDashNativeDashFs.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadProgressCallbackResult extends js.Object {
  // The number of bytes written to the file so far
  var bytesWritten: Double
  // The total size in bytes of the download resource
  var contentLength: Double
  // The download job ID, required if one wishes to cancel the download. See `stopDownload`.
  var jobId: Double
}

object DownloadProgressCallbackResult {
  @scala.inline
  def apply(bytesWritten: Double, contentLength: Double, jobId: Double): DownloadProgressCallbackResult = {
    val __obj = js.Dynamic.literal(bytesWritten = bytesWritten, contentLength = contentLength, jobId = jobId)
  
    __obj.asInstanceOf[DownloadProgressCallbackResult]
  }
}

