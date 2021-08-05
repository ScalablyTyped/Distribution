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
  
  inline def apply(): Axis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Axis]
  }
  
  extension [Self <: Axis](x: Self) {
    
    inline def setAxisLineColor(value: Color): Self = StObject.set(x, "axisLineColor", value.asInstanceOf[js.Any])
    
    inline def setAxisLineColorUndefined: Self = StObject.set(x, "axisLineColor", js.undefined)
    
    inline def setAxisLineWidth(value: Double): Self = StObject.set(x, "axisLineWidth", value.asInstanceOf[js.Any])
    
    inline def setAxisLineWidthUndefined: Self = StObject.set(x, "axisLineWidth", js.undefined)
    
    inline def setAxisMaximum(value: Double): Self = StObject.set(x, "axisMaximum", value.asInstanceOf[js.Any])
    
    inline def setAxisMaximumUndefined: Self = StObject.set(x, "axisMaximum", js.undefined)
    
    inline def setAxisMinimum(value: Double): Self = StObject.set(x, "axisMinimum", value.asInstanceOf[js.Any])
    
    inline def setAxisMinimumUndefined: Self = StObject.set(x, "axisMinimum", js.undefined)
    
    inline def setCenterAxisLabels(value: Boolean): Self = StObject.set(x, "centerAxisLabels", value.asInstanceOf[js.Any])
    
    inline def setCenterAxisLabelsUndefined: Self = StObject.set(x, "centerAxisLabels", js.undefined)
    
    inline def setDrawAxisLines(value: Boolean): Self = StObject.set(x, "drawAxisLines", value.asInstanceOf[js.Any])
    
    inline def setDrawAxisLinesUndefined: Self = StObject.set(x, "drawAxisLines", js.undefined)
    
    inline def setDrawGridLines(value: Boolean): Self = StObject.set(x, "drawGridLines", value.asInstanceOf[js.Any])
    
    inline def setDrawGridLinesUndefined: Self = StObject.set(x, "drawGridLines", js.undefined)
    
    inline def setDrawLabels(value: Boolean): Self = StObject.set(x, "drawLabels", value.asInstanceOf[js.Any])
    
    inline def setDrawLabelsUndefined: Self = StObject.set(x, "drawLabels", js.undefined)
    
    inline def setDrawLimitLinesBehindData(value: Boolean): Self = StObject.set(x, "drawLimitLinesBehindData", value.asInstanceOf[js.Any])
    
    inline def setDrawLimitLinesBehindDataUndefined: Self = StObject.set(x, "drawLimitLinesBehindData", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontWeight(value: Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setGranularity(value: Double): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    inline def setGranularityEnabled(value: Boolean): Self = StObject.set(x, "granularityEnabled", value.asInstanceOf[js.Any])
    
    inline def setGranularityEnabledUndefined: Self = StObject.set(x, "granularityEnabled", js.undefined)
    
    inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    inline def setGridColor(value: Color): Self = StObject.set(x, "gridColor", value.asInstanceOf[js.Any])
    
    inline def setGridColorUndefined: Self = StObject.set(x, "gridColor", js.undefined)
    
    inline def setGridDashedLine(value: LineLength): Self = StObject.set(x, "gridDashedLine", value.asInstanceOf[js.Any])
    
    inline def setGridDashedLineUndefined: Self = StObject.set(x, "gridDashedLine", js.undefined)
    
    inline def setGridLineWidth(value: Double): Self = StObject.set(x, "gridLineWidth", value.asInstanceOf[js.Any])
    
    inline def setGridLineWidthUndefined: Self = StObject.set(x, "gridLineWidth", js.undefined)
    
    inline def setLabelCount(value: Double): Self = StObject.set(x, "labelCount", value.asInstanceOf[js.Any])
    
    inline def setLabelCountForce(value: Boolean): Self = StObject.set(x, "labelCountForce", value.asInstanceOf[js.Any])
    
    inline def setLabelCountForceUndefined: Self = StObject.set(x, "labelCountForce", js.undefined)
    
    inline def setLabelCountUndefined: Self = StObject.set(x, "labelCount", js.undefined)
    
    inline def setLimitLines(value: js.Array[AxisLimitLine]): Self = StObject.set(x, "limitLines", value.asInstanceOf[js.Any])
    
    inline def setLimitLinesUndefined: Self = StObject.set(x, "limitLines", js.undefined)
    
    inline def setLimitLinesVarargs(value: AxisLimitLine*): Self = StObject.set(x, "limitLines", js.Array(value :_*))
    
    inline def setSince(value: Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    
    inline def setTextColor(value: Color): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    inline def setTextSize(value: Double): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
    
    inline def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
    
    inline def setTimeUnit(value: MILLISECONDS | SECONDS | MINUTES | HOURS | DAYS): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
    
    inline def setTimeUnitUndefined: Self = StObject.set(x, "timeUnit", js.undefined)
    
    inline def setValueFormatter(value: ValueFormatter): Self = StObject.set(x, "valueFormatter", value.asInstanceOf[js.Any])
    
    inline def setValueFormatterPattern(value: String): Self = StObject.set(x, "valueFormatterPattern", value.asInstanceOf[js.Any])
    
    inline def setValueFormatterPatternUndefined: Self = StObject.set(x, "valueFormatterPattern", js.undefined)
    
    inline def setValueFormatterUndefined: Self = StObject.set(x, "valueFormatter", js.undefined)
    
    inline def setValueFormatterVarargs(value: String*): Self = StObject.set(x, "valueFormatter", js.Array(value :_*))
  }
}
