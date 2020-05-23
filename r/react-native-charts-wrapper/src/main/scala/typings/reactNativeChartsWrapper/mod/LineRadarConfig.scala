package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.anon.Angle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineRadarConfig extends js.Object {
  var drawFilled: js.UndefOr[Boolean] = js.undefined
  var fillAlpha: js.UndefOr[Double] = js.undefined
  var fillColor: js.UndefOr[Color] = js.undefined
  var fillGradient: js.UndefOr[Angle] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object LineRadarConfig {
  @scala.inline
  def apply(
    drawFilled: js.UndefOr[Boolean] = js.undefined,
    fillAlpha: js.UndefOr[Double] = js.undefined,
    fillColor: js.UndefOr[Color] = js.undefined,
    fillGradient: Angle = null,
    lineWidth: js.UndefOr[Double] = js.undefined
  ): LineRadarConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(drawFilled)) __obj.updateDynamic("drawFilled")(drawFilled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fillAlpha)) __obj.updateDynamic("fillAlpha")(fillAlpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fillColor)) __obj.updateDynamic("fillColor")(fillColor.get.asInstanceOf[js.Any])
    if (fillGradient != null) __obj.updateDynamic("fillGradient")(fillGradient.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineRadarConfig]
  }
}

