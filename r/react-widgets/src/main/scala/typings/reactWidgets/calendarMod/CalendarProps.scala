package typings.reactWidgets.calendarMod

import typings.react.mod.ReactType
import typings.reactWidgets.commonPropsMod.AutoFocus
import typings.reactWidgets.commonPropsMod.ReactWidgetsCommonProps
import typings.reactWidgets.reactWidgetsStrings.century
import typings.reactWidgets.reactWidgetsStrings.decade
import typings.reactWidgets.reactWidgetsStrings.month
import typings.reactWidgets.reactWidgetsStrings.year
import typings.std.Date
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarProps
  extends ReactWidgetsCommonProps
     with AutoFocus {
  /**
    * A formatter for century, the default formats the first and last year of the century like:
    * 1900 - 1999.
    */
  var centuryFormat: js.UndefOr[String | (js.Function1[/* day */ Date, String])] = js.native
  /**
    * Set the culture of the Calendar, passed to the configured localizer.
    */
  var culture: js.UndefOr[String] = js.native
  /**
    * Default current date at which the calendar opens. If none is provided, opens at today's
    * date or the value date (if any).
    * @default Date()
    */
  var currentDate: js.UndefOr[Date] = js.native
  /**
    * A formatter for day of the month.
    */
  var dateFormat: js.UndefOr[String | (js.Function1[/* day */ Date, String])] = js.native
  /**
    * Provide a custom component to render the days of the month.
    * The Component is provided the following props
    * - date: a Date object for the day of the month to render
    * - label: a formatted String of the date to render. To adjust the format of the label
    *          string use the dateFormat prop, listed below.
    */
  var dayComponent: js.UndefOr[ReactType[_]] = js.native
  /**
    * A formatter calendar days of the week, the default formats each day as a Narrow name:
    * "Mo", "Tu", etc.
    */
  var dayFormat: js.UndefOr[String | (js.Function1[/* day */ Date, String])] = js.native
  /**
    * A formatter for decade, the default formats the first and last year of the decade like:
    * 2000 - 2009.
    */
  var decadeFormat: js.UndefOr[String | (js.Function1[/* day */ Date, String])] = js.native
  /**
    * Default value.
    */
  var defaultValue: js.UndefOr[Date] = js.native
  /**
    * Set a unique starting view
    */
  var defaultView: js.UndefOr[CalendarView] = js.native
  /**
    * The highest level view the calendar can navigate up to. This value should be higher than
    * initialView
    */
  var finalView: js.UndefOr[month | year | decade | century] = js.native
  /**
    * Show or hide the Calendar footer.
    * @default false
    */
  var footer: js.UndefOr[Boolean] = js.native
  /**
    * A formatter for the Calendar footer, formats Today's Date as a string.
    */
  var footerFormat: js.UndefOr[String | (js.Function1[/* day */ Date, String])] = js.native
  /**
    * A formatter for the header button of the month view
    */
  var headerFormat: js.UndefOr[String | (js.Function1[/* day */ Date, String])] = js.native
  /**
    * The starting and lowest level view the calendar can navigate down to.
    */
  var initialView: js.UndefOr[month | year | decade | century] = js.native
  /**
    * The maximum date that the Calendar can navigate to.
    */
  var max: js.UndefOr[Date] = js.native
  var messages: js.UndefOr[CalendarMessages] = js.native
  /**
    * The minimum date that the Calendar can navigate from.
    */
  var min: js.UndefOr[Date] = js.native
  /**
    * A formatter for month name.
    */
  var monthFormat: js.UndefOr[String | (js.Function1[/* day */ Date, String])] = js.native
  /**
    * Change event Handler that is called when the value is changed. The handler is called with
    * the Date object
    */
  var onChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[Date], Unit]] = js.native
  /**
    * Change event Handler that is called when the currentDate is changed. The handler is
    * called with the currentDate object.
    */
  var onCurrentDateChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[Date], Unit]] = js.native
  /**
    * The native onKeyDown event, called preventDefault will prevent any custom behavior, included keyboard shortcuts.
    */
  var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  /**
    * Callback fired when the Calendar navigates between views, or forward and backwards in
    * time.
    */
  var onNavigate: js.UndefOr[js.Function3[/* date */ Date, /* direction */ String, /* view */ String, Unit]] = js.native
  /**
    * A callback fired when the view changes.
    */
  var onViewChange: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * The current selected date, should be a Date object or null.
    */
  var value: js.UndefOr[Date] = js.native
  /**
    * Controls the currently displayed calendar view. Use defaultView to set a unique starting view.
    */
  var view: js.UndefOr[CalendarView] = js.native
  /**
    * Defines a list of views the Calendar can traverse through, starting with the first in the list to the last.
    */
  var views: js.UndefOr[js.Array[CalendarView]] = js.native
  /**
    * A formatter for the year.
    */
  var yearFormat: js.UndefOr[String | (js.Function1[/* day */ Date, String])] = js.native
}

object CalendarProps {
  @scala.inline
  def apply(): CalendarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarProps]
  }
  @scala.inline
  implicit class CalendarPropsOps[Self <: CalendarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCenturyFormatFunction1(value: /* day */ Date => String): Self = this.set("centuryFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setCenturyFormat(value: String | (js.Function1[/* day */ Date, String])): Self = this.set("centuryFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenturyFormat: Self = this.set("centuryFormat", js.undefined)
    @scala.inline
    def setCulture(value: String): Self = this.set("culture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCulture: Self = this.set("culture", js.undefined)
    @scala.inline
    def setCurrentDate(value: Date): Self = this.set("currentDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentDate: Self = this.set("currentDate", js.undefined)
    @scala.inline
    def setDateFormatFunction1(value: /* day */ Date => String): Self = this.set("dateFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setDateFormat(value: String | (js.Function1[/* day */ Date, String])): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    @scala.inline
    def setDayComponent(value: ReactType[_]): Self = this.set("dayComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayComponent: Self = this.set("dayComponent", js.undefined)
    @scala.inline
    def setDayFormatFunction1(value: /* day */ Date => String): Self = this.set("dayFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setDayFormat(value: String | (js.Function1[/* day */ Date, String])): Self = this.set("dayFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayFormat: Self = this.set("dayFormat", js.undefined)
    @scala.inline
    def setDecadeFormatFunction1(value: /* day */ Date => String): Self = this.set("decadeFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setDecadeFormat(value: String | (js.Function1[/* day */ Date, String])): Self = this.set("decadeFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecadeFormat: Self = this.set("decadeFormat", js.undefined)
    @scala.inline
    def setDefaultValue(value: Date): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDefaultView(value: CalendarView): Self = this.set("defaultView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultView: Self = this.set("defaultView", js.undefined)
    @scala.inline
    def setFinalView(value: month | year | decade | century): Self = this.set("finalView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalView: Self = this.set("finalView", js.undefined)
    @scala.inline
    def setFooter(value: Boolean): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setFooterFormatFunction1(value: /* day */ Date => String): Self = this.set("footerFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setFooterFormat(value: String | (js.Function1[/* day */ Date, String])): Self = this.set("footerFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterFormat: Self = this.set("footerFormat", js.undefined)
    @scala.inline
    def setHeaderFormatFunction1(value: /* day */ Date => String): Self = this.set("headerFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setHeaderFormat(value: String | (js.Function1[/* day */ Date, String])): Self = this.set("headerFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderFormat: Self = this.set("headerFormat", js.undefined)
    @scala.inline
    def setInitialView(value: month | year | decade | century): Self = this.set("initialView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialView: Self = this.set("initialView", js.undefined)
    @scala.inline
    def setMax(value: Date): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMessages(value: CalendarMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setMin(value: Date): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMonthFormatFunction1(value: /* day */ Date => String): Self = this.set("monthFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setMonthFormat(value: String | (js.Function1[/* day */ Date, String])): Self = this.set("monthFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthFormat: Self = this.set("monthFormat", js.undefined)
    @scala.inline
    def setOnChange(value: /* date */ js.UndefOr[Date] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnCurrentDateChange(value: /* date */ js.UndefOr[Date] => Unit): Self = this.set("onCurrentDateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCurrentDateChange: Self = this.set("onCurrentDateChange", js.undefined)
    @scala.inline
    def setOnKeyDown(value: /* event */ KeyboardEvent => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOnNavigate(value: (/* date */ Date, /* direction */ String, /* view */ String) => Unit): Self = this.set("onNavigate", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnNavigate: Self = this.set("onNavigate", js.undefined)
    @scala.inline
    def setOnViewChange(value: () => Unit): Self = this.set("onViewChange", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnViewChange: Self = this.set("onViewChange", js.undefined)
    @scala.inline
    def setValue(value: Date): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setView(value: CalendarView): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    @scala.inline
    def setViewsVarargs(value: CalendarView*): Self = this.set("views", js.Array(value :_*))
    @scala.inline
    def setViews(value: js.Array[CalendarView]): Self = this.set("views", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
    @scala.inline
    def setYearFormatFunction1(value: /* day */ Date => String): Self = this.set("yearFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setYearFormat(value: String | (js.Function1[/* day */ Date, String])): Self = this.set("yearFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearFormat: Self = this.set("yearFormat", js.undefined)
  }
  
}

