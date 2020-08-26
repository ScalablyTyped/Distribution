package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsagePlan extends js.Object {
  var quota: js.UndefOr[Quota] = js.native
  var throttle: js.UndefOr[Throttle] = js.native
}

object UsagePlan {
  @scala.inline
  def apply(): UsagePlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsagePlan]
  }
  @scala.inline
  implicit class UsagePlanOps[Self <: UsagePlan] (val x: Self) extends AnyVal {
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
    def setQuota(value: Quota): Self = this.set("quota", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuota: Self = this.set("quota", js.undefined)
    @scala.inline
    def setThrottle(value: Throttle): Self = this.set("throttle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottle: Self = this.set("throttle", js.undefined)
  }
  
}

