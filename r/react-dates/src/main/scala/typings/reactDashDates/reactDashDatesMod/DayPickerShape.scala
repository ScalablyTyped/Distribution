package typings.reactDashDates.reactDashDatesMod

import typings.react.reactMod.Global.JSXNs.Element
import typings.reactDashDates.Anon_CurrentMonth
import typings.reactDashDates.reactDashDatesMod.momentPropTypesNs.momentObj
import typings.reactDashDates.reactDashDatesNumbers.`0`
import typings.reactDashDates.reactDashDatesNumbers.`1`
import typings.reactDashDates.reactDashDatesNumbers.`2`
import typings.reactDashDates.reactDashDatesNumbers.`3`
import typings.reactDashDates.reactDashDatesNumbers.`4`
import typings.reactDashDates.reactDashDatesNumbers.`5`
import typings.reactDashDates.reactDashDatesNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// components/DayPickerShape.jsx
trait DayPickerShape extends js.Object {
  var calendarInfoPosition: js.UndefOr[CalendarInfoPositionShape] = js.undefined
  var dayAriaLabelFormat: js.UndefOr[String] = js.undefined
  var daySize: js.UndefOr[Double] = js.undefined
  var enableOutsideDays: js.UndefOr[Boolean] = js.undefined
  var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  var hideKeyboardShortcutsPanel: js.UndefOr[Boolean] = js.undefined
  var initialVisibleMonth: js.UndefOr[js.Function0[momentObj]] = js.undefined
  var isFocused: js.UndefOr[Boolean] = js.undefined
  var isRTL: js.UndefOr[Boolean] = js.undefined
  // i18n
  var monthFormat: js.UndefOr[String] = js.undefined
  var navNext: js.UndefOr[String | Element] = js.undefined
  var navPrev: js.UndefOr[String | Element] = js.undefined
  var noBorder: js.UndefOr[Boolean] = js.undefined
  var numberOfMonths: js.UndefOr[Double] = js.undefined
  // accessibility
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onNextMonthClick: js.UndefOr[js.Function1[/* newCurrentMonth */ momentObj, Unit]] = js.undefined
  var onOutsideClick: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
  var onPrevMonthClick: js.UndefOr[js.Function1[/* newCurrentMonth */ momentObj, Unit]] = js.undefined
  var orientation: js.UndefOr[ScrollableOrientationShape] = js.undefined
  var phrases: js.UndefOr[SingleDatePickerPhrases] = js.undefined
  var renderCalendarDay: js.UndefOr[js.Function1[/* day */ momentObj, String | Element]] = js.undefined
  var renderCalendarInfo: js.UndefOr[js.Function0[String | Element]] = js.undefined
  var renderDayContents: js.UndefOr[js.Function1[/* day */ momentObj, String | Element]] = js.undefined
  var renderMonthElement: js.UndefOr[js.Function1[/* props */ Anon_CurrentMonth, String | Element]] = js.undefined
  var renderMonthText: js.UndefOr[js.Function1[/* day */ momentObj, String | Element]] = js.undefined
  var showKeyboardShortcuts: js.UndefOr[Boolean] = js.undefined
  var transitionDuration: js.UndefOr[Double] = js.undefined
  var verticalHeight: js.UndefOr[Double] = js.undefined
  var weekDayFormat: js.UndefOr[String] = js.undefined
  var withPortal: js.UndefOr[Boolean] = js.undefined
}

object DayPickerShape {
  @scala.inline
  def apply(
    calendarInfoPosition: CalendarInfoPositionShape = null,
    dayAriaLabelFormat: String = null,
    daySize: Int | Double = null,
    enableOutsideDays: js.UndefOr[Boolean] = js.undefined,
    firstDayOfWeek: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null,
    hideKeyboardShortcutsPanel: js.UndefOr[Boolean] = js.undefined,
    initialVisibleMonth: () => momentObj = null,
    isFocused: js.UndefOr[Boolean] = js.undefined,
    isRTL: js.UndefOr[Boolean] = js.undefined,
    monthFormat: String = null,
    navNext: String | Element = null,
    navPrev: String | Element = null,
    noBorder: js.UndefOr[Boolean] = js.undefined,
    numberOfMonths: Int | Double = null,
    onBlur: () => Unit = null,
    onNextMonthClick: /* newCurrentMonth */ momentObj => Unit = null,
    onOutsideClick: /* e */ js.Any => Unit = null,
    onPrevMonthClick: /* newCurrentMonth */ momentObj => Unit = null,
    orientation: ScrollableOrientationShape = null,
    phrases: SingleDatePickerPhrases = null,
    renderCalendarDay: /* day */ momentObj => String | Element = null,
    renderCalendarInfo: () => String | Element = null,
    renderDayContents: /* day */ momentObj => String | Element = null,
    renderMonthElement: /* props */ Anon_CurrentMonth => String | Element = null,
    renderMonthText: /* day */ momentObj => String | Element = null,
    showKeyboardShortcuts: js.UndefOr[Boolean] = js.undefined,
    transitionDuration: Int | Double = null,
    verticalHeight: Int | Double = null,
    weekDayFormat: String = null,
    withPortal: js.UndefOr[Boolean] = js.undefined
  ): DayPickerShape = {
    val __obj = js.Dynamic.literal()
    if (calendarInfoPosition != null) __obj.updateDynamic("calendarInfoPosition")(calendarInfoPosition)
    if (dayAriaLabelFormat != null) __obj.updateDynamic("dayAriaLabelFormat")(dayAriaLabelFormat)
    if (daySize != null) __obj.updateDynamic("daySize")(daySize.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOutsideDays)) __obj.updateDynamic("enableOutsideDays")(enableOutsideDays)
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(hideKeyboardShortcutsPanel)) __obj.updateDynamic("hideKeyboardShortcutsPanel")(hideKeyboardShortcutsPanel)
    if (initialVisibleMonth != null) __obj.updateDynamic("initialVisibleMonth")(js.Any.fromFunction0(initialVisibleMonth))
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused)
    if (!js.isUndefined(isRTL)) __obj.updateDynamic("isRTL")(isRTL)
    if (monthFormat != null) __obj.updateDynamic("monthFormat")(monthFormat)
    if (navNext != null) __obj.updateDynamic("navNext")(navNext.asInstanceOf[js.Any])
    if (navPrev != null) __obj.updateDynamic("navPrev")(navPrev.asInstanceOf[js.Any])
    if (!js.isUndefined(noBorder)) __obj.updateDynamic("noBorder")(noBorder)
    if (numberOfMonths != null) __obj.updateDynamic("numberOfMonths")(numberOfMonths.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onNextMonthClick != null) __obj.updateDynamic("onNextMonthClick")(js.Any.fromFunction1(onNextMonthClick))
    if (onOutsideClick != null) __obj.updateDynamic("onOutsideClick")(js.Any.fromFunction1(onOutsideClick))
    if (onPrevMonthClick != null) __obj.updateDynamic("onPrevMonthClick")(js.Any.fromFunction1(onPrevMonthClick))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (phrases != null) __obj.updateDynamic("phrases")(phrases)
    if (renderCalendarDay != null) __obj.updateDynamic("renderCalendarDay")(js.Any.fromFunction1(renderCalendarDay))
    if (renderCalendarInfo != null) __obj.updateDynamic("renderCalendarInfo")(js.Any.fromFunction0(renderCalendarInfo))
    if (renderDayContents != null) __obj.updateDynamic("renderDayContents")(js.Any.fromFunction1(renderDayContents))
    if (renderMonthElement != null) __obj.updateDynamic("renderMonthElement")(js.Any.fromFunction1(renderMonthElement))
    if (renderMonthText != null) __obj.updateDynamic("renderMonthText")(js.Any.fromFunction1(renderMonthText))
    if (!js.isUndefined(showKeyboardShortcuts)) __obj.updateDynamic("showKeyboardShortcuts")(showKeyboardShortcuts)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (verticalHeight != null) __obj.updateDynamic("verticalHeight")(verticalHeight.asInstanceOf[js.Any])
    if (weekDayFormat != null) __obj.updateDynamic("weekDayFormat")(weekDayFormat)
    if (!js.isUndefined(withPortal)) __obj.updateDynamic("withPortal")(withPortal)
    __obj.asInstanceOf[DayPickerShape]
  }
}

