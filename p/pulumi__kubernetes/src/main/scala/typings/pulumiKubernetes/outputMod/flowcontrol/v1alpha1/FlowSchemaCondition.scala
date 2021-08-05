package typings.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FlowSchemaCondition describes conditions for a FlowSchema.
  */
trait FlowSchemaCondition extends StObject {
  
  /**
    * `lastTransitionTime` is the last time the condition transitioned from one status to another.
    */
  var lastTransitionTime: String
  
  /**
    * `message` is a human-readable message indicating details about last transition.
    */
  var message: String
  
  /**
    * `reason` is a unique, one-word, CamelCase reason for the condition's last transition.
    */
  var reason: String
  
  /**
    * `status` is the status of the condition. Can be True, False, Unknown. Required.
    */
  var status: String
  
  /**
    * `type` is the type of the condition. Required.
    */
  var `type`: String
}
object FlowSchemaCondition {
  
  inline def apply(lastTransitionTime: String, message: String, reason: String, status: String, `type`: String): FlowSchemaCondition = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowSchemaCondition]
  }
  
  extension [Self <: FlowSchemaCondition](x: Self) {
    
    inline def setLastTransitionTime(value: String): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
