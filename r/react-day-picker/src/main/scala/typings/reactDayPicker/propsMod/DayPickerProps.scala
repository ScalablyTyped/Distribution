package typings.reactDayPicker.propsMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FocusEvent
import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SFC
import typings.react.mod.TouchEvent
import typings.reactDayPicker.anon.NextMonth
import typings.reactDayPicker.anon.PartialModifiers
import typings.reactDayPicker.classNamesMod.ClassNames
import typings.reactDayPicker.localeUtilsMod.LocaleUtils
import typings.reactDayPicker.modifiersMod.DayModifiers
import typings.reactDayPicker.modifiersMod.Modifier
import typings.std.Date
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DayPickerProps extends js.Object {
  
  var canChangeMonth: js.UndefOr[Boolean] = js.native
  
  var captionElement: js.UndefOr[
    ReactElement | (ComponentClass[CaptionElementProps, ComponentState]) | SFC[CaptionElementProps]
  ] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var classNames: js.UndefOr[ClassNames] = js.native
  
  var containerProps: js.UndefOr[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]] = js.native
  
  var dir: js.UndefOr[String] = js.native
  
  var disabledDays: js.UndefOr[Modifier | js.Array[Modifier]] = js.native
  
  var enableOutsideDaysClick: js.UndefOr[Boolean] = js.native
  
  var firstDayOfWeek: js.UndefOr[Double] = js.native
  
  var fixedWeeks: js.UndefOr[Boolean] = js.native
  
  var fromMonth: js.UndefOr[Date] = js.native
  
  var initialMonth: js.UndefOr[Date] = js.native
  
  var labels: js.UndefOr[NextMonth] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var localeUtils: js.UndefOr[LocaleUtils] = js.native
  
  var modifiers: js.UndefOr[PartialModifiers] = js.native
  
  var modifiersStyles: js.UndefOr[js.Object] = js.native
  
  var month: js.UndefOr[Date] = js.native
  
  var months: js.UndefOr[js.Array[String]] = js.native
  
  var navbarElement: js.UndefOr[
    ReactElement | (ComponentClass[NavbarElementProps, ComponentState]) | SFC[NavbarElementProps]
  ] = js.native
  
  var numberOfMonths: js.UndefOr[Double] = js.native
  
  var onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.native
  
  var onCaptionClick: js.UndefOr[
    js.Function2[/* month */ Date, /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]
  ] = js.native
  
  var onDayClick: js.UndefOr[
    js.Function3[
      /* day */ Date, 
      /* modifiers */ DayModifiers, 
      /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.native
  
  var onDayKeyDown: js.UndefOr[
    js.Function3[
      /* day */ Date, 
      /* modifiers */ DayModifiers, 
      /* e */ KeyboardEvent[HTMLDivElement], 
      Unit
    ]
  ] = js.native
  
  var onDayMouseDown: js.UndefOr[
    js.Function3[
      /* day */ Date, 
      /* modifiers */ DayModifiers, 
      /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.native
  
  var onDayMouseEnter: js.UndefOr[
    js.Function3[
      /* day */ Date, 
      /* modifiers */ DayModifiers, 
      /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.native
  
  var onDayMouseLeave: js.UndefOr[
    js.Function3[
      /* day */ Date, 
      /* modifiers */ DayModifiers, 
      /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.native
  
  var onDayMouseUp: js.UndefOr[
    js.Function3[
      /* day */ Date, 
      /* modifiers */ DayModifiers, 
      /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.native
  
  var onDayTouchEnd: js.UndefOr[
    js.Function3[/* day */ Date, /* modifiers */ DayModifiers, /* e */ TouchEvent[HTMLDivElement], Unit]
  ] = js.native
  
  var onDayTouchStart: js.UndefOr[
    js.Function3[/* day */ Date, /* modifiers */ DayModifiers, /* e */ TouchEvent[HTMLDivElement], Unit]
  ] = js.native
  
  var onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.native
  
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[HTMLDivElement], Unit]] = js.native
  
  var onMonthChange: js.UndefOr[js.Function1[/* month */ Date, Unit]] = js.native
  
  var onTodayButtonClick: js.UndefOr[
    js.Function3[
      /* day */ Date, 
      /* modifiers */ DayModifiers, 
      /* e */ MouseEvent[HTMLButtonElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.native
  
  var onWeekClick: js.UndefOr[
    js.Function3[
      /* weekNumber */ Double, 
      /* days */ js.Array[Date], 
      /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.native
  
  var pagedNavigation: js.UndefOr[Boolean] = js.native
  
  var renderDay: js.UndefOr[js.Function2[/* date */ Date, /* modifiers */ DayModifiers, ReactNode]] = js.native
  
  var renderWeek: js.UndefOr[
    js.Function3[/* weekNumber */ Double, /* week */ js.Array[Date], /* month */ Date, ReactNode]
  ] = js.native
  
  var reverseMonths: js.UndefOr[Boolean] = js.native
  
  var selectedDays: js.UndefOr[Modifier | js.Array[Modifier]] = js.native
  
  var showOutsideDays: js.UndefOr[Boolean] = js.native
  
  var showWeekDays: js.UndefOr[Boolean] = js.native
  
  var showWeekNumbers: js.UndefOr[Boolean] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var toMonth: js.UndefOr[Date] = js.native
  
  var todayButton: js.UndefOr[String] = js.native
  
  var weekdayElement: js.UndefOr[
    ReactElement | (ComponentClass[WeekdayElementProps, ComponentState]) | SFC[WeekdayElementProps]
  ] = js.native
  
  var weekdaysLong: js.UndefOr[js.Array[String]] = js.native
  
  var weekdaysShort: js.UndefOr[js.Array[String]] = js.native
}
object DayPickerProps {
  
  @scala.inline
  def apply(): DayPickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayPickerProps]
  }
  
  @scala.inline
  implicit class DayPickerPropsOps[Self <: DayPickerProps] (val x: Self) extends AnyVal {
    
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
    def setCanChangeMonth(value: Boolean): Self = this.set("canChangeMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanChangeMonth: Self = this.set("canChangeMonth", js.undefined)
    
    @scala.inline
    def setCaptionElement(
      value: ReactElement | (ComponentClass[CaptionElementProps, ComponentState]) | SFC[CaptionElementProps]
    ): Self = this.set("captionElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptionElement: Self = this.set("captionElement", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClassNames(value: ClassNames): Self = this.set("classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassNames: Self = this.set("classNames", js.undefined)
    
    @scala.inline
    def setContainerProps(value: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]): Self = this.set("containerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerProps: Self = this.set("containerProps", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setDisabledDaysVarargs(value: Modifier*): Self = this.set("disabledDays", js.Array(value :_*))
    
    @scala.inline
    def setDisabledDaysFunction1(value: /* date */ Date => Boolean): Self = this.set("disabledDays", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisabledDays(value: Modifier | js.Array[Modifier]): Self = this.set("disabledDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledDays: Self = this.set("disabledDays", js.undefined)
    
    @scala.inline
    def setEnableOutsideDaysClick(value: Boolean): Self = this.set("enableOutsideDaysClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableOutsideDaysClick: Self = this.set("enableOutsideDaysClick", js.undefined)
    
    @scala.inline
    def setFirstDayOfWeek(value: Double): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
    
    @scala.inline
    def setFixedWeeks(value: Boolean): Self = this.set("fixedWeeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedWeeks: Self = this.set("fixedWeeks", js.undefined)
    
    @scala.inline
    def setFromMonth(value: Date): Self = this.set("fromMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromMonth: Self = this.set("fromMonth", js.undefined)
    
    @scala.inline
    def setInitialMonth(value: Date): Self = this.set("initialMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialMonth: Self = this.set("initialMonth", js.undefined)
    
    @scala.inline
    def setLabels(value: NextMonth): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setLocaleUtils(value: LocaleUtils): Self = this.set("localeUtils", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocaleUtils: Self = this.set("localeUtils", js.undefined)
    
    @scala.inline
    def setModifiers(value: PartialModifiers): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    
    @scala.inline
    def setModifiersStyles(value: js.Object): Self = this.set("modifiersStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiersStyles: Self = this.set("modifiersStyles", js.undefined)
    
    @scala.inline
    def setMonth(value: Date): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setMonthsVarargs(value: String*): Self = this.set("months", js.Array(value :_*))
    
    @scala.inline
    def setMonths(value: js.Array[String]): Self = this.set("months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonths: Self = this.set("months", js.undefined)
    
    @scala.inline
    def setNavbarElement(
      value: ReactElement | (ComponentClass[NavbarElementProps, ComponentState]) | SFC[NavbarElementProps]
    ): Self = this.set("navbarElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavbarElement: Self = this.set("navbarElement", js.undefined)
    
    @scala.inline
    def setNumberOfMonths(value: Double): Self = this.set("numberOfMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfMonths: Self = this.set("numberOfMonths", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* e */ FocusEvent[HTMLDivElement] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnCaptionClick(value: (/* month */ Date, /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit): Self = this.set("onCaptionClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCaptionClick: Self = this.set("onCaptionClick", js.undefined)
    
    @scala.inline
    def setOnDayClick(
      value: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onDayClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnDayClick: Self = this.set("onDayClick", js.undefined)
    
    @scala.inline
    def setOnDayKeyDown(
      value: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ KeyboardEvent[HTMLDivElement]) => Unit
    ): Self = this.set("onDayKeyDown", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnDayKeyDown: Self = this.set("onDayKeyDown", js.undefined)
    
    @scala.inline
    def setOnDayMouseDown(
      value: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onDayMouseDown", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnDayMouseDown: Self = this.set("onDayMouseDown", js.undefined)
    
    @scala.inline
    def setOnDayMouseEnter(
      value: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onDayMouseEnter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnDayMouseEnter: Self = this.set("onDayMouseEnter", js.undefined)
    
    @scala.inline
    def setOnDayMouseLeave(
      value: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onDayMouseLeave", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnDayMouseLeave: Self = this.set("onDayMouseLeave", js.undefined)
    
    @scala.inline
    def setOnDayMouseUp(
      value: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onDayMouseUp", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnDayMouseUp: Self = this.set("onDayMouseUp", js.undefined)
    
    @scala.inline
    def setOnDayTouchEnd(value: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ TouchEvent[HTMLDivElement]) => Unit): Self = this.set("onDayTouchEnd", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnDayTouchEnd: Self = this.set("onDayTouchEnd", js.undefined)
    
    @scala.inline
    def setOnDayTouchStart(value: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ TouchEvent[HTMLDivElement]) => Unit): Self = this.set("onDayTouchStart", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnDayTouchStart: Self = this.set("onDayTouchStart", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* e */ FocusEvent[HTMLDivElement] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: /* e */ KeyboardEvent[HTMLDivElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnMonthChange(value: /* month */ Date => Unit): Self = this.set("onMonthChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMonthChange: Self = this.set("onMonthChange", js.undefined)
    
    @scala.inline
    def setOnTodayButtonClick(
      value: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ MouseEvent[HTMLButtonElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onTodayButtonClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnTodayButtonClick: Self = this.set("onTodayButtonClick", js.undefined)
    
    @scala.inline
    def setOnWeekClick(
      value: (/* weekNumber */ Double, /* days */ js.Array[Date], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onWeekClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnWeekClick: Self = this.set("onWeekClick", js.undefined)
    
    @scala.inline
    def setPagedNavigation(value: Boolean): Self = this.set("pagedNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagedNavigation: Self = this.set("pagedNavigation", js.undefined)
    
    @scala.inline
    def setRenderDay(value: (/* date */ Date, /* modifiers */ DayModifiers) => ReactNode): Self = this.set("renderDay", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderDay: Self = this.set("renderDay", js.undefined)
    
    @scala.inline
    def setRenderWeek(value: (/* weekNumber */ Double, /* week */ js.Array[Date], /* month */ Date) => ReactNode): Self = this.set("renderWeek", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRenderWeek: Self = this.set("renderWeek", js.undefined)
    
    @scala.inline
    def setReverseMonths(value: Boolean): Self = this.set("reverseMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverseMonths: Self = this.set("reverseMonths", js.undefined)
    
    @scala.inline
    def setSelectedDaysVarargs(value: Modifier*): Self = this.set("selectedDays", js.Array(value :_*))
    
    @scala.inline
    def setSelectedDaysFunction1(value: /* date */ Date => Boolean): Self = this.set("selectedDays", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectedDays(value: Modifier | js.Array[Modifier]): Self = this.set("selectedDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedDays: Self = this.set("selectedDays", js.undefined)
    
    @scala.inline
    def setShowOutsideDays(value: Boolean): Self = this.set("showOutsideDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOutsideDays: Self = this.set("showOutsideDays", js.undefined)
    
    @scala.inline
    def setShowWeekDays(value: Boolean): Self = this.set("showWeekDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowWeekDays: Self = this.set("showWeekDays", js.undefined)
    
    @scala.inline
    def setShowWeekNumbers(value: Boolean): Self = this.set("showWeekNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowWeekNumbers: Self = this.set("showWeekNumbers", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setToMonth(value: Date): Self = this.set("toMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToMonth: Self = this.set("toMonth", js.undefined)
    
    @scala.inline
    def setTodayButton(value: String): Self = this.set("todayButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTodayButton: Self = this.set("todayButton", js.undefined)
    
    @scala.inline
    def setWeekdayElement(
      value: ReactElement | (ComponentClass[WeekdayElementProps, ComponentState]) | SFC[WeekdayElementProps]
    ): Self = this.set("weekdayElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekdayElement: Self = this.set("weekdayElement", js.undefined)
    
    @scala.inline
    def setWeekdaysLongVarargs(value: String*): Self = this.set("weekdaysLong", js.Array(value :_*))
    
    @scala.inline
    def setWeekdaysLong(value: js.Array[String]): Self = this.set("weekdaysLong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekdaysLong: Self = this.set("weekdaysLong", js.undefined)
    
    @scala.inline
    def setWeekdaysShortVarargs(value: String*): Self = this.set("weekdaysShort", js.Array(value :_*))
    
    @scala.inline
    def setWeekdaysShort(value: js.Array[String]): Self = this.set("weekdaysShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekdaysShort: Self = this.set("weekdaysShort", js.undefined)
  }
}
