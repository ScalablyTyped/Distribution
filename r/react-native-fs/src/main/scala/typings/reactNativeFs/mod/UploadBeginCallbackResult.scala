package typings.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadBeginCallbackResult extends js.Object {
  var jobId: Double
}

object UploadBeginCallbackResult {
  @scala.inline
  def apply(jobId: Double): UploadBeginCallbackResult = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadBeginCallbackResult]
  }
}

