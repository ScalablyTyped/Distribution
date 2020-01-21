package typings.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadBeginCallbackResult extends js.Object {
  // The HTTP status code
  var contentLength: Double
  // The total size in bytes of the download resource
  var headers: Headers
  var jobId: Double
  // The download job ID, required if one wishes to cancel the download. See `stopDownload`.
  var statusCode: Double
}

object DownloadBeginCallbackResult {
  @scala.inline
  def apply(contentLength: Double, headers: Headers, jobId: Double, statusCode: Double): DownloadBeginCallbackResult = {
    val __obj = js.Dynamic.literal(contentLength = contentLength.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DownloadBeginCallbackResult]
  }
}

