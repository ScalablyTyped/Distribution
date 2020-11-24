package typings.reduxForm.fieldMod

import typings.react.mod.ChangeEvent
import typings.react.mod.DragEvent
import typings.react.mod.FocusEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrappedFieldInputProps extends CommonFieldInputProps {
  
  var checked: js.UndefOr[Boolean] = js.native
  
  var onBlur: EventOrValueHandler[FocusEvent[_]] = js.native
  
  var onChange: EventOrValueHandler[ChangeEvent[_]] = js.native
  
  var value: js.Any = js.native
}
object WrappedFieldInputProps {
  
  @scala.inline
  def apply(
    name: String,
    onBlur: EventOrValueHandler[FocusEvent[_]],
    onChange: EventOrValueHandler[ChangeEvent[_]],
    onDragStart: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit,
    onDrop: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit,
    onFocus: (FocusEvent[_], /* name */ js.UndefOr[String]) => Unit,
    value: js.Any
  ): WrappedFieldInputProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onBlur = onBlur.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onDragStart = js.Any.fromFunction2(onDragStart), onDrop = js.Any.fromFunction2(onDrop), onFocus = js.Any.fromFunction2(onFocus), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedFieldInputProps]
  }
  
  @scala.inline
  implicit class WrappedFieldInputPropsOps[Self <: WrappedFieldInputProps] (val x: Self) extends AnyVal {
    
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
    def setOnBlur(value: EventOrValueHandler[FocusEvent[_]]): Self = this.set("onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: EventOrValueHandler[ChangeEvent[_]]): Self = this.set("onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
  }
}
