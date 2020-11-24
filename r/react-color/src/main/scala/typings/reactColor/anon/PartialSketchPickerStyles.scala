package typings.reactColor.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-color.react-color/lib/components/sketch/Sketch.SketchPickerStylesProps> */
@js.native
trait PartialSketchPickerStyles extends js.Object {
  
  var Alpha: js.UndefOr[CSSProperties] = js.native
  
  var Hue: js.UndefOr[CSSProperties] = js.native
  
  var Saturation: js.UndefOr[CSSProperties] = js.native
  
  var activeColor: js.UndefOr[CSSProperties] = js.native
  
  var alpha: js.UndefOr[CSSProperties] = js.native
  
  var color: js.UndefOr[CSSProperties] = js.native
  
  var controls: js.UndefOr[CSSProperties] = js.native
  
  var hue: js.UndefOr[CSSProperties] = js.native
  
  var picker: js.UndefOr[CSSProperties] = js.native
  
  var saturation: js.UndefOr[CSSProperties] = js.native
  
  var sliders: js.UndefOr[CSSProperties] = js.native
}
object PartialSketchPickerStyles {
  
  @scala.inline
  def apply(): PartialSketchPickerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSketchPickerStyles]
  }
  
  @scala.inline
  implicit class PartialSketchPickerStylesOps[Self <: PartialSketchPickerStyles] (val x: Self) extends AnyVal {
    
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
    def deleteAlpha: Self = this.set("Alpha", js.undefined)
    
    @scala.inline
    def setHue(value: CSSProperties): Self = this.set("Hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHue: Self = this.set("Hue", js.undefined)
    
    @scala.inline
    def setSaturation(value: CSSProperties): Self = this.set("Saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaturation: Self = this.set("Saturation", js.undefined)
    
    @scala.inline
    def setActiveColor(value: CSSProperties): Self = this.set("activeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveColor: Self = this.set("activeColor", js.undefined)
    
    @scala.inline
    def setColor(value: CSSProperties): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setControls(value: CSSProperties): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    
    @scala.inline
    def setPicker(value: CSSProperties): Self = this.set("picker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePicker: Self = this.set("picker", js.undefined)
    
    @scala.inline
    def setSliders(value: CSSProperties): Self = this.set("sliders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSliders: Self = this.set("sliders", js.undefined)
  }
}
