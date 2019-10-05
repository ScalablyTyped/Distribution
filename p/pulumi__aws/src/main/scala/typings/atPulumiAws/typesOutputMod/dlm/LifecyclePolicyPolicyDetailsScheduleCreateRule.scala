package typings.atPulumiAws.typesOutputMod.dlm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecyclePolicyPolicyDetailsScheduleCreateRule extends js.Object {
  /**
    * How often this lifecycle policy should be evaluated. `2`,`3`,`4`,`6`,`8`,`12` or `24` are valid values.
    */
  var interval: Double
  /**
    * The unit for how often the lifecycle policy should be evaluated. `HOURS` is currently the only allowed value and also the default value.
    */
  var intervalUnit: js.UndefOr[String] = js.undefined
  /**
    * A list of times in 24 hour clock format that sets when the lifecycle policy should be evaluated. Max of 1.
    */
  var times: String
}

object LifecyclePolicyPolicyDetailsScheduleCreateRule {
  @scala.inline
  def apply(interval: Double, times: String, intervalUnit: String = null): LifecyclePolicyPolicyDetailsScheduleCreateRule = {
    val __obj = js.Dynamic.literal(interval = interval, times = times)
    if (intervalUnit != null) __obj.updateDynamic("intervalUnit")(intervalUnit)
    __obj.asInstanceOf[LifecyclePolicyPolicyDetailsScheduleCreateRule]
  }
}

