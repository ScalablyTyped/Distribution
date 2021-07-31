package typings.reactColor.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-color.react-color/lib/components/sketch/Sketch.SketchPickerStylesProps> */
trait PartialSketchPickerStyles extends StObject {
  
  var Alpha: js.UndefOr[CSSProperties] = js.undefined
  
  var Hue: js.UndefOr[CSSProperties] = js.undefined
  
  var Saturation: js.UndefOr[CSSProperties] = js.undefined
  
  var activeColor: js.UndefOr[CSSProperties] = js.undefined
  
  var alpha: js.UndefOr[CSSProperties] = js.undefined
  
  var color: js.UndefOr[CSSProperties] = js.undefined
  
  var controls: js.UndefOr[CSSProperties] = js.undefined
  
  var hue: js.UndefOr[CSSProperties] = js.undefined
  
  var picker: js.UndefOr[CSSProperties] = js.undefined
  
  var saturation: js.UndefOr[CSSProperties] = js.undefined
  
  var sliders: js.UndefOr[CSSProperties] = js.undefined
}
object PartialSketchPickerStyles {
  
  @scala.inline
  def apply(): PartialSketchPickerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSketchPickerStyles]
  }
  
  @scala.inline
  implicit class PartialSketchPickerStylesMutableBuilder[Self <: PartialSketchPickerStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveColor(value: CSSProperties): Self = StObject.set(x, "activeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveColorUndefined: Self = StObject.set(x, "activeColor", js.undefined)
    
    @scala.inline
    def setAlpha(value: CSSProperties): Self = StObject.set(x, "Alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "Alpha", js.undefined)
    
    @scala.inline
    def setColor(value: CSSProperties): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setControls(value: CSSProperties): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    @scala.inline
    def setHue(value: CSSProperties): Self = StObject.set(x, "Hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHueUndefined: Self = StObject.set(x, "Hue", js.undefined)
    
    @scala.inline
    def setPicker(value: CSSProperties): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
    
    @scala.inline
    def setSaturation(value: CSSProperties): Self = StObject.set(x, "Saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaturationUndefined: Self = StObject.set(x, "Saturation", js.undefined)
    
    @scala.inline
    def setSliders(value: CSSProperties): Self = StObject.set(x, "sliders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidersUndefined: Self = StObject.set(x, "sliders", js.undefined)
  }
}
