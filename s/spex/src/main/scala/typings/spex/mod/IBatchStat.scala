package typings.spex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBatchStat extends js.Object {
  var duration: Double = js.native
  var failed: Double = js.native
  var succeeded: Double = js.native
  var total: Double = js.native
}

object IBatchStat {
  @scala.inline
  def apply(duration: Double, failed: Double, succeeded: Double, total: Double): IBatchStat = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBatchStat]
  }
  @scala.inline
  implicit class IBatchStatOps[Self <: IBatchStat] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailed(value: Double): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSucceeded(value: Double): Self = this.set("succeeded", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

