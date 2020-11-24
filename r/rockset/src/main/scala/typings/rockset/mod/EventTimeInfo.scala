package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventTimeInfo extends js.Object {
  
  // name of the field containing event time
  var field: String = js.native
  
  // format of time field, can be one of: milliseconds_since_epoch, seconds_since_epoch
  var format: js.UndefOr[String] = js.native
  
  // default time zone, in standard IANA format
  var time_zone: js.UndefOr[String] = js.native
}
object EventTimeInfo {
  
  @scala.inline
  def apply(field: String): EventTimeInfo = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTimeInfo]
  }
  
  @scala.inline
  implicit class EventTimeInfoOps[Self <: EventTimeInfo] (val x: Self) extends AnyVal {
    
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setTime_zone(value: String): Self = this.set("time_zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime_zone: Self = this.set("time_zone", js.undefined)
  }
}
