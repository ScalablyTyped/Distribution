package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.anon.LineLength
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.DAYS
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.HOURS
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.MILLISECONDS
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.MINUTES
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.SECONDS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Axis extends js.Object {
  var axisLineColor: js.UndefOr[Color] = js.native
  var axisLineWidth: js.UndefOr[Double] = js.native
  var axisMaximum: js.UndefOr[Double] = js.native
  var axisMinimum: js.UndefOr[Double] = js.native
  var centerAxisLabels: js.UndefOr[Boolean] = js.native
  var drawAxisLines: js.UndefOr[Boolean] = js.native
  var drawGridLines: js.UndefOr[Boolean] = js.native
  var drawLabels: js.UndefOr[Boolean] = js.native
  var drawLimitLinesBehindData: js.UndefOr[Boolean] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontStyle: js.UndefOr[String] = js.native
  var fontWeight: js.UndefOr[Double] = js.native
  var granularity: js.UndefOr[Double] = js.native
  var granularityEnabled: js.UndefOr[Boolean] = js.native
  var gridColor: js.UndefOr[Color] = js.native
  var gridDashedLine: js.UndefOr[LineLength] = js.native
  var gridLineWidth: js.UndefOr[Double] = js.native
  var labelCount: js.UndefOr[Double] = js.native
  var labelCountForce: js.UndefOr[Boolean] = js.native
  var limitLines: js.UndefOr[js.Array[AxisLimitLine]] = js.native
  var since: js.UndefOr[Double] = js.native
  var textColor: js.UndefOr[Color] = js.native
  var textSize: js.UndefOr[Double] = js.native
  var timeUnit: js.UndefOr[MILLISECONDS | SECONDS | MINUTES | HOURS | DAYS] = js.native
  var valueFormatter: js.UndefOr[ValueFormatter] = js.native
  var valueFormatterPattern: js.UndefOr[String] = js.native
}

object Axis {
  @scala.inline
  def apply(): Axis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Axis]
  }
  @scala.inline
  implicit class AxisOps[Self <: Axis] (val x: Self) extends AnyVal {
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
    def setAxisLineColor(value: Color): Self = this.set("axisLineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisLineColor: Self = this.set("axisLineColor", js.undefined)
    @scala.inline
    def setAxisLineWidth(value: Double): Self = this.set("axisLineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisLineWidth: Self = this.set("axisLineWidth", js.undefined)
    @scala.inline
    def setAxisMaximum(value: Double): Self = this.set("axisMaximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisMaximum: Self = this.set("axisMaximum", js.undefined)
    @scala.inline
    def setAxisMinimum(value: Double): Self = this.set("axisMinimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisMinimum: Self = this.set("axisMinimum", js.undefined)
    @scala.inline
    def setCenterAxisLabels(value: Boolean): Self = this.set("centerAxisLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterAxisLabels: Self = this.set("centerAxisLabels", js.undefined)
    @scala.inline
    def setDrawAxisLines(value: Boolean): Self = this.set("drawAxisLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawAxisLines: Self = this.set("drawAxisLines", js.undefined)
    @scala.inline
    def setDrawGridLines(value: Boolean): Self = this.set("drawGridLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawGridLines: Self = this.set("drawGridLines", js.undefined)
    @scala.inline
    def setDrawLabels(value: Boolean): Self = this.set("drawLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawLabels: Self = this.set("drawLabels", js.undefined)
    @scala.inline
    def setDrawLimitLinesBehindData(value: Boolean): Self = this.set("drawLimitLinesBehindData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawLimitLinesBehindData: Self = this.set("drawLimitLinesBehindData", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontWeight(value: Double): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setGranularity(value: Double): Self = this.set("granularity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGranularity: Self = this.set("granularity", js.undefined)
    @scala.inline
    def setGranularityEnabled(value: Boolean): Self = this.set("granularityEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGranularityEnabled: Self = this.set("granularityEnabled", js.undefined)
    @scala.inline
    def setGridColor(value: Color): Self = this.set("gridColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridColor: Self = this.set("gridColor", js.undefined)
    @scala.inline
    def setGridDashedLine(value: LineLength): Self = this.set("gridDashedLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridDashedLine: Self = this.set("gridDashedLine", js.undefined)
    @scala.inline
    def setGridLineWidth(value: Double): Self = this.set("gridLineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridLineWidth: Self = this.set("gridLineWidth", js.undefined)
    @scala.inline
    def setLabelCount(value: Double): Self = this.set("labelCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelCount: Self = this.set("labelCount", js.undefined)
    @scala.inline
    def setLabelCountForce(value: Boolean): Self = this.set("labelCountForce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelCountForce: Self = this.set("labelCountForce", js.undefined)
    @scala.inline
    def setLimitLinesVarargs(value: AxisLimitLine*): Self = this.set("limitLines", js.Array(value :_*))
    @scala.inline
    def setLimitLines(value: js.Array[AxisLimitLine]): Self = this.set("limitLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimitLines: Self = this.set("limitLines", js.undefined)
    @scala.inline
    def setSince(value: Double): Self = this.set("since", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSince: Self = this.set("since", js.undefined)
    @scala.inline
    def setTextColor(value: Color): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    @scala.inline
    def setTextSize(value: Double): Self = this.set("textSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextSize: Self = this.set("textSize", js.undefined)
    @scala.inline
    def setTimeUnit(value: MILLISECONDS | SECONDS | MINUTES | HOURS | DAYS): Self = this.set("timeUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeUnit: Self = this.set("timeUnit", js.undefined)
    @scala.inline
    def setValueFormatterVarargs(value: String*): Self = this.set("valueFormatter", js.Array(value :_*))
    @scala.inline
    def setValueFormatter(value: ValueFormatter): Self = this.set("valueFormatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueFormatter: Self = this.set("valueFormatter", js.undefined)
    @scala.inline
    def setValueFormatterPattern(value: String): Self = this.set("valueFormatterPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueFormatterPattern: Self = this.set("valueFormatterPattern", js.undefined)
  }
  
}

