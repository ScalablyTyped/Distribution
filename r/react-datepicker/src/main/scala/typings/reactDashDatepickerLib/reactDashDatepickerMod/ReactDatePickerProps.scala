package typings
package reactDashDatepickerLib.reactDashDatepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactDatePickerProps extends js.Object {
  var adjustDateOnChange: js.UndefOr[scala.Boolean] = js.native
  var allowSameDay: js.UndefOr[scala.Boolean] = js.native
  var autoComplete: js.UndefOr[java.lang.String] = js.native
  var autoFocus: js.UndefOr[scala.Boolean] = js.native
  var calendarClassName: js.UndefOr[java.lang.String] = js.native
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.native
  var className: js.UndefOr[java.lang.String] = js.native
  var customInput: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.native
  var customInputRef: js.UndefOr[java.lang.String] = js.native
  var dateFormat: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.native
  var dateFormatCalendar: js.UndefOr[java.lang.String] = js.native
  var dayClassName: js.UndefOr[
    js.Function1[/* date */ momentLib.momentMod.momentNs.Moment, java.lang.String | scala.Null]
  ] = js.native
  var disabled: js.UndefOr[scala.Boolean] = js.native
  var disabledKeyboardNavigation: js.UndefOr[scala.Boolean] = js.native
  var dropdownMode: js.UndefOr[
    reactDashDatepickerLib.reactDashDatepickerLibStrings.scroll | reactDashDatepickerLib.reactDashDatepickerLibStrings.select
  ] = js.native
  var endDate: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.native
  var excludeDates: js.UndefOr[js.Array[momentLib.momentMod.momentNs.Moment]] = js.native
  var excludeTimes: js.UndefOr[js.Array[momentLib.momentMod.momentNs.Moment]] = js.native
  var filterDate: js.UndefOr[js.Function1[/* date */ momentLib.momentMod.momentNs.Moment, scala.Boolean]] = js.native
  var fixedHeight: js.UndefOr[scala.Boolean] = js.native
  var forceShowMonthNavigation: js.UndefOr[scala.Boolean] = js.native
  var formatWeekNumber: js.UndefOr[
    js.Function1[/* date */ momentLib.momentMod.momentNs.Moment, java.lang.String | scala.Double]
  ] = js.native
  var highlightDates: js.UndefOr[js.Array[momentLib.momentMod.momentNs.Moment]] = js.native
  var id: js.UndefOr[java.lang.String] = js.native
  var includeDates: js.UndefOr[js.Array[momentLib.momentMod.momentNs.Moment]] = js.native
  var includeTimes: js.UndefOr[js.Array[momentLib.momentMod.momentNs.Moment]] = js.native
  var `inline`: js.UndefOr[scala.Boolean] = js.native
  var isClearable: js.UndefOr[scala.Boolean] = js.native
  var locale: js.UndefOr[java.lang.String] = js.native
  var maxDate: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.native
  var maxTime: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.native
  var minDate: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.native
  var minTime: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.native
  var monthsShown: js.UndefOr[scala.Double] = js.native
  var name: js.UndefOr[java.lang.String] = js.native
  var onBlur: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLInputElement], 
      scala.Unit
    ]
  ] = js.native
  var onChangeRaw: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLInputElement], 
      scala.Unit
    ]
  ] = js.native
  var onClickOutside: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement], 
      scala.Unit
    ]
  ] = js.native
  var onFocus: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLInputElement], 
      scala.Unit
    ]
  ] = js.native
  var onKeyDown: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLDivElement], 
      scala.Unit
    ]
  ] = js.native
  var onMonthChange: js.UndefOr[js.Function1[/* date */ momentLib.momentMod.momentNs.Moment, scala.Unit]] = js.native
  var onSelect: js.UndefOr[
    js.Function2[
      /* date */ momentLib.momentMod.momentNs.Moment, 
      /* event */ js.UndefOr[reactLib.reactMod.ReactNs.SyntheticEvent[_]], 
      scala.Unit
    ]
  ] = js.native
  var onWeekSelect: js.UndefOr[
    js.Function3[
      /* firstDayOfWeek */ momentLib.momentMod.momentNs.Moment, 
      /* weekNumber */ java.lang.String | scala.Double, 
      /* event */ js.UndefOr[reactLib.reactMod.ReactNs.SyntheticEvent[_]], 
      scala.Unit
    ]
  ] = js.native
  var onYearChange: js.UndefOr[js.Function1[/* date */ momentLib.momentMod.momentNs.Moment, scala.Unit]] = js.native
  var openToDate: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.native
  var peekNextMonth: js.UndefOr[scala.Boolean] = js.native
  var placeholderText: js.UndefOr[java.lang.String] = js.native
  var popperClassName: js.UndefOr[java.lang.String] = js.native
  var popperContainer: js.UndefOr[
    js.Function1[
      /* props */ reactDashDatepickerLib.Anon_Children, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.native
  var popperModifiers: js.UndefOr[popperDotJsLib.popperDotJsMod.Modifiers] = js.native
  var popperPlacement: js.UndefOr[java.lang.String] = js.native
  var preventOpenOnFocus: js.UndefOr[scala.Boolean] = js.native
  var readOnly: js.UndefOr[scala.Boolean] = js.native
  var required: js.UndefOr[scala.Boolean] = js.native
  var scrollableMonthYearDropdown: js.UndefOr[scala.Boolean] = js.native
  var scrollableYearDropdown: js.UndefOr[scala.Boolean] = js.native
  var selected: js.UndefOr[momentLib.momentMod.momentNs.Moment | scala.Null] = js.native
  var selectsEnd: js.UndefOr[scala.Boolean] = js.native
  var selectsStart: js.UndefOr[scala.Boolean] = js.native
  var shouldCloseOnSelect: js.UndefOr[scala.Boolean] = js.native
  var showDisabledMonthNavigation: js.UndefOr[scala.Boolean] = js.native
  var showMonthDropdown: js.UndefOr[scala.Boolean] = js.native
  var showMonthYearDropdown: js.UndefOr[scala.Boolean] = js.native
  var showTimeSelect: js.UndefOr[scala.Boolean] = js.native
  var showTimeSelectOnly: js.UndefOr[scala.Boolean] = js.native
  var showWeekNumbers: js.UndefOr[scala.Boolean] = js.native
  var showYearDropdown: js.UndefOr[scala.Boolean] = js.native
  var startDate: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.native
  var startOpen: js.UndefOr[scala.Boolean] = js.native
  var tabIndex: js.UndefOr[scala.Double] = js.native
  var timeCaption: js.UndefOr[java.lang.String] = js.native
  var timeFormat: js.UndefOr[java.lang.String] = js.native
  var timeIntervals: js.UndefOr[scala.Double] = js.native
  var title: js.UndefOr[java.lang.String] = js.native
  var todayButton: js.UndefOr[java.lang.String] = js.native
  var useShortMonthInDropdown: js.UndefOr[scala.Boolean] = js.native
  var useWeekdaysShort: js.UndefOr[scala.Boolean] = js.native
  var utcOffset: js.UndefOr[scala.Double] = js.native
  var value: js.UndefOr[java.lang.String] = js.native
  var weekLabel: js.UndefOr[java.lang.String] = js.native
  var withPortal: js.UndefOr[scala.Boolean] = js.native
  var yearDropdownItemNumber: js.UndefOr[scala.Double] = js.native
  def onChange(): scala.Unit = js.native
  def onChange(date: momentLib.momentMod.momentNs.Moment): scala.Unit = js.native
  def onChange(date: momentLib.momentMod.momentNs.Moment, event: reactLib.reactMod.ReactNs.SyntheticEvent[_]): scala.Unit = js.native
  def onChange(date: scala.Null, event: reactLib.reactMod.ReactNs.SyntheticEvent[_]): scala.Unit = js.native
}

