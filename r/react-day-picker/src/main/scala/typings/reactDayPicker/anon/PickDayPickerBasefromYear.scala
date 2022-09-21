package typings.reactDayPicker.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-day-picker.react-day-picker/dist/types/DayPickerBase.DayPickerBase, 'fromYear' | 'toYear' | 'fromDate' | 'toDate' | 'fromMonth' | 'toMonth'> */
trait PickDayPickerBasefromYear extends StObject {
  
  var fromDate: js.UndefOr[js.Date] = js.undefined
  
  var fromMonth: js.UndefOr[js.Date] = js.undefined
  
  var fromYear: js.UndefOr[Double] = js.undefined
  
  var toDate: js.UndefOr[js.Date] = js.undefined
  
  var toMonth: js.UndefOr[js.Date] = js.undefined
  
  var toYear: js.UndefOr[Double] = js.undefined
}
object PickDayPickerBasefromYear {
  
  inline def apply(): PickDayPickerBasefromYear = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickDayPickerBasefromYear]
  }
  
  extension [Self <: PickDayPickerBasefromYear](x: Self) {
    
    inline def setFromDate(value: js.Date): Self = StObject.set(x, "fromDate", value.asInstanceOf[js.Any])
    
    inline def setFromDateUndefined: Self = StObject.set(x, "fromDate", js.undefined)
    
    inline def setFromMonth(value: js.Date): Self = StObject.set(x, "fromMonth", value.asInstanceOf[js.Any])
    
    inline def setFromMonthUndefined: Self = StObject.set(x, "fromMonth", js.undefined)
    
    inline def setFromYear(value: Double): Self = StObject.set(x, "fromYear", value.asInstanceOf[js.Any])
    
    inline def setFromYearUndefined: Self = StObject.set(x, "fromYear", js.undefined)
    
    inline def setToDate(value: js.Date): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
    
    inline def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
    
    inline def setToMonth(value: js.Date): Self = StObject.set(x, "toMonth", value.asInstanceOf[js.Any])
    
    inline def setToMonthUndefined: Self = StObject.set(x, "toMonth", js.undefined)
    
    inline def setToYear(value: Double): Self = StObject.set(x, "toYear", value.asInstanceOf[js.Any])
    
    inline def setToYearUndefined: Self = StObject.set(x, "toYear", js.undefined)
  }
}
