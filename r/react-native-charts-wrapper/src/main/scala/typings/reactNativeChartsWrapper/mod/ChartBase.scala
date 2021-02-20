package typings.reactNativeChartsWrapper.mod

import typings.reactNative.mod.ViewProps
import typings.reactNativeChartsWrapper.anon.DataIndex
import typings.reactNativeChartsWrapper.anon.Digits
import typings.reactNativeChartsWrapper.anon.DurationX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartBase extends ViewProps {
  
  var animation: js.UndefOr[DurationX] = js.native
  
  var chartBackgroundColor: js.UndefOr[Color] = js.native
  
  var chartDescription: js.UndefOr[ChartDescription] = js.native
  
  var dragDecelerationEnabled: js.UndefOr[Boolean] = js.native
  
  var dragDecelerationFrictionCoef: js.UndefOr[Double] = js.native
  
  var highlightPerTapEnabled: js.UndefOr[Boolean] = js.native
  
  var highlights: js.UndefOr[js.Array[DataIndex]] = js.native
  
  var legend: js.UndefOr[ChartLegend] = js.native
  
  var logEnabled: js.UndefOr[Boolean] = js.native
  
  var marker: js.UndefOr[Digits] = js.native
  
  var noDataText: js.UndefOr[String] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* event */ ChartChangeEvent, Unit]] = js.native
  
  var onSelect: js.UndefOr[js.Function1[/* event */ ChartSelectEvent, Unit]] = js.native
  
  var touchEnabled: js.UndefOr[Boolean] = js.native
  
  var xAxis: js.UndefOr[typings.reactNativeChartsWrapper.mod.xAxis] = js.native
}
object ChartBase {
  
  @scala.inline
  def apply(): ChartBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBase]
  }
  
  @scala.inline
  implicit class ChartBaseMutableBuilder[Self <: ChartBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: DurationX): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setChartBackgroundColor(value: Color): Self = StObject.set(x, "chartBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartBackgroundColorUndefined: Self = StObject.set(x, "chartBackgroundColor", js.undefined)
    
    @scala.inline
    def setChartDescription(value: ChartDescription): Self = StObject.set(x, "chartDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartDescriptionUndefined: Self = StObject.set(x, "chartDescription", js.undefined)
    
    @scala.inline
    def setDragDecelerationEnabled(value: Boolean): Self = StObject.set(x, "dragDecelerationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragDecelerationEnabledUndefined: Self = StObject.set(x, "dragDecelerationEnabled", js.undefined)
    
    @scala.inline
    def setDragDecelerationFrictionCoef(value: Double): Self = StObject.set(x, "dragDecelerationFrictionCoef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragDecelerationFrictionCoefUndefined: Self = StObject.set(x, "dragDecelerationFrictionCoef", js.undefined)
    
    @scala.inline
    def setHighlightPerTapEnabled(value: Boolean): Self = StObject.set(x, "highlightPerTapEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightPerTapEnabledUndefined: Self = StObject.set(x, "highlightPerTapEnabled", js.undefined)
    
    @scala.inline
    def setHighlights(value: js.Array[DataIndex]): Self = StObject.set(x, "highlights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightsUndefined: Self = StObject.set(x, "highlights", js.undefined)
    
    @scala.inline
    def setHighlightsVarargs(value: DataIndex*): Self = StObject.set(x, "highlights", js.Array(value :_*))
    
    @scala.inline
    def setLegend(value: ChartLegend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    @scala.inline
    def setLogEnabled(value: Boolean): Self = StObject.set(x, "logEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogEnabledUndefined: Self = StObject.set(x, "logEnabled", js.undefined)
    
    @scala.inline
    def setMarker(value: Digits): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setNoDataText(value: String): Self = StObject.set(x, "noDataText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDataTextUndefined: Self = StObject.set(x, "noDataText", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* event */ ChartChangeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnSelect(value: /* event */ ChartSelectEvent => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setTouchEnabled(value: Boolean): Self = StObject.set(x, "touchEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchEnabledUndefined: Self = StObject.set(x, "touchEnabled", js.undefined)
    
    @scala.inline
    def setXAxis(value: xAxis): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
  }
}
