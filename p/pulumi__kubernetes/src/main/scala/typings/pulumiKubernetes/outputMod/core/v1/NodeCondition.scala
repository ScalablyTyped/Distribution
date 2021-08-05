package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodeCondition contains condition information for a node.
  */
trait NodeCondition extends StObject {
  
  /**
    * Last time we got an update on a given condition.
    */
  var lastHeartbeatTime: String
  
  /**
    * Last time the condition transit from one status to another.
    */
  var lastTransitionTime: String
  
  /**
    * Human readable message indicating details about last transition.
    */
  var message: String
  
  /**
    * (brief) reason for the condition's last transition.
    */
  var reason: String
  
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  var status: String
  
  /**
    * Type of node condition.
    */
  var `type`: String
}
object NodeCondition {
  
  inline def apply(
    lastHeartbeatTime: String,
    lastTransitionTime: String,
    message: String,
    reason: String,
    status: String,
    `type`: String
  ): NodeCondition = {
    val __obj = js.Dynamic.literal(lastHeartbeatTime = lastHeartbeatTime.asInstanceOf[js.Any], lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeCondition]
  }
  
  extension [Self <: NodeCondition](x: Self) {
    
    inline def setLastHeartbeatTime(value: String): Self = StObject.set(x, "lastHeartbeatTime", value.asInstanceOf[js.Any])
    
    inline def setLastTransitionTime(value: String): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
