package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.anon.LineLength
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.DAYS
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.HOURS
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.MILLISECONDS
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.MINUTES
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.SECONDS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Axis extends StObject {
  
  var axisLineColor: js.UndefOr[Color] = js.undefined
  
  var axisLineWidth: js.UndefOr[Double] = js.undefined
  
  var axisMaximum: js.UndefOr[Double] = js.undefined
  
  var axisMinimum: js.UndefOr[Double] = js.undefined
  
  var centerAxisLabels: js.UndefOr[Boolean] = js.undefined
  
  var drawAxisLines: js.UndefOr[Boolean] = js.undefined
  
  var drawGridLines: js.UndefOr[Boolean] = js.undefined
  
  var drawLabels: js.UndefOr[Boolean] = js.undefined
  
  var drawLimitLinesBehindData: js.UndefOr[Boolean] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontStyle: js.UndefOr[String] = js.undefined
  
  var fontWeight: js.UndefOr[Double] = js.undefined
  
  var granularity: js.UndefOr[Double] = js.undefined
  
  var granularityEnabled: js.UndefOr[Boolean] = js.undefined
  
  var gridColor: js.UndefOr[Color] = js.undefined
  
  var gridDashedLine: js.UndefOr[LineLength] = js.undefined
  
  var gridLineWidth: js.UndefOr[Double] = js.undefined
  
  var labelCount: js.UndefOr[Double] = js.undefined
  
  var labelCountForce: js.UndefOr[Boolean] = js.undefined
  
  var limitLines: js.UndefOr[js.Array[AxisLimitLine]] = js.undefined
  
  var since: js.UndefOr[Double] = js.undefined
  
  var textColor: js.UndefOr[Color] = js.undefined
  
  var textSize: js.UndefOr[Double] = js.undefined
  
  var timeUnit: js.UndefOr[MILLISECONDS | SECONDS | MINUTES | HOURS | DAYS] = js.undefined
  
  var valueFormatter: js.UndefOr[ValueFormatter] = js.undefined
  
  var valueFormatterPattern: js.UndefOr[String] = js.undefined
}
object Axis {
  
  @scala.inline
  def apply(): Axis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Axis]
  }
  
  @scala.inline
  implicit class AxisMutableBuilder[Self <: Axis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisLineColor(value: Color): Self = StObject.set(x, "axisLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisLineColorUndefined: Self = StObject.set(x, "axisLineColor", js.undefined)
    
    @scala.inline
    def setAxisLineWidth(value: Double): Self = StObject.set(x, "axisLineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisLineWidthUndefined: Self = StObject.set(x, "axisLineWidth", js.undefined)
    
    @scala.inline
    def setAxisMaximum(value: Double): Self = StObject.set(x, "axisMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisMaximumUndefined: Self = StObject.set(x, "axisMaximum", js.undefined)
    
    @scala.inline
    def setAxisMinimum(value: Double): Self = StObject.set(x, "axisMinimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisMinimumUndefined: Self = StObject.set(x, "axisMinimum", js.undefined)
    
    @scala.inline
    def setCenterAxisLabels(value: Boolean): Self = StObject.set(x, "centerAxisLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterAxisLabelsUndefined: Self = StObject.set(x, "centerAxisLabels", js.undefined)
    
    @scala.inline
    def setDrawAxisLines(value: Boolean): Self = StObject.set(x, "drawAxisLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawAxisLinesUndefined: Self = StObject.set(x, "drawAxisLines", js.undefined)
    
    @scala.inline
    def setDrawGridLines(value: Boolean): Self = StObject.set(x, "drawGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawGridLinesUndefined: Self = StObject.set(x, "drawGridLines", js.undefined)
    
    @scala.inline
    def setDrawLabels(value: Boolean): Self = StObject.set(x, "drawLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawLabelsUndefined: Self = StObject.set(x, "drawLabels", js.undefined)
    
    @scala.inline
    def setDrawLimitLinesBehindData(value: Boolean): Self = StObject.set(x, "drawLimitLinesBehindData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawLimitLinesBehindDataUndefined: Self = StObject.set(x, "drawLimitLinesBehindData", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setGranularity(value: Double): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularityEnabled(value: Boolean): Self = StObject.set(x, "granularityEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularityEnabledUndefined: Self = StObject.set(x, "granularityEnabled", js.undefined)
    
    @scala.inline
    def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    @scala.inline
    def setGridColor(value: Color): Self = StObject.set(x, "gridColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridColorUndefined: Self = StObject.set(x, "gridColor", js.undefined)
    
    @scala.inline
    def setGridDashedLine(value: LineLength): Self = StObject.set(x, "gridDashedLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridDashedLineUndefined: Self = StObject.set(x, "gridDashedLine", js.undefined)
    
    @scala.inline
    def setGridLineWidth(value: Double): Self = StObject.set(x, "gridLineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridLineWidthUndefined: Self = StObject.set(x, "gridLineWidth", js.undefined)
    
    @scala.inline
    def setLabelCount(value: Double): Self = StObject.set(x, "labelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelCountForce(value: Boolean): Self = StObject.set(x, "labelCountForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelCountForceUndefined: Self = StObject.set(x, "labelCountForce", js.undefined)
    
    @scala.inline
    def setLabelCountUndefined: Self = StObject.set(x, "labelCount", js.undefined)
    
    @scala.inline
    def setLimitLines(value: js.Array[AxisLimitLine]): Self = StObject.set(x, "limitLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitLinesUndefined: Self = StObject.set(x, "limitLines", js.undefined)
    
    @scala.inline
    def setLimitLinesVarargs(value: AxisLimitLine*): Self = StObject.set(x, "limitLines", js.Array(value :_*))
    
    @scala.inline
    def setSince(value: Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    
    @scala.inline
    def setTextColor(value: Color): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    @scala.inline
    def setTextSize(value: Double): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
    
    @scala.inline
    def setTimeUnit(value: MILLISECONDS | SECONDS | MINUTES | HOURS | DAYS): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUnitUndefined: Self = StObject.set(x, "timeUnit", js.undefined)
    
    @scala.inline
    def setValueFormatter(value: ValueFormatter): Self = StObject.set(x, "valueFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFormatterPattern(value: String): Self = StObject.set(x, "valueFormatterPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFormatterPatternUndefined: Self = StObject.set(x, "valueFormatterPattern", js.undefined)
    
    @scala.inline
    def setValueFormatterUndefined: Self = StObject.set(x, "valueFormatter", js.undefined)
    
    @scala.inline
    def setValueFormatterVarargs(value: String*): Self = StObject.set(x, "valueFormatter", js.Array(value :_*))
  }
}
