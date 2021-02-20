package typings.pulumiKubernetes.outputMod.autoscaling.v2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HorizontalPodAutoscalerCondition describes the state of a HorizontalPodAutoscaler at a certain point.
  */
@js.native
trait HorizontalPodAutoscalerCondition extends StObject {
  
  /**
    * lastTransitionTime is the last time the condition transitioned from one status to another
    */
  var lastTransitionTime: String = js.native
  
  /**
    * message is a human-readable explanation containing details about the transition
    */
  var message: String = js.native
  
  /**
    * reason is the reason for the condition's last transition.
    */
  var reason: String = js.native
  
  /**
    * status is the status of the condition (True, False, Unknown)
    */
  var status: String = js.native
  
  /**
    * type describes the current condition
    */
  var `type`: String = js.native
}
object HorizontalPodAutoscalerCondition {
  
  @scala.inline
  def apply(lastTransitionTime: String, message: String, reason: String, status: String, `type`: String): HorizontalPodAutoscalerCondition = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscalerCondition]
  }
  
  @scala.inline
  implicit class HorizontalPodAutoscalerConditionMutableBuilder[Self <: HorizontalPodAutoscalerCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastTransitionTime(value: String): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
