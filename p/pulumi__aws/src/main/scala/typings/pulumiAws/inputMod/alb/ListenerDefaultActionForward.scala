package typings.pulumiAws.inputMod.alb

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerDefaultActionForward extends StObject {
  
  /**
    * The target group stickiness for the rule.
    */
  var stickiness: js.UndefOr[Input[ListenerDefaultActionForwardStickiness]] = js.undefined
  
  /**
    * One or more target groups block.
    */
  var targetGroups: Input[js.Array[Input[ListenerDefaultActionForwardTargetGroup]]]
}
object ListenerDefaultActionForward {
  
  @scala.inline
  def apply(targetGroups: Input[js.Array[Input[ListenerDefaultActionForwardTargetGroup]]]): ListenerDefaultActionForward = {
    val __obj = js.Dynamic.literal(targetGroups = targetGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDefaultActionForward]
  }
  
  @scala.inline
  implicit class ListenerDefaultActionForwardMutableBuilder[Self <: ListenerDefaultActionForward] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStickiness(value: Input[ListenerDefaultActionForwardStickiness]): Self = StObject.set(x, "stickiness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickinessUndefined: Self = StObject.set(x, "stickiness", js.undefined)
    
    @scala.inline
    def setTargetGroups(value: Input[js.Array[Input[ListenerDefaultActionForwardTargetGroup]]]): Self = StObject.set(x, "targetGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupsVarargs(value: Input[ListenerDefaultActionForwardTargetGroup]*): Self = StObject.set(x, "targetGroups", js.Array(value :_*))
  }
}
