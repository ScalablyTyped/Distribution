package typings
package reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CalendarBaseProps extends js.Object {
  /**
       *  Initially visible month. Default = Date()
       */
  var current: js.UndefOr[TCalendarDate] = js.undefined
  /**
       *  Provide custom day rendering component.
       */
  var dayComponent: js.UndefOr[
    (reactLib.reactMod.Component[DayComponentProps, js.Object, _]) | reactLib.reactMod.ReactNs.SFC[DayComponentProps]
  ] = js.undefined
  /**
       *  If hideArrows=false and hideExtraDays=false do not switch month when tapping on greyed out
       *  day from another month that is visible in calendar page. Default = false
       */
  var disableMonthChange: js.UndefOr[scala.Boolean] = js.undefined
  /**
       *  Disable days by default. Default = false
       */
  var disabledByDefault: js.UndefOr[scala.Boolean] = js.undefined
  /**
       *  Display loading indicator. Default = false
       */
  var displayLoadingIndicator: js.UndefOr[scala.Boolean] = js.undefined
  /**
       *  If firstDay=1 week starts from Monday. Note that dayNames and dayNamesShort should still start from Sunday.
       */
  var firstDay: js.UndefOr[scala.Double] = js.undefined
  /**
       *  Hide month navigation arrows. Default = false
       */
  var hideArrows: js.UndefOr[scala.Boolean] = js.undefined
  /**
       *  Hide day names. Default = false
       */
  var hideDayNames: js.UndefOr[scala.Boolean] = js.undefined
  /**
       *  Do not show days of other months in month page. Default = false
       */
  var hideExtraDays: js.UndefOr[scala.Boolean] = js.undefined
  /**
       *  Maximum date that can be selected, dates after maxDate will be grayed out. Default = undefined
       */
  var maxDate: js.UndefOr[TCalendarDate] = js.undefined
  /**
       *  Minimum date that can be selected, dates before minDate will be grayed out. Default = undefined
       */
  var minDate: js.UndefOr[TCalendarDate] = js.undefined
  /**
       *  Month format in calendar title. Formatting values: http://arshaw.com/xdate/#Formatting
       */
  var monthFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
       *  Handler which gets executed on day long press. Default = undefined
       */
  var onDayLongPress: js.UndefOr[DateCallbackHandler] = js.undefined
  /**
       *  Handler which gets executed on day press. Default = undefined
       */
  var onDayPress: js.UndefOr[DateCallbackHandler] = js.undefined
  /**
       *  Handler which gets executed when visible month changes in calendar. Default = undefined
       */
  var onMonthChange: js.UndefOr[DateCallbackHandler] = js.undefined
  /**
       *  Handler which gets executed when press arrow icon left. It receive a callback can go back month
       */
  var onPressArrowLeft: js.UndefOr[js.Function1[/* substractMonth */ js.Function0[scala.Unit], scala.Unit]] = js.undefined
  /**
       *  Handler which gets executed when press arrow icon left. It receive a callback can go next month
       */
  var onPressArrowRight: js.UndefOr[js.Function1[/* addMonth */ js.Function0[scala.Unit], scala.Unit]] = js.undefined
  /**
       *  Callback which gets executed when visible months change in scroll view. Default = undefined
       */
  var onVisibleMonthsChange: js.UndefOr[js.Function1[/* months */ js.Array[DateObject], scala.Unit]] = js.undefined
  /**
       *  Replace default arrows with custom ones (direction can be 'left' or 'right')
       */
  var renderArrow: js.UndefOr[
    js.Function1[
      /* direction */ reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.left | reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.right, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  /**
       *  Show week numbers to the left. Default = false
       */
  var showWeekNumbers: js.UndefOr[scala.Boolean] = js.undefined
  /**
       *  Calendar container style.
       */
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
       *  Specify theme properties to override specific styles for calendar parts. Default = {}
       */
  var theme: js.UndefOr[CalendarTheme] = js.undefined
}

