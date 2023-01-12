package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.anon.StartTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderContext extends StObject {
  
  var intervals: js.Array[StartTime]
  
  var unit: String
}
object HeaderContext {
  
  inline def apply(intervals: js.Array[StartTime], unit: String): HeaderContext = {
    val __obj = js.Dynamic.literal(intervals = intervals.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeaderContext] (val x: Self) extends AnyVal {
    
    inline def setIntervals(value: js.Array[StartTime]): Self = StObject.set(x, "intervals", value.asInstanceOf[js.Any])
    
    inline def setIntervalsVarargs(value: StartTime*): Self = StObject.set(x, "intervals", js.Array(value*))
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
  }
}
