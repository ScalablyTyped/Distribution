package typings
package reactDashMdLib.libPickersDatePickerContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerProps
  extends reactDashMdLib.libPickersMod.BasePickerProps {
  var calendarClassName: js.UndefOr[java.lang.String] = js.undefined
  var calendarDateClassName: js.UndefOr[java.lang.String] = js.undefined
  var calendarOuterDateClassName: js.UndefOr[java.lang.String] = js.undefined
  var calendarTitleClassName: js.UndefOr[java.lang.String] = js.undefined
  var calendarTitleFormat: js.UndefOr[reactDashMdLib.libPickersMod.CalendarTitleFormat] = js.undefined
  var calendarWeekdayClassName: js.UndefOr[java.lang.String] = js.undefined
  var calendarWeekdayFormat: js.UndefOr[reactDashMdLib.libPickersMod.NSL] = js.undefined
  var dateRenderer: js.UndefOr[
    js.Function2[
      /* date */ stdLib.Date, 
      /* day */ scala.Double, 
      reactLib.reactMod.ReactNs.ReactElement[_]
    ]
  ] = js.undefined
  var defaultCalendarDate: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  var defaultCalendarMode: js.UndefOr[
    reactDashMdLib.reactDashMdLibStrings.calendar | reactDashMdLib.reactDashMdLibStrings.year
  ] = js.undefined
  var defaultValue: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  var disableOuterDates: js.UndefOr[scala.Boolean] = js.undefined
  var firstDayOfWeek: js.UndefOr[
    reactDashMdLib.reactDashMdLibNumbers.`0` | reactDashMdLib.reactDashMdLibNumbers.`1` | reactDashMdLib.reactDashMdLibNumbers.`2` | reactDashMdLib.reactDashMdLibNumbers.`3` | reactDashMdLib.reactDashMdLibNumbers.`4` | reactDashMdLib.reactDashMdLibNumbers.`5` | reactDashMdLib.reactDashMdLibNumbers.`6`
  ] = js.undefined
  var formatOptions: js.UndefOr[reactDashMdLib.libPickersMod.IntlFormat] = js.undefined
  var getDateClassName: js.UndefOr[js.Function2[/* date */ stdLib.Date, /* day */ scala.Double, java.lang.String]] = js.undefined
  /**
    * @deprecated
    */
  var initialCalendarDate: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  var maxDate: js.UndefOr[stdLib.Date] = js.undefined
  var minDate: js.UndefOr[stdLib.Date] = js.undefined
  var nextIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var nextIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var nextIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* formattedDate */ java.lang.String, 
      /* date */ stdLib.Date, 
      /* event */ reactLib.Event, 
      scala.Unit
    ]
  ] = js.undefined
  var onNextMonth: js.UndefOr[js.Function1[/* firstDayInMonth */ stdLib.Date, scala.Unit]] = js.undefined
  var onPreviousMonth: js.UndefOr[js.Function1[/* firstDayInMonth */ stdLib.Date, scala.Unit]] = js.undefined
  var onYearSelected: js.UndefOr[js.Function1[/* firstDayInYear */ stdLib.Date, scala.Unit]] = js.undefined
  var previousIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var previousIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var previousIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var showAllDays: js.UndefOr[scala.Boolean] = js.undefined
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  var yearPickerClassName: js.UndefOr[java.lang.String] = js.undefined
  var yearsDisplayed: js.UndefOr[scala.Double] = js.undefined
}

