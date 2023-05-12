package typings.reactBigCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstDayOfWeek extends StObject {
  
  /**
    * Luxon uses 1 based values for month and weekday
    * So we default to Sunday (7)
    * @default 7
    */
  var firstDayOfWeek: Double
}
object FirstDayOfWeek {
  
  inline def apply(firstDayOfWeek: Double): FirstDayOfWeek = {
    val __obj = js.Dynamic.literal(firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstDayOfWeek]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirstDayOfWeek] (val x: Self) extends AnyVal {
    
    inline def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
  }
}
