package typings.reactDashNativeDashFs.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadBeginCallbackResult extends js.Object {
  // The total size in bytes of the download resource
  var contentLength: Double
  // The HTTP response headers from the server
  var headers: Headers
  // The download job ID, required if one wishes to cancel the download. See `stopDownload`.
  var jobId: Double
  // The HTTP status code
  var statusCode: Double
}

object DownloadBeginCallbackResult {
  @scala.inline
  def apply(contentLength: Double, headers: Headers, jobId: Double, statusCode: Double): DownloadBeginCallbackResult = {
    val __obj = js.Dynamic.literal(contentLength = contentLength, headers = headers, jobId = jobId, statusCode = statusCode)
  
    __obj.asInstanceOf[DownloadBeginCallbackResult]
  }
}

