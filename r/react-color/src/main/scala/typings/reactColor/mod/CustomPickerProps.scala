package typings.reactColor.mod

import typings.react.mod.ChangeEvent
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactNode
import typings.reactColor.anon.PartialClassesany
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomPickerProps[A] extends ClassAttributes[A] {
  
  var className: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[Color] = js.native
  
  var onChange: ColorChangeHandler = js.native
  
  var pointer: js.UndefOr[ReactNode] = js.native
  
  var styles: js.UndefOr[PartialClassesany] = js.native
}
object CustomPickerProps {
  
  @scala.inline
  def apply[A](onChange: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): CustomPickerProps[A] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange))
    __obj.asInstanceOf[CustomPickerProps[A]]
  }
  
  @scala.inline
  implicit class CustomPickerPropsOps[Self <: CustomPickerProps[_], A] (val x: Self with CustomPickerProps[A]) extends AnyVal {
    
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
    def setOnChange(value: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setPointer(value: ReactNode): Self = this.set("pointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointer: Self = this.set("pointer", js.undefined)
    
    @scala.inline
    def setStyles(value: PartialClassesany): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
