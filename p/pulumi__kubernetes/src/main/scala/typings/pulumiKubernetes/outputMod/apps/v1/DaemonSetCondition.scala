package typings.pulumiKubernetes.outputMod.apps.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DaemonSetCondition describes the state of a DaemonSet at a certain point.
  */
trait DaemonSetCondition extends StObject {
  
  /**
    * Last time the condition transitioned from one status to another.
    */
  var lastTransitionTime: String
  
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
    * Type of DaemonSet condition.
    */
  var `type`: String
}
object DaemonSetCondition {
  
  inline def apply(lastTransitionTime: String, message: String, reason: String, status: String, `type`: String): DaemonSetCondition = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaemonSetCondition]
  }
  
  extension [Self <: DaemonSetCondition](x: Self) {
    
    inline def setLastTransitionTime(value: String): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
