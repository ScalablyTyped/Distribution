package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.anon.StartTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderContext extends js.Object {
  
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
  implicit class HeaderContextOps[Self <: HeaderContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIntervalsVarargs(value: StartTime*): Self = this.set("intervals", js.Array(value :_*))
    
    @scala.inline
    def setIntervals(value: js.Array[StartTime]): Self = this.set("intervals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
  }
}
