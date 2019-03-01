package typings
package reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiDotMarking extends Marking {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var dots: js.Array[CalendarDot]
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var selectedColor: js.UndefOr[java.lang.String] = js.undefined
}

object MultiDotMarking {
  @scala.inline
  def apply(
    dots: js.Array[CalendarDot],
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    selectedColor: java.lang.String = null
  ): MultiDotMarking = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dots")(dots)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (selectedColor != null) __obj.updateDynamic("selectedColor")(selectedColor)
    __obj.asInstanceOf[MultiDotMarking]
  }
}

