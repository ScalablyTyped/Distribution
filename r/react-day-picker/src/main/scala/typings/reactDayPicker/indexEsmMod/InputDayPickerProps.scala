package typings.reactDayPicker.indexEsmMod

import typings.dateFns.mod.Locale
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The props to attach to the DayPicker component when using {@link useInput}. */
/* Inlined std.Pick<react-day-picker.react-day-picker/dist/index.esm.DayPickerSingleProps, 'fromDate' | 'toDate' | 'locale' | 'month' | 'onDayClick' | 'onMonthChange' | 'selected' | 'today'> */
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
