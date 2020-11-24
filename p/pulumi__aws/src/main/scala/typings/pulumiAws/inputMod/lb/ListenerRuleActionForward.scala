package typings.pulumiAws.inputMod.lb

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerRuleActionForward extends js.Object {
  
  /**
    * The target group stickiness for the rule.
    */
  var stickiness: js.UndefOr[Input[ListenerRuleActionForwardStickiness]] = js.native
  
  /**
    * One or more target groups block.
    */
  var targetGroups: Input[js.Array[Input[ListenerRuleActionForwardTargetGroup]]] = js.native
}
object ListenerRuleActionForward {
  
  @scala.inline
  def apply(targetGroups: Input[js.Array[Input[ListenerRuleActionForwardTargetGroup]]]): ListenerRuleActionForward = {
    val __obj = js.Dynamic.literal(targetGroups = targetGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleActionForward]
  }
  
  @scala.inline
  implicit class ListenerRuleActionForwardOps[Self <: ListenerRuleActionForward] (val x: Self) extends AnyVal {
    
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
    def setTargetGroupsVarargs(value: Input[ListenerRuleActionForwardTargetGroup]*): Self = this.set("targetGroups", js.Array(value :_*))
    
    @scala.inline
    def setTargetGroups(value: Input[js.Array[Input[ListenerRuleActionForwardTargetGroup]]]): Self = this.set("targetGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickiness(value: Input[ListenerRuleActionForwardStickiness]): Self = this.set("stickiness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStickiness: Self = this.set("stickiness", js.undefined)
  }
}
