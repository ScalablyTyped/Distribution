package typings.reactColor.chromeMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChromePickerStylesProps extends js.Object {
  
  var Alpha: CSSProperties = js.native
  
  var Hue: CSSProperties = js.native
  
  var Saturation: CSSProperties = js.native
  
  var active: CSSProperties = js.native
  
  var alpha: CSSProperties = js.native
  
  var body: CSSProperties = js.native
  
  var color: CSSProperties = js.native
  
  var controls: CSSProperties = js.native
  
  var hue: CSSProperties = js.native
  
  var picker: CSSProperties = js.native
  
  var saturation: CSSProperties = js.native
  
  var swatch: CSSProperties = js.native
  
  var toggles: CSSProperties = js.native
}
object ChromePickerStylesProps {
  
  @scala.inline
  def apply(
    Alpha: CSSProperties,
    Hue: CSSProperties,
    Saturation: CSSProperties,
    active: CSSProperties,
    alpha: CSSProperties,
    body: CSSProperties,
    color: CSSProperties,
    controls: CSSProperties,
    hue: CSSProperties,
    picker: CSSProperties,
    saturation: CSSProperties,
    swatch: CSSProperties,
    toggles: CSSProperties
  ): ChromePickerStylesProps = {
    val __obj = js.Dynamic.literal(Alpha = Alpha.asInstanceOf[js.Any], Hue = Hue.asInstanceOf[js.Any], Saturation = Saturation.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], swatch = swatch.asInstanceOf[js.Any], toggles = toggles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromePickerStylesProps]
  }
  
  @scala.inline
  implicit class ChromePickerStylesPropsOps[Self <: ChromePickerStylesProps] (val x: Self) extends AnyVal {
    
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
    def setAlpha(value: CSSProperties): Self = this.set("Alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHue(value: CSSProperties): Self = this.set("Hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaturation(value: CSSProperties): Self = this.set("Saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: CSSProperties): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: CSSProperties): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: CSSProperties): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControls(value: CSSProperties): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicker(value: CSSProperties): Self = this.set("picker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwatch(value: CSSProperties): Self = this.set("swatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggles(value: CSSProperties): Self = this.set("toggles", value.asInstanceOf[js.Any])
  }
}
