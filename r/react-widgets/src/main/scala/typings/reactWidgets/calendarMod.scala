package typings.reactWidgets

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactType
import typings.reactWidgets.commonPropsMod.AutoFocus
import typings.reactWidgets.commonPropsMod.ReactWidgetsCommonProps
import typings.reactWidgets.reactWidgetsStrings.century
import typings.reactWidgets.reactWidgetsStrings.decade
import typings.reactWidgets.reactWidgetsStrings.month
import typings.reactWidgets.reactWidgetsStrings.year
import typings.std.Date
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-widgets/lib/Calendar", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends Component[CalendarProps, ComponentState, js.Any] {
    def this(props: CalendarProps) = this()
    def this(props: CalendarProps, context: js.Any) = this()
  }
  @JSImport("react-widgets/lib/Calendar", JSImport.Namespace)
  @js.native
  val ^ : js.Object & CalendarClass = js.native
  
  type CalendarClass = ComponentClass[CalendarProps, ComponentState]
  
  trait CalendarMessages extends StObject {
    
    /**
      * Title and screen reader text for the left arrow button.
      * @default: "navigate back"
      */
    var moveBack: js.UndefOr[String] = js.undefined
    
    /**
      * Title and screen reader text for the right arrow button.
      * @default: "navigate forward"
      */
    var moveForward: js.UndefOr[String] = js.undefined
  }
  object CalendarMessages {
    
    inline def apply(): CalendarMessages = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarMessages]
    }
    
    extension [Self <: CalendarMessages](x: Self) {
      
      inline def setMoveBack(value: String): Self = StObject.set(x, "moveBack", value.asInstanceOf[js.Any])
      
      inline def setMoveBackUndefined: Self = StObject.set(x, "moveBack", js.undefined)
      
      inline def setMoveForward(value: String): Self = StObject.set(x, "moveForward", value.asInstanceOf[js.Any])
      
      inline def setMoveForwardUndefined: Self = StObject.set(x, "moveForward", js.undefined)
    }
  }
  
  trait CalendarProps
    extends StObject
       with ReactWidgetsCommonProps
       with AutoFocus {
    
    /**
      * A formatter for century, the default formats the first and last year of the century like:
      * 1900 - 1999.
      */
    var centuryFormat: js.UndefOr[String | (js.Function1[/* day */ Date, String])] = js.undefined
    
    /**
      * Set the culture of the Calendar, passed to the configured localizer.
      */
    var culture: js.UndefOr[String] = js.undefined
    
    /**
      * Default current date at which the calendar opens. If none is provided, opens at today's
      * date or the value date (if any).
      * @default Date()
      */
    var currentDate: js.UndefOr[Date] = js.undefined
    
    /**
      * A formatter for day of the month.
      */
    var dateFormat: js.UndefOr[String | (js.Function1[/* day */ Date, String])] = js.undefined
    
    /**
      * Provide a custom component to render the days of the month.
      * The Component is provided the following props
      * - date: a Date object for the day of the month to render
      * - label: a formatted String of the date to render. To adjust the format of the label
      *          string use the dateFormat prop, listed below.
      */
    var dayComponent: js.UndefOr[ReactType[js.Any]] = js.undefined
    
    /**
      * A formatter calendar days of the week, the default formats each day as a Narrow name:
      * "Mo", "Tu", etc.
      */
    var dayFormat: js.UndefOr[String | (js.Function1[/* day */ Date, String])] = js.undefined
    
    /**
      * A formatter for decade, the default formats the first and last year of the decade like:
      * 2000 - 2009.
      */
    var decadeFormat: js.UndefOr[String | (js.Function1[/* day */ Date, String])] = js.undefined
    
    /**
      * Default value.
      */
    var defaultValue: js.UndefOr[Date] = js.undefined
    
    /**
      * Set a unique starting view
      */
    var defaultView: js.UndefOr[CalendarView] = js.undefined
    
    /**
      * The highest level view the calendar can navigate up to. This value should be higher than
      * initialView
      */
    var finalView: js.UndefOr[month | year | decade | century] = js.undefined
    
    /**
      * Show or hide the Calendar footer.
      * @default false
      */
    var footer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A formatter for the Calendar footer, formats Today's Date as a string.
      */
    var footerFormat: js.UndefOr[String | (js.Function1[/* day */ Date, String])] = js.undefined
    
    /**
      * A formatter for the header button of the month view
      */
    var headerFormat: js.UndefOr[String | (js.Function1[/* day */ Date, String])] = js.undefined
    
    /**
      * The starting and lowest level view the calendar can navigate down to.
      */
    var initialView: js.UndefOr[month | year | decade | century] = js.undefined
    
    /**
      * The maximum date that the Calendar can navigate to.
      */
    var max: js.UndefOr[Date] = js.undefined
    
    var messages: js.UndefOr[CalendarMessages] = js.undefined
    
    /**
      * The minimum date that the Calendar can navigate from.
      */
    var min: js.UndefOr[Date] = js.undefined
    
    /**
      * A formatter for month name.
      */
    var monthFormat: js.UndefOr[String | (js.Function1[/* day */ Date, String])] = js.undefined
    
    /**
      * Change event Handler that is called when the value is changed. The handler is called with
      * the Date object
      */
    var onChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[Date], Unit]] = js.undefined
    
    /**
      * Change event Handler that is called when the currentDate is changed. The handler is
      * called with the currentDate object.
      */
    var onCurrentDateChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[Date], Unit]] = js.undefined
    
    /**
      * The native onKeyDown event, called preventDefault will prevent any custom behavior, included keyboard shortcuts.
      */
    var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
    
    /**
      * Callback fired when the Calendar navigates between views, or forward and backwards in
      * time.
      */
    var onNavigate: js.UndefOr[js.Function3[/* date */ Date, /* direction */ String, /* view */ String, Unit]] = js.undefined
    
    /**
      * A callback fired when the view changes.
      */
    var onViewChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * The current selected date, should be a Date object or null.
      */
    var value: js.UndefOr[Date] = js.undefined
    
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
    var yearFormat: js.UndefOr[String | (js.Function1[/* day */ Date, String])] = js.undefined
  }
  object CalendarProps {
    
    inline def apply(): CalendarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarProps]
    }
    
    extension [Self <: CalendarProps](x: Self) {
      
      inline def setCenturyFormat(value: String | (js.Function1[/* day */ Date, String])): Self = StObject.set(x, "centuryFormat", value.asInstanceOf[js.Any])
      
      inline def setCenturyFormatFunction1(value: /* day */ Date => String): Self = StObject.set(x, "centuryFormat", js.Any.fromFunction1(value))
      
      inline def setCenturyFormatUndefined: Self = StObject.set(x, "centuryFormat", js.undefined)
      
      inline def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
      
      inline def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
      
      inline def setCurrentDate(value: Date): Self = StObject.set(x, "currentDate", value.asInstanceOf[js.Any])
      
      inline def setCurrentDateUndefined: Self = StObject.set(x, "currentDate", js.undefined)
      
      inline def setDateFormat(value: String | (js.Function1[/* day */ Date, String])): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateFormatFunction1(value: /* day */ Date => String): Self = StObject.set(x, "dateFormat", js.Any.fromFunction1(value))
      
      inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      inline def setDayComponent(value: ReactType[js.Any]): Self = StObject.set(x, "dayComponent", value.asInstanceOf[js.Any])
      
      inline def setDayComponentUndefined: Self = StObject.set(x, "dayComponent", js.undefined)
      
      inline def setDayFormat(value: String | (js.Function1[/* day */ Date, String])): Self = StObject.set(x, "dayFormat", value.asInstanceOf[js.Any])
      
      inline def setDayFormatFunction1(value: /* day */ Date => String): Self = StObject.set(x, "dayFormat", js.Any.fromFunction1(value))
      
      inline def setDayFormatUndefined: Self = StObject.set(x, "dayFormat", js.undefined)
      
      inline def setDecadeFormat(value: String | (js.Function1[/* day */ Date, String])): Self = StObject.set(x, "decadeFormat", value.asInstanceOf[js.Any])
      
      inline def setDecadeFormatFunction1(value: /* day */ Date => String): Self = StObject.set(x, "decadeFormat", js.Any.fromFunction1(value))
      
      inline def setDecadeFormatUndefined: Self = StObject.set(x, "decadeFormat", js.undefined)
      
      inline def setDefaultValue(value: Date): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultView(value: CalendarView): Self = StObject.set(x, "defaultView", value.asInstanceOf[js.Any])
      
      inline def setDefaultViewUndefined: Self = StObject.set(x, "defaultView", js.undefined)
      
      inline def setFinalView(value: month | year | decade | century): Self = StObject.set(x, "finalView", value.asInstanceOf[js.Any])
      
      inline def setFinalViewUndefined: Self = StObject.set(x, "finalView", js.undefined)
      
      inline def setFooter(value: Boolean): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterFormat(value: String | (js.Function1[/* day */ Date, String])): Self = StObject.set(x, "footerFormat", value.asInstanceOf[js.Any])
      
      inline def setFooterFormatFunction1(value: /* day */ Date => String): Self = StObject.set(x, "footerFormat", js.Any.fromFunction1(value))
      
      inline def setFooterFormatUndefined: Self = StObject.set(x, "footerFormat", js.undefined)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeaderFormat(value: String | (js.Function1[/* day */ Date, String])): Self = StObject.set(x, "headerFormat", value.asInstanceOf[js.Any])
      
      inline def setHeaderFormatFunction1(value: /* day */ Date => String): Self = StObject.set(x, "headerFormat", js.Any.fromFunction1(value))
      
      inline def setHeaderFormatUndefined: Self = StObject.set(x, "headerFormat", js.undefined)
      
      inline def setInitialView(value: month | year | decade | century): Self = StObject.set(x, "initialView", value.asInstanceOf[js.Any])
      
      inline def setInitialViewUndefined: Self = StObject.set(x, "initialView", js.undefined)
      
      inline def setMax(value: Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMessages(value: CalendarMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMin(value: Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMonthFormat(value: String | (js.Function1[/* day */ Date, String])): Self = StObject.set(x, "monthFormat", value.asInstanceOf[js.Any])
      
      inline def setMonthFormatFunction1(value: /* day */ Date => String): Self = StObject.set(x, "monthFormat", js.Any.fromFunction1(value))
      
      inline def setMonthFormatUndefined: Self = StObject.set(x, "monthFormat", js.undefined)
      
      inline def setOnChange(value: /* date */ js.UndefOr[Date] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnCurrentDateChange(value: /* date */ js.UndefOr[Date] => Unit): Self = StObject.set(x, "onCurrentDateChange", js.Any.fromFunction1(value))
      
      inline def setOnCurrentDateChangeUndefined: Self = StObject.set(x, "onCurrentDateChange", js.undefined)
      
      inline def setOnKeyDown(value: /* event */ KeyboardEvent => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnNavigate(value: (/* date */ Date, /* direction */ String, /* view */ String) => Unit): Self = StObject.set(x, "onNavigate", js.Any.fromFunction3(value))
      
      inline def setOnNavigateUndefined: Self = StObject.set(x, "onNavigate", js.undefined)
      
      inline def setOnViewChange(value: () => Unit): Self = StObject.set(x, "onViewChange", js.Any.fromFunction0(value))
      
      inline def setOnViewChangeUndefined: Self = StObject.set(x, "onViewChange", js.undefined)
      
      inline def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setView(value: CalendarView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      
      inline def setViews(value: js.Array[CalendarView]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
      
      inline def setViewsVarargs(value: CalendarView*): Self = StObject.set(x, "views", js.Array(value :_*))
      
      inline def setYearFormat(value: String | (js.Function1[/* day */ Date, String])): Self = StObject.set(x, "yearFormat", value.asInstanceOf[js.Any])
      
      inline def setYearFormatFunction1(value: /* day */ Date => String): Self = StObject.set(x, "yearFormat", js.Any.fromFunction1(value))
      
      inline def setYearFormatUndefined: Self = StObject.set(x, "yearFormat", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactWidgets.reactWidgetsStrings.month
    - typings.reactWidgets.reactWidgetsStrings.year
    - typings.reactWidgets.reactWidgetsStrings.decade
    - typings.reactWidgets.reactWidgetsStrings.century
  */
  trait CalendarView extends StObject
  object CalendarView {
    
    inline def century: typings.reactWidgets.reactWidgetsStrings.century = "century".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.century]
    
    inline def decade: typings.reactWidgets.reactWidgetsStrings.decade = "decade".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.decade]
    
    inline def month: typings.reactWidgets.reactWidgetsStrings.month = "month".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.month]
    
    inline def year: typings.reactWidgets.reactWidgetsStrings.year = "year".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.year]
  }
  
  type _To = js.Object & CalendarClass
  
  /* This means you don't have to write `^`, but can instead just say `calendarMod.foo` */
  override def _to: js.Object & CalendarClass = ^
}
