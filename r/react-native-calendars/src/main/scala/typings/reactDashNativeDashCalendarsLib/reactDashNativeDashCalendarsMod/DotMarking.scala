package typings
package reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotMarking extends Marking {
  var activeOpacity: js.UndefOr[scala.Double] = js.undefined
  var disableTouchEvent: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var dotColor: js.UndefOr[java.lang.String] = js.undefined
  var marked: js.UndefOr[scala.Boolean] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var selectedColor: js.UndefOr[java.lang.String] = js.undefined
}

object DotMarking {
  @scala.inline
  def apply(
    activeOpacity: scala.Int | scala.Double = null,
    disableTouchEvent: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dotColor: java.lang.String = null,
    marked: js.UndefOr[scala.Boolean] = js.undefined,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    selectedColor: java.lang.String = null
  ): DotMarking = {
    val __obj = js.Dynamic.literal()
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTouchEvent)) __obj.updateDynamic("disableTouchEvent")(disableTouchEvent)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (dotColor != null) __obj.updateDynamic("dotColor")(dotColor)
    if (!js.isUndefined(marked)) __obj.updateDynamic("marked")(marked)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (selectedColor != null) __obj.updateDynamic("selectedColor")(selectedColor)
    __obj.asInstanceOf[DotMarking]
  }
}

