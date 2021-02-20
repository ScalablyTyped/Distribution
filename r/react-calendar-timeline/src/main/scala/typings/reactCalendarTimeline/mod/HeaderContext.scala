package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.anon.StartTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderContext extends StObject {
  
  var intervals: js.Array[StartTime] = js.native
  
  var unit: String = js.native
}
object HeaderContext {
  
  @scala.inline
  def apply(intervals: js.Array[StartTime], unit: String): HeaderContext = {
    val __obj = js.Dynamic.literal(intervals = intervals.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderContext]
  }
  
  @scala.inline
  implicit class HeaderContextMutableBuilder[Self <: HeaderContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntervals(value: js.Array[StartTime]): Self = StObject.set(x, "intervals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalsVarargs(value: StartTime*): Self = StObject.set(x, "intervals", js.Array(value :_*))
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
  }
}
