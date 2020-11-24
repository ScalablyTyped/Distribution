package typings.reactColor.mod

import typings.react.mod.ChangeEvent
import typings.react.mod.ClassAttributes
import typings.reactColor.anon.PartialClassesany
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorPickerProps[A] extends ClassAttributes[A] {
  
  var className: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[Color] = js.native
  
  var onChange: js.UndefOr[ColorChangeHandler] = js.native
  
  var onChangeComplete: js.UndefOr[ColorChangeHandler] = js.native
  
  var styles: js.UndefOr[PartialClassesany] = js.native
}
object ColorPickerProps {
  
  @scala.inline
  def apply[A](): ColorPickerProps[A] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorPickerProps[A]]
  }
  
  @scala.inline
  implicit class ColorPickerPropsOps[Self <: ColorPickerProps[_], A] (val x: Self with ColorPickerProps[A]) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnChangeComplete(value: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): Self = this.set("onChangeComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChangeComplete: Self = this.set("onChangeComplete", js.undefined)
    
    @scala.inline
    def setStyles(value: PartialClassesany): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
