package typings.pulumiAws.outputMod.applicationloadbalancing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerRuleActionForward extends StObject {
  
  /**
    * The target group stickiness for the rule.
    */
  var stickiness: js.UndefOr[ListenerRuleActionForwardStickiness] = js.undefined
  
  /**
    * One or more target groups block.
    */
  var targetGroups: js.Array[ListenerRuleActionForwardTargetGroup]
}
object ListenerRuleActionForward {
  
  inline def apply(targetGroups: js.Array[ListenerRuleActionForwardTargetGroup]): ListenerRuleActionForward = {
    val __obj = js.Dynamic.literal(targetGroups = targetGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleActionForward]
  }
  
  extension [Self <: ListenerRuleActionForward](x: Self) {
    
    inline def setStickiness(value: ListenerRuleActionForwardStickiness): Self = StObject.set(x, "stickiness", value.asInstanceOf[js.Any])
    
    inline def setStickinessUndefined: Self = StObject.set(x, "stickiness", js.undefined)
    
    inline def setTargetGroups(value: js.Array[ListenerRuleActionForwardTargetGroup]): Self = StObject.set(x, "targetGroups", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupsVarargs(value: ListenerRuleActionForwardTargetGroup*): Self = StObject.set(x, "targetGroups", js.Array(value :_*))
  }
}
