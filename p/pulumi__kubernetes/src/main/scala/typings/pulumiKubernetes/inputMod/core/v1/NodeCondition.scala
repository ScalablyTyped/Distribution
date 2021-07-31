package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var lastHeartbeatTime: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Last time the condition transit from one status to another.
    */
  var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Human readable message indicating details about last transition.
    */
  var message: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * (brief) reason for the condition's last transition.
    */
  var reason: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  var status: Input[String]
  
  /**
    * Type of node condition.
    */
  var `type`: Input[String]
}
object NodeCondition {
  
  @scala.inline
  def apply(status: Input[String], `type`: Input[String]): NodeCondition = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeCondition]
  }
  
  @scala.inline
  implicit class NodeConditionMutableBuilder[Self <: NodeCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastHeartbeatTime(value: Input[String]): Self = StObject.set(x, "lastHeartbeatTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastHeartbeatTimeUndefined: Self = StObject.set(x, "lastHeartbeatTime", js.undefined)
    
    @scala.inline
    def setLastTransitionTime(value: Input[String]): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTransitionTimeUndefined: Self = StObject.set(x, "lastTransitionTime", js.undefined)
    
    @scala.inline
    def setMessage(value: Input[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setReason(value: Input[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
