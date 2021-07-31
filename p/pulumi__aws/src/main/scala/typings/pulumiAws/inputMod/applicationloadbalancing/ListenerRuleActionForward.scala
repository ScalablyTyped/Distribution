package typings.pulumiAws.inputMod.applicationloadbalancing

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerRuleActionForward extends StObject {
  
  /**
    * The target group stickiness for the rule.
    */
  var stickiness: js.UndefOr[Input[ListenerRuleActionForwardStickiness]] = js.undefined
  
  /**
    * One or more target groups block.
    */
  var targetGroups: Input[js.Array[Input[ListenerRuleActionForwardTargetGroup]]]
}
object ListenerRuleActionForward {
  
  @scala.inline
  def apply(targetGroups: Input[js.Array[Input[ListenerRuleActionForwardTargetGroup]]]): ListenerRuleActionForward = {
    val __obj = js.Dynamic.literal(targetGroups = targetGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleActionForward]
  }
  
  @scala.inline
  implicit class ListenerRuleActionForwardMutableBuilder[Self <: ListenerRuleActionForward] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStickiness(value: Input[ListenerRuleActionForwardStickiness]): Self = StObject.set(x, "stickiness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickinessUndefined: Self = StObject.set(x, "stickiness", js.undefined)
    
    @scala.inline
    def setTargetGroups(value: Input[js.Array[Input[ListenerRuleActionForwardTargetGroup]]]): Self = StObject.set(x, "targetGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupsVarargs(value: Input[ListenerRuleActionForwardTargetGroup]*): Self = StObject.set(x, "targetGroups", js.Array(value :_*))
  }
}
