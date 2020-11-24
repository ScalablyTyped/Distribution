package typings.reactNativeChartsWrapper.mod

import typings.reactNative.mod.ViewProps
import typings.reactNativeChartsWrapper.anon.DataIndex
import typings.reactNativeChartsWrapper.anon.Digits
import typings.reactNativeChartsWrapper.anon.DurationX
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
  implicit class ChartBaseOps[Self <: ChartBase] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: DurationX): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setChartBackgroundColor(value: Color): Self = this.set("chartBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartBackgroundColor: Self = this.set("chartBackgroundColor", js.undefined)
    
    @scala.inline
    def setChartDescription(value: ChartDescription): Self = this.set("chartDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartDescription: Self = this.set("chartDescription", js.undefined)
    
    @scala.inline
    def setDragDecelerationEnabled(value: Boolean): Self = this.set("dragDecelerationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragDecelerationEnabled: Self = this.set("dragDecelerationEnabled", js.undefined)
    
    @scala.inline
    def setDragDecelerationFrictionCoef(value: Double): Self = this.set("dragDecelerationFrictionCoef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragDecelerationFrictionCoef: Self = this.set("dragDecelerationFrictionCoef", js.undefined)
    
    @scala.inline
    def setHighlightPerTapEnabled(value: Boolean): Self = this.set("highlightPerTapEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightPerTapEnabled: Self = this.set("highlightPerTapEnabled", js.undefined)
    
    @scala.inline
    def setHighlightsVarargs(value: DataIndex*): Self = this.set("highlights", js.Array(value :_*))
    
    @scala.inline
    def setHighlights(value: js.Array[DataIndex]): Self = this.set("highlights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlights: Self = this.set("highlights", js.undefined)
    
    @scala.inline
    def setLegend(value: ChartLegend): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setLogEnabled(value: Boolean): Self = this.set("logEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogEnabled: Self = this.set("logEnabled", js.undefined)
    
    @scala.inline
    def setMarker(value: Digits): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    
    @scala.inline
    def setNoDataText(value: String): Self = this.set("noDataText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDataText: Self = this.set("noDataText", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* event */ ChartChangeEvent => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnSelect(value: /* event */ ChartSelectEvent => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setTouchEnabled(value: Boolean): Self = this.set("touchEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchEnabled: Self = this.set("touchEnabled", js.undefined)
    
    @scala.inline
    def setXAxis(value: xAxis): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxis: Self = this.set("xAxis", js.undefined)
  }
}
