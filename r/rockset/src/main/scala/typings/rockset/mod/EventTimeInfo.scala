package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventTimeInfo extends StObject {
  
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
  implicit class EventTimeInfoMutableBuilder[Self <: EventTimeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setTime_zone(value: String): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_zoneUndefined: Self = StObject.set(x, "time_zone", js.undefined)
  }
}
