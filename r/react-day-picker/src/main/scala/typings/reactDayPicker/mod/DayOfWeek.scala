package typings.reactDayPicker.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A matcher to match a date being one of the specified days of the week (`0-7`, where `0` is Sunday). */
trait DayOfWeek
  extends StObject
     with _Matcher {
  
  var dayOfWeek: js.Array[Double]
}
object DayOfWeek {
  
  inline def apply(dayOfWeek: js.Array[Double]): DayOfWeek = {
    val __obj = js.Dynamic.literal(dayOfWeek = dayOfWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayOfWeek]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DayOfWeek] (val x: Self) extends AnyVal {
    
    inline def setDayOfWeek(value: js.Array[Double]): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekVarargs(value: Double*): Self = StObject.set(x, "dayOfWeek", js.Array(value*))
  }
}
