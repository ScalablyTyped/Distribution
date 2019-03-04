package typings
package reactDashNativeDashFsLib.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadProgressCallbackResult extends js.Object {
  // The upload job ID, required if one wishes to cancel the upload. See `stopUpload`.
  var jobId: scala.Double
  // The total number of bytes that will be sent to the server
  var totalBytesExpectedToSend: scala.Double
  // The number of bytes sent to the server
  var totalBytesSent: scala.Double
}

object UploadProgressCallbackResult {
  @scala.inline
  def apply(jobId: scala.Double, totalBytesExpectedToSend: scala.Double, totalBytesSent: scala.Double): UploadProgressCallbackResult = {
    val __obj = js.Dynamic.literal(jobId = jobId, totalBytesExpectedToSend = totalBytesExpectedToSend, totalBytesSent = totalBytesSent)
  
    __obj.asInstanceOf[UploadProgressCallbackResult]
  }
}

