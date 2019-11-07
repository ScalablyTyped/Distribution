package typings.reactDashNativeDashFs.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadResult extends js.Object {
  // The HTTP response headers from the server
  var body: String
  // The HTTP status code
  var headers: Headers
  var jobId: Double
  // The upload job ID, required if one wishes to cancel the upload. See `stopUpload`.
  var statusCode: Double
}

object UploadResult {
  @scala.inline
  def apply(body: String, headers: Headers, jobId: Double, statusCode: Double): UploadResult = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, jobId = jobId, statusCode = statusCode)
  
    __obj.asInstanceOf[UploadResult]
  }
}

