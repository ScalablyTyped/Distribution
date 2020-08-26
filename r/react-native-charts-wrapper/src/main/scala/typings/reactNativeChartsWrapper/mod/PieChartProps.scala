package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PieChartProps extends PieRadarChartBase {
  var centerText: js.UndefOr[String] = js.native
  var centerTextRadiusPercent: js.UndefOr[Double] = js.native
  var data: js.UndefOr[PieData] = js.native
  var drawEntryLabels: js.UndefOr[Boolean] = js.native
  var entryLabelColor: js.UndefOr[Color] = js.native
  var entryLabelTextSize: js.UndefOr[Double] = js.native
  var holeColor: js.UndefOr[Color] = js.native
  var holeRadius: js.UndefOr[Double] = js.native
  var maxAngle: js.UndefOr[Double] = js.native
  var styledCenterText: js.UndefOr[typings.reactNativeChartsWrapper.anon.Color] = js.native
  var transparentCircleColor: js.UndefOr[Color] = js.native
  var transparentCircleRadius: js.UndefOr[Double] = js.native
  var usePercentValues: js.UndefOr[Boolean] = js.native
}

object PieChartProps {
  @scala.inline
  def apply(): PieChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieChartProps]
  }
  @scala.inline
  implicit class PieChartPropsOps[Self <: PieChartProps] (val x: Self) extends AnyVal {
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
    def setCenterText(value: String): Self = this.set("centerText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterText: Self = this.set("centerText", js.undefined)
    @scala.inline
    def setCenterTextRadiusPercent(value: Double): Self = this.set("centerTextRadiusPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterTextRadiusPercent: Self = this.set("centerTextRadiusPercent", js.undefined)
    @scala.inline
    def setData(value: PieData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDrawEntryLabels(value: Boolean): Self = this.set("drawEntryLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawEntryLabels: Self = this.set("drawEntryLabels", js.undefined)
    @scala.inline
    def setEntryLabelColor(value: Color): Self = this.set("entryLabelColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntryLabelColor: Self = this.set("entryLabelColor", js.undefined)
    @scala.inline
    def setEntryLabelTextSize(value: Double): Self = this.set("entryLabelTextSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntryLabelTextSize: Self = this.set("entryLabelTextSize", js.undefined)
    @scala.inline
    def setHoleColor(value: Color): Self = this.set("holeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoleColor: Self = this.set("holeColor", js.undefined)
    @scala.inline
    def setHoleRadius(value: Double): Self = this.set("holeRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoleRadius: Self = this.set("holeRadius", js.undefined)
    @scala.inline
    def setMaxAngle(value: Double): Self = this.set("maxAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAngle: Self = this.set("maxAngle", js.undefined)
    @scala.inline
    def setStyledCenterText(value: typings.reactNativeChartsWrapper.anon.Color): Self = this.set("styledCenterText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyledCenterText: Self = this.set("styledCenterText", js.undefined)
    @scala.inline
    def setTransparentCircleColor(value: Color): Self = this.set("transparentCircleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransparentCircleColor: Self = this.set("transparentCircleColor", js.undefined)
    @scala.inline
    def setTransparentCircleRadius(value: Double): Self = this.set("transparentCircleRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransparentCircleRadius: Self = this.set("transparentCircleRadius", js.undefined)
    @scala.inline
    def setUsePercentValues(value: Boolean): Self = this.set("usePercentValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePercentValues: Self = this.set("usePercentValues", js.undefined)
  }
  
}

