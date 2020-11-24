package typings.riot.anon

import typings.riotjsDomBindings.mod.AttributeExpressionData
import typings.riotjsDomBindings.mod.SlotBindingData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentScope extends js.Object {
  
  var attributes: js.Array[AttributeExpressionData] = js.native
  
  var parentScope: js.Any = js.native
  
  var slots: js.Array[SlotBindingData] = js.native
}
object ParentScope {
  
  @scala.inline
  def apply(
    attributes: js.Array[AttributeExpressionData],
    parentScope: js.Any,
    slots: js.Array[SlotBindingData]
  ): ParentScope = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], parentScope = parentScope.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentScope]
  }
  
  @scala.inline
  implicit class ParentScopeOps[Self <: ParentScope] (val x: Self) extends AnyVal {
    
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
    def setParentScope(value: js.Any): Self = this.set("parentScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotsVarargs(value: SlotBindingData*): Self = this.set("slots", js.Array(value :_*))
    
    @scala.inline
    def setSlots(value: js.Array[SlotBindingData]): Self = this.set("slots", value.asInstanceOf[js.Any])
  }
}
