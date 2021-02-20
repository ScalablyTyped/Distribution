package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NamespaceCondition contains details about state of namespace.
  */
@js.native
trait NamespaceCondition extends StObject {
  
  var lastTransitionTime: String = js.native
  
  var message: String = js.native
  
  var reason: String = js.native
  
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  var status: String = js.native
  
  /**
    * Type of namespace controller condition.
    */
  var `type`: String = js.native
}
object NamespaceCondition {
  
  @scala.inline
  def apply(lastTransitionTime: String, message: String, reason: String, status: String, `type`: String): NamespaceCondition = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceCondition]
  }
  
  @scala.inline
  implicit class NamespaceConditionMutableBuilder[Self <: NamespaceCondition] (val x: Self) extends AnyVal {
    
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
