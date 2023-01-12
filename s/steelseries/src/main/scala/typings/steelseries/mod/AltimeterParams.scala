package typings.steelseries.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent steelseries.steelseries.FrameStruct */
/* Inlined parent std.Omit<steelseries.steelseries.PointKnob, 'pointerType' | 'pointerColor'> */
/* Inlined parent std.Omit<steelseries.steelseries.Lcd, 'lcdDecimals'> */
trait AltimeterParams extends StObject {
  
  var backgroundColor: js.UndefOr[BackgroundColor] = js.undefined
  
  // Omit<> in Horizon
  var backgroundVisible: js.UndefOr[Boolean] = js.undefined
  
  var customLayer: js.UndefOr[Any] = js.undefined
  
  var digitalFont: js.UndefOr[Boolean] = js.undefined
  
  // Omit<> in Horizon
  var foregroundType: js.UndefOr[ForegroundType] = js.undefined
  
  // Omit<> in Linear*
  var foregroundVisible: js.UndefOr[Boolean] = js.undefined
  
  var frameDesign: js.UndefOr[FrameDesign] = js.undefined
  
  var frameVisible: js.UndefOr[Boolean] = js.undefined
  
  var knobStyle: js.UndefOr[KnobStyle] = js.undefined
  
  var knobType: js.UndefOr[KnobType] = js.undefined
  
  var lcdColor: js.UndefOr[LcdColor] = js.undefined
  
  var lcdVisible: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var unitAltPos: js.UndefOr[Boolean] = js.undefined
}
object AltimeterParams {
  
  inline def apply(): AltimeterParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AltimeterParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AltimeterParams] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: BackgroundColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundVisible(value: Boolean): Self = StObject.set(x, "backgroundVisible", value.asInstanceOf[js.Any])
    
    inline def setBackgroundVisibleUndefined: Self = StObject.set(x, "backgroundVisible", js.undefined)
    
    inline def setCustomLayer(value: Any): Self = StObject.set(x, "customLayer", value.asInstanceOf[js.Any])
    
    inline def setCustomLayerUndefined: Self = StObject.set(x, "customLayer", js.undefined)
    
    inline def setDigitalFont(value: Boolean): Self = StObject.set(x, "digitalFont", value.asInstanceOf[js.Any])
    
    inline def setDigitalFontUndefined: Self = StObject.set(x, "digitalFont", js.undefined)
    
    inline def setForegroundType(value: ForegroundType): Self = StObject.set(x, "foregroundType", value.asInstanceOf[js.Any])
    
    inline def setForegroundTypeUndefined: Self = StObject.set(x, "foregroundType", js.undefined)
    
    inline def setForegroundVisible(value: Boolean): Self = StObject.set(x, "foregroundVisible", value.asInstanceOf[js.Any])
    
    inline def setForegroundVisibleUndefined: Self = StObject.set(x, "foregroundVisible", js.undefined)
    
    inline def setFrameDesign(value: FrameDesign): Self = StObject.set(x, "frameDesign", value.asInstanceOf[js.Any])
    
    inline def setFrameDesignUndefined: Self = StObject.set(x, "frameDesign", js.undefined)
    
    inline def setFrameVisible(value: Boolean): Self = StObject.set(x, "frameVisible", value.asInstanceOf[js.Any])
    
    inline def setFrameVisibleUndefined: Self = StObject.set(x, "frameVisible", js.undefined)
    
    inline def setKnobStyle(value: KnobStyle): Self = StObject.set(x, "knobStyle", value.asInstanceOf[js.Any])
    
    inline def setKnobStyleUndefined: Self = StObject.set(x, "knobStyle", js.undefined)
    
    inline def setKnobType(value: KnobType): Self = StObject.set(x, "knobType", value.asInstanceOf[js.Any])
    
    inline def setKnobTypeUndefined: Self = StObject.set(x, "knobType", js.undefined)
    
    inline def setLcdColor(value: LcdColor): Self = StObject.set(x, "lcdColor", value.asInstanceOf[js.Any])
    
    inline def setLcdColorUndefined: Self = StObject.set(x, "lcdColor", js.undefined)
    
    inline def setLcdVisible(value: Boolean): Self = StObject.set(x, "lcdVisible", value.asInstanceOf[js.Any])
    
    inline def setLcdVisibleUndefined: Self = StObject.set(x, "lcdVisible", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUnitAltPos(value: Boolean): Self = StObject.set(x, "unitAltPos", value.asInstanceOf[js.Any])
    
    inline def setUnitAltPosUndefined: Self = StObject.set(x, "unitAltPos", js.undefined)
  }
}
