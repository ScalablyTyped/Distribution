package typings.reactDayPicker.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableNavigation extends StObject {
  
  var disableNavigation: js.UndefOr[Boolean] = js.undefined
  
  var fromDate: js.UndefOr[js.Date] = js.undefined
  
  var numberOfMonths: js.UndefOr[Double] = js.undefined
  
  var pagedNavigation: js.UndefOr[Boolean] = js.undefined
  
  var toDate: js.UndefOr[js.Date] = js.undefined
  
  var today: js.UndefOr[js.Date] = js.undefined
}
object DisableNavigation {
  
  inline def apply(): DisableNavigation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableNavigation]
  }
  
  extension [Self <: DisableNavigation](x: Self) {
    
    inline def setDisableNavigation(value: Boolean): Self = StObject.set(x, "disableNavigation", value.asInstanceOf[js.Any])
    
    inline def setDisableNavigationUndefined: Self = StObject.set(x, "disableNavigation", js.undefined)
    
    inline def setFromDate(value: js.Date): Self = StObject.set(x, "fromDate", value.asInstanceOf[js.Any])
    
    inline def setFromDateUndefined: Self = StObject.set(x, "fromDate", js.undefined)
    
    inline def setNumberOfMonths(value: Double): Self = StObject.set(x, "numberOfMonths", value.asInstanceOf[js.Any])
    
    inline def setNumberOfMonthsUndefined: Self = StObject.set(x, "numberOfMonths", js.undefined)
    
    inline def setPagedNavigation(value: Boolean): Self = StObject.set(x, "pagedNavigation", value.asInstanceOf[js.Any])
    
    inline def setPagedNavigationUndefined: Self = StObject.set(x, "pagedNavigation", js.undefined)
    
    inline def setToDate(value: js.Date): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
    
    inline def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
    
    inline def setToday(value: js.Date): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
    
    inline def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
  }
}
