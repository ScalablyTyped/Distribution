package typings.reactCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveStartDateDate extends StObject {
  
  var activeStartDate: js.Date
}
object ActiveStartDateDate {
  
  inline def apply(activeStartDate: js.Date): ActiveStartDateDate = {
    val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveStartDateDate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveStartDateDate] (val x: Self) extends AnyVal {
    
    inline def setActiveStartDate(value: js.Date): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
  }
}
