package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineScatterCandleRadarConfig extends StObject {
  
  var drawHighlightIndicators: js.UndefOr[Boolean] = js.undefined
  
  var drawHorizontalHighlightIndicator: js.UndefOr[Boolean] = js.undefined
  
  var drawVerticalHighlightIndicator: js.UndefOr[Boolean] = js.undefined
  
  var highlightLineWidth: js.UndefOr[Double] = js.undefined
}
object LineScatterCandleRadarConfig {
  
  inline def apply(): LineScatterCandleRadarConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineScatterCandleRadarConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineScatterCandleRadarConfig] (val x: Self) extends AnyVal {
    
    inline def setDrawHighlightIndicators(value: Boolean): Self = StObject.set(x, "drawHighlightIndicators", value.asInstanceOf[js.Any])
    
    inline def setDrawHighlightIndicatorsUndefined: Self = StObject.set(x, "drawHighlightIndicators", js.undefined)
    
    inline def setDrawHorizontalHighlightIndicator(value: Boolean): Self = StObject.set(x, "drawHorizontalHighlightIndicator", value.asInstanceOf[js.Any])
    
    inline def setDrawHorizontalHighlightIndicatorUndefined: Self = StObject.set(x, "drawHorizontalHighlightIndicator", js.undefined)
    
    inline def setDrawVerticalHighlightIndicator(value: Boolean): Self = StObject.set(x, "drawVerticalHighlightIndicator", value.asInstanceOf[js.Any])
    
    inline def setDrawVerticalHighlightIndicatorUndefined: Self = StObject.set(x, "drawVerticalHighlightIndicator", js.undefined)
    
    inline def setHighlightLineWidth(value: Double): Self = StObject.set(x, "highlightLineWidth", value.asInstanceOf[js.Any])
    
    inline def setHighlightLineWidthUndefined: Self = StObject.set(x, "highlightLineWidth", js.undefined)
  }
}
