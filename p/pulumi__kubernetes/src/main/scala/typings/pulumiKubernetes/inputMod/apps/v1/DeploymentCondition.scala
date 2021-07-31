package typings.pulumiKubernetes.inputMod.apps.v1

import typings.pulumiPulumi.outputMod.Input
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
  var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The last time this condition was updated.
    */
  var lastUpdateTime: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A human readable message indicating details about the transition.
    */
  var message: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The reason for the condition's last transition.
    */
  var reason: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  var status: Input[String]
  
  /**
    * Type of deployment condition.
    */
  var `type`: Input[String]
}
object DeploymentCondition {
  
  @scala.inline
  def apply(status: Input[String], `type`: Input[String]): DeploymentCondition = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentCondition]
  }
  
  @scala.inline
  implicit class DeploymentConditionMutableBuilder[Self <: DeploymentCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastTransitionTime(value: Input[String]): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTransitionTimeUndefined: Self = StObject.set(x, "lastTransitionTime", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: Input[String]): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
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
