package typings.reactCalendar

import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import typings.reactCalendar.anon.ActiveStartDate
import typings.reactCalendar.anon.GoToRangeStartOnSelect
import typings.reactCalendar.anon.ReadonlyCalendarState
import typings.reactCalendar.distCjsSharedTypesMod.Action
import typings.reactCalendar.distCjsSharedTypesMod.CalendarType
import typings.reactCalendar.distCjsSharedTypesMod.ClassName
import typings.reactCalendar.distCjsSharedTypesMod.Detail
import typings.reactCalendar.distCjsSharedTypesMod.LooseValue
import typings.reactCalendar.distCjsSharedTypesMod.NavigationLabelArgs
import typings.reactCalendar.distCjsSharedTypesMod.NavigationLabelFunc
import typings.reactCalendar.distCjsSharedTypesMod.OnArgs
import typings.reactCalendar.distCjsSharedTypesMod.OnChangeFunc
import typings.reactCalendar.distCjsSharedTypesMod.OnClickWeekNumberFunc
import typings.reactCalendar.distCjsSharedTypesMod.TileArgs
import typings.reactCalendar.distCjsSharedTypesMod.TileClassNameFunc
import typings.reactCalendar.distCjsSharedTypesMod.TileContentFunc
import typings.reactCalendar.distCjsSharedTypesMod.TileDisabledFunc
import typings.reactCalendar.distCjsSharedTypesMod.Value
import typings.reactCalendar.distCjsSharedTypesMod.View
import typings.reactCalendar.reactCalendarStrings.assertive
import typings.reactCalendar.reactCalendarStrings.century
import typings.reactCalendar.reactCalendarStrings.day
import typings.reactCalendar.reactCalendarStrings.decade
import typings.reactCalendar.reactCalendarStrings.end
import typings.reactCalendar.reactCalendarStrings.month
import typings.reactCalendar.reactCalendarStrings.off
import typings.reactCalendar.reactCalendarStrings.polite
import typings.reactCalendar.reactCalendarStrings.range
import typings.reactCalendar.reactCalendarStrings.start
import typings.reactCalendar.reactCalendarStrings.year
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsCalendarMod {
  
  @JSImport("react-calendar/dist/cjs/Calendar", JSImport.Default)
  @js.native
  open class default () extends Calendar
  /* static members */
  object default {
    
    @JSImport("react-calendar/dist/cjs/Calendar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-calendar/dist/cjs/Calendar", "default.defaultProps")
    @js.native
    def defaultProps: GoToRangeStartOnSelect = js.native
    inline def defaultProps_=(x: GoToRangeStartOnSelect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-calendar/dist/cjs/Calendar", "default.propTypes")
    @js.native
    def propTypes: ActiveStartDate = js.native
    inline def propTypes_=(x: ActiveStartDate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Calendar extends Component[CalendarProps, CalendarState, Any] {
    
    def activeStartDate: js.Date = js.native
    
    def drillDown(nextActiveStartDate: js.Date, event: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit = js.native
    
    def drillDownAvailable: Boolean = js.native
    
    def drillUp(): Unit = js.native
    
    def drillUpAvailable: Boolean = js.native
    
    /**
      * Gets current value in a desired format.
      */
    def getProcessedValue(value: js.Date): js.Date | (js.Tuple2[js.Date | Null, js.Date | Null]) | Null = js.native
    
    def hover: js.UndefOr[js.Date | Null] = js.native
    
    def onChange(value: js.Date, event: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit = js.native
    
    def onClickTile(value: js.Date, event: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit = js.native
    
    def onMouseLeave(): Unit = js.native
    
    def onMouseOver(value: js.Date): Unit = js.native
    
    def renderContent(): Element = js.native
    def renderContent(next: Boolean): Element = js.native
    
    def renderNavigation(): Element | Null = js.native
    
    /**
      * Called when the user uses navigation buttons.
      */
    def setActiveStartDate(nextActiveStartDate: js.Date, action: Action): Unit = js.native
    
    def setStateAndCallCallbacks(nextState: typings.reactCalendar.anon.Action): Unit = js.native
    def setStateAndCallCallbacks(
      nextState: typings.reactCalendar.anon.Action,
      event: Unit,
      callback: js.Function1[/* param0 */ OnArgs, Unit]
    ): Unit = js.native
    def setStateAndCallCallbacks(
      nextState: typings.reactCalendar.anon.Action,
      event: MouseEvent[HTMLButtonElement, NativeMouseEvent]
    ): Unit = js.native
    def setStateAndCallCallbacks(
      nextState: typings.reactCalendar.anon.Action,
      event: MouseEvent[HTMLButtonElement, NativeMouseEvent],
      callback: js.Function1[/* param0 */ OnArgs, Unit]
    ): Unit = js.native
    
    @JSName("state")
    var state_Calendar: ReadonlyCalendarState = js.native
    
    def value: Value = js.native
    
    def valueType: day | month | year | decade = js.native
    
    def view: View = js.native
    
    def views: js.Array[month | year | century | decade] = js.native
  }
  
  trait CalendarProps extends StObject {
    
    var activeStartDate: js.UndefOr[js.Date] = js.undefined
    
    var allowPartialRange: js.UndefOr[Boolean] = js.undefined
    
    var calendarType: js.UndefOr[CalendarType] = js.undefined
    
    var className: js.UndefOr[ClassName] = js.undefined
    
    var defaultActiveStartDate: js.UndefOr[js.Date] = js.undefined
    
    var defaultValue: js.UndefOr[LooseValue] = js.undefined
    
    var defaultView: js.UndefOr[View] = js.undefined
    
    var formatDay: js.UndefOr[js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String]] = js.undefined
    
    var formatLongDate: js.UndefOr[js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String]] = js.undefined
    
    var formatMonth: js.UndefOr[js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String]] = js.undefined
    
    var formatMonthYear: js.UndefOr[js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String]] = js.undefined
    
    var formatShortWeekday: js.UndefOr[js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String]] = js.undefined
    
    var formatWeekday: js.UndefOr[js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String]] = js.undefined
    
    var formatYear: js.UndefOr[js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String]] = js.undefined
    
    var goToRangeStartOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var inputRef: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    var maxDetail: js.UndefOr[Detail] = js.undefined
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    var minDetail: js.UndefOr[Detail] = js.undefined
    
    var navigationAriaLabel: js.UndefOr[String] = js.undefined
    
    var navigationAriaLive: js.UndefOr[off | polite | assertive] = js.undefined
    
    var navigationLabel: js.UndefOr[NavigationLabelFunc] = js.undefined
    
    var next2AriaLabel: js.UndefOr[String] = js.undefined
    
    var next2Label: js.UndefOr[ReactNode] = js.undefined
    
    var nextAriaLabel: js.UndefOr[String] = js.undefined
    
    var nextLabel: js.UndefOr[ReactNode] = js.undefined
    
    var onActiveStartDateChange: js.UndefOr[js.Function1[/* param0 */ OnArgs, Unit]] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[/* value */ Value, /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Unit]
      ] = js.undefined
    
    var onClickDay: js.UndefOr[OnChangeFunc] = js.undefined
    
    var onClickDecade: js.UndefOr[OnChangeFunc] = js.undefined
    
    var onClickMonth: js.UndefOr[OnChangeFunc] = js.undefined
    
    var onClickWeekNumber: js.UndefOr[OnClickWeekNumberFunc] = js.undefined
    
    var onClickYear: js.UndefOr[OnChangeFunc] = js.undefined
    
    var onDrillDown: js.UndefOr[js.Function1[/* param0 */ OnArgs, Unit]] = js.undefined
    
    var onDrillUp: js.UndefOr[js.Function1[/* param0 */ OnArgs, Unit]] = js.undefined
    
    var onViewChange: js.UndefOr[js.Function1[/* param0 */ OnArgs, Unit]] = js.undefined
    
    var prev2AriaLabel: js.UndefOr[String] = js.undefined
    
    var prev2Label: js.UndefOr[ReactNode] = js.undefined
    
    var prevAriaLabel: js.UndefOr[String] = js.undefined
    
    var prevLabel: js.UndefOr[ReactNode] = js.undefined
    
    var returnValue: js.UndefOr[start | end | range] = js.undefined
    
    var selectRange: js.UndefOr[Boolean] = js.undefined
    
    var showDoubleView: js.UndefOr[Boolean] = js.undefined
    
    var showFixedNumberOfWeeks: js.UndefOr[Boolean] = js.undefined
    
    var showNavigation: js.UndefOr[Boolean] = js.undefined
    
    var showNeighboringMonth: js.UndefOr[Boolean] = js.undefined
    
    var showWeekNumbers: js.UndefOr[Boolean] = js.undefined
    
    var tileClassName: js.UndefOr[TileClassNameFunc | ClassName] = js.undefined
    
    var tileContent: js.UndefOr[TileContentFunc | ReactNode] = js.undefined
    
    var tileDisabled: js.UndefOr[TileDisabledFunc] = js.undefined
    
    var value: js.UndefOr[LooseValue] = js.undefined
    
    var view: js.UndefOr[View] = js.undefined
  }
  object CalendarProps {
    
    inline def apply(): CalendarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalendarProps] (val x: Self) extends AnyVal {
      
      inline def setActiveStartDate(value: js.Date): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
      
      inline def setActiveStartDateUndefined: Self = StObject.set(x, "activeStartDate", js.undefined)
      
      inline def setAllowPartialRange(value: Boolean): Self = StObject.set(x, "allowPartialRange", value.asInstanceOf[js.Any])
      
      inline def setAllowPartialRangeUndefined: Self = StObject.set(x, "allowPartialRange", js.undefined)
      
      inline def setCalendarType(value: CalendarType): Self = StObject.set(x, "calendarType", value.asInstanceOf[js.Any])
      
      inline def setCalendarTypeUndefined: Self = StObject.set(x, "calendarType", js.undefined)
      
      inline def setClassName(value: ClassName): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameNull: Self = StObject.set(x, "className", null)
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassNameVarargs(value: (js.UndefOr[String | Null])*): Self = StObject.set(x, "className", js.Array(value*))
      
      inline def setDefaultActiveStartDate(value: js.Date): Self = StObject.set(x, "defaultActiveStartDate", value.asInstanceOf[js.Any])
      
      inline def setDefaultActiveStartDateUndefined: Self = StObject.set(x, "defaultActiveStartDate", js.undefined)
      
      inline def setDefaultValue(value: LooseValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultView(value: View): Self = StObject.set(x, "defaultView", value.asInstanceOf[js.Any])
      
      inline def setDefaultViewUndefined: Self = StObject.set(x, "defaultView", js.undefined)
      
      inline def setFormatDay(value: (/* locale */ js.UndefOr[String], /* date */ js.Date) => String): Self = StObject.set(x, "formatDay", js.Any.fromFunction2(value))
      
      inline def setFormatDayUndefined: Self = StObject.set(x, "formatDay", js.undefined)
      
      inline def setFormatLongDate(value: (/* locale */ js.UndefOr[String], /* date */ js.Date) => String): Self = StObject.set(x, "formatLongDate", js.Any.fromFunction2(value))
      
      inline def setFormatLongDateUndefined: Self = StObject.set(x, "formatLongDate", js.undefined)
      
      inline def setFormatMonth(value: (/* locale */ js.UndefOr[String], /* date */ js.Date) => String): Self = StObject.set(x, "formatMonth", js.Any.fromFunction2(value))
      
      inline def setFormatMonthUndefined: Self = StObject.set(x, "formatMonth", js.undefined)
      
      inline def setFormatMonthYear(value: (/* locale */ js.UndefOr[String], /* date */ js.Date) => String): Self = StObject.set(x, "formatMonthYear", js.Any.fromFunction2(value))
      
      inline def setFormatMonthYearUndefined: Self = StObject.set(x, "formatMonthYear", js.undefined)
      
      inline def setFormatShortWeekday(value: (/* locale */ js.UndefOr[String], /* date */ js.Date) => String): Self = StObject.set(x, "formatShortWeekday", js.Any.fromFunction2(value))
      
      inline def setFormatShortWeekdayUndefined: Self = StObject.set(x, "formatShortWeekday", js.undefined)
      
      inline def setFormatWeekday(value: (/* locale */ js.UndefOr[String], /* date */ js.Date) => String): Self = StObject.set(x, "formatWeekday", js.Any.fromFunction2(value))
      
      inline def setFormatWeekdayUndefined: Self = StObject.set(x, "formatWeekday", js.undefined)
      
      inline def setFormatYear(value: (/* locale */ js.UndefOr[String], /* date */ js.Date) => String): Self = StObject.set(x, "formatYear", js.Any.fromFunction2(value))
      
      inline def setFormatYearUndefined: Self = StObject.set(x, "formatYear", js.undefined)
      
      inline def setGoToRangeStartOnSelect(value: Boolean): Self = StObject.set(x, "goToRangeStartOnSelect", value.asInstanceOf[js.Any])
      
      inline def setGoToRangeStartOnSelectUndefined: Self = StObject.set(x, "goToRangeStartOnSelect", js.undefined)
      
      inline def setInputRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMaxDetail(value: Detail): Self = StObject.set(x, "maxDetail", value.asInstanceOf[js.Any])
      
      inline def setMaxDetailUndefined: Self = StObject.set(x, "maxDetail", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMinDetail(value: Detail): Self = StObject.set(x, "minDetail", value.asInstanceOf[js.Any])
      
      inline def setMinDetailUndefined: Self = StObject.set(x, "minDetail", js.undefined)
      
      inline def setNavigationAriaLabel(value: String): Self = StObject.set(x, "navigationAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNavigationAriaLabelUndefined: Self = StObject.set(x, "navigationAriaLabel", js.undefined)
      
      inline def setNavigationAriaLive(value: off | polite | assertive): Self = StObject.set(x, "navigationAriaLive", value.asInstanceOf[js.Any])
      
      inline def setNavigationAriaLiveUndefined: Self = StObject.set(x, "navigationAriaLive", js.undefined)
      
      inline def setNavigationLabel(value: /* param0 */ NavigationLabelArgs => ReactNode): Self = StObject.set(x, "navigationLabel", js.Any.fromFunction1(value))
      
      inline def setNavigationLabelUndefined: Self = StObject.set(x, "navigationLabel", js.undefined)
      
      inline def setNext2AriaLabel(value: String): Self = StObject.set(x, "next2AriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNext2AriaLabelUndefined: Self = StObject.set(x, "next2AriaLabel", js.undefined)
      
      inline def setNext2Label(value: ReactNode): Self = StObject.set(x, "next2Label", value.asInstanceOf[js.Any])
      
      inline def setNext2LabelUndefined: Self = StObject.set(x, "next2Label", js.undefined)
      
      inline def setNextAriaLabel(value: String): Self = StObject.set(x, "nextAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNextAriaLabelUndefined: Self = StObject.set(x, "nextAriaLabel", js.undefined)
      
      inline def setNextLabel(value: ReactNode): Self = StObject.set(x, "nextLabel", value.asInstanceOf[js.Any])
      
      inline def setNextLabelUndefined: Self = StObject.set(x, "nextLabel", js.undefined)
      
      inline def setOnActiveStartDateChange(value: /* param0 */ OnArgs => Unit): Self = StObject.set(x, "onActiveStartDateChange", js.Any.fromFunction1(value))
      
      inline def setOnActiveStartDateChangeUndefined: Self = StObject.set(x, "onActiveStartDateChange", js.undefined)
      
      inline def setOnChange(value: (/* value */ Value, /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClickDay(value: (/* value */ js.Date, /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClickDay", js.Any.fromFunction2(value))
      
      inline def setOnClickDayUndefined: Self = StObject.set(x, "onClickDay", js.undefined)
      
      inline def setOnClickDecade(value: (/* value */ js.Date, /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClickDecade", js.Any.fromFunction2(value))
      
      inline def setOnClickDecadeUndefined: Self = StObject.set(x, "onClickDecade", js.undefined)
      
      inline def setOnClickMonth(value: (/* value */ js.Date, /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClickMonth", js.Any.fromFunction2(value))
      
      inline def setOnClickMonthUndefined: Self = StObject.set(x, "onClickMonth", js.undefined)
      
      inline def setOnClickWeekNumber(
        value: (/* weekNumber */ Double, /* date */ js.Date, /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onClickWeekNumber", js.Any.fromFunction3(value))
      
      inline def setOnClickWeekNumberUndefined: Self = StObject.set(x, "onClickWeekNumber", js.undefined)
      
      inline def setOnClickYear(value: (/* value */ js.Date, /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClickYear", js.Any.fromFunction2(value))
      
      inline def setOnClickYearUndefined: Self = StObject.set(x, "onClickYear", js.undefined)
      
      inline def setOnDrillDown(value: /* param0 */ OnArgs => Unit): Self = StObject.set(x, "onDrillDown", js.Any.fromFunction1(value))
      
      inline def setOnDrillDownUndefined: Self = StObject.set(x, "onDrillDown", js.undefined)
      
      inline def setOnDrillUp(value: /* param0 */ OnArgs => Unit): Self = StObject.set(x, "onDrillUp", js.Any.fromFunction1(value))
      
      inline def setOnDrillUpUndefined: Self = StObject.set(x, "onDrillUp", js.undefined)
      
      inline def setOnViewChange(value: /* param0 */ OnArgs => Unit): Self = StObject.set(x, "onViewChange", js.Any.fromFunction1(value))
      
      inline def setOnViewChangeUndefined: Self = StObject.set(x, "onViewChange", js.undefined)
      
      inline def setPrev2AriaLabel(value: String): Self = StObject.set(x, "prev2AriaLabel", value.asInstanceOf[js.Any])
      
      inline def setPrev2AriaLabelUndefined: Self = StObject.set(x, "prev2AriaLabel", js.undefined)
      
      inline def setPrev2Label(value: ReactNode): Self = StObject.set(x, "prev2Label", value.asInstanceOf[js.Any])
      
      inline def setPrev2LabelUndefined: Self = StObject.set(x, "prev2Label", js.undefined)
      
      inline def setPrevAriaLabel(value: String): Self = StObject.set(x, "prevAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setPrevAriaLabelUndefined: Self = StObject.set(x, "prevAriaLabel", js.undefined)
      
      inline def setPrevLabel(value: ReactNode): Self = StObject.set(x, "prevLabel", value.asInstanceOf[js.Any])
      
      inline def setPrevLabelUndefined: Self = StObject.set(x, "prevLabel", js.undefined)
      
      inline def setReturnValue(value: start | end | range): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
      
      inline def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
      
      inline def setSelectRange(value: Boolean): Self = StObject.set(x, "selectRange", value.asInstanceOf[js.Any])
      
      inline def setSelectRangeUndefined: Self = StObject.set(x, "selectRange", js.undefined)
      
      inline def setShowDoubleView(value: Boolean): Self = StObject.set(x, "showDoubleView", value.asInstanceOf[js.Any])
      
      inline def setShowDoubleViewUndefined: Self = StObject.set(x, "showDoubleView", js.undefined)
      
      inline def setShowFixedNumberOfWeeks(value: Boolean): Self = StObject.set(x, "showFixedNumberOfWeeks", value.asInstanceOf[js.Any])
      
      inline def setShowFixedNumberOfWeeksUndefined: Self = StObject.set(x, "showFixedNumberOfWeeks", js.undefined)
      
      inline def setShowNavigation(value: Boolean): Self = StObject.set(x, "showNavigation", value.asInstanceOf[js.Any])
      
      inline def setShowNavigationUndefined: Self = StObject.set(x, "showNavigation", js.undefined)
      
      inline def setShowNeighboringMonth(value: Boolean): Self = StObject.set(x, "showNeighboringMonth", value.asInstanceOf[js.Any])
      
      inline def setShowNeighboringMonthUndefined: Self = StObject.set(x, "showNeighboringMonth", js.undefined)
      
      inline def setShowWeekNumbers(value: Boolean): Self = StObject.set(x, "showWeekNumbers", value.asInstanceOf[js.Any])
      
      inline def setShowWeekNumbersUndefined: Self = StObject.set(x, "showWeekNumbers", js.undefined)
      
      inline def setTileClassName(value: TileClassNameFunc | ClassName): Self = StObject.set(x, "tileClassName", value.asInstanceOf[js.Any])
      
      inline def setTileClassNameFunction1(value: /* args */ TileArgs => ClassName): Self = StObject.set(x, "tileClassName", js.Any.fromFunction1(value))
      
      inline def setTileClassNameNull: Self = StObject.set(x, "tileClassName", null)
      
      inline def setTileClassNameUndefined: Self = StObject.set(x, "tileClassName", js.undefined)
      
      inline def setTileClassNameVarargs(value: (js.UndefOr[String | Null])*): Self = StObject.set(x, "tileClassName", js.Array(value*))
      
      inline def setTileContent(value: TileContentFunc | ReactNode): Self = StObject.set(x, "tileContent", value.asInstanceOf[js.Any])
      
      inline def setTileContentFunction1(value: /* args */ TileArgs => ReactNode): Self = StObject.set(x, "tileContent", js.Any.fromFunction1(value))
      
      inline def setTileContentUndefined: Self = StObject.set(x, "tileContent", js.undefined)
      
      inline def setTileDisabled(value: /* args */ TileArgs => Boolean): Self = StObject.set(x, "tileDisabled", js.Any.fromFunction1(value))
      
      inline def setTileDisabledUndefined: Self = StObject.set(x, "tileDisabled", js.undefined)
      
      inline def setValue(value: LooseValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  trait CalendarState extends StObject {
    
    var action: js.UndefOr[Action] = js.undefined
    
    var activeStartDate: js.UndefOr[js.Date | Null] = js.undefined
    
    var hover: js.UndefOr[js.Date | Null] = js.undefined
    
    var value: js.UndefOr[Value] = js.undefined
    
    var view: js.UndefOr[View] = js.undefined
  }
  object CalendarState {
    
    inline def apply(): CalendarState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalendarState] (val x: Self) extends AnyVal {
      
      inline def setAction(value: Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setActiveStartDate(value: js.Date): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
      
      inline def setActiveStartDateNull: Self = StObject.set(x, "activeStartDate", null)
      
      inline def setActiveStartDateUndefined: Self = StObject.set(x, "activeStartDate", js.undefined)
      
      inline def setHover(value: js.Date): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      inline def setHoverNull: Self = StObject.set(x, "hover", null)
      
      inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
}
