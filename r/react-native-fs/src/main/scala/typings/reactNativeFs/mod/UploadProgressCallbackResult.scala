package typings.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadProgressCallbackResult extends js.Object {
  var jobId: Double
  // The upload job ID, required if one wishes to cancel the upload. See `stopUpload`.
  var totalBytesExpectedToSend: Double
  // The total number of bytes that will be sent to the server
  var totalBytesSent: Double
}

object UploadProgressCallbackResult {
  @scala.inline
  def apply(jobId: Double, totalBytesExpectedToSend: Double, totalBytesSent: Double): UploadProgressCallbackResult = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], totalBytesExpectedToSend = totalBytesExpectedToSend.asInstanceOf[js.Any], totalBytesSent = totalBytesSent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UploadProgressCallbackResult]
  }
}

