package typings.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadResult extends js.Object {
  // The HTTP status code
  var bytesWritten: Double
  var jobId: Double
  // The download job ID, required if one wishes to cancel the download. See `stopDownload`.
  var statusCode: Double
}

object DownloadResult {
  @scala.inline
  def apply(bytesWritten: Double, jobId: Double, statusCode: Double): DownloadResult = {
    val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DownloadResult]
  }
}

