package typings.reactDayPicker

import typings.dateFns.mod.Locale
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactDayPicker.eventHandlersMod.DayClickEventHandler
import typings.reactDayPicker.eventHandlersMod.MonthChangeEventHandler
import typings.reactDayPicker.typesModifiersMod.ActiveModifiers
import typings.std.Element
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useInputUseInputMod {
  
  @JSImport("react-day-picker/dist/hooks/useInput/useInput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useInput(): UseInputValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useInput")().asInstanceOf[UseInputValue]
  inline def useInput(options: UseInputOptions): UseInputValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useInput")(options.asInstanceOf[js.Any]).asInstanceOf[UseInputValue]
  
  /* Inlined std.Pick<react-day-picker.react-day-picker/dist/types/DayPickerSingle.DayPickerSingleProps, 'fromDate' | 'toDate' | 'locale' | 'month' | 'onDayClick' | 'onMonthChange' | 'selected' | 'today'> */
  trait InputDayPickerProps extends StObject {
    
    var fromDate: js.UndefOr[js.Date] = js.undefined
    
    var locale: js.UndefOr[Locale] = js.undefined
    
    var month: js.UndefOr[js.Date] = js.undefined
    
    var onDayClick: js.UndefOr[DayClickEventHandler] = js.undefined
    
    var onMonthChange: js.UndefOr[MonthChangeEventHandler] = js.undefined
    
    var selected: js.UndefOr[js.Date] = js.undefined
    
    var toDate: js.UndefOr[js.Date] = js.undefined
    
    var today: js.UndefOr[js.Date] = js.undefined
  }
  object InputDayPickerProps {
    
    inline def apply(): InputDayPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputDayPickerProps]
    }
    
    extension [Self <: InputDayPickerProps](x: Self) {
      
      inline def setFromDate(value: js.Date): Self = StObject.set(x, "fromDate", value.asInstanceOf[js.Any])
      
      inline def setFromDateUndefined: Self = StObject.set(x, "fromDate", js.undefined)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMonth(value: js.Date): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setOnDayClick(
        value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ MouseEvent[Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onDayClick", js.Any.fromFunction3(value))
      
      inline def setOnDayClickUndefined: Self = StObject.set(x, "onDayClick", js.undefined)
      
      inline def setOnMonthChange(value: /* month */ js.Date => Unit): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1(value))
      
      inline def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
      
      inline def setSelected(value: js.Date): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setToDate(value: js.Date): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
      
      inline def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
      
      inline def setToday(value: js.Date): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      inline def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
    }
  }
  
  /* Inlined std.Pick<react.react.InputHTMLAttributes<std.HTMLInputElement>, 'onBlur' | 'onChange' | 'onFocus' | 'value' | 'placeholder'> */
  trait InputHTMLAttributes extends StObject {
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
  }
  object InputHTMLAttributes {
    
    inline def apply(): InputHTMLAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputHTMLAttributes]
    }
    
    extension [Self <: InputHTMLAttributes](x: Self) {
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLInputElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  /* Inlined parent std.Pick<react-day-picker.react-day-picker/dist/types/DayPickerBase.DayPickerBase, 'locale' | 'fromDate' | 'toDate' | 'fromMonth' | 'toMonth' | 'fromYear' | 'toYear' | 'today'> */
  trait UseInputOptions extends StObject {
    
    /** The initially selected date */
    var defaultSelected: js.UndefOr[js.Date] = js.undefined
    
    /** The format string for formatting the input field. See https://date-fns.org/docs/format for a list of format strings. Default to `PP`. */
    var format: js.UndefOr[String] = js.undefined
    
    var fromDate: js.UndefOr[js.Date] = js.undefined
    
    var fromMonth: js.UndefOr[js.Date] = js.undefined
    
    var fromYear: js.UndefOr[Double] = js.undefined
    
    var locale: js.UndefOr[Locale] = js.undefined
    
    /** Make the selection required. */
    var required: js.UndefOr[Boolean] = js.undefined
    
    var toDate: js.UndefOr[js.Date] = js.undefined
    
    var toMonth: js.UndefOr[js.Date] = js.undefined
    
    var toYear: js.UndefOr[Double] = js.undefined
    
    var today: js.UndefOr[js.Date] = js.undefined
  }
  object UseInputOptions {
    
    inline def apply(): UseInputOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseInputOptions]
    }
    
    extension [Self <: UseInputOptions](x: Self) {
      
      inline def setDefaultSelected(value: js.Date): Self = StObject.set(x, "defaultSelected", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedUndefined: Self = StObject.set(x, "defaultSelected", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFromDate(value: js.Date): Self = StObject.set(x, "fromDate", value.asInstanceOf[js.Any])
      
      inline def setFromDateUndefined: Self = StObject.set(x, "fromDate", js.undefined)
      
      inline def setFromMonth(value: js.Date): Self = StObject.set(x, "fromMonth", value.asInstanceOf[js.Any])
      
      inline def setFromMonthUndefined: Self = StObject.set(x, "fromMonth", js.undefined)
      
      inline def setFromYear(value: Double): Self = StObject.set(x, "fromYear", value.asInstanceOf[js.Any])
      
      inline def setFromYearUndefined: Self = StObject.set(x, "fromYear", js.undefined)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setToDate(value: js.Date): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
      
      inline def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
      
      inline def setToMonth(value: js.Date): Self = StObject.set(x, "toMonth", value.asInstanceOf[js.Any])
      
      inline def setToMonthUndefined: Self = StObject.set(x, "toMonth", js.undefined)
      
      inline def setToYear(value: Double): Self = StObject.set(x, "toYear", value.asInstanceOf[js.Any])
      
      inline def setToYearUndefined: Self = StObject.set(x, "toYear", js.undefined)
      
      inline def setToday(value: js.Date): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      inline def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
    }
  }
  
  @js.native
  trait UseInputValue extends StObject {
    
    /** The props to pass to a DayPicker component. */
    var dayPickerProps: InputDayPickerProps = js.native
    
    /** The props to pass to an input field. */
    var inputProps: InputHTMLAttributes = js.native
    
    /** A function to reset to the initial state. */
    def reset(): Unit = js.native
    
    /** A function to set the selected day. */
    def setSelected(): Unit = js.native
    def setSelected(day: js.Date): Unit = js.native
  }
}
