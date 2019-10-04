package typings.atPulumiAws.typesInputMod.dlmNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecyclePolicyPolicyDetailsScheduleRetainRule extends js.Object {
  /**
    * How many snapshots to keep. Must be an integer between 1 and 1000.
    */
  var count: Input[Double]
}

object LifecyclePolicyPolicyDetailsScheduleRetainRule {
  @scala.inline
  def apply(count: Input[Double]): LifecyclePolicyPolicyDetailsScheduleRetainRule = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LifecyclePolicyPolicyDetailsScheduleRetainRule]
  }
}

