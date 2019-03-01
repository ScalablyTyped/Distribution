package typings
package reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeriodMarking extends Marking {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var endingDay: js.UndefOr[scala.Boolean] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var startingDay: js.UndefOr[scala.Boolean] = js.undefined
  var textColor: js.UndefOr[java.lang.String] = js.undefined
}

object PeriodMarking {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    endingDay: js.UndefOr[scala.Boolean] = js.undefined,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    startingDay: js.UndefOr[scala.Boolean] = js.undefined,
    textColor: java.lang.String = null
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

