package typings.reactNativeCalendars.mod

import typings.reactNativeCalendars.anon.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeCalendars.mod.CustomMarking
  - typings.reactNativeCalendars.mod.DotMarking
  - typings.reactNativeCalendars.mod.MultiDotMarking
  - typings.reactNativeCalendars.mod.MultiPeriodMarking
  - typings.reactNativeCalendars.mod.PeriodMarking
*/
trait Marking extends js.Object

object Marking {
  @scala.inline
  def MultiDotMarking(
    dots: js.Array[CalendarDot],
    disabled: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectedColor: String = null
  ): Marking = {
    val __obj = js.Dynamic.literal(dots = dots.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (selectedColor != null) __obj.updateDynamic("selectedColor")(selectedColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marking]
  }
  @scala.inline
  def MultiPeriodMarking(periods: js.Array[Color]): Marking = {
    val __obj = js.Dynamic.literal(periods = periods.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marking]
  }
  @scala.inline
  def DotMarking(
    activeOpacity: js.UndefOr[Double] = js.undefined,
    disableTouchEvent: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dotColor: String = null,
    marked: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectedColor: String = null
  ): Marking = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeOpacity)) __obj.updateDynamic("activeOpacity")(activeOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTouchEvent)) __obj.updateDynamic("disableTouchEvent")(disableTouchEvent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (dotColor != null) __obj.updateDynamic("dotColor")(dotColor.asInstanceOf[js.Any])
    if (!js.isUndefined(marked)) __obj.updateDynamic("marked")(marked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (selectedColor != null) __obj.updateDynamic("selectedColor")(selectedColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marking]
  }
  @scala.inline
  def CustomMarking(customStyles: MarkedDateCustomStyles): Marking = {
    val __obj = js.Dynamic.literal(customStyles = customStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marking]
  }
  @scala.inline
  def PeriodMarking(
    color: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    endingDay: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    startingDay: js.UndefOr[Boolean] = js.undefined,
    textColor: String = null
  ): Marking = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endingDay)) __obj.updateDynamic("endingDay")(endingDay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startingDay)) __obj.updateDynamic("startingDay")(startingDay.get.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marking]
  }
}

