package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FlowSchemaCondition describes conditions for a FlowSchema.
  */
@js.native
trait FlowSchemaCondition extends StObject {
  
  /**
    * `lastTransitionTime` is the last time the condition transitioned from one status to another.
    */
  var lastTransitionTime: js.UndefOr[Input[String]] = js.native
  
  /**
    * `message` is a human-readable message indicating details about last transition.
    */
  var message: js.UndefOr[Input[String]] = js.native
  
  /**
    * `reason` is a unique, one-word, CamelCase reason for the condition's last transition.
    */
  var reason: js.UndefOr[Input[String]] = js.native
  
  /**
    * `status` is the status of the condition. Can be True, False, Unknown. Required.
    */
  var status: js.UndefOr[Input[String]] = js.native
  
  /**
    * `type` is the type of the condition. Required.
    */
  var `type`: js.UndefOr[Input[String]] = js.native
}
object FlowSchemaCondition {
  
  @scala.inline
  def apply(): FlowSchemaCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowSchemaCondition]
  }
  
  @scala.inline
  implicit class FlowSchemaConditionMutableBuilder[Self <: FlowSchemaCondition] (val x: Self) extends AnyVal {
    
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
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
