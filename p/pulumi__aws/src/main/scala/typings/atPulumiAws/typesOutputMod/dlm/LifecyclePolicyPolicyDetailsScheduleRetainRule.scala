package typings.atPulumiAws.typesOutputMod.dlm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecyclePolicyPolicyDetailsScheduleRetainRule extends js.Object {
  /**
    * How many snapshots to keep. Must be an integer between 1 and 1000.
    */
  var count: Double
}

object LifecyclePolicyPolicyDetailsScheduleRetainRule {
  @scala.inline
  def apply(count: Double): LifecyclePolicyPolicyDetailsScheduleRetainRule = {
    val __obj = js.Dynamic.literal(count = count)
  
    __obj.asInstanceOf[LifecyclePolicyPolicyDetailsScheduleRetainRule]
  }
}

