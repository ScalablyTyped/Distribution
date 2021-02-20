package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CandleStickDatasetConfig
  extends CommonDatasetConfig
     with BarLineScatterCandleBubbleConfig
     with LineScatterCandleRadarConfig {
  
  var barSpace: js.UndefOr[Double] = js.native
  
  var decreasingColor: js.UndefOr[Color] = js.native
  
  var decreasingPaintStyle: js.UndefOr[CandleStickPaintStyle] = js.native
  
  var increasingColor: js.UndefOr[Color] = js.native
  
  var increasingPaintStyle: js.UndefOr[CandleStickPaintStyle] = js.native
  
  var neutralColor: js.UndefOr[Color] = js.native
  
  var shadowColor: js.UndefOr[Color] = js.native
  
  var shadowColorSameAsCandle: js.UndefOr[Boolean] = js.native
  
  var shadowWidth: js.UndefOr[Double] = js.native
}
object CandleStickDatasetConfig {
  
  @scala.inline
  def apply(): CandleStickDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CandleStickDatasetConfig]
  }
  
  @scala.inline
  implicit class CandleStickDatasetConfigMutableBuilder[Self <: CandleStickDatasetConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBarSpace(value: Double): Self = StObject.set(x, "barSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarSpaceUndefined: Self = StObject.set(x, "barSpace", js.undefined)
    
    @scala.inline
    def setDecreasingColor(value: Color): Self = StObject.set(x, "decreasingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecreasingColorUndefined: Self = StObject.set(x, "decreasingColor", js.undefined)
    
    @scala.inline
    def setDecreasingPaintStyle(value: CandleStickPaintStyle): Self = StObject.set(x, "decreasingPaintStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecreasingPaintStyleUndefined: Self = StObject.set(x, "decreasingPaintStyle", js.undefined)
    
    @scala.inline
    def setIncreasingColor(value: Color): Self = StObject.set(x, "increasingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncreasingColorUndefined: Self = StObject.set(x, "increasingColor", js.undefined)
    
    @scala.inline
    def setIncreasingPaintStyle(value: CandleStickPaintStyle): Self = StObject.set(x, "increasingPaintStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncreasingPaintStyleUndefined: Self = StObject.set(x, "increasingPaintStyle", js.undefined)
    
    @scala.inline
    def setNeutralColor(value: Color): Self = StObject.set(x, "neutralColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeutralColorUndefined: Self = StObject.set(x, "neutralColor", js.undefined)
    
    @scala.inline
    def setShadowColor(value: Color): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowColorSameAsCandle(value: Boolean): Self = StObject.set(x, "shadowColorSameAsCandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowColorSameAsCandleUndefined: Self = StObject.set(x, "shadowColorSameAsCandle", js.undefined)
    
    @scala.inline
    def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    @scala.inline
    def setShadowWidth(value: Double): Self = StObject.set(x, "shadowWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowWidthUndefined: Self = StObject.set(x, "shadowWidth", js.undefined)
  }
}
