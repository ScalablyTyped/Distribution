package typings.reactColor.sketchMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchPickerStylesProps extends js.Object {
  
  var Alpha: CSSProperties = js.native
  
  var Hue: CSSProperties = js.native
  
  var Saturation: CSSProperties = js.native
  
  var activeColor: CSSProperties = js.native
  
  var alpha: CSSProperties = js.native
  
  var color: CSSProperties = js.native
  
  var controls: CSSProperties = js.native
  
  var hue: CSSProperties = js.native
  
  var picker: CSSProperties = js.native
  
  var saturation: CSSProperties = js.native
  
  var sliders: CSSProperties = js.native
}
object SketchPickerStylesProps {
  
  @scala.inline
  def apply(
    Alpha: CSSProperties,
    Hue: CSSProperties,
    Saturation: CSSProperties,
    activeColor: CSSProperties,
    alpha: CSSProperties,
    color: CSSProperties,
    controls: CSSProperties,
    hue: CSSProperties,
    picker: CSSProperties,
    saturation: CSSProperties,
    sliders: CSSProperties
  ): SketchPickerStylesProps = {
    val __obj = js.Dynamic.literal(Alpha = Alpha.asInstanceOf[js.Any], Hue = Hue.asInstanceOf[js.Any], Saturation = Saturation.asInstanceOf[js.Any], activeColor = activeColor.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], sliders = sliders.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchPickerStylesProps]
  }
  
  @scala.inline
  implicit class SketchPickerStylesPropsOps[Self <: SketchPickerStylesProps] (val x: Self) extends AnyVal {
    
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
    def setActiveColor(value: CSSProperties): Self = this.set("activeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: CSSProperties): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControls(value: CSSProperties): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicker(value: CSSProperties): Self = this.set("picker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSliders(value: CSSProperties): Self = this.set("sliders", value.asInstanceOf[js.Any])
  }
}
