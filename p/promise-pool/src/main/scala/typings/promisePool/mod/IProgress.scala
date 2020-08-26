package typings.promisePool.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProgress extends js.Object {
  var error: js.Any = js.native
  var fulfilled: Double = js.native
  var index: Double = js.native
  var pending: Double = js.native
  var rejected: Double = js.native
  var retries: Double = js.native
  var success: Boolean = js.native
  var total: Double = js.native
}

object IProgress {
  @scala.inline
  def apply(
    error: js.Any,
    fulfilled: Double,
    index: Double,
    pending: Double,
    rejected: Double,
    retries: Double,
    success: Boolean,
    total: Double
  ): IProgress = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], fulfilled = fulfilled.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgress]
  }
  @scala.inline
  implicit class IProgressOps[Self <: IProgress] (val x: Self) extends AnyVal {
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
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setFulfilled(value: Double): Self = this.set("fulfilled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setPending(value: Double): Self = this.set("pending", value.asInstanceOf[js.Any])
    @scala.inline
    def setRejected(value: Double): Self = this.set("rejected", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

