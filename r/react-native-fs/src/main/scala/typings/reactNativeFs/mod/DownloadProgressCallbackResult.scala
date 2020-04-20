package typings.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadProgressCallbackResult extends js.Object {
  // The total size in bytes of the download resource
  var bytesWritten: Double
  // The download job ID, required if one wishes to cancel the download. See `stopDownload`.
  var contentLength: Double
  var jobId: Double
}

object DownloadProgressCallbackResult {
  @scala.inline
  def apply(bytesWritten: Double, contentLength: Double, jobId: Double): DownloadProgressCallbackResult = {
    val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any], contentLength = contentLength.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadProgressCallbackResult]
  }
}

