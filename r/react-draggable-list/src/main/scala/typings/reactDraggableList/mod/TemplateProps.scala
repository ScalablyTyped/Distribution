package typings.reactDraggableList.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateProps[I, C] extends js.Object {
  
  var anySelected: Double = js.native
  
  var commonProps: C = js.native
  
  var dragHandleProps: js.Object = js.native
  
  var item: I = js.native
  
  var itemSelected: Double = js.native
}
object TemplateProps {
  
  @scala.inline
  def apply[I, C](anySelected: Double, commonProps: C, dragHandleProps: js.Object, item: I, itemSelected: Double): TemplateProps[I, C] = {
    val __obj = js.Dynamic.literal(anySelected = anySelected.asInstanceOf[js.Any], commonProps = commonProps.asInstanceOf[js.Any], dragHandleProps = dragHandleProps.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemSelected = itemSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateProps[I, C]]
  }
  
  @scala.inline
  implicit class TemplatePropsOps[Self <: TemplateProps[_, _], I, C] (val x: Self with (TemplateProps[I, C])) extends AnyVal {
    
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
    def setAnySelected(value: Double): Self = this.set("anySelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonProps(value: C): Self = this.set("commonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragHandleProps(value: js.Object): Self = this.set("dragHandleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: I): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSelected(value: Double): Self = this.set("itemSelected", value.asInstanceOf[js.Any])
  }
}
