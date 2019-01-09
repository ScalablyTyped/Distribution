package typings
package reactDashDatesLib.reactDashDatesMod.ReactDatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// shapes/DateRangePickerShape.js
@js.native
trait DateRangePickerShape extends js.Object {
  var anchorDirection: js.UndefOr[AnchorDirectionShape] = js.native
  var appendToBody: js.UndefOr[scala.Boolean] = js.native
  var block: js.UndefOr[scala.Boolean] = js.native
  var calendarInfoPosition: js.UndefOr[CalendarInfoPositionShape] = js.native
  var customArrowIcon: js.UndefOr[java.lang.String | reactLib.reactMod.Global.JSXNs.Element] = js.native
  var customCloseIcon: js.UndefOr[java.lang.String | reactLib.reactMod.Global.JSXNs.Element] = js.native
  var customInputIcon: js.UndefOr[java.lang.String | reactLib.reactMod.Global.JSXNs.Element] = js.native
  var dayAriaLabelFormat: js.UndefOr[java.lang.String] = js.native
  var daySize: js.UndefOr[scala.Double] = js.native
  var disableScroll: js.UndefOr[scala.Boolean] = js.native
  var disabled: js.UndefOr[DisabledShape] = js.native
  // internationalization props
  var displayFormat: js.UndefOr[java.lang.String | js.Function0[java.lang.String]] = js.native
  var enableOutsideDays: js.UndefOr[scala.Boolean] = js.native
  var endDate: reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj | scala.Null = js.native
  var endDateId: java.lang.String = js.native
  var endDatePlaceholderText: js.UndefOr[java.lang.String] = js.native
  var firstDayOfWeek: js.UndefOr[DayOfWeekShape] = js.native
  var focusedInput: FocusedInputShape | scala.Null = js.native
  var hideKeyboardShortcutsPanel: js.UndefOr[scala.Boolean] = js.native
  var horizontalMargin: js.UndefOr[scala.Double] = js.native
  var initialVisibleMonth: js.UndefOr[js.Function0[reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj]] = js.native
  var inputIconPosition: js.UndefOr[IconPositionShape] = js.native
  var isDayBlocked: js.UndefOr[js.Function1[/* day */ js.Any, scala.Boolean]] = js.native
  var isDayHighlighted: js.UndefOr[js.Function1[/* day */ js.Any, scala.Boolean]] = js.native
  var isOutsideRange: js.UndefOr[js.Function1[/* day */ js.Any, scala.Boolean]] = js.native
  var isRTL: js.UndefOr[scala.Boolean] = js.native
  var keepFocusOnInput: js.UndefOr[scala.Boolean] = js.native
  var keepOpenOnDateSelect: js.UndefOr[scala.Boolean] = js.native
  var minimumNights: js.UndefOr[scala.Double] = js.native
  var monthFormat: js.UndefOr[java.lang.String] = js.native
  var navNext: js.UndefOr[java.lang.String | reactLib.reactMod.Global.JSXNs.Element] = js.native
  // navigation related props
  var navPrev: js.UndefOr[java.lang.String | reactLib.reactMod.Global.JSXNs.Element] = js.native
  var noBorder: js.UndefOr[scala.Boolean] = js.native
  var numberOfMonths: js.UndefOr[scala.Double] = js.native
  var onClose: js.UndefOr[js.Function1[/* final */ reactDashDatesLib.Anon_EndDateStartDate, scala.Unit]] = js.native
  var onNextMonthClick: js.UndefOr[
    js.Function1[
      /* newCurrentMonth */ reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj, 
      scala.Unit
    ]
  ] = js.native
  var onPrevMonthClick: js.UndefOr[
    js.Function1[
      /* newCurrentMonth */ reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj, 
      scala.Unit
    ]
  ] = js.native
  var openDirection: js.UndefOr[OpenDirectionShape] = js.native
  var orientation: js.UndefOr[OrientationShape] = js.native
  var phrases: js.UndefOr[DateRangePickerPhrases] = js.native
  var readOnly: js.UndefOr[scala.Boolean] = js.native
  var regular: js.UndefOr[scala.Boolean] = js.native
  // day presentation and interaction related props
  var renderCalendarDay: js.UndefOr[
    js.Function1[
      /* day */ reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj, 
      java.lang.String | reactLib.reactMod.Global.JSXNs.Element
    ]
  ] = js.native
  var renderCalendarInfo: js.UndefOr[js.Function0[java.lang.String | reactLib.reactMod.Global.JSXNs.Element]] = js.native
  var renderDayContents: js.UndefOr[
    js.Function1[
      /* day */ reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj, 
      java.lang.String | reactLib.reactMod.Global.JSXNs.Element
    ]
  ] = js.native
  var renderMonthElement: js.UndefOr[
    js.Function1[
      /* props */ reactDashDatesLib.Anon_CurrentMonth, 
      java.lang.String | reactLib.reactMod.Global.JSXNs.Element
    ]
  ] = js.native
  // calendar presentation and interaction related props
  var renderMonthText: js.UndefOr[
    js.Function1[
      /* day */ reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj, 
      java.lang.String | reactLib.reactMod.Global.JSXNs.Element
    ]
  ] = js.native
  var reopenPickerOnClearDates: js.UndefOr[scala.Boolean] = js.native
  var required: js.UndefOr[scala.Boolean] = js.native
  var screenReaderInputMessage: js.UndefOr[java.lang.String] = js.native
  var showClearDates: js.UndefOr[scala.Boolean] = js.native
  var showDefaultInputIcon: js.UndefOr[scala.Boolean] = js.native
  var small: js.UndefOr[scala.Boolean] = js.native
  // required props for a functional interactive DateRangePicker
  var startDate: reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj | scala.Null = js.native
  var startDateId: java.lang.String = js.native
  // input related props
  var startDatePlaceholderText: js.UndefOr[java.lang.String] = js.native
  var transitionDuration: js.UndefOr[scala.Double] = js.native
  var verticalHeight: js.UndefOr[scala.Double] = js.native
  var verticalSpacing: js.UndefOr[scala.Double] = js.native
  var weekDayFormat: js.UndefOr[java.lang.String] = js.native
  var withFullScreenPortal: js.UndefOr[scala.Boolean] = js.native
  var withPortal: js.UndefOr[scala.Boolean] = js.native
  def onDatesChange(arg: reactDashDatesLib.Anon_EndDate): scala.Unit = js.native
  def onFocusChange(): scala.Unit = js.native
  def onFocusChange(arg: FocusedInputShape): scala.Unit = js.native
}

