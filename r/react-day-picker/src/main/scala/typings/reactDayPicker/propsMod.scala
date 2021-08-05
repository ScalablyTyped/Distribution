package typings.reactDayPicker

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FocusEvent
import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SFC
import typings.react.mod.TouchEvent
import typings.reactDayPicker.anon.NextMonth
import typings.reactDayPicker.anon.PartialModifiers
import typings.reactDayPicker.classNamesMod.ClassNames
import typings.reactDayPicker.classNamesMod.InputClassNames
import typings.reactDayPicker.dayPickerInputMod.default
import typings.reactDayPicker.localeUtilsMod.LocaleUtils
import typings.reactDayPicker.modifiersMod.DayModifiers
import typings.reactDayPicker.modifiersMod.Modifier
import typings.std.Date
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propsMod {
  
  trait CaptionElementProps extends StObject {
    
    var classNames: ClassNames
    
    var date: Date
    
    var locale: String
    
    var localeUtils: LocaleUtils
    
    var months: js.UndefOr[js.Array[String]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  }
  object CaptionElementProps {
    
    inline def apply(classNames: ClassNames, date: Date, locale: String, localeUtils: LocaleUtils): CaptionElementProps = {
      val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], localeUtils = localeUtils.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaptionElementProps]
    }
    
    extension [Self <: CaptionElementProps](x: Self) {
      
      inline def setClassNames(value: ClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUtils(value: LocaleUtils): Self = StObject.set(x, "localeUtils", value.asInstanceOf[js.Any])
      
      inline def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      inline def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value :_*))
      
      inline def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  trait DayPickerInputProps extends StObject {
    
    var classNames: js.UndefOr[InputClassNames] = js.undefined
    
    var clickUnselectsDay: js.UndefOr[Boolean] = js.undefined
    
    var component: js.UndefOr[js.Any] = js.undefined
    
    var dayPickerProps: js.UndefOr[DayPickerProps] = js.undefined
    
    var format: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var formatDate: js.UndefOr[js.Function3[/* date */ Date, /* format */ String, /* locale */ String, String]] = js.undefined
    
    var hideOnDayClick: js.UndefOr[Boolean] = js.undefined
    
    var inputProps: js.UndefOr[js.Object] = js.undefined
    
    var keepFocus: js.UndefOr[Boolean] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.undefined
    
    var onDayChange: js.UndefOr[
        js.Function3[/* day */ Date, /* DayModifiers */ DayModifiers, /* dayPickerInput */ default, Unit]
      ] = js.undefined
    
    var onDayPickerHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onDayPickerShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.undefined
    
    var onKeyUp: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.undefined
    
    var overlayComponent: js.UndefOr[js.Any] = js.undefined
    
    var parseDate: js.UndefOr[
        js.Function3[/* str */ String, /* format */ String, /* locale */ String, Date | Unit]
      ] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var showOverlay: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var value: js.UndefOr[String | Date] = js.undefined
  }
  object DayPickerInputProps {
    
    inline def apply(): DayPickerInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DayPickerInputProps]
    }
    
    extension [Self <: DayPickerInputProps](x: Self) {
      
      inline def setClassNames(value: InputClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setClickUnselectsDay(value: Boolean): Self = StObject.set(x, "clickUnselectsDay", value.asInstanceOf[js.Any])
      
      inline def setClickUnselectsDayUndefined: Self = StObject.set(x, "clickUnselectsDay", js.undefined)
      
      inline def setComponent(value: js.Any): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setDayPickerProps(value: DayPickerProps): Self = StObject.set(x, "dayPickerProps", value.asInstanceOf[js.Any])
      
      inline def setDayPickerPropsUndefined: Self = StObject.set(x, "dayPickerProps", js.undefined)
      
      inline def setFormat(value: String | js.Array[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatDate(value: (/* date */ Date, /* format */ String, /* locale */ String) => String): Self = StObject.set(x, "formatDate", js.Any.fromFunction3(value))
      
      inline def setFormatDateUndefined: Self = StObject.set(x, "formatDate", js.undefined)
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFormatVarargs(value: String*): Self = StObject.set(x, "format", js.Array(value :_*))
      
      inline def setHideOnDayClick(value: Boolean): Self = StObject.set(x, "hideOnDayClick", value.asInstanceOf[js.Any])
      
      inline def setHideOnDayClickUndefined: Self = StObject.set(x, "hideOnDayClick", js.undefined)
      
      inline def setInputProps(value: js.Object): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setKeepFocus(value: Boolean): Self = StObject.set(x, "keepFocus", value.asInstanceOf[js.Any])
      
      inline def setKeepFocusUndefined: Self = StObject.set(x, "keepFocus", js.undefined)
      
      inline def setOnBlur(value: /* e */ FocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* e */ FocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: /* e */ FocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnDayChange(value: (/* day */ Date, /* DayModifiers */ DayModifiers, /* dayPickerInput */ default) => Unit): Self = StObject.set(x, "onDayChange", js.Any.fromFunction3(value))
      
      inline def setOnDayChangeUndefined: Self = StObject.set(x, "onDayChange", js.undefined)
      
      inline def setOnDayPickerHide(value: () => Unit): Self = StObject.set(x, "onDayPickerHide", js.Any.fromFunction0(value))
      
      inline def setOnDayPickerHideUndefined: Self = StObject.set(x, "onDayPickerHide", js.undefined)
      
      inline def setOnDayPickerShow(value: () => Unit): Self = StObject.set(x, "onDayPickerShow", js.Any.fromFunction0(value))
      
      inline def setOnDayPickerShowUndefined: Self = StObject.set(x, "onDayPickerShow", js.undefined)
      
      inline def setOnFocus(value: /* e */ FocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyUp(value: /* e */ FocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOverlayComponent(value: js.Any): Self = StObject.set(x, "overlayComponent", value.asInstanceOf[js.Any])
      
      inline def setOverlayComponentUndefined: Self = StObject.set(x, "overlayComponent", js.undefined)
      
      inline def setParseDate(value: (/* str */ String, /* format */ String, /* locale */ String) => Date | Unit): Self = StObject.set(x, "parseDate", js.Any.fromFunction3(value))
      
      inline def setParseDateUndefined: Self = StObject.set(x, "parseDate", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setShowOverlay(value: Boolean): Self = StObject.set(x, "showOverlay", value.asInstanceOf[js.Any])
      
      inline def setShowOverlayUndefined: Self = StObject.set(x, "showOverlay", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: String | Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait DayPickerProps extends StObject {
    
    var canChangeMonth: js.UndefOr[Boolean] = js.undefined
    
    var captionElement: js.UndefOr[
        ReactElement | (ComponentClass[CaptionElementProps, ComponentState]) | SFC[CaptionElementProps]
      ] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var classNames: js.UndefOr[ClassNames] = js.undefined
    
    var containerProps: js.UndefOr[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var disabledDays: js.UndefOr[Modifier | js.Array[Modifier]] = js.undefined
    
    var enableOutsideDaysClick: js.UndefOr[Boolean] = js.undefined
    
    var firstDayOfWeek: js.UndefOr[Double] = js.undefined
    
    var fixedWeeks: js.UndefOr[Boolean] = js.undefined
    
    var fromMonth: js.UndefOr[Date] = js.undefined
    
    var initialMonth: js.UndefOr[Date] = js.undefined
    
    var labels: js.UndefOr[NextMonth] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var localeUtils: js.UndefOr[LocaleUtils] = js.undefined
    
    var modifiers: js.UndefOr[PartialModifiers] = js.undefined
    
    var modifiersStyles: js.UndefOr[js.Object] = js.undefined
    
    var month: js.UndefOr[Date] = js.undefined
    
    var months: js.UndefOr[js.Array[String]] = js.undefined
    
    var navbarElement: js.UndefOr[
        ReactElement | (ComponentClass[NavbarElementProps, ComponentState]) | SFC[NavbarElementProps]
      ] = js.undefined
    
    var numberOfMonths: js.UndefOr[Double] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.undefined
    
    var onCaptionClick: js.UndefOr[
        js.Function2[/* month */ Date, /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]
      ] = js.undefined
    
    var onDayClick: js.UndefOr[
        js.Function3[
          /* day */ Date, 
          /* modifiers */ DayModifiers, 
          /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
          Unit
        ]
      ] = js.undefined
    
    var onDayKeyDown: js.UndefOr[
        js.Function3[
          /* day */ Date, 
          /* modifiers */ DayModifiers, 
          /* e */ KeyboardEvent[HTMLDivElement], 
          Unit
        ]
      ] = js.undefined
    
    var onDayMouseDown: js.UndefOr[
        js.Function3[
          /* day */ Date, 
          /* modifiers */ DayModifiers, 
          /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
          Unit
        ]
      ] = js.undefined
    
    var onDayMouseEnter: js.UndefOr[
        js.Function3[
          /* day */ Date, 
          /* modifiers */ DayModifiers, 
          /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
          Unit
        ]
      ] = js.undefined
    
    var onDayMouseLeave: js.UndefOr[
        js.Function3[
          /* day */ Date, 
          /* modifiers */ DayModifiers, 
          /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
          Unit
        ]
      ] = js.undefined
    
    var onDayMouseUp: js.UndefOr[
        js.Function3[
          /* day */ Date, 
          /* modifiers */ DayModifiers, 
          /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
          Unit
        ]
      ] = js.undefined
    
    var onDayTouchEnd: js.UndefOr[
        js.Function3[/* day */ Date, /* modifiers */ DayModifiers, /* e */ TouchEvent[HTMLDivElement], Unit]
      ] = js.undefined
    
    var onDayTouchStart: js.UndefOr[
        js.Function3[/* day */ Date, /* modifiers */ DayModifiers, /* e */ TouchEvent[HTMLDivElement], Unit]
      ] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.undefined
    
    var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[HTMLDivElement], Unit]] = js.undefined
    
    var onMonthChange: js.UndefOr[js.Function1[/* month */ Date, Unit]] = js.undefined
    
    var onTodayButtonClick: js.UndefOr[
        js.Function3[
          /* day */ Date, 
          /* modifiers */ DayModifiers, 
          /* e */ MouseEvent[HTMLButtonElement, NativeMouseEvent], 
          Unit
        ]
      ] = js.undefined
    
    var onWeekClick: js.UndefOr[
        js.Function3[
          /* weekNumber */ Double, 
          /* days */ js.Array[Date], 
          /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
          Unit
        ]
      ] = js.undefined
    
    var pagedNavigation: js.UndefOr[Boolean] = js.undefined
    
    var renderDay: js.UndefOr[js.Function2[/* date */ Date, /* modifiers */ DayModifiers, ReactNode]] = js.undefined
    
    var renderWeek: js.UndefOr[
        js.Function3[/* weekNumber */ Double, /* week */ js.Array[Date], /* month */ Date, ReactNode]
      ] = js.undefined
    
    var reverseMonths: js.UndefOr[Boolean] = js.undefined
    
    var selectedDays: js.UndefOr[Modifier | js.Array[Modifier]] = js.undefined
    
    var showOutsideDays: js.UndefOr[Boolean] = js.undefined
    
    var showWeekDays: js.UndefOr[Boolean] = js.undefined
    
    var showWeekNumbers: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var toMonth: js.UndefOr[Date] = js.undefined
    
    var todayButton: js.UndefOr[String] = js.undefined
    
    var weekdayElement: js.UndefOr[
        ReactElement | (ComponentClass[WeekdayElementProps, ComponentState]) | SFC[WeekdayElementProps]
      ] = js.undefined
    
    var weekdaysLong: js.UndefOr[js.Array[String]] = js.undefined
    
    var weekdaysShort: js.UndefOr[js.Array[String]] = js.undefined
  }
  object DayPickerProps {
    
    inline def apply(): DayPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DayPickerProps]
    }
    
    extension [Self <: DayPickerProps](x: Self) {
      
      inline def setCanChangeMonth(value: Boolean): Self = StObject.set(x, "canChangeMonth", value.asInstanceOf[js.Any])
      
      inline def setCanChangeMonthUndefined: Self = StObject.set(x, "canChangeMonth", js.undefined)
      
      inline def setCaptionElement(
        value: ReactElement | (ComponentClass[CaptionElementProps, ComponentState]) | SFC[CaptionElementProps]
      ): Self = StObject.set(x, "captionElement", value.asInstanceOf[js.Any])
      
      inline def setCaptionElementUndefined: Self = StObject.set(x, "captionElement", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassNames(value: ClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setContainerProps(value: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]): Self = StObject.set(x, "containerProps", value.asInstanceOf[js.Any])
      
      inline def setContainerPropsUndefined: Self = StObject.set(x, "containerProps", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDisabledDays(value: Modifier | js.Array[Modifier]): Self = StObject.set(x, "disabledDays", value.asInstanceOf[js.Any])
      
      inline def setDisabledDaysFunction1(value: /* date */ Date => Boolean): Self = StObject.set(x, "disabledDays", js.Any.fromFunction1(value))
      
      inline def setDisabledDaysUndefined: Self = StObject.set(x, "disabledDays", js.undefined)
      
      inline def setDisabledDaysVarargs(value: Modifier*): Self = StObject.set(x, "disabledDays", js.Array(value :_*))
      
      inline def setEnableOutsideDaysClick(value: Boolean): Self = StObject.set(x, "enableOutsideDaysClick", value.asInstanceOf[js.Any])
      
      inline def setEnableOutsideDaysClickUndefined: Self = StObject.set(x, "enableOutsideDaysClick", js.undefined)
      
      inline def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      inline def setFixedWeeks(value: Boolean): Self = StObject.set(x, "fixedWeeks", value.asInstanceOf[js.Any])
      
      inline def setFixedWeeksUndefined: Self = StObject.set(x, "fixedWeeks", js.undefined)
      
      inline def setFromMonth(value: Date): Self = StObject.set(x, "fromMonth", value.asInstanceOf[js.Any])
      
      inline def setFromMonthUndefined: Self = StObject.set(x, "fromMonth", js.undefined)
      
      inline def setInitialMonth(value: Date): Self = StObject.set(x, "initialMonth", value.asInstanceOf[js.Any])
      
      inline def setInitialMonthUndefined: Self = StObject.set(x, "initialMonth", js.undefined)
      
      inline def setLabels(value: NextMonth): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocaleUtils(value: LocaleUtils): Self = StObject.set(x, "localeUtils", value.asInstanceOf[js.Any])
      
      inline def setLocaleUtilsUndefined: Self = StObject.set(x, "localeUtils", js.undefined)
      
      inline def setModifiers(value: PartialModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersStyles(value: js.Object): Self = StObject.set(x, "modifiersStyles", value.asInstanceOf[js.Any])
      
      inline def setModifiersStylesUndefined: Self = StObject.set(x, "modifiersStyles", js.undefined)
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setMonth(value: Date): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      inline def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value :_*))
      
      inline def setNavbarElement(
        value: ReactElement | (ComponentClass[NavbarElementProps, ComponentState]) | SFC[NavbarElementProps]
      ): Self = StObject.set(x, "navbarElement", value.asInstanceOf[js.Any])
      
      inline def setNavbarElementUndefined: Self = StObject.set(x, "navbarElement", js.undefined)
      
      inline def setNumberOfMonths(value: Double): Self = StObject.set(x, "numberOfMonths", value.asInstanceOf[js.Any])
      
      inline def setNumberOfMonthsUndefined: Self = StObject.set(x, "numberOfMonths", js.undefined)
      
      inline def setOnBlur(value: /* e */ FocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCaptionClick(value: (/* month */ Date, /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onCaptionClick", js.Any.fromFunction2(value))
      
      inline def setOnCaptionClickUndefined: Self = StObject.set(x, "onCaptionClick", js.undefined)
      
      inline def setOnDayClick(
        value: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onDayClick", js.Any.fromFunction3(value))
      
      inline def setOnDayClickUndefined: Self = StObject.set(x, "onDayClick", js.undefined)
      
      inline def setOnDayKeyDown(
        value: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ KeyboardEvent[HTMLDivElement]) => Unit
      ): Self = StObject.set(x, "onDayKeyDown", js.Any.fromFunction3(value))
      
      inline def setOnDayKeyDownUndefined: Self = StObject.set(x, "onDayKeyDown", js.undefined)
      
      inline def setOnDayMouseDown(
        value: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onDayMouseDown", js.Any.fromFunction3(value))
      
      inline def setOnDayMouseDownUndefined: Self = StObject.set(x, "onDayMouseDown", js.undefined)
      
      inline def setOnDayMouseEnter(
        value: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onDayMouseEnter", js.Any.fromFunction3(value))
      
      inline def setOnDayMouseEnterUndefined: Self = StObject.set(x, "onDayMouseEnter", js.undefined)
      
      inline def setOnDayMouseLeave(
        value: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onDayMouseLeave", js.Any.fromFunction3(value))
      
      inline def setOnDayMouseLeaveUndefined: Self = StObject.set(x, "onDayMouseLeave", js.undefined)
      
      inline def setOnDayMouseUp(
        value: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onDayMouseUp", js.Any.fromFunction3(value))
      
      inline def setOnDayMouseUpUndefined: Self = StObject.set(x, "onDayMouseUp", js.undefined)
      
      inline def setOnDayTouchEnd(value: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ TouchEvent[HTMLDivElement]) => Unit): Self = StObject.set(x, "onDayTouchEnd", js.Any.fromFunction3(value))
      
      inline def setOnDayTouchEndUndefined: Self = StObject.set(x, "onDayTouchEnd", js.undefined)
      
      inline def setOnDayTouchStart(value: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ TouchEvent[HTMLDivElement]) => Unit): Self = StObject.set(x, "onDayTouchStart", js.Any.fromFunction3(value))
      
      inline def setOnDayTouchStartUndefined: Self = StObject.set(x, "onDayTouchStart", js.undefined)
      
      inline def setOnFocus(value: /* e */ FocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: /* e */ KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnMonthChange(value: /* month */ Date => Unit): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1(value))
      
      inline def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
      
      inline def setOnTodayButtonClick(
        value: (/* day */ Date, /* modifiers */ DayModifiers, /* e */ MouseEvent[HTMLButtonElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onTodayButtonClick", js.Any.fromFunction3(value))
      
      inline def setOnTodayButtonClickUndefined: Self = StObject.set(x, "onTodayButtonClick", js.undefined)
      
      inline def setOnWeekClick(
        value: (/* weekNumber */ Double, /* days */ js.Array[Date], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onWeekClick", js.Any.fromFunction3(value))
      
      inline def setOnWeekClickUndefined: Self = StObject.set(x, "onWeekClick", js.undefined)
      
      inline def setPagedNavigation(value: Boolean): Self = StObject.set(x, "pagedNavigation", value.asInstanceOf[js.Any])
      
      inline def setPagedNavigationUndefined: Self = StObject.set(x, "pagedNavigation", js.undefined)
      
      inline def setRenderDay(value: (/* date */ Date, /* modifiers */ DayModifiers) => ReactNode): Self = StObject.set(x, "renderDay", js.Any.fromFunction2(value))
      
      inline def setRenderDayUndefined: Self = StObject.set(x, "renderDay", js.undefined)
      
      inline def setRenderWeek(value: (/* weekNumber */ Double, /* week */ js.Array[Date], /* month */ Date) => ReactNode): Self = StObject.set(x, "renderWeek", js.Any.fromFunction3(value))
      
      inline def setRenderWeekUndefined: Self = StObject.set(x, "renderWeek", js.undefined)
      
      inline def setReverseMonths(value: Boolean): Self = StObject.set(x, "reverseMonths", value.asInstanceOf[js.Any])
      
      inline def setReverseMonthsUndefined: Self = StObject.set(x, "reverseMonths", js.undefined)
      
      inline def setSelectedDays(value: Modifier | js.Array[Modifier]): Self = StObject.set(x, "selectedDays", value.asInstanceOf[js.Any])
      
      inline def setSelectedDaysFunction1(value: /* date */ Date => Boolean): Self = StObject.set(x, "selectedDays", js.Any.fromFunction1(value))
      
      inline def setSelectedDaysUndefined: Self = StObject.set(x, "selectedDays", js.undefined)
      
      inline def setSelectedDaysVarargs(value: Modifier*): Self = StObject.set(x, "selectedDays", js.Array(value :_*))
      
      inline def setShowOutsideDays(value: Boolean): Self = StObject.set(x, "showOutsideDays", value.asInstanceOf[js.Any])
      
      inline def setShowOutsideDaysUndefined: Self = StObject.set(x, "showOutsideDays", js.undefined)
      
      inline def setShowWeekDays(value: Boolean): Self = StObject.set(x, "showWeekDays", value.asInstanceOf[js.Any])
      
      inline def setShowWeekDaysUndefined: Self = StObject.set(x, "showWeekDays", js.undefined)
      
      inline def setShowWeekNumbers(value: Boolean): Self = StObject.set(x, "showWeekNumbers", value.asInstanceOf[js.Any])
      
      inline def setShowWeekNumbersUndefined: Self = StObject.set(x, "showWeekNumbers", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setToMonth(value: Date): Self = StObject.set(x, "toMonth", value.asInstanceOf[js.Any])
      
      inline def setToMonthUndefined: Self = StObject.set(x, "toMonth", js.undefined)
      
      inline def setTodayButton(value: String): Self = StObject.set(x, "todayButton", value.asInstanceOf[js.Any])
      
      inline def setTodayButtonUndefined: Self = StObject.set(x, "todayButton", js.undefined)
      
      inline def setWeekdayElement(
        value: ReactElement | (ComponentClass[WeekdayElementProps, ComponentState]) | SFC[WeekdayElementProps]
      ): Self = StObject.set(x, "weekdayElement", value.asInstanceOf[js.Any])
      
      inline def setWeekdayElementUndefined: Self = StObject.set(x, "weekdayElement", js.undefined)
      
      inline def setWeekdaysLong(value: js.Array[String]): Self = StObject.set(x, "weekdaysLong", value.asInstanceOf[js.Any])
      
      inline def setWeekdaysLongUndefined: Self = StObject.set(x, "weekdaysLong", js.undefined)
      
      inline def setWeekdaysLongVarargs(value: String*): Self = StObject.set(x, "weekdaysLong", js.Array(value :_*))
      
      inline def setWeekdaysShort(value: js.Array[String]): Self = StObject.set(x, "weekdaysShort", value.asInstanceOf[js.Any])
      
      inline def setWeekdaysShortUndefined: Self = StObject.set(x, "weekdaysShort", js.undefined)
      
      inline def setWeekdaysShortVarargs(value: String*): Self = StObject.set(x, "weekdaysShort", js.Array(value :_*))
    }
  }
  
  @js.native
  trait NavbarElementProps extends StObject {
    
    var className: String = js.native
    
    var classNames: ClassNames = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    var labels: NextMonth = js.native
    
    var locale: String = js.native
    
    var localeUtils: LocaleUtils = js.native
    
    var month: Date = js.native
    
    var nextMonth: Date = js.native
    
    def onNextClick(): Unit = js.native
    def onNextClick(callback: js.Function0[Unit]): Unit = js.native
    
    def onPreviousClick(): Unit = js.native
    def onPreviousClick(callback: js.Function0[Unit]): Unit = js.native
    
    var previousMonth: Date = js.native
    
    var showNextButton: Boolean = js.native
    
    var showPreviousButton: Boolean = js.native
  }
  
  trait WeekdayElementProps extends StObject {
    
    var className: String
    
    var locale: String
    
    var localeUtils: LocaleUtils
    
    var weekday: Double
    
    var weekdaysLong: js.UndefOr[js.Array[String]] = js.undefined
    
    var weekdaysShort: js.UndefOr[js.Array[String]] = js.undefined
  }
  object WeekdayElementProps {
    
    inline def apply(className: String, locale: String, localeUtils: LocaleUtils, weekday: Double): WeekdayElementProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], localeUtils = localeUtils.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any])
      __obj.asInstanceOf[WeekdayElementProps]
    }
    
    extension [Self <: WeekdayElementProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUtils(value: LocaleUtils): Self = StObject.set(x, "localeUtils", value.asInstanceOf[js.Any])
      
      inline def setWeekday(value: Double): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      inline def setWeekdaysLong(value: js.Array[String]): Self = StObject.set(x, "weekdaysLong", value.asInstanceOf[js.Any])
      
      inline def setWeekdaysLongUndefined: Self = StObject.set(x, "weekdaysLong", js.undefined)
      
      inline def setWeekdaysLongVarargs(value: String*): Self = StObject.set(x, "weekdaysLong", js.Array(value :_*))
      
      inline def setWeekdaysShort(value: js.Array[String]): Self = StObject.set(x, "weekdaysShort", value.asInstanceOf[js.Any])
      
      inline def setWeekdaysShortUndefined: Self = StObject.set(x, "weekdaysShort", js.undefined)
      
      inline def setWeekdaysShortVarargs(value: String*): Self = StObject.set(x, "weekdaysShort", js.Array(value :_*))
    }
  }
}
