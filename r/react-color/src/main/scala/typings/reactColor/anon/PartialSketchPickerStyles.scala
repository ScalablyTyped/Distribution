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
  
  inline def apply(): PartialSketchPickerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSketchPickerStyles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialSketchPickerStyles] (val x: Self) extends AnyVal {
    
    inline def setActiveColor(value: CSSProperties): Self = StObject.set(x, "activeColor", value.asInstanceOf[js.Any])
    
    inline def setActiveColorUndefined: Self = StObject.set(x, "activeColor", js.undefined)
    
    inline def setAlpha(value: CSSProperties): Self = StObject.set(x, "Alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "Alpha", js.undefined)
    
    inline def setColor(value: CSSProperties): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setControls(value: CSSProperties): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setHue(value: CSSProperties): Self = StObject.set(x, "Hue", value.asInstanceOf[js.Any])
    
    inline def setHueUndefined: Self = StObject.set(x, "Hue", js.undefined)
    
    inline def setPicker(value: CSSProperties): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
    
    inline def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
    
    inline def setSaturation(value: CSSProperties): Self = StObject.set(x, "Saturation", value.asInstanceOf[js.Any])
    
    inline def setSaturationUndefined: Self = StObject.set(x, "Saturation", js.undefined)
    
    inline def setSliders(value: CSSProperties): Self = StObject.set(x, "sliders", value.asInstanceOf[js.Any])
    
    inline def setSlidersUndefined: Self = StObject.set(x, "sliders", js.undefined)
  }
}
