package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CandleStickDatasetConfig
  extends StObject
     with CommonDatasetConfig
     with BarLineScatterCandleBubbleConfig
     with LineScatterCandleRadarConfig {
  
  var barSpace: js.UndefOr[Double] = js.undefined
  
  var decreasingColor: js.UndefOr[Color] = js.undefined
  
  var decreasingPaintStyle: js.UndefOr[CandleStickPaintStyle] = js.undefined
  
  var increasingColor: js.UndefOr[Color] = js.undefined
  
  var increasingPaintStyle: js.UndefOr[CandleStickPaintStyle] = js.undefined
  
  var neutralColor: js.UndefOr[Color] = js.undefined
  
  var shadowColor: js.UndefOr[Color] = js.undefined
  
  var shadowColorSameAsCandle: js.UndefOr[Boolean] = js.undefined
  
  var shadowWidth: js.UndefOr[Double] = js.undefined
}
object CandleStickDatasetConfig {
  
  inline def apply(): CandleStickDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CandleStickDatasetConfig]
  }
  
  extension [Self <: CandleStickDatasetConfig](x: Self) {
    
    inline def setBarSpace(value: Double): Self = StObject.set(x, "barSpace", value.asInstanceOf[js.Any])
    
    inline def setBarSpaceUndefined: Self = StObject.set(x, "barSpace", js.undefined)
    
    inline def setDecreasingColor(value: Color): Self = StObject.set(x, "decreasingColor", value.asInstanceOf[js.Any])
    
    inline def setDecreasingColorUndefined: Self = StObject.set(x, "decreasingColor", js.undefined)
    
    inline def setDecreasingPaintStyle(value: CandleStickPaintStyle): Self = StObject.set(x, "decreasingPaintStyle", value.asInstanceOf[js.Any])
    
    inline def setDecreasingPaintStyleUndefined: Self = StObject.set(x, "decreasingPaintStyle", js.undefined)
    
    inline def setIncreasingColor(value: Color): Self = StObject.set(x, "increasingColor", value.asInstanceOf[js.Any])
    
    inline def setIncreasingColorUndefined: Self = StObject.set(x, "increasingColor", js.undefined)
    
    inline def setIncreasingPaintStyle(value: CandleStickPaintStyle): Self = StObject.set(x, "increasingPaintStyle", value.asInstanceOf[js.Any])
    
    inline def setIncreasingPaintStyleUndefined: Self = StObject.set(x, "increasingPaintStyle", js.undefined)
    
    inline def setNeutralColor(value: Color): Self = StObject.set(x, "neutralColor", value.asInstanceOf[js.Any])
    
    inline def setNeutralColorUndefined: Self = StObject.set(x, "neutralColor", js.undefined)
    
    inline def setShadowColor(value: Color): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowColorSameAsCandle(value: Boolean): Self = StObject.set(x, "shadowColorSameAsCandle", value.asInstanceOf[js.Any])
    
    inline def setShadowColorSameAsCandleUndefined: Self = StObject.set(x, "shadowColorSameAsCandle", js.undefined)
    
    inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    inline def setShadowWidth(value: Double): Self = StObject.set(x, "shadowWidth", value.asInstanceOf[js.Any])
    
    inline def setShadowWidthUndefined: Self = StObject.set(x, "shadowWidth", js.undefined)
  }
}
