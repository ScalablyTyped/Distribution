package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagBindingData[Scope]
  extends StObject
     with BaseBindingData[Scope]
     with _BindingData[Scope] {
  
  var attributes: js.Array[AttributeExpressionData[Scope]]
  
  def getComponent(name: String): TemplateChunk[Scope, Any]
  
  var slots: js.Array[SlotBindingData[Scope]]
}
object TagBindingData {
  
  inline def apply[Scope](
    attributes: js.Array[AttributeExpressionData[Scope]],
    getComponent: String => TemplateChunk[Scope, Any],
    slots: js.Array[SlotBindingData[Scope]]
  ): TagBindingData[Scope] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], getComponent = js.Any.fromFunction1(getComponent), slots = slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagBindingData[Scope]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagBindingData[?], Scope] (val x: Self & TagBindingData[Scope]) extends AnyVal {
    
    inline def setAttributes(value: js.Array[AttributeExpressionData[Scope]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: AttributeExpressionData[Scope]*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setGetComponent(value: String => TemplateChunk[Scope, Any]): Self = StObject.set(x, "getComponent", js.Any.fromFunction1(value))
    
    inline def setSlots(value: js.Array[SlotBindingData[Scope]]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsVarargs(value: SlotBindingData[Scope]*): Self = StObject.set(x, "slots", js.Array(value*))
  }
}
