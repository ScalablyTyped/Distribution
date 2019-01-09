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

