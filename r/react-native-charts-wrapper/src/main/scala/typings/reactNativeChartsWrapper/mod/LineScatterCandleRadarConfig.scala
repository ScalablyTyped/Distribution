package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineScatterCandleRadarConfig extends StObject {
  
  var drawHighlightIndicators: js.UndefOr[Boolean] = js.native
  
  var drawHorizontalHighlightIndicator: js.UndefOr[Boolean] = js.native
  
  var drawVerticalHighlightIndicator: js.UndefOr[Boolean] = js.native
  
  var highlightLineWidth: js.UndefOr[Double] = js.native
}
object LineScatterCandleRadarConfig {
  
  @scala.inline
  def apply(): LineScatterCandleRadarConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineScatterCandleRadarConfig]
  }
  
  @scala.inline
  implicit class LineScatterCandleRadarConfigMutableBuilder[Self <: LineScatterCandleRadarConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrawHighlightIndicators(value: Boolean): Self = StObject.set(x, "drawHighlightIndicators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawHighlightIndicatorsUndefined: Self = StObject.set(x, "drawHighlightIndicators", js.undefined)
    
    @scala.inline
    def setDrawHorizontalHighlightIndicator(value: Boolean): Self = StObject.set(x, "drawHorizontalHighlightIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawHorizontalHighlightIndicatorUndefined: Self = StObject.set(x, "drawHorizontalHighlightIndicator", js.undefined)
    
    @scala.inline
    def setDrawVerticalHighlightIndicator(value: Boolean): Self = StObject.set(x, "drawVerticalHighlightIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawVerticalHighlightIndicatorUndefined: Self = StObject.set(x, "drawVerticalHighlightIndicator", js.undefined)
    
    @scala.inline
    def setHighlightLineWidth(value: Double): Self = StObject.set(x, "highlightLineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightLineWidthUndefined: Self = StObject.set(x, "highlightLineWidth", js.undefined)
  }
}
