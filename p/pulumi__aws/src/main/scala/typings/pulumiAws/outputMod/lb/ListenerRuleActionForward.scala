package typings.pulumiAws.outputMod.lb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerRuleActionForward extends js.Object {
  
  /**
    * The target group stickiness for the rule.
    */
  var stickiness: js.UndefOr[ListenerRuleActionForwardStickiness] = js.native
  
  /**
    * One or more target groups block.
    */
  var targetGroups: js.Array[ListenerRuleActionForwardTargetGroup] = js.native
}
object ListenerRuleActionForward {
  
  @scala.inline
  def apply(targetGroups: js.Array[ListenerRuleActionForwardTargetGroup]): ListenerRuleActionForward = {
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
    def setTargetGroupsVarargs(value: ListenerRuleActionForwardTargetGroup*): Self = this.set("targetGroups", js.Array(value :_*))
    
    @scala.inline
    def setTargetGroups(value: js.Array[ListenerRuleActionForwardTargetGroup]): Self = this.set("targetGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickiness(value: ListenerRuleActionForwardStickiness): Self = this.set("stickiness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStickiness: Self = this.set("stickiness", js.undefined)
  }
}
