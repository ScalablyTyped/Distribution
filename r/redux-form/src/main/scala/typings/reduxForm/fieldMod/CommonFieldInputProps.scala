package typings.reduxForm.fieldMod

import typings.react.mod.DragEvent
import typings.react.mod.FocusEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonFieldInputProps extends js.Object {
  
  var name: String = js.native
  
  var onDragStart: EventHandler[DragEvent[_]] = js.native
  
  var onDrop: EventHandler[DragEvent[_]] = js.native
  
  var onFocus: EventHandler[FocusEvent[_]] = js.native
}
object CommonFieldInputProps {
  
  @scala.inline
  def apply(
    name: String,
    onDragStart: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit,
    onDrop: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit,
    onFocus: (FocusEvent[_], /* name */ js.UndefOr[String]) => Unit
  ): CommonFieldInputProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onDragStart = js.Any.fromFunction2(onDragStart), onDrop = js.Any.fromFunction2(onDrop), onFocus = js.Any.fromFunction2(onFocus))
    __obj.asInstanceOf[CommonFieldInputProps]
  }
  
  @scala.inline
  implicit class CommonFieldInputPropsOps[Self <: CommonFieldInputProps] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragStart(value: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit): Self = this.set("onDragStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDrop(value: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit): Self = this.set("onDrop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnFocus(value: (FocusEvent[_], /* name */ js.UndefOr[String]) => Unit): Self = this.set("onFocus", js.Any.fromFunction2(value))
  }
}
