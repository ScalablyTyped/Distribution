package typings.serverlessTencentScf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventName extends js.Object {
  
  var eventName: String = js.native
  
  var eventQueue: String = js.native
  
  var eventSource: String = js.native
  
  var eventTime: Double = js.native
  
  var eventVersion: String = js.native
  
  var reqid: Double = js.native
  
  var requestParameters: RequestHeaders = js.native
  
  var reservedInfo: String = js.native
}
object EventName {
  
  @scala.inline
  def apply(
    eventName: String,
    eventQueue: String,
    eventSource: String,
    eventTime: Double,
    eventVersion: String,
    reqid: Double,
    requestParameters: RequestHeaders,
    reservedInfo: String
  ): EventName = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], eventQueue = eventQueue.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], reqid = reqid.asInstanceOf[js.Any], requestParameters = requestParameters.asInstanceOf[js.Any], reservedInfo = reservedInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventName]
  }
  
  @scala.inline
  implicit class EventNameOps[Self <: EventName] (val x: Self) extends AnyVal {
    
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
    def setEventName(value: String): Self = this.set("eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventQueue(value: String): Self = this.set("eventQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSource(value: String): Self = this.set("eventSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTime(value: Double): Self = this.set("eventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventVersion(value: String): Self = this.set("eventVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqid(value: Double): Self = this.set("reqid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestParameters(value: RequestHeaders): Self = this.set("requestParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedInfo(value: String): Self = this.set("reservedInfo", value.asInstanceOf[js.Any])
  }
}
