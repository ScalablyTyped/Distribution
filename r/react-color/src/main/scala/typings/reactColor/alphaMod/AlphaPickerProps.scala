package typings.reactColor.alphaMod

import typings.reactColor.anon.PartialClassesAlphaPicker
import typings.reactColor.mod.ColorPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlphaPickerProps extends ColorPickerProps[AlphaPicker] {
  
  var height: js.UndefOr[String] = js.native
  
  @JSName("styles")
  var styles_AlphaPickerProps: js.UndefOr[PartialClassesAlphaPicker] = js.native
  
  var width: js.UndefOr[String] = js.native
}
object AlphaPickerProps {
  
  @scala.inline
  def apply(): AlphaPickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlphaPickerProps]
  }
  
  @scala.inline
  implicit class AlphaPickerPropsOps[Self <: AlphaPickerProps] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setStyles(value: PartialClassesAlphaPicker): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
