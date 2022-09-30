package typings.reactDayPicker.mod

import typings.dateFns.mod.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<react-day-picker.react-day-picker.DayPickerBase, 'locale' | 'fromDate' | 'toDate' | 'fromMonth' | 'toMonth' | 'fromYear' | 'toYear' | 'today'> */
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
