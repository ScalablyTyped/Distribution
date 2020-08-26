package typings.pulumiAws.outputMod.dlm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicyPolicyDetailsScheduleCreateRule extends js.Object {
  /**
    * How often this lifecycle policy should be evaluated. `1`, `2`,`3`,`4`,`6`,`8`,`12` or `24` are valid values.
    */
  var interval: Double = js.native
  /**
    * The unit for how often the lifecycle policy should be evaluated. `HOURS` is currently the only allowed value and also the default value.
    */
  var intervalUnit: js.UndefOr[String] = js.native
  /**
    * A list of times in 24 hour clock format that sets when the lifecycle policy should be evaluated. Max of 1.
    */
  var times: String = js.native
}

object LifecyclePolicyPolicyDetailsScheduleCreateRule {
  @scala.inline
  def apply(interval: Double, times: String): LifecyclePolicyPolicyDetailsScheduleCreateRule = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyPolicyDetailsScheduleCreateRule]
  }
  @scala.inline
  implicit class LifecyclePolicyPolicyDetailsScheduleCreateRuleOps[Self <: LifecyclePolicyPolicyDetailsScheduleCreateRule] (val x: Self) extends AnyVal {
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
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimes(value: String): Self = this.set("times", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntervalUnit(value: String): Self = this.set("intervalUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntervalUnit: Self = this.set("intervalUnit", js.undefined)
  }
  
}

