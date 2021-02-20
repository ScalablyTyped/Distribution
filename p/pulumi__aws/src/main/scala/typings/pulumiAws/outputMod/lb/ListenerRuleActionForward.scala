package typings.pulumiAws.outputMod.lb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerRuleActionForward extends StObject {
  
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
  implicit class ListenerRuleActionForwardMutableBuilder[Self <: ListenerRuleActionForward] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStickiness(value: ListenerRuleActionForwardStickiness): Self = StObject.set(x, "stickiness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickinessUndefined: Self = StObject.set(x, "stickiness", js.undefined)
    
    @scala.inline
    def setTargetGroups(value: js.Array[ListenerRuleActionForwardTargetGroup]): Self = StObject.set(x, "targetGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupsVarargs(value: ListenerRuleActionForwardTargetGroup*): Self = StObject.set(x, "targetGroups", js.Array(value :_*))
  }
}
