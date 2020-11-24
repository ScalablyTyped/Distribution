package typings.riotjsDomBindings.mod

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
  implicit class TagBindingDataOps[Self <: TagBindingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributesVarargs(value: AttributeExpressionData*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: js.Array[AttributeExpressionData]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetComponent(value: String => TemplateChunk[_, _]): Self = this.set("getComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSlotsVarargs(value: SlotBindingData*): Self = this.set("slots", js.Array(value :_*))
    
    @scala.inline
    def setSlots(value: js.Array[SlotBindingData]): Self = this.set("slots", value.asInstanceOf[js.Any])
  }
}
