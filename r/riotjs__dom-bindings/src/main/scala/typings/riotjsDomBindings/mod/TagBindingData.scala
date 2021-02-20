package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagBindingData
  extends BaseBindingData
     with BindingData {
  
  var attributes: js.Array[AttributeExpressionData] = js.native
  
  def getComponent(name: String): TemplateChunk[_, _] = js.native
  
  var slots: js.Array[SlotBindingData] = js.native
}
object TagBindingData {
  
  @scala.inline
  def apply(
    attributes: js.Array[AttributeExpressionData],
    getComponent: String => TemplateChunk[_, _],
    slots: js.Array[SlotBindingData]
  ): TagBindingData = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], getComponent = js.Any.fromFunction1(getComponent), slots = slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagBindingData]
  }
  
  @scala.inline
  implicit class TagBindingDataMutableBuilder[Self <: TagBindingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[AttributeExpressionData]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesVarargs(value: AttributeExpressionData*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setGetComponent(value: String => TemplateChunk[_, _]): Self = StObject.set(x, "getComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSlots(value: js.Array[SlotBindingData]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotsVarargs(value: SlotBindingData*): Self = StObject.set(x, "slots", js.Array(value :_*))
  }
}
