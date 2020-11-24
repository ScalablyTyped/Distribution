package typings.reactNativeCalendars.mod

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.SFC
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeCalendars.reactNativeCalendarsStrings.left
import typings.reactNativeCalendars.reactNativeCalendarsStrings.right
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarBaseProps extends js.Object {
  
  /**
    *  Initially visible month. Default = Date()
    */
  var current: js.UndefOr[TCalendarDate] = js.native
  
  /**
    *  Provide custom day rendering component.
    */
  var dayComponent: js.UndefOr[(Component[DayComponentProps, js.Object, _]) | SFC[DayComponentProps]] = js.native
  
  /**
    *  Disable left arrow. Default = false
    */
  var disableArrowLeft: js.UndefOr[Boolean] = js.native
  
  /**
    *  Disable right arrow. Default = false
    */
  var disableArrowRight: js.UndefOr[Boolean] = js.native
  
  /**
    *  If hideArrows=false and hideExtraDays=false do not switch month when tapping on greyed out
    *  day from another month that is visible in calendar page. Default = false
    */
  var disableMonthChange: js.UndefOr[Boolean] = js.native
  
  /**
    *  Disable days by default. Default = false
    */
  var disabledByDefault: js.UndefOr[Boolean] = js.native
  
  /**
    *  Display loading indicator. Default = false
    */
  var displayLoadingIndicator: js.UndefOr[Boolean] = js.native
  
  /**
    *  If firstDay=1 week starts from Monday. Note that dayNames and dayNamesShort should still start from Sunday.
    */
  var firstDay: js.UndefOr[Double] = js.native
  
  /**
    *  Style passed to the header
    */
  var headerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    *  Hide month navigation arrows. Default = false
    */
  var hideArrows: js.UndefOr[Boolean] = js.native
  
  /**
    *  Hide day names. Default = false
    */
  var hideDayNames: js.UndefOr[Boolean] = js.native
  
  /**
    *  Do not show days of other months in month page. Default = false
    */
  var hideExtraDays: js.UndefOr[Boolean] = js.native
  
  /**
    *  Maximum date that can be selected, dates after maxDate will be grayed out. Default = undefined
    */
  var maxDate: js.UndefOr[TCalendarDate] = js.native
  
  /**
    *  Minimum date that can be selected, dates before minDate will be grayed out. Default = undefined
    */
  var minDate: js.UndefOr[TCalendarDate] = js.native
  
  /**
    *  Month format in calendar title. Formatting values: http://arshaw.com/xdate/#Formatting
    */
  var monthFormat: js.UndefOr[String] = js.native
  
  /**
    *  Handler which gets executed on day long press. Default = undefined
    */
  var onDayLongPress: js.UndefOr[DateCallbackHandler] = js.native
  
  /**
    *  Handler which gets executed on day press. Default = undefined
    */
  var onDayPress: js.UndefOr[DateCallbackHandler] = js.native
  
  /**
    *  Handler which gets executed when visible month changes in calendar. Default = undefined
    */
  var onMonthChange: js.UndefOr[DateCallbackHandler] = js.native
  
  /**
    *  Handler which gets executed when press arrow icon left. It receive a callback can go back month
    */
  var onPressArrowLeft: js.UndefOr[js.Function1[/* substractMonth */ js.Function0[Unit], Unit]] = js.native
  
  /**
    *  Handler which gets executed when press arrow icon left. It receive a callback can go next month
    */
  var onPressArrowRight: js.UndefOr[js.Function1[/* addMonth */ js.Function0[Unit], Unit]] = js.native
  
  /**
    *  Callback which gets executed when visible months change in scroll view. Default = undefined
    */
  var onVisibleMonthsChange: js.UndefOr[js.Function1[/* months */ js.Array[DateObject], Unit]] = js.native
  
  /**
    *  Replace default arrows with custom ones (direction can be 'left' or 'right')
    */
  var renderArrow: js.UndefOr[js.Function1[/* direction */ left | right, ReactNode]] = js.native
  
  /*
    *  Replace default month and year title with custom one. the function receive a date as parameter.
    */
  var renderHeader: js.UndefOr[js.Function1[/* date */ Date, ReactNode]] = js.native
  
  /**
    *  Show week numbers to the left. Default = false
    */
  var showWeekNumbers: js.UndefOr[Boolean] = js.native
  
  /**
    *  Calendar container style.
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    *  Specify theme properties to override specific styles for calendar parts. Default = {}
    */
  var theme: js.UndefOr[CalendarTheme] = js.native
  
  /**
    *  Provide aria-level for calendar heading for proper accessibility when used with web (react-native-web)
    */
  var webAriaLevel: js.UndefOr[Double] = js.native
}
object CalendarBaseProps {
  
  @scala.inline
  def apply(): CalendarBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarBaseProps]
  }
  
  @scala.inline
  implicit class CalendarBasePropsOps[Self <: CalendarBaseProps] (val x: Self) extends AnyVal {
    
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
    def setCurrent(value: TCalendarDate): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    
    @scala.inline
    def setDayComponent(value: (Component[DayComponentProps, js.Object, _]) | SFC[DayComponentProps]): Self = this.set("dayComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayComponent: Self = this.set("dayComponent", js.undefined)
    
    @scala.inline
    def setDisableArrowLeft(value: Boolean): Self = this.set("disableArrowLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableArrowLeft: Self = this.set("disableArrowLeft", js.undefined)
    
    @scala.inline
    def setDisableArrowRight(value: Boolean): Self = this.set("disableArrowRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableArrowRight: Self = this.set("disableArrowRight", js.undefined)
    
    @scala.inline
    def setDisableMonthChange(value: Boolean): Self = this.set("disableMonthChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableMonthChange: Self = this.set("disableMonthChange", js.undefined)
    
    @scala.inline
    def setDisabledByDefault(value: Boolean): Self = this.set("disabledByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledByDefault: Self = this.set("disabledByDefault", js.undefined)
    
    @scala.inline
    def setDisplayLoadingIndicator(value: Boolean): Self = this.set("displayLoadingIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayLoadingIndicator: Self = this.set("displayLoadingIndicator", js.undefined)
    
    @scala.inline
    def setFirstDay(value: Double): Self = this.set("firstDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstDay: Self = this.set("firstDay", js.undefined)
    
    @scala.inline
    def setHeaderStyle(value: StyleProp[ViewStyle]): Self = this.set("headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderStyle: Self = this.set("headerStyle", js.undefined)
    
    @scala.inline
    def setHeaderStyleNull: Self = this.set("headerStyle", null)
    
    @scala.inline
    def setHideArrows(value: Boolean): Self = this.set("hideArrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideArrows: Self = this.set("hideArrows", js.undefined)
    
    @scala.inline
    def setHideDayNames(value: Boolean): Self = this.set("hideDayNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideDayNames: Self = this.set("hideDayNames", js.undefined)
    
    @scala.inline
    def setHideExtraDays(value: Boolean): Self = this.set("hideExtraDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideExtraDays: Self = this.set("hideExtraDays", js.undefined)
    
    @scala.inline
    def setMaxDate(value: TCalendarDate): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: TCalendarDate): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setMonthFormat(value: String): Self = this.set("monthFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthFormat: Self = this.set("monthFormat", js.undefined)
    
    @scala.inline
    def setOnDayLongPress(value: /* date */ DateObject => Unit): Self = this.set("onDayLongPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDayLongPress: Self = this.set("onDayLongPress", js.undefined)
    
    @scala.inline
    def setOnDayPress(value: /* date */ DateObject => Unit): Self = this.set("onDayPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDayPress: Self = this.set("onDayPress", js.undefined)
    
    @scala.inline
    def setOnMonthChange(value: /* date */ DateObject => Unit): Self = this.set("onMonthChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMonthChange: Self = this.set("onMonthChange", js.undefined)
    
    @scala.inline
    def setOnPressArrowLeft(value: /* substractMonth */ js.Function0[Unit] => Unit): Self = this.set("onPressArrowLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPressArrowLeft: Self = this.set("onPressArrowLeft", js.undefined)
    
    @scala.inline
    def setOnPressArrowRight(value: /* addMonth */ js.Function0[Unit] => Unit): Self = this.set("onPressArrowRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPressArrowRight: Self = this.set("onPressArrowRight", js.undefined)
    
    @scala.inline
    def setOnVisibleMonthsChange(value: /* months */ js.Array[DateObject] => Unit): Self = this.set("onVisibleMonthsChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnVisibleMonthsChange: Self = this.set("onVisibleMonthsChange", js.undefined)
    
    @scala.inline
    def setRenderArrow(value: /* direction */ left | right => ReactNode): Self = this.set("renderArrow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderArrow: Self = this.set("renderArrow", js.undefined)
    
    @scala.inline
    def setRenderHeader(value: /* date */ Date => ReactNode): Self = this.set("renderHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderHeader: Self = this.set("renderHeader", js.undefined)
    
    @scala.inline
    def setShowWeekNumbers(value: Boolean): Self = this.set("showWeekNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowWeekNumbers: Self = this.set("showWeekNumbers", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setTheme(value: CalendarTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setWebAriaLevel(value: Double): Self = this.set("webAriaLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebAriaLevel: Self = this.set("webAriaLevel", js.undefined)
  }
}
