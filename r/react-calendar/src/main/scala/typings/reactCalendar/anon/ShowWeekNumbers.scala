package typings.reactCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowWeekNumbers extends StObject {
  
  var showWeekNumbers: js.UndefOr[Boolean] = js.undefined
}
object ShowWeekNumbers {
  
  inline def apply(): ShowWeekNumbers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowWeekNumbers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShowWeekNumbers] (val x: Self) extends AnyVal {
    
    inline def setShowWeekNumbers(value: Boolean): Self = StObject.set(x, "showWeekNumbers", value.asInstanceOf[js.Any])
    
    inline def setShowWeekNumbersUndefined: Self = StObject.set(x, "showWeekNumbers", js.undefined)
  }
}
