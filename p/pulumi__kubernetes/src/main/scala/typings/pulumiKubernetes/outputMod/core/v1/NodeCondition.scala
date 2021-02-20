package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodeCondition contains condition information for a node.
  */
@js.native
trait NodeCondition extends StObject {
  
  /**
    * Last time we got an update on a given condition.
    */
  var lastHeartbeatTime: String = js.native
  
  /**
    * Last time the condition transit from one status to another.
    */
  var lastTransitionTime: String = js.native
  
  /**
    * Human readable message indicating details about last transition.
    */
  var message: String = js.native
  
  /**
    * (brief) reason for the condition's last transition.
    */
  var reason: String = js.native
  
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  var status: String = js.native
  
  /**
    * Type of node condition.
    */
  var `type`: String = js.native
}
object NodeCondition {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class NodeConditionMutableBuilder[Self <: NodeCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastHeartbeatTime(value: String): Self = StObject.set(x, "lastHeartbeatTime", value.asInstanceOf[js.Any])
    
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
