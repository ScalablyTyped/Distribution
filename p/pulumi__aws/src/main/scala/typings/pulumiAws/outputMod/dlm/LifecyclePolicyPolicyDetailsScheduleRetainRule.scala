package typings.pulumiAws.outputMod.dlm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecyclePolicyPolicyDetailsScheduleRetainRule extends js.Object {
  
  /**
    * How many snapshots to keep. Must be an integer between 1 and 1000.
    */
  var count: Double = js.native
}
object LifecyclePolicyPolicyDetailsScheduleRetainRule {
  
  @scala.inline
  def apply(count: Double): LifecyclePolicyPolicyDetailsScheduleRetainRule = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyPolicyDetailsScheduleRetainRule]
  }
  
  @scala.inline
  implicit class LifecyclePolicyPolicyDetailsScheduleRetainRuleOps[Self <: LifecyclePolicyPolicyDetailsScheduleRetainRule] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
  }
}
