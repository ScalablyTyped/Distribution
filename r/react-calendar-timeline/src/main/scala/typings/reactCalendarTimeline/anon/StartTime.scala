package typings.reactCalendarTimeline.anon

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartTime extends js.Object {
  
  var endTime: Moment = js.native
  
  var startTime: Moment = js.native
}
object StartTime {
  
  @scala.inline
  def apply(endTime: Moment, startTime: Moment): StartTime = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTime]
  }
  
  @scala.inline
  implicit class StartTimeOps[Self <: StartTime] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: Moment): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Moment): Self = this.set("startTime", value.asInstanceOf[js.Any])
  }
}
