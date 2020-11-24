package typings.reactInfiniteCalendar.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangedSelection extends js.Object {
  
  var end: Date = js.native
  
  var eventType: EVENT_TYPE = js.native
  
  var start: Date = js.native
}
object RangedSelection {
  
  @scala.inline
  def apply(end: Date, eventType: EVENT_TYPE, start: Date): RangedSelection = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangedSelection]
  }
  
  @scala.inline
  implicit class RangedSelectionOps[Self <: RangedSelection] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: Date): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventType(value: EVENT_TYPE): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Date): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
