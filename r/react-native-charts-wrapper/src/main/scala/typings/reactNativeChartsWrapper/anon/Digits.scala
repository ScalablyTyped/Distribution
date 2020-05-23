package typings.reactNativeChartsWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Digits extends js.Object {
  var digits: js.UndefOr[Double] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var markerColor: js.UndefOr[typings.reactNativeChartsWrapper.mod.Color] = js.undefined
  var textColor: js.UndefOr[typings.reactNativeChartsWrapper.mod.Color] = js.undefined
  var textSize: js.UndefOr[Double] = js.undefined
}

object Digits {
  @scala.inline
  def apply(
    digits: js.UndefOr[Double] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    markerColor: js.UndefOr[typings.reactNativeChartsWrapper.mod.Color] = js.undefined,
    textColor: js.UndefOr[typings.reactNativeChartsWrapper.mod.Color] = js.undefined,
    textSize: js.UndefOr[Double] = js.undefined
  ): Digits = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(digits)) __obj.updateDynamic("digits")(digits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(markerColor)) __obj.updateDynamic("markerColor")(markerColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textColor)) __obj.updateDynamic("textColor")(textColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textSize)) __obj.updateDynamic("textSize")(textSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Digits]
  }
}

