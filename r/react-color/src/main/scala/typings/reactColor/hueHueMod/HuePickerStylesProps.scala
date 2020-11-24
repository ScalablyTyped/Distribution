package typings.reactColor.hueHueMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HuePickerStylesProps extends js.Object {
  
  var hue: CSSProperties = js.native
  
  var picker: CSSProperties = js.native
}
object HuePickerStylesProps {
  
  @scala.inline
  def apply(hue: CSSProperties, picker: CSSProperties): HuePickerStylesProps = {
    val __obj = js.Dynamic.literal(hue = hue.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[HuePickerStylesProps]
  }
  
  @scala.inline
  implicit class HuePickerStylesPropsOps[Self <: HuePickerStylesProps] (val x: Self) extends AnyVal {
    
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
    def setHue(value: CSSProperties): Self = this.set("hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicker(value: CSSProperties): Self = this.set("picker", value.asInstanceOf[js.Any])
  }
}
