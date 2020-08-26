package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.anon.Phase
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CUBIC_BEZIER
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.HORIZONTAL_BEZIER
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LINEAR
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.STEPPED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineDatasetConfig
  extends CommonDatasetConfig
     with BarLineScatterCandleBubbleConfig
     with LineScatterCandleRadarConfig
     with LineRadarConfig {
  var circleColor: js.UndefOr[Color] = js.native
  var circleColors: js.UndefOr[js.Array[Color]] = js.native
  var circleHoleColor: js.UndefOr[Color] = js.native
  var circleRadius: js.UndefOr[Double] = js.native
  var dashedLine: js.UndefOr[Phase] = js.native
  var drawCircleHole: js.UndefOr[Boolean] = js.native
  var drawCircles: js.UndefOr[Boolean] = js.native
  var drawCubicIntensity: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[LINEAR | STEPPED | CUBIC_BEZIER | HORIZONTAL_BEZIER] = js.native
}

object LineDatasetConfig {
  @scala.inline
  def apply(): LineDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineDatasetConfig]
  }
  @scala.inline
  implicit class LineDatasetConfigOps[Self <: LineDatasetConfig] (val x: Self) extends AnyVal {
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
    def setCircleColor(value: Color): Self = this.set("circleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircleColor: Self = this.set("circleColor", js.undefined)
    @scala.inline
    def setCircleColorsVarargs(value: Color*): Self = this.set("circleColors", js.Array(value :_*))
    @scala.inline
    def setCircleColors(value: js.Array[Color]): Self = this.set("circleColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircleColors: Self = this.set("circleColors", js.undefined)
    @scala.inline
    def setCircleHoleColor(value: Color): Self = this.set("circleHoleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircleHoleColor: Self = this.set("circleHoleColor", js.undefined)
    @scala.inline
    def setCircleRadius(value: Double): Self = this.set("circleRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircleRadius: Self = this.set("circleRadius", js.undefined)
    @scala.inline
    def setDashedLine(value: Phase): Self = this.set("dashedLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashedLine: Self = this.set("dashedLine", js.undefined)
    @scala.inline
    def setDrawCircleHole(value: Boolean): Self = this.set("drawCircleHole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawCircleHole: Self = this.set("drawCircleHole", js.undefined)
    @scala.inline
    def setDrawCircles(value: Boolean): Self = this.set("drawCircles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawCircles: Self = this.set("drawCircles", js.undefined)
    @scala.inline
    def setDrawCubicIntensity(value: Double): Self = this.set("drawCubicIntensity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawCubicIntensity: Self = this.set("drawCubicIntensity", js.undefined)
    @scala.inline
    def setMode(value: LINEAR | STEPPED | CUBIC_BEZIER | HORIZONTAL_BEZIER): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

