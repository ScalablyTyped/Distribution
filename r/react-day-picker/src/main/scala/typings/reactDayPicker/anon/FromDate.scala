package typings.reactDayPicker.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromDate extends StObject {
  
  var fromDate: js.UndefOr[js.Date] = js.undefined
  
  var toDate: js.UndefOr[js.Date] = js.undefined
}
object FromDate {
  
  inline def apply(): FromDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromDate]
  }
  
  extension [Self <: FromDate](x: Self) {
    
    inline def setFromDate(value: js.Date): Self = StObject.set(x, "fromDate", value.asInstanceOf[js.Any])
    
    inline def setFromDateUndefined: Self = StObject.set(x, "fromDate", js.undefined)
    
    inline def setToDate(value: js.Date): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
    
    inline def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
  }
}
