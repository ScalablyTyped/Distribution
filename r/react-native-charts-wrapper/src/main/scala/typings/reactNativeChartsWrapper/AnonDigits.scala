package typings.reactNativeChartsWrapper

import typings.reactNativeChartsWrapper.mod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDigits extends js.Object {
  var digits: js.UndefOr[Double] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var markerColor: js.UndefOr[Color] = js.undefined
  var textColor: js.UndefOr[Color] = js.undefined
  var textSize: js.UndefOr[Double] = js.undefined
}

object AnonDigits {
  @scala.inline
  def apply(
    digits: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    markerColor: Int | Double = null,
    textColor: Int | Double = null,
    textSize: Int | Double = null
  ): AnonDigits = {
    val __obj = js.Dynamic.literal()
    if (digits != null) __obj.updateDynamic("digits")(digits.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (markerColor != null) __obj.updateDynamic("markerColor")(markerColor.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (textSize != null) __obj.updateDynamic("textSize")(textSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDigits]
  }
}

