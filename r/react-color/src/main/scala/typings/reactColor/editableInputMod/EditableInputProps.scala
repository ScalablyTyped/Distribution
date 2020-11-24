package typings.reactColor.editableInputMod

import typings.react.mod.ChangeEvent
import typings.react.mod.ClassAttributes
import typings.reactColor.mod.Color
import typings.reactColor.mod.ColorChangeHandler
import typings.reactColor.mod.ColorResult
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditableInputProps extends ClassAttributes[EditableInput] {
  
  var color: js.UndefOr[Color] = js.native
  
  var dragLabel: js.UndefOr[String] = js.native
  
  var dragMax: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var onChange: js.UndefOr[ColorChangeHandler] = js.native
  
  var style: js.UndefOr[EditableInputStyles] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object EditableInputProps {
  
  @scala.inline
  def apply(): EditableInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditableInputProps]
  }
  
  @scala.inline
  implicit class EditableInputPropsOps[Self <: EditableInputProps] (val x: Self) extends AnyVal {
    
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
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDragLabel(value: String): Self = this.set("dragLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragLabel: Self = this.set("dragLabel", js.undefined)
    
    @scala.inline
    def setDragMax(value: String): Self = this.set("dragMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragMax: Self = this.set("dragMax", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setStyle(value: EditableInputStyles): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
