package typings.atPulumiAws.typesInputMod.dlm

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecyclePolicyPolicyDetailsScheduleCreateRule extends js.Object {
  /**
    * How often this lifecycle policy should be evaluated. `2`,`3`,`4`,`6`,`8`,`12` or `24` are valid values.
    */
  var interval: Input[Double]
  /**
    * The unit for how often the lifecycle policy should be evaluated. `HOURS` is currently the only allowed value and also the default value.
    */
  var intervalUnit: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of times in 24 hour clock format that sets when the lifecycle policy should be evaluated. Max of 1.
    */
  var times: js.UndefOr[Input[String]] = js.undefined
}

object LifecyclePolicyPolicyDetailsScheduleCreateRule {
  @scala.inline
  def apply(interval: Input[Double], intervalUnit: Input[String] = null, times: Input[String] = null): LifecyclePolicyPolicyDetailsScheduleCreateRule = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    if (intervalUnit != null) __obj.updateDynamic("intervalUnit")(intervalUnit.asInstanceOf[js.Any])
    if (times != null) __obj.updateDynamic("times")(times.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyPolicyDetailsScheduleCreateRule]
  }
}

