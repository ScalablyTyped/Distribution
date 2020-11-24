package typings.reactColor.sliderMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderPickerStylesProps extends js.Object {
  
  var Hue: CSSProperties = js.native
  
  var hue: CSSProperties = js.native
}
object SliderPickerStylesProps {
  
  @scala.inline
  def apply(Hue: CSSProperties, hue: CSSProperties): SliderPickerStylesProps = {
    val __obj = js.Dynamic.literal(Hue = Hue.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderPickerStylesProps]
  }
  
  @scala.inline
  implicit class SliderPickerStylesPropsOps[Self <: SliderPickerStylesProps] (val x: Self) extends AnyVal {
    
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
    def setHue(value: CSSProperties): Self = this.set("Hue", value.asInstanceOf[js.Any])
  }
}
