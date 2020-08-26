package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CIRCLE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CROSS
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.SQUARE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TRIANGLE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScatterDatasetConfig
  extends CommonDatasetConfig
     with BarLineScatterCandleBubbleConfig
     with LineScatterCandleRadarConfig {
  var scatterShape: js.UndefOr[SQUARE | CIRCLE | TRIANGLE | CROSS | X] = js.native
  var scatterShapeHoleColor: js.UndefOr[Color] = js.native
  var scatterShapeHoleRadius: js.UndefOr[Double] = js.native
  var scatterShapeSize: js.UndefOr[Double] = js.native
}

object ScatterDatasetConfig {
  @scala.inline
  def apply(): ScatterDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScatterDatasetConfig]
  }
  @scala.inline
  implicit class ScatterDatasetConfigOps[Self <: ScatterDatasetConfig] (val x: Self) extends AnyVal {
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
    def setScatterShape(value: SQUARE | CIRCLE | TRIANGLE | CROSS | X): Self = this.set("scatterShape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScatterShape: Self = this.set("scatterShape", js.undefined)
    @scala.inline
    def setScatterShapeHoleColor(value: Color): Self = this.set("scatterShapeHoleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScatterShapeHoleColor: Self = this.set("scatterShapeHoleColor", js.undefined)
    @scala.inline
    def setScatterShapeHoleRadius(value: Double): Self = this.set("scatterShapeHoleRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScatterShapeHoleRadius: Self = this.set("scatterShapeHoleRadius", js.undefined)
    @scala.inline
    def setScatterShapeSize(value: Double): Self = this.set("scatterShapeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScatterShapeSize: Self = this.set("scatterShapeSize", js.undefined)
  }
  
}

