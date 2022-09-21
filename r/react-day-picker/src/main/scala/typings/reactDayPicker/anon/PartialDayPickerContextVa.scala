package typings.reactDayPicker.anon

import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.TouchEvent
import typings.reactDayPicker.captionCaptionMod.CaptionLayout
import typings.reactDayPicker.dayPickerBaseMod.CustomComponents
import typings.reactDayPicker.dayPickerBaseMod.DaySelectionMode
import typings.reactDayPicker.eventHandlersMod.DayClickEventHandler
import typings.reactDayPicker.eventHandlersMod.DayFocusEventHandler
import typings.reactDayPicker.eventHandlersMod.DayKeyboardEventHandler
import typings.reactDayPicker.eventHandlersMod.DayMouseEventHandler
import typings.reactDayPicker.eventHandlersMod.DayTouchEventHandler
import typings.reactDayPicker.eventHandlersMod.MonthChangeEventHandler
import typings.reactDayPicker.eventHandlersMod.SelectMultipleEventHandler
import typings.reactDayPicker.eventHandlersMod.SelectRangeEventHandler
import typings.reactDayPicker.eventHandlersMod.SelectSingleEventHandler
import typings.reactDayPicker.eventHandlersMod.WeekNumberClickEventHandler
import typings.reactDayPicker.matchersMod.DateRange
import typings.reactDayPicker.matchersMod.Matcher
import typings.reactDayPicker.reactDayPickerNumbers.`3`
import typings.reactDayPicker.reactDayPickerNumbers.`4`
import typings.reactDayPicker.reactDayPickerNumbers.`5`
import typings.reactDayPicker.reactDayPickerNumbers.`6`
import typings.reactDayPicker.stylesMod.Styles
import typings.reactDayPicker.typesFormattersMod.Formatters
import typings.reactDayPicker.typesLabelsMod.Labels
import typings.reactDayPicker.typesModifiersMod.ActiveModifiers
import typings.reactDayPicker.typesModifiersMod.DayModifiers
import typings.reactDayPicker.typesModifiersMod.ModifiersClassNames
import typings.reactDayPicker.typesModifiersMod.ModifiersStyles
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-day-picker.react-day-picker/dist/contexts/DayPicker.DayPickerContextValue> */
trait PartialDayPickerContextVa extends StObject {
  
  var captionLayout: js.UndefOr[CaptionLayout] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var classNames: js.UndefOr[RequiredClassNames] = js.undefined
  
  var components: js.UndefOr[CustomComponents] = js.undefined
  
  var defaultMonth: js.UndefOr[js.Date] = js.undefined
  
  var dir: js.UndefOr[String] = js.undefined
  
  var disableNavigation: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Matcher | js.Array[Matcher]] = js.undefined
  
  var fixedWeeks: js.UndefOr[Boolean] = js.undefined
  
  var footer: js.UndefOr[ReactNode] = js.undefined
  
  var formatters: js.UndefOr[Formatters] = js.undefined
  
  var fromDate: js.UndefOr[js.Date] = js.undefined
  
  var fromMonth: js.UndefOr[js.Date] = js.undefined
  
  var fromYear: js.UndefOr[Double] = js.undefined
  
  var hidden: js.UndefOr[Matcher | js.Array[Matcher]] = js.undefined
  
  var hideHead: js.UndefOr[Boolean] = js.undefined
  
  var initialFocus: js.UndefOr[Boolean] = js.undefined
  
  var labels: js.UndefOr[Labels] = js.undefined
  
  var locale: js.UndefOr[typings.dateFns.Locale] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[DaySelectionMode] = js.undefined
  
  var modifiers: js.UndefOr[DayModifiers] = js.undefined
  
  var modifiersClassNames: js.UndefOr[ModifiersClassNames] = js.undefined
  
  var modifiersStyles: js.UndefOr[ModifiersStyles] = js.undefined
  
  var month: js.UndefOr[js.Date] = js.undefined
  
  var numberOfMonths: js.UndefOr[Double] = js.undefined
  
  var onDayBlur: js.UndefOr[DayFocusEventHandler] = js.undefined
  
  var onDayClick: js.UndefOr[DayClickEventHandler] = js.undefined
  
  var onDayFocus: js.UndefOr[DayFocusEventHandler] = js.undefined
  
  var onDayKeyDown: js.UndefOr[DayKeyboardEventHandler] = js.undefined
  
  var onDayKeyPress: js.UndefOr[DayKeyboardEventHandler] = js.undefined
  
  var onDayKeyUp: js.UndefOr[DayKeyboardEventHandler] = js.undefined
  
  var onDayMouseEnter: js.UndefOr[DayMouseEventHandler] = js.undefined
  
  var onDayMouseLeave: js.UndefOr[DayMouseEventHandler] = js.undefined
  
  var onDayTouchCancel: js.UndefOr[DayTouchEventHandler] = js.undefined
  
  var onDayTouchEnd: js.UndefOr[DayTouchEventHandler] = js.undefined
  
  var onDayTouchMove: js.UndefOr[DayTouchEventHandler] = js.undefined
  
  var onDayTouchStart: js.UndefOr[DayTouchEventHandler] = js.undefined
  
  var onMonthChange: js.UndefOr[MonthChangeEventHandler] = js.undefined
  
  var onNextClick: js.UndefOr[MonthChangeEventHandler] = js.undefined
  
  var onPrevClick: js.UndefOr[MonthChangeEventHandler] = js.undefined
  
  var onSelect: js.UndefOr[SelectSingleEventHandler | SelectMultipleEventHandler | SelectRangeEventHandler] = js.undefined
  
  var onWeekNumberClick: js.UndefOr[WeekNumberClickEventHandler] = js.undefined
  
  var pagedNavigation: js.UndefOr[Boolean] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var reverseMonths: js.UndefOr[Boolean] = js.undefined
  
  var selected: js.UndefOr[Matcher | js.Array[Matcher]] = js.undefined
  
  var showOutsideDays: js.UndefOr[Boolean] = js.undefined
  
  var showWeekNumber: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var styles: js.UndefOr[Styles] = js.undefined
  
  var toDate: js.UndefOr[js.Date] = js.undefined
  
  var toMonth: js.UndefOr[js.Date] = js.undefined
  
  var toYear: js.UndefOr[Double] = js.undefined
  
  var today: js.UndefOr[js.Date] = js.undefined
  
  var weekStartsOn: js.UndefOr[
    typings.reactDayPicker.reactDayPickerNumbers.`0` | typings.reactDayPicker.reactDayPickerNumbers.`1` | typings.reactDayPicker.reactDayPickerNumbers.`2` | `3` | `4` | `5` | `6`
  ] = js.undefined
}
object PartialDayPickerContextVa {
  
  inline def apply(): PartialDayPickerContextVa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDayPickerContextVa]
  }
  
  extension [Self <: PartialDayPickerContextVa](x: Self) {
    
    inline def setCaptionLayout(value: CaptionLayout): Self = StObject.set(x, "captionLayout", value.asInstanceOf[js.Any])
    
    inline def setCaptionLayoutUndefined: Self = StObject.set(x, "captionLayout", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClassNames(value: RequiredClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    inline def setComponents(value: CustomComponents): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setDefaultMonth(value: js.Date): Self = StObject.set(x, "defaultMonth", value.asInstanceOf[js.Any])
    
    inline def setDefaultMonthUndefined: Self = StObject.set(x, "defaultMonth", js.undefined)
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setDisableNavigation(value: Boolean): Self = StObject.set(x, "disableNavigation", value.asInstanceOf[js.Any])
    
    inline def setDisableNavigationUndefined: Self = StObject.set(x, "disableNavigation", js.undefined)
    
    inline def setDisabled(value: Matcher | js.Array[Matcher]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledFunction1(value: /* date */ js.Date => Boolean): Self = StObject.set(x, "disabled", js.Any.fromFunction1(value))
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisabledVarargs(value: (js.Date | Matcher)*): Self = StObject.set(x, "disabled", js.Array(value*))
    
    inline def setFixedWeeks(value: Boolean): Self = StObject.set(x, "fixedWeeks", value.asInstanceOf[js.Any])
    
    inline def setFixedWeeksUndefined: Self = StObject.set(x, "fixedWeeks", js.undefined)
    
    inline def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFormatters(value: Formatters): Self = StObject.set(x, "formatters", value.asInstanceOf[js.Any])
    
    inline def setFormattersUndefined: Self = StObject.set(x, "formatters", js.undefined)
    
    inline def setFromDate(value: js.Date): Self = StObject.set(x, "fromDate", value.asInstanceOf[js.Any])
    
    inline def setFromDateUndefined: Self = StObject.set(x, "fromDate", js.undefined)
    
    inline def setFromMonth(value: js.Date): Self = StObject.set(x, "fromMonth", value.asInstanceOf[js.Any])
    
    inline def setFromMonthUndefined: Self = StObject.set(x, "fromMonth", js.undefined)
    
    inline def setFromYear(value: Double): Self = StObject.set(x, "fromYear", value.asInstanceOf[js.Any])
    
    inline def setFromYearUndefined: Self = StObject.set(x, "fromYear", js.undefined)
    
    inline def setHidden(value: Matcher | js.Array[Matcher]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenFunction1(value: /* date */ js.Date => Boolean): Self = StObject.set(x, "hidden", js.Any.fromFunction1(value))
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setHiddenVarargs(value: (js.Date | Matcher)*): Self = StObject.set(x, "hidden", js.Array(value*))
    
    inline def setHideHead(value: Boolean): Self = StObject.set(x, "hideHead", value.asInstanceOf[js.Any])
    
    inline def setHideHeadUndefined: Self = StObject.set(x, "hideHead", js.undefined)
    
    inline def setInitialFocus(value: Boolean): Self = StObject.set(x, "initialFocus", value.asInstanceOf[js.Any])
    
    inline def setInitialFocusUndefined: Self = StObject.set(x, "initialFocus", js.undefined)
    
    inline def setLabels(value: Labels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLocale(value: typings.dateFns.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMode(value: DaySelectionMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setModifiers(value: DayModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersClassNames(value: ModifiersClassNames): Self = StObject.set(x, "modifiersClassNames", value.asInstanceOf[js.Any])
    
    inline def setModifiersClassNamesUndefined: Self = StObject.set(x, "modifiersClassNames", js.undefined)
    
    inline def setModifiersStyles(value: ModifiersStyles): Self = StObject.set(x, "modifiersStyles", value.asInstanceOf[js.Any])
    
    inline def setModifiersStylesUndefined: Self = StObject.set(x, "modifiersStyles", js.undefined)
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setMonth(value: js.Date): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setNumberOfMonths(value: Double): Self = StObject.set(x, "numberOfMonths", value.asInstanceOf[js.Any])
    
    inline def setNumberOfMonthsUndefined: Self = StObject.set(x, "numberOfMonths", js.undefined)
    
    inline def setOnDayBlur(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ (FocusEvent[Element, Element]) | KeyboardEvent[Element]) => Unit
    ): Self = StObject.set(x, "onDayBlur", js.Any.fromFunction3(value))
    
    inline def setOnDayBlurUndefined: Self = StObject.set(x, "onDayBlur", js.undefined)
    
    inline def setOnDayClick(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ MouseEvent[Element, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onDayClick", js.Any.fromFunction3(value))
    
    inline def setOnDayClickUndefined: Self = StObject.set(x, "onDayClick", js.undefined)
    
    inline def setOnDayFocus(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ (FocusEvent[Element, Element]) | KeyboardEvent[Element]) => Unit
    ): Self = StObject.set(x, "onDayFocus", js.Any.fromFunction3(value))
    
    inline def setOnDayFocusUndefined: Self = StObject.set(x, "onDayFocus", js.undefined)
    
    inline def setOnDayKeyDown(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ KeyboardEvent[Element]) => Unit
    ): Self = StObject.set(x, "onDayKeyDown", js.Any.fromFunction3(value))
    
    inline def setOnDayKeyDownUndefined: Self = StObject.set(x, "onDayKeyDown", js.undefined)
    
    inline def setOnDayKeyPress(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ KeyboardEvent[Element]) => Unit
    ): Self = StObject.set(x, "onDayKeyPress", js.Any.fromFunction3(value))
    
    inline def setOnDayKeyPressUndefined: Self = StObject.set(x, "onDayKeyPress", js.undefined)
    
    inline def setOnDayKeyUp(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ KeyboardEvent[Element]) => Unit
    ): Self = StObject.set(x, "onDayKeyUp", js.Any.fromFunction3(value))
    
    inline def setOnDayKeyUpUndefined: Self = StObject.set(x, "onDayKeyUp", js.undefined)
    
    inline def setOnDayMouseEnter(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ MouseEvent[Element, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onDayMouseEnter", js.Any.fromFunction3(value))
    
    inline def setOnDayMouseEnterUndefined: Self = StObject.set(x, "onDayMouseEnter", js.undefined)
    
    inline def setOnDayMouseLeave(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ MouseEvent[Element, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onDayMouseLeave", js.Any.fromFunction3(value))
    
    inline def setOnDayMouseLeaveUndefined: Self = StObject.set(x, "onDayMouseLeave", js.undefined)
    
    inline def setOnDayTouchCancel(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ TouchEvent[Element]) => Unit
    ): Self = StObject.set(x, "onDayTouchCancel", js.Any.fromFunction3(value))
    
    inline def setOnDayTouchCancelUndefined: Self = StObject.set(x, "onDayTouchCancel", js.undefined)
    
    inline def setOnDayTouchEnd(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ TouchEvent[Element]) => Unit
    ): Self = StObject.set(x, "onDayTouchEnd", js.Any.fromFunction3(value))
    
    inline def setOnDayTouchEndUndefined: Self = StObject.set(x, "onDayTouchEnd", js.undefined)
    
    inline def setOnDayTouchMove(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ TouchEvent[Element]) => Unit
    ): Self = StObject.set(x, "onDayTouchMove", js.Any.fromFunction3(value))
    
    inline def setOnDayTouchMoveUndefined: Self = StObject.set(x, "onDayTouchMove", js.undefined)
    
    inline def setOnDayTouchStart(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ TouchEvent[Element]) => Unit
    ): Self = StObject.set(x, "onDayTouchStart", js.Any.fromFunction3(value))
    
    inline def setOnDayTouchStartUndefined: Self = StObject.set(x, "onDayTouchStart", js.undefined)
    
    inline def setOnMonthChange(value: /* month */ js.Date => Unit): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1(value))
    
    inline def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
    
    inline def setOnNextClick(value: /* month */ js.Date => Unit): Self = StObject.set(x, "onNextClick", js.Any.fromFunction1(value))
    
    inline def setOnNextClickUndefined: Self = StObject.set(x, "onNextClick", js.undefined)
    
    inline def setOnPrevClick(value: /* month */ js.Date => Unit): Self = StObject.set(x, "onPrevClick", js.Any.fromFunction1(value))
    
    inline def setOnPrevClickUndefined: Self = StObject.set(x, "onPrevClick", js.undefined)
    
    inline def setOnSelect(
      value: (js.UndefOr[js.Array[js.Date] | js.Date | DateRange], /* selectedDay */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ MouseEvent[Element, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onSelect", js.Any.fromFunction4(value))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setOnWeekNumberClick(
      value: (/* weekNumber */ Double, /* dates */ js.Array[js.Date], /* e */ MouseEvent[Element, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onWeekNumberClick", js.Any.fromFunction3(value))
    
    inline def setOnWeekNumberClickUndefined: Self = StObject.set(x, "onWeekNumberClick", js.undefined)
    
    inline def setPagedNavigation(value: Boolean): Self = StObject.set(x, "pagedNavigation", value.asInstanceOf[js.Any])
    
    inline def setPagedNavigationUndefined: Self = StObject.set(x, "pagedNavigation", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setReverseMonths(value: Boolean): Self = StObject.set(x, "reverseMonths", value.asInstanceOf[js.Any])
    
    inline def setReverseMonthsUndefined: Self = StObject.set(x, "reverseMonths", js.undefined)
    
    inline def setSelected(value: Matcher | js.Array[Matcher]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedFunction1(value: /* date */ js.Date => Boolean): Self = StObject.set(x, "selected", js.Any.fromFunction1(value))
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSelectedVarargs(value: (js.Date | Matcher)*): Self = StObject.set(x, "selected", js.Array(value*))
    
    inline def setShowOutsideDays(value: Boolean): Self = StObject.set(x, "showOutsideDays", value.asInstanceOf[js.Any])
    
    inline def setShowOutsideDaysUndefined: Self = StObject.set(x, "showOutsideDays", js.undefined)
    
    inline def setShowWeekNumber(value: Boolean): Self = StObject.set(x, "showWeekNumber", value.asInstanceOf[js.Any])
    
    inline def setShowWeekNumberUndefined: Self = StObject.set(x, "showWeekNumber", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyles(value: Styles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setToDate(value: js.Date): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
    
    inline def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
    
    inline def setToMonth(value: js.Date): Self = StObject.set(x, "toMonth", value.asInstanceOf[js.Any])
    
    inline def setToMonthUndefined: Self = StObject.set(x, "toMonth", js.undefined)
    
    inline def setToYear(value: Double): Self = StObject.set(x, "toYear", value.asInstanceOf[js.Any])
    
    inline def setToYearUndefined: Self = StObject.set(x, "toYear", js.undefined)
    
    inline def setToday(value: js.Date): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
    
    inline def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
    
    inline def setWeekStartsOn(
      value: typings.reactDayPicker.reactDayPickerNumbers.`0` | typings.reactDayPicker.reactDayPickerNumbers.`1` | typings.reactDayPicker.reactDayPickerNumbers.`2` | `3` | `4` | `5` | `6`
    ): Self = StObject.set(x, "weekStartsOn", value.asInstanceOf[js.Any])
    
    inline def setWeekStartsOnUndefined: Self = StObject.set(x, "weekStartsOn", js.undefined)
  }
}
