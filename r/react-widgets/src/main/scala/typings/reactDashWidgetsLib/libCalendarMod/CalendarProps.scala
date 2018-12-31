package typings
package reactDashWidgetsLib.libCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarProps
  extends reactDashWidgetsLib.libCommonPropsMod.ReactWidgetsCommonProps[CalendarClass]
     with reactDashWidgetsLib.libCommonPropsMod.AutoFocus {
  /**
    * A formatter for century, the default formats the first and last year of the century like:
    * 1900 - 1999.
    */
  var centuryFormat: js.UndefOr[java.lang.String | (js.Function1[/* day */ stdLib.Date, java.lang.String])] = js.undefined
  /**
    * Set the culture of the Calendar, passed to the configured localizer.
    */
  var culture: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default current date at which the calendar opens. If none is provided, opens at today's
    * date or the value date (if any).
    * @default Date()
    */
  var currentDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * A formatter for day of the month.
    */
  var dateFormat: js.UndefOr[java.lang.String | (js.Function1[/* day */ stdLib.Date, java.lang.String])] = js.undefined
  /**
    * Provide a custom component to render the days of the month.
    * The Component is provided the following props
    * - date: a Date object for the day of the month to render
    * - label: a formatted String of the date to render. To adjust the format of the label
    *          string use the dateFormat prop, listed below.
    */
  var dayComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  /**
    * A formatter calendar days of the week, the default formats each day as a Narrow name:
    * "Mo", "Tu", etc.
    */
  var dayFormat: js.UndefOr[java.lang.String | (js.Function1[/* day */ stdLib.Date, java.lang.String])] = js.undefined
  /**
    * A formatter for decade, the default formats the first and last year of the decade like:
    * 2000 - 2009.
    */
  var decadeFormat: js.UndefOr[java.lang.String | (js.Function1[/* day */ stdLib.Date, java.lang.String])] = js.undefined
  /**
    * Default value.
    */
  var defaultValue: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * Set a unique starting view
    */
  var defaultView: js.UndefOr[CalendarView] = js.undefined
  /**
    * The highest level view the calendar can navigate up to. This value should be higher than
    * initialView
    */
  var finalView: js.UndefOr[
    reactDashWidgetsLib.reactDashWidgetsLibStrings.month | reactDashWidgetsLib.reactDashWidgetsLibStrings.year | reactDashWidgetsLib.reactDashWidgetsLibStrings.decade | reactDashWidgetsLib.reactDashWidgetsLibStrings.century
  ] = js.undefined
  /**
    * Show or hide the Calendar footer.
    * @default false
    */
  var footer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A formatter for the Calendar footer, formats Today's Date as a string.
    */
  var footerFormat: js.UndefOr[java.lang.String | (js.Function1[/* day */ stdLib.Date, java.lang.String])] = js.undefined
  /**
    * A formatter for the header button of the month view
    */
  var headerFormat: js.UndefOr[java.lang.String | (js.Function1[/* day */ stdLib.Date, java.lang.String])] = js.undefined
  /**
    * The starting and lowest level view the calendar can navigate down to.
    */
  var initialView: js.UndefOr[
    reactDashWidgetsLib.reactDashWidgetsLibStrings.month | reactDashWidgetsLib.reactDashWidgetsLibStrings.year | reactDashWidgetsLib.reactDashWidgetsLibStrings.decade | reactDashWidgetsLib.reactDashWidgetsLibStrings.century
  ] = js.undefined
  /**
    * The maximum date that the Calendar can navigate to.
    */
  var max: js.UndefOr[stdLib.Date] = js.undefined
  var messages: js.UndefOr[CalendarMessages] = js.undefined
  /**
    * The minimum date that the Calendar can navigate from.
    */
  var min: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * A formatter for month name.
    */
  var monthFormat: js.UndefOr[java.lang.String | (js.Function1[/* day */ stdLib.Date, java.lang.String])] = js.undefined
  /**
    * Change event Handler that is called when the value is changed. The handler is called with
    * the Date object
    */
  var onChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[stdLib.Date], scala.Unit]] = js.undefined
  /**
    * Change event Handler that is called when the currentDate is changed. The handler is
    * called with the currentDate object.
    */
  var onCurrentDateChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[stdLib.Date], scala.Unit]] = js.undefined
  /**
    * The native onKeyDown event, called preventDefault will prevent any custom behavior, included keyboard shortcuts.
    */
  var onKeyDown: js.UndefOr[js.Function1[/* event */ reactLib.KeyboardEvent, scala.Unit]] = js.undefined
  /**
    * Callback fired when the Calendar navigates between views, or forward and backwards in
    * time.
    */
  var onNavigate: js.UndefOr[
    js.Function3[
      /* date */ stdLib.Date, 
      /* direction */ java.lang.String, 
      /* view */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * A callback fired when the view changes.
    */
  var onViewChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * The current selected date, should be a Date object or null.
    */
  var value: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * Controls the currently displayed calendar view. Use defaultView to set a unique starting view.
    */
  var view: js.UndefOr[CalendarView] = js.undefined
  /**
    * Defines a list of views the Calendar can traverse through, starting with the first in the list to the last.
    */
  var views: js.UndefOr[js.Array[CalendarView]] = js.undefined
  /**
    * A formatter for the year.
    */
  var yearFormat: js.UndefOr[java.lang.String | (js.Function1[/* day */ stdLib.Date, java.lang.String])] = js.undefined
}

