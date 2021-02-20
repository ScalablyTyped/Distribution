package typings.pulumiAws.outputMod.lb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerDefaultActionForward extends StObject {
  
  /**
    * The target group stickiness for the rule.
    */
  var stickiness: js.UndefOr[ListenerDefaultActionForwardStickiness] = js.native
  
  /**
    * One or more target groups block.
    */
  var targetGroups: js.Array[ListenerDefaultActionForwardTargetGroup] = js.native
}
object ListenerDefaultActionForward {
  
  @scala.inline
  def apply(targetGroups: js.Array[ListenerDefaultActionForwardTargetGroup]): ListenerDefaultActionForward = {
    val __obj = js.Dynamic.literal(targetGroups = targetGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDefaultActionForward]
  }
  
  @scala.inline
  implicit class ListenerDefaultActionForwardMutableBuilder[Self <: ListenerDefaultActionForward] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStickiness(value: ListenerDefaultActionForwardStickiness): Self = StObject.set(x, "stickiness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickinessUndefined: Self = StObject.set(x, "stickiness", js.undefined)
    
    @scala.inline
    def setTargetGroups(value: js.Array[ListenerDefaultActionForwardTargetGroup]): Self = StObject.set(x, "targetGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupsVarargs(value: ListenerDefaultActionForwardTargetGroup*): Self = StObject.set(x, "targetGroups", js.Array(value :_*))
  }
}
