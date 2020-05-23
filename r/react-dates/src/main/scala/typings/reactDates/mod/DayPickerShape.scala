package typings.reactDates.mod

import typings.react.mod.global.JSX.Element
import typings.reactDates.anon.IsVisible
import typings.reactDates.mod.momentPropTypes.momentObj
import typings.reactDates.reactDatesNumbers.`0`
import typings.reactDates.reactDatesNumbers.`1`
import typings.reactDates.reactDatesNumbers.`2`
import typings.reactDates.reactDatesNumbers.`3`
import typings.reactDates.reactDatesNumbers.`4`
import typings.reactDates.reactDatesNumbers.`5`
import typings.reactDates.reactDatesNumbers.`6`
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
  var horizontalMonthPadding: js.UndefOr[Double] = js.undefined
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
  var renderMonthElement: js.UndefOr[js.Function1[/* props */ IsVisible, String | Element]] = js.undefined
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
    daySize: js.UndefOr[Double] = js.undefined,
    enableOutsideDays: js.UndefOr[Boolean] = js.undefined,
    firstDayOfWeek: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null,
    hideKeyboardShortcutsPanel: js.UndefOr[Boolean] = js.undefined,
    horizontalMonthPadding: js.UndefOr[Double] = js.undefined,
    initialVisibleMonth: () => momentObj = null,
    isFocused: js.UndefOr[Boolean] = js.undefined,
    isRTL: js.UndefOr[Boolean] = js.undefined,
    monthFormat: String = null,
    navNext: String | Element = null,
    navPrev: String | Element = null,
    noBorder: js.UndefOr[Boolean] = js.undefined,
    numberOfMonths: js.UndefOr[Double] = js.undefined,
    onBlur: () => Unit = null,
    onNextMonthClick: /* newCurrentMonth */ momentObj => Unit = null,
    onOutsideClick: /* e */ js.Any => Unit = null,
    onPrevMonthClick: /* newCurrentMonth */ momentObj => Unit = null,
    orientation: ScrollableOrientationShape = null,
    phrases: SingleDatePickerPhrases = null,
    renderCalendarDay: /* day */ momentObj => String | Element = null,
    renderCalendarInfo: () => String | Element = null,
    renderDayContents: /* day */ momentObj => String | Element = null,
    renderMonthElement: /* props */ IsVisible => String | Element = null,
    renderMonthText: /* day */ momentObj => String | Element = null,
    showKeyboardShortcuts: js.UndefOr[Boolean] = js.undefined,
    transitionDuration: js.UndefOr[Double] = js.undefined,
    verticalHeight: js.UndefOr[Double] = js.undefined,
    weekDayFormat: String = null,
    withPortal: js.UndefOr[Boolean] = js.undefined
  ): DayPickerShape = {
    val __obj = js.Dynamic.literal()
    if (calendarInfoPosition != null) __obj.updateDynamic("calendarInfoPosition")(calendarInfoPosition.asInstanceOf[js.Any])
    if (dayAriaLabelFormat != null) __obj.updateDynamic("dayAriaLabelFormat")(dayAriaLabelFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(daySize)) __obj.updateDynamic("daySize")(daySize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOutsideDays)) __obj.updateDynamic("enableOutsideDays")(enableOutsideDays.get.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(hideKeyboardShortcutsPanel)) __obj.updateDynamic("hideKeyboardShortcutsPanel")(hideKeyboardShortcutsPanel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalMonthPadding)) __obj.updateDynamic("horizontalMonthPadding")(horizontalMonthPadding.get.asInstanceOf[js.Any])
    if (initialVisibleMonth != null) __obj.updateDynamic("initialVisibleMonth")(js.Any.fromFunction0(initialVisibleMonth))
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isRTL)) __obj.updateDynamic("isRTL")(isRTL.get.asInstanceOf[js.Any])
    if (monthFormat != null) __obj.updateDynamic("monthFormat")(monthFormat.asInstanceOf[js.Any])
    if (navNext != null) __obj.updateDynamic("navNext")(navNext.asInstanceOf[js.Any])
    if (navPrev != null) __obj.updateDynamic("navPrev")(navPrev.asInstanceOf[js.Any])
    if (!js.isUndefined(noBorder)) __obj.updateDynamic("noBorder")(noBorder.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfMonths)) __obj.updateDynamic("numberOfMonths")(numberOfMonths.get.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onNextMonthClick != null) __obj.updateDynamic("onNextMonthClick")(js.Any.fromFunction1(onNextMonthClick))
    if (onOutsideClick != null) __obj.updateDynamic("onOutsideClick")(js.Any.fromFunction1(onOutsideClick))
    if (onPrevMonthClick != null) __obj.updateDynamic("onPrevMonthClick")(js.Any.fromFunction1(onPrevMonthClick))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (phrases != null) __obj.updateDynamic("phrases")(phrases.asInstanceOf[js.Any])
    if (renderCalendarDay != null) __obj.updateDynamic("renderCalendarDay")(js.Any.fromFunction1(renderCalendarDay))
    if (renderCalendarInfo != null) __obj.updateDynamic("renderCalendarInfo")(js.Any.fromFunction0(renderCalendarInfo))
    if (renderDayContents != null) __obj.updateDynamic("renderDayContents")(js.Any.fromFunction1(renderDayContents))
    if (renderMonthElement != null) __obj.updateDynamic("renderMonthElement")(js.Any.fromFunction1(renderMonthElement))
    if (renderMonthText != null) __obj.updateDynamic("renderMonthText")(js.Any.fromFunction1(renderMonthText))
    if (!js.isUndefined(showKeyboardShortcuts)) __obj.updateDynamic("showKeyboardShortcuts")(showKeyboardShortcuts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionDuration)) __obj.updateDynamic("transitionDuration")(transitionDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalHeight)) __obj.updateDynamic("verticalHeight")(verticalHeight.get.asInstanceOf[js.Any])
    if (weekDayFormat != null) __obj.updateDynamic("weekDayFormat")(weekDayFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(withPortal)) __obj.updateDynamic("withPortal")(withPortal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayPickerShape]
  }
}

