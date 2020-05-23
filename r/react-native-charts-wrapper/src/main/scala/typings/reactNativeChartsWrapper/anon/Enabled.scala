package typings.reactNativeChartsWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enabled extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var lineColor: js.UndefOr[typings.reactNativeChartsWrapper.mod.Color] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object Enabled {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    lineColor: js.UndefOr[typings.reactNativeChartsWrapper.mod.Color] = js.undefined,
    lineWidth: js.UndefOr[Double] = js.undefined
  ): Enabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineColor)) __obj.updateDynamic("lineColor")(lineColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
}

