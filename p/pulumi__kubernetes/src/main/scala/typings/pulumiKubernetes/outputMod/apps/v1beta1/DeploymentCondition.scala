package typings.pulumiKubernetes.outputMod.apps.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DeploymentCondition describes the state of a deployment at a certain point.
  */
@js.native
trait DeploymentCondition extends StObject {
  
  /**
    * Last time the condition transitioned from one status to another.
    */
  var lastTransitionTime: String = js.native
  
  /**
    * The last time this condition was updated.
    */
  var lastUpdateTime: String = js.native
  
  /**
    * A human readable message indicating details about the transition.
    */
  var message: String = js.native
  
  /**
    * The reason for the condition's last transition.
    */
  var reason: String = js.native
  
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  var status: String = js.native
  
  /**
    * Type of deployment condition.
    */
  var `type`: String = js.native
}
object DeploymentCondition {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class DeploymentConditionMutableBuilder[Self <: DeploymentCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastTransitionTime(value: String): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
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
