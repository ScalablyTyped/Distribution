package typings.reactCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoToRangeStartOnSelect extends StObject {
  
  var goToRangeStartOnSelect: Boolean
  
  var maxDate: js.Date
  
  var maxDetail: String
  
  var minDate: js.Date
  
  var minDetail: String
  
  var returnValue: String
  
  var showNavigation: Boolean
  
  var showNeighboringMonth: Boolean
}
object GoToRangeStartOnSelect {
  
  inline def apply(
    goToRangeStartOnSelect: Boolean,
    maxDate: js.Date,
    maxDetail: String,
    minDate: js.Date,
    minDetail: String,
    returnValue: String,
    showNavigation: Boolean,
    showNeighboringMonth: Boolean
  ): GoToRangeStartOnSelect = {
    val __obj = js.Dynamic.literal(goToRangeStartOnSelect = goToRangeStartOnSelect.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], maxDetail = maxDetail.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], minDetail = minDetail.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], showNavigation = showNavigation.asInstanceOf[js.Any], showNeighboringMonth = showNeighboringMonth.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoToRangeStartOnSelect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoToRangeStartOnSelect] (val x: Self) extends AnyVal {
    
    inline def setGoToRangeStartOnSelect(value: Boolean): Self = StObject.set(x, "goToRangeStartOnSelect", value.asInstanceOf[js.Any])
    
    inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDetail(value: String): Self = StObject.set(x, "maxDetail", value.asInstanceOf[js.Any])
    
    inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDetail(value: String): Self = StObject.set(x, "minDetail", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: String): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setShowNavigation(value: Boolean): Self = StObject.set(x, "showNavigation", value.asInstanceOf[js.Any])
    
    inline def setShowNeighboringMonth(value: Boolean): Self = StObject.set(x, "showNeighboringMonth", value.asInstanceOf[js.Any])
  }
}
