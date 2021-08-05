package typings.pulumiKubernetes.outputMod.apps.v1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DeploymentCondition describes the state of a deployment at a certain point.
  */
trait DeploymentCondition extends StObject {
  
  /**
    * Last time the condition transitioned from one status to another.
    */
  var lastTransitionTime: String
  
  /**
    * The last time this condition was updated.
    */
  var lastUpdateTime: String
  
  /**
    * A human readable message indicating details about the transition.
    */
  var message: String
  
  /**
    * The reason for the condition's last transition.
    */
  var reason: String
  
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  var status: String
  
  /**
    * Type of deployment condition.
    */
  var `type`: String
}
object DeploymentCondition {
  
  inline def apply(
    lastTransitionTime: String,
    lastUpdateTime: String,
    message: String,
    reason: String,
    status: String,
    `type`: String
  ): DeploymentCondition = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], lastUpdateTime = lastUpdateTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentCondition]
  }
  
  extension [Self <: DeploymentCondition](x: Self) {
    
    inline def setLastTransitionTime(value: String): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
