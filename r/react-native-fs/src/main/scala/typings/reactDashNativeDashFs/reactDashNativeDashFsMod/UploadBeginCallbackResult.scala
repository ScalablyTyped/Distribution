package typings.reactDashNativeDashFs.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadBeginCallbackResult extends js.Object {
  // The upload job ID, required if one wishes to cancel the upload. See `stopUpload`.
  var jobId: Double
}

object UploadBeginCallbackResult {
  @scala.inline
  def apply(jobId: Double): UploadBeginCallbackResult = {
    val __obj = js.Dynamic.literal(jobId = jobId)
  
    __obj.asInstanceOf[UploadBeginCallbackResult]
  }
}

