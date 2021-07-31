package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NamespaceCondition contains details about state of namespace.
  */
trait NamespaceCondition extends StObject {
  
  var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
  
  var message: js.UndefOr[Input[String]] = js.undefined
  
  var reason: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  var status: Input[String]
  
  /**
    * Type of namespace controller condition.
    */
  var `type`: Input[String]
}
object NamespaceCondition {
  
  @scala.inline
  def apply(status: Input[String], `type`: Input[String]): NamespaceCondition = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceCondition]
  }
  
  @scala.inline
  implicit class NamespaceConditionMutableBuilder[Self <: NamespaceCondition] (val x: Self) extends AnyVal {
    
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
