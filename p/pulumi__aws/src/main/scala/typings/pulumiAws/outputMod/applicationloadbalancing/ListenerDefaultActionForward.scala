package typings.pulumiAws.outputMod.applicationloadbalancing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerDefaultActionForward extends StObject {
  
  /**
    * The target group stickiness for the rule.
    */
  var stickiness: js.UndefOr[ListenerDefaultActionForwardStickiness] = js.undefined
  
  /**
    * One or more target groups block.
    */
  var targetGroups: js.Array[ListenerDefaultActionForwardTargetGroup]
}
object ListenerDefaultActionForward {
  
  inline def apply(targetGroups: js.Array[ListenerDefaultActionForwardTargetGroup]): ListenerDefaultActionForward = {
    val __obj = js.Dynamic.literal(targetGroups = targetGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDefaultActionForward]
  }
  
  extension [Self <: ListenerDefaultActionForward](x: Self) {
    
    inline def setStickiness(value: ListenerDefaultActionForwardStickiness): Self = StObject.set(x, "stickiness", value.asInstanceOf[js.Any])
    
    inline def setStickinessUndefined: Self = StObject.set(x, "stickiness", js.undefined)
    
    inline def setTargetGroups(value: js.Array[ListenerDefaultActionForwardTargetGroup]): Self = StObject.set(x, "targetGroups", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupsVarargs(value: ListenerDefaultActionForwardTargetGroup*): Self = StObject.set(x, "targetGroups", js.Array(value :_*))
  }
}
