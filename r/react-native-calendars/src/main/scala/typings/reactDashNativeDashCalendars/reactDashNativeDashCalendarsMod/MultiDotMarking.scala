package typings.reactDashNativeDashCalendars.reactDashNativeDashCalendarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiDotMarking extends Marking {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dots: js.Array[CalendarDot]
  var selected: js.UndefOr[Boolean] = js.undefined
  var selectedColor: js.UndefOr[String] = js.undefined
}

object MultiDotMarking {
  @scala.inline
  def apply(
    dots: js.Array[CalendarDot],
    disabled: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectedColor: String = null
  ): MultiDotMarking = {
    val __obj = js.Dynamic.literal(dots = dots)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (selectedColor != null) __obj.updateDynamic("selectedColor")(selectedColor)
    __obj.asInstanceOf[MultiDotMarking]
  }
}

