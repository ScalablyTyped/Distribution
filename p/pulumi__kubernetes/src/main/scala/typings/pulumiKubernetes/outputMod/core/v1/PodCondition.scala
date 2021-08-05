package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodCondition contains details for the current condition of this pod.
  */
trait PodCondition extends StObject {
  
  /**
    * Last time we probed the condition.
    */
  var lastProbeTime: String
  
  /**
    * Last time the condition transitioned from one status to another.
    */
  var lastTransitionTime: String
  
  /**
    * Human-readable message indicating details about last transition.
    */
  var message: String
  
  /**
    * Unique, one-word, CamelCase reason for the condition's last transition.
    */
  var reason: String
  
  /**
    * Status is the status of the condition. Can be True, False, Unknown. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
    */
  var status: String
  
  /**
    * Type is the type of the condition. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
    */
  var `type`: String
}
object PodCondition {
  
  inline def apply(
    lastProbeTime: String,
    lastTransitionTime: String,
    message: String,
    reason: String,
    status: String,
    `type`: String
  ): PodCondition = {
    val __obj = js.Dynamic.literal(lastProbeTime = lastProbeTime.asInstanceOf[js.Any], lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodCondition]
  }
  
  extension [Self <: PodCondition](x: Self) {
    
    inline def setLastProbeTime(value: String): Self = StObject.set(x, "lastProbeTime", value.asInstanceOf[js.Any])
    
    inline def setLastTransitionTime(value: String): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
