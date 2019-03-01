package typings
package reactDashDatesLib.reactDashDatesMod.ReactDatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// components/DayPickerShape.jsx
trait DayPickerShape extends js.Object {
  var calendarInfoPosition: js.UndefOr[CalendarInfoPositionShape] = js.undefined
  var dayAriaLabelFormat: js.UndefOr[java.lang.String] = js.undefined
  var daySize: js.UndefOr[scala.Double] = js.undefined
  var enableOutsideDays: js.UndefOr[scala.Boolean] = js.undefined
  var firstDayOfWeek: js.UndefOr[
    reactDashDatesLib.reactDashDatesLibNumbers.`0` | reactDashDatesLib.reactDashDatesLibNumbers.`1` | reactDashDatesLib.reactDashDatesLibNumbers.`2` | reactDashDatesLib.reactDashDatesLibNumbers.`3` | reactDashDatesLib.reactDashDatesLibNumbers.`4` | reactDashDatesLib.reactDashDatesLibNumbers.`5` | reactDashDatesLib.reactDashDatesLibNumbers.`6`
  ] = js.undefined
  var hideKeyboardShortcutsPanel: js.UndefOr[scala.Boolean] = js.undefined
  var initialVisibleMonth: js.UndefOr[js.Function0[reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj]] = js.undefined
  var isFocused: js.UndefOr[scala.Boolean] = js.undefined
  var isRTL: js.UndefOr[scala.Boolean] = js.undefined
  // i18n
  var monthFormat: js.UndefOr[java.lang.String] = js.undefined
  var navNext: js.UndefOr[java.lang.String | reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var navPrev: js.UndefOr[java.lang.String | reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var noBorder: js.UndefOr[scala.Boolean] = js.undefined
  var numberOfMonths: js.UndefOr[scala.Double] = js.undefined
  // accessibility
  var onBlur: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onNextMonthClick: js.UndefOr[
    js.Function1[
      /* newCurrentMonth */ reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj, 
      scala.Unit
    ]
  ] = js.undefined
  var onOutsideClick: js.UndefOr[js.Function1[/* e */ js.Any, scala.Unit]] = js.undefined
  var onPrevMonthClick: js.UndefOr[
    js.Function1[
      /* newCurrentMonth */ reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj, 
      scala.Unit
    ]
  ] = js.undefined
  var orientation: js.UndefOr[ScrollableOrientationShape] = js.undefined
  var phrases: js.UndefOr[SingleDatePickerPhrases] = js.undefined
  var renderCalendarDay: js.UndefOr[
    js.Function1[
      /* day */ reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj, 
      java.lang.String | reactLib.reactMod.Global.JSXNs.Element
    ]
  ] = js.undefined
  var renderCalendarInfo: js.UndefOr[js.Function0[java.lang.String | reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  var renderDayContents: js.UndefOr[
    js.Function1[
      /* day */ reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj, 
      java.lang.String | reactLib.reactMod.Global.JSXNs.Element
    ]
  ] = js.undefined
  var renderMonthElement: js.UndefOr[
    js.Function1[
      /* props */ reactDashDatesLib.Anon_CurrentMonth, 
      java.lang.String | reactLib.reactMod.Global.JSXNs.Element
    ]
  ] = js.undefined
  var renderMonthText: js.UndefOr[
    js.Function1[
      /* day */ reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj, 
      java.lang.String | reactLib.reactMod.Global.JSXNs.Element
    ]
  ] = js.undefined
  var showKeyboardShortcuts: js.UndefOr[scala.Boolean] = js.undefined
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
  var verticalHeight: js.UndefOr[scala.Double] = js.undefined
  var weekDayFormat: js.UndefOr[java.lang.String] = js.undefined
  var withPortal: js.UndefOr[scala.Boolean] = js.undefined
}

object DayPickerShape {
  @scala.inline
  def apply(
    calendarInfoPosition: CalendarInfoPositionShape = null,
    dayAriaLabelFormat: java.lang.String = null,
    daySize: scala.Int | scala.Double = null,
    enableOutsideDays: js.UndefOr[scala.Boolean] = js.undefined,
    firstDayOfWeek: reactDashDatesLib.reactDashDatesLibNumbers.`0` | reactDashDatesLib.reactDashDatesLibNumbers.`1` | reactDashDatesLib.reactDashDatesLibNumbers.`2` | reactDashDatesLib.reactDashDatesLibNumbers.`3` | reactDashDatesLib.reactDashDatesLibNumbers.`4` | reactDashDatesLib.reactDashDatesLibNumbers.`5` | reactDashDatesLib.reactDashDatesLibNumbers.`6` = null,
    hideKeyboardShortcutsPanel: js.UndefOr[scala.Boolean] = js.undefined,
    initialVisibleMonth: js.Function0[reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj] = null,
    isFocused: js.UndefOr[scala.Boolean] = js.undefined,
    isRTL: js.UndefOr[scala.Boolean] = js.undefined,
    monthFormat: java.lang.String = null,
    navNext: java.lang.String | reactLib.reactMod.Global.JSXNs.Element = null,
    navPrev: java.lang.String | reactLib.reactMod.Global.JSXNs.Element = null,
    noBorder: js.UndefOr[scala.Boolean] = js.undefined,
    numberOfMonths: scala.Int | scala.Double = null,
    onBlur: js.Function0[scala.Unit] = null,
    onNextMonthClick: js.Function1[
      /* newCurrentMonth */ reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj, 
      scala.Unit
    ] = null,
    onOutsideClick: js.Function1[/* e */ js.Any, scala.Unit] = null,
    onPrevMonthClick: js.Function1[
      /* newCurrentMonth */ reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj, 
      scala.Unit
    ] = null,
    orientation: ScrollableOrientationShape = null,
    phrases: SingleDatePickerPhrases = null,
    renderCalendarDay: js.Function1[
      /* day */ reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj, 
      java.lang.String | reactLib.reactMod.Global.JSXNs.Element
    ] = null,
    renderCalendarInfo: js.Function0[java.lang.String | reactLib.reactMod.Global.JSXNs.Element] = null,
    renderDayContents: js.Function1[
      /* day */ reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj, 
      java.lang.String | reactLib.reactMod.Global.JSXNs.Element
    ] = null,
    renderMonthElement: js.Function1[
      /* props */ reactDashDatesLib.Anon_CurrentMonth, 
      java.lang.String | reactLib.reactMod.Global.JSXNs.Element
    ] = null,
    renderMonthText: js.Function1[
      /* day */ reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj, 
      java.lang.String | reactLib.reactMod.Global.JSXNs.Element
    ] = null,
    showKeyboardShortcuts: js.UndefOr[scala.Boolean] = js.undefined,
    transitionDuration: scala.Int | scala.Double = null,
    verticalHeight: scala.Int | scala.Double = null,
    weekDayFormat: java.lang.String = null,
    withPortal: js.UndefOr[scala.Boolean] = js.undefined
  ): DayPickerShape = {
    val __obj = js.Dynamic.literal()
    if (calendarInfoPosition != null) __obj.updateDynamic("calendarInfoPosition")(calendarInfoPosition)
    if (dayAriaLabelFormat != null) __obj.updateDynamic("dayAriaLabelFormat")(dayAriaLabelFormat)
    if (daySize != null) __obj.updateDynamic("daySize")(daySize.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOutsideDays)) __obj.updateDynamic("enableOutsideDays")(enableOutsideDays)
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(hideKeyboardShortcutsPanel)) __obj.updateDynamic("hideKeyboardShortcutsPanel")(hideKeyboardShortcutsPanel)
    if (initialVisibleMonth != null) __obj.updateDynamic("initialVisibleMonth")(initialVisibleMonth)
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused)
    if (!js.isUndefined(isRTL)) __obj.updateDynamic("isRTL")(isRTL)
    if (monthFormat != null) __obj.updateDynamic("monthFormat")(monthFormat)
    if (navNext != null) __obj.updateDynamic("navNext")(navNext.asInstanceOf[js.Any])
    if (navPrev != null) __obj.updateDynamic("navPrev")(navPrev.asInstanceOf[js.Any])
    if (!js.isUndefined(noBorder)) __obj.updateDynamic("noBorder")(noBorder)
    if (numberOfMonths != null) __obj.updateDynamic("numberOfMonths")(numberOfMonths.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onNextMonthClick != null) __obj.updateDynamic("onNextMonthClick")(onNextMonthClick)
    if (onOutsideClick != null) __obj.updateDynamic("onOutsideClick")(onOutsideClick)
    if (onPrevMonthClick != null) __obj.updateDynamic("onPrevMonthClick")(onPrevMonthClick)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (phrases != null) __obj.updateDynamic("phrases")(phrases)
    if (renderCalendarDay != null) __obj.updateDynamic("renderCalendarDay")(renderCalendarDay)
    if (renderCalendarInfo != null) __obj.updateDynamic("renderCalendarInfo")(renderCalendarInfo)
    if (renderDayContents != null) __obj.updateDynamic("renderDayContents")(renderDayContents)
    if (renderMonthElement != null) __obj.updateDynamic("renderMonthElement")(renderMonthElement)
    if (renderMonthText != null) __obj.updateDynamic("renderMonthText")(renderMonthText)
    if (!js.isUndefined(showKeyboardShortcuts)) __obj.updateDynamic("showKeyboardShortcuts")(showKeyboardShortcuts)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (verticalHeight != null) __obj.updateDynamic("verticalHeight")(verticalHeight.asInstanceOf[js.Any])
    if (weekDayFormat != null) __obj.updateDynamic("weekDayFormat")(weekDayFormat)
    if (!js.isUndefined(withPortal)) __obj.updateDynamic("withPortal")(withPortal)
    __obj.asInstanceOf[DayPickerShape]
  }
}

