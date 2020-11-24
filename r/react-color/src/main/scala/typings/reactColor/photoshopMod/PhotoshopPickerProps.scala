package typings.reactColor.photoshopMod

import typings.react.mod.ChangeEvent
import typings.reactColor.anon.PartialClassesPhotoshopPi
import typings.reactColor.mod.ColorChangeHandler
import typings.reactColor.mod.ColorPickerProps
import typings.reactColor.mod.ColorResult
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhotoshopPickerProps extends ColorPickerProps[PhotoshopPicker] {
  
  var header: js.UndefOr[String] = js.native
  
  var onAccept: js.UndefOr[ColorChangeHandler] = js.native
  
  var onCancel: js.UndefOr[ColorChangeHandler] = js.native
  
  @JSName("styles")
  var styles_PhotoshopPickerProps: js.UndefOr[PartialClassesPhotoshopPi] = js.native
}
object PhotoshopPickerProps {
  
  @scala.inline
  def apply(): PhotoshopPickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhotoshopPickerProps]
  }
  
  @scala.inline
  implicit class PhotoshopPickerPropsOps[Self <: PhotoshopPickerProps] (val x: Self) extends AnyVal {
    
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
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setOnAccept(value: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): Self = this.set("onAccept", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnAccept: Self = this.set("onAccept", js.undefined)
    
    @scala.inline
    def setOnCancel(value: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): Self = this.set("onCancel", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    
    @scala.inline
    def setStyles(value: PartialClassesPhotoshopPi): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
