package typings.reactNativeCalendars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var endingDay: js.UndefOr[Boolean] = js.undefined
  var startingDay: js.UndefOr[Boolean] = js.undefined
}

object AnonColor {
  @scala.inline
  def apply(
    color: String = null,
    endingDay: js.UndefOr[Boolean] = js.undefined,
    startingDay: js.UndefOr[Boolean] = js.undefined
  ): AnonColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(endingDay)) __obj.updateDynamic("endingDay")(endingDay.asInstanceOf[js.Any])
    if (!js.isUndefined(startingDay)) __obj.updateDynamic("startingDay")(startingDay.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColor]
  }
}

