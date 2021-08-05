package typings.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HorizontalPodAutoscalerCondition describes the state of a HorizontalPodAutoscaler at a certain point.
  */
trait HorizontalPodAutoscalerCondition extends StObject {
  
  /**
    * lastTransitionTime is the last time the condition transitioned from one status to another
    */
  var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * message is a human-readable explanation containing details about the transition
    */
  var message: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * reason is the reason for the condition's last transition.
    */
  var reason: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * status is the status of the condition (True, False, Unknown)
    */
  var status: Input[String]
  
  /**
    * type describes the current condition
    */
  var `type`: Input[String]
}
object HorizontalPodAutoscalerCondition {
  
  inline def apply(status: Input[String], `type`: Input[String]): HorizontalPodAutoscalerCondition = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscalerCondition]
  }
  
  extension [Self <: HorizontalPodAutoscalerCondition](x: Self) {
    
    inline def setLastTransitionTime(value: Input[String]): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
    
    inline def setLastTransitionTimeUndefined: Self = StObject.set(x, "lastTransitionTime", js.undefined)
    
    inline def setMessage(value: Input[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setReason(value: Input[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
