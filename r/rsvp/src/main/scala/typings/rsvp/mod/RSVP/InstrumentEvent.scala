package typings.rsvp.mod.RSVP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstrumentEvent extends js.Object {
   // guid of promise. Must be globally unique, not just within the implementation
  var childGuid: String
   // one of ['created', 'chained', 'fulfilled', 'rejected']
  var detail: js.Any
   // child of child promise (for chained via `then`)
  var eventName: String
  var guid: String
   // fulfillment value or rejection reason, if applicable
  var label: String
   // label passed to promise's constructor
  var timeStamp: Double
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
}

