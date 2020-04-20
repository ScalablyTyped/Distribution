package typings.pulumiAws.inputMod.dlm

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicyPolicyDetailsScheduleRetainRule extends js.Object {
  /**
    * How many snapshots to keep. Must be an integer between 1 and 1000.
    */
  var count: Input[Double] = js.native
}

object LifecyclePolicyPolicyDetailsScheduleRetainRule {
  @scala.inline
  def apply(count: Input[Double]): LifecyclePolicyPolicyDetailsScheduleRetainRule = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyPolicyDetailsScheduleRetainRule]
  }
}

