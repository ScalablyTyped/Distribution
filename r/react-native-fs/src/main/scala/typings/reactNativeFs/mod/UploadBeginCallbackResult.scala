package typings.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadBeginCallbackResult extends js.Object {
  var jobId: Double = js.native
}

object UploadBeginCallbackResult {
  @scala.inline
  def apply(jobId: Double): UploadBeginCallbackResult = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadBeginCallbackResult]
  }
  @scala.inline
  implicit class UploadBeginCallbackResultOps[Self <: UploadBeginCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJobId(value: Double): Self = this.set("jobId", value.asInstanceOf[js.Any])
  }
  
}

