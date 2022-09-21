package typings.reactNativeCalendars.mod

import typings.react.mod.Component
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeCalendars.reactNativeCalendarsStrings.left
import typings.reactNativeCalendars.reactNativeCalendarsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarBaseProps extends StObject {
  
  /**
    *  Initially visible month. Default = Date()
    */
  var current: js.UndefOr[TCalendarDate] = js.undefined
  
  /**
    * Allow rendering of a totally custom header
    */
  var customHeader: js.UndefOr[js.Function1[/* props */ HeaderComponentProps, ReactNode]] = js.undefined
  
  /**
    *  Provide custom day rendering component.
    */
  var dayComponent: js.UndefOr[(Component[DayComponentProps, js.Object, Any]) | FC[DayComponentProps]] = js.undefined
  
  /**
    *  Disable left arrow. Default = false
    */
  var disableArrowLeft: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Disable right arrow. Default = false
    */
  var disableArrowRight: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  If hideArrows=false and hideExtraDays=false do not switch month when tapping on greyed out
    *  day from another month that is visible in calendar page. Default = false
    */
  var disableMonthChange: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Disable days by default. Default = false
    */
  var disabledByDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Display loading indicator. Default = false
    */
  var displayLoadingIndicator: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  If firstDay=1 week starts from Monday. Note that dayNames and dayNamesShort should still start from Sunday.
    */
  var firstDay: js.UndefOr[Double] = js.undefined
  
  /**
    *  Style passed to the header
    */
  var headerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    *  Hide month navigation arrows. Default = false
    */
  var hideArrows: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Hide day names. Default = false
    */
  var hideDayNames: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Do not show days of other months in month page. Default = false
    */
  var hideExtraDays: js.UndefOr[Boolean] = js.undefined
  
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
  var monthFormat: js.UndefOr[String] = js.undefined
  
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
  var onPressArrowLeft: js.UndefOr[js.Function1[/* substractMonth */ js.Function0[Unit], Unit]] = js.undefined
  
  /**
    *  Handler which gets executed when press arrow icon left. It receive a callback can go next month
    */
  var onPressArrowRight: js.UndefOr[js.Function1[/* addMonth */ js.Function0[Unit], Unit]] = js.undefined
  
  /**
    *  Callback which gets executed when visible months change in scroll view. Default = undefined
    */
  var onVisibleMonthsChange: js.UndefOr[js.Function1[/* months */ js.Array[DateObject], Unit]] = js.undefined
  
  /**
    *  Replace default arrows with custom ones (direction can be 'left' or 'right')
    */
  var renderArrow: js.UndefOr[js.Function1[/* direction */ left | right, ReactNode]] = js.undefined
  
  /**
    *  Replace default month and year title with custom one. the function receive a date as parameter.
    */
  var renderHeader: js.UndefOr[js.Function1[/* date */ js.Date, ReactNode]] = js.undefined
  
  /**
    *  Show week numbers to the left. Default = false
    */
  var showWeekNumbers: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Calendar container style.
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    *  Specify theme properties to override specific styles for calendar parts. Default = {}
    */
  var theme: js.UndefOr[CalendarTheme] = js.undefined
  
  /**
    *  Provide aria-level for calendar heading for proper accessibility when used with web (react-native-web)
    */
  var webAriaLevel: js.UndefOr[Double] = js.undefined
}
object CalendarBaseProps {
  
  inline def apply(): CalendarBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarBaseProps]
  }
  
  extension [Self <: CalendarBaseProps](x: Self) {
    
    inline def setCurrent(value: TCalendarDate): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setCustomHeader(value: /* props */ HeaderComponentProps => ReactNode): Self = StObject.set(x, "customHeader", js.Any.fromFunction1(value))
    
    inline def setCustomHeaderUndefined: Self = StObject.set(x, "customHeader", js.undefined)
    
    inline def setDayComponent(value: (Component[DayComponentProps, js.Object, Any]) | FC[DayComponentProps]): Self = StObject.set(x, "dayComponent", value.asInstanceOf[js.Any])
    
    inline def setDayComponentUndefined: Self = StObject.set(x, "dayComponent", js.undefined)
    
    inline def setDisableArrowLeft(value: Boolean): Self = StObject.set(x, "disableArrowLeft", value.asInstanceOf[js.Any])
    
    inline def setDisableArrowLeftUndefined: Self = StObject.set(x, "disableArrowLeft", js.undefined)
    
    inline def setDisableArrowRight(value: Boolean): Self = StObject.set(x, "disableArrowRight", value.asInstanceOf[js.Any])
    
    inline def setDisableArrowRightUndefined: Self = StObject.set(x, "disableArrowRight", js.undefined)
    
    inline def setDisableMonthChange(value: Boolean): Self = StObject.set(x, "disableMonthChange", value.asInstanceOf[js.Any])
    
    inline def setDisableMonthChangeUndefined: Self = StObject.set(x, "disableMonthChange", js.undefined)
    
    inline def setDisabledByDefault(value: Boolean): Self = StObject.set(x, "disabledByDefault", value.asInstanceOf[js.Any])
    
    inline def setDisabledByDefaultUndefined: Self = StObject.set(x, "disabledByDefault", js.undefined)
    
    inline def setDisplayLoadingIndicator(value: Boolean): Self = StObject.set(x, "displayLoadingIndicator", value.asInstanceOf[js.Any])
    
    inline def setDisplayLoadingIndicatorUndefined: Self = StObject.set(x, "displayLoadingIndicator", js.undefined)
    
    inline def setFirstDay(value: Double): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
    
    inline def setFirstDayUndefined: Self = StObject.set(x, "firstDay", js.undefined)
    
    inline def setHeaderStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
    
    inline def setHeaderStyleNull: Self = StObject.set(x, "headerStyle", null)
    
    inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
    
    inline def setHideArrows(value: Boolean): Self = StObject.set(x, "hideArrows", value.asInstanceOf[js.Any])
    
    inline def setHideArrowsUndefined: Self = StObject.set(x, "hideArrows", js.undefined)
    
    inline def setHideDayNames(value: Boolean): Self = StObject.set(x, "hideDayNames", value.asInstanceOf[js.Any])
    
    inline def setHideDayNamesUndefined: Self = StObject.set(x, "hideDayNames", js.undefined)
    
    inline def setHideExtraDays(value: Boolean): Self = StObject.set(x, "hideExtraDays", value.asInstanceOf[js.Any])
    
    inline def setHideExtraDaysUndefined: Self = StObject.set(x, "hideExtraDays", js.undefined)
    
    inline def setMaxDate(value: TCalendarDate): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    inline def setMinDate(value: TCalendarDate): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    inline def setMonthFormat(value: String): Self = StObject.set(x, "monthFormat", value.asInstanceOf[js.Any])
    
    inline def setMonthFormatUndefined: Self = StObject.set(x, "monthFormat", js.undefined)
    
    inline def setOnDayLongPress(value: /* date */ DateObject => Unit): Self = StObject.set(x, "onDayLongPress", js.Any.fromFunction1(value))
    
    inline def setOnDayLongPressUndefined: Self = StObject.set(x, "onDayLongPress", js.undefined)
    
    inline def setOnDayPress(value: /* date */ DateObject => Unit): Self = StObject.set(x, "onDayPress", js.Any.fromFunction1(value))
    
    inline def setOnDayPressUndefined: Self = StObject.set(x, "onDayPress", js.undefined)
    
    inline def setOnMonthChange(value: /* date */ DateObject => Unit): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1(value))
    
    inline def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
    
    inline def setOnPressArrowLeft(value: /* substractMonth */ js.Function0[Unit] => Unit): Self = StObject.set(x, "onPressArrowLeft", js.Any.fromFunction1(value))
    
    inline def setOnPressArrowLeftUndefined: Self = StObject.set(x, "onPressArrowLeft", js.undefined)
    
    inline def setOnPressArrowRight(value: /* addMonth */ js.Function0[Unit] => Unit): Self = StObject.set(x, "onPressArrowRight", js.Any.fromFunction1(value))
    
    inline def setOnPressArrowRightUndefined: Self = StObject.set(x, "onPressArrowRight", js.undefined)
    
    inline def setOnVisibleMonthsChange(value: /* months */ js.Array[DateObject] => Unit): Self = StObject.set(x, "onVisibleMonthsChange", js.Any.fromFunction1(value))
    
    inline def setOnVisibleMonthsChangeUndefined: Self = StObject.set(x, "onVisibleMonthsChange", js.undefined)
    
    inline def setRenderArrow(value: /* direction */ left | right => ReactNode): Self = StObject.set(x, "renderArrow", js.Any.fromFunction1(value))
    
    inline def setRenderArrowUndefined: Self = StObject.set(x, "renderArrow", js.undefined)
    
    inline def setRenderHeader(value: /* date */ js.Date => ReactNode): Self = StObject.set(x, "renderHeader", js.Any.fromFunction1(value))
    
    inline def setRenderHeaderUndefined: Self = StObject.set(x, "renderHeader", js.undefined)
    
    inline def setShowWeekNumbers(value: Boolean): Self = StObject.set(x, "showWeekNumbers", value.asInstanceOf[js.Any])
    
    inline def setShowWeekNumbersUndefined: Self = StObject.set(x, "showWeekNumbers", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: CalendarTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setWebAriaLevel(value: Double): Self = StObject.set(x, "webAriaLevel", value.asInstanceOf[js.Any])
    
    inline def setWebAriaLevelUndefined: Self = StObject.set(x, "webAriaLevel", js.undefined)
  }
}
