package typings.rsvp.mod.RSVP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstrumentEvent extends js.Object {
  
   // guid of promise. Must be globally unique, not just within the implementation
  var childGuid: String = js.native
  
   // one of ['created', 'chained', 'fulfilled', 'rejected']
  var detail: js.Any = js.native
  
   // child of child promise (for chained via `then`)
  var eventName: String = js.native
  
  var guid: String = js.native
  
   // fulfillment value or rejection reason, if applicable
  var label: String = js.native
  
   // label passed to promise's constructor
  var timeStamp: Double = js.native
}
object InstrumentEvent {
  
  @scala.inline
  def apply(
    childGuid: String,
    detail: js.Any,
    eventName: String,
    guid: String,
    label: String,
    timeStamp: Double
  ): InstrumentEvent = {
    val __obj = js.Dynamic.literal(childGuid = childGuid.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstrumentEvent]
  }
  
  @scala.inline
  implicit class InstrumentEventOps[Self <: InstrumentEvent] (val x: Self) extends AnyVal {
    
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
    def setChildGuid(value: String): Self = this.set("childGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetail(value: js.Any): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventName(value: String): Self = this.set("eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuid(value: String): Self = this.set("guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
  }
}
