package typings.reactNativeCalendars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeriodMarking extends Marking {
  var color: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var endingDay: js.UndefOr[Boolean] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var startingDay: js.UndefOr[Boolean] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object PeriodMarking {
  @scala.inline
  def apply(
    color: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    endingDay: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    startingDay: js.UndefOr[Boolean] = js.undefined,
    textColor: String = null
  ): PeriodMarking = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endingDay)) __obj.updateDynamic("endingDay")(endingDay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startingDay)) __obj.updateDynamic("startingDay")(startingDay.get.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeriodMarking]
  }
}

