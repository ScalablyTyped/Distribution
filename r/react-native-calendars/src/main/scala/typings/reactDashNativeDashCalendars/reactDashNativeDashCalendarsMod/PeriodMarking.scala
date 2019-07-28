package typings.reactDashNativeDashCalendars.reactDashNativeDashCalendarsMod

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
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(endingDay)) __obj.updateDynamic("endingDay")(endingDay)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (!js.isUndefined(startingDay)) __obj.updateDynamic("startingDay")(startingDay)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[PeriodMarking]
  }
}

