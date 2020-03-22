package typings.reactNativeCalendars.mod

import typings.reactNativeCalendars.AnonColor
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
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (selectedColor != null) __obj.updateDynamic("selectedColor")(selectedColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marking]
  }
  @scala.inline
  def MultiPeriodMarking(periods: js.Array[AnonColor]): Marking = {
    val __obj = js.Dynamic.literal(periods = periods.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Marking]
  }
  @scala.inline
  def DotMarking(
    activeOpacity: Int | Double = null,
    disableTouchEvent: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dotColor: String = null,
    marked: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectedColor: String = null
  ): Marking = {
    val __obj = js.Dynamic.literal()
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTouchEvent)) __obj.updateDynamic("disableTouchEvent")(disableTouchEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dotColor != null) __obj.updateDynamic("dotColor")(dotColor.asInstanceOf[js.Any])
    if (!js.isUndefined(marked)) __obj.updateDynamic("marked")(marked.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
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
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(endingDay)) __obj.updateDynamic("endingDay")(endingDay.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (!js.isUndefined(startingDay)) __obj.updateDynamic("startingDay")(startingDay.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marking]
  }
}

