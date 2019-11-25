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
    val __obj = js.Dynamic.literal(dots = dots.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (selectedColor != null) __obj.updateDynamic("selectedColor")(selectedColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiDotMarking]
  }
}

