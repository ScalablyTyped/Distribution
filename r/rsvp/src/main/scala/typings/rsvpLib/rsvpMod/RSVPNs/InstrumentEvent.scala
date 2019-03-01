package typings
package rsvpLib.rsvpMod.RSVPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstrumentEvent extends js.Object {
   // guid of promise. Must be globally unique, not just within the implementation
  var childGuid: java.lang.String
   // one of ['created', 'chained', 'fulfilled', 'rejected']
  var detail: js.Any
   // child of child promise (for chained via `then`)
  var eventName: java.lang.String
  var guid: java.lang.String
   // fulfillment value or rejection reason, if applicable
  var label: java.lang.String
   // label passed to promise's constructor
  var timeStamp: scala.Double
}

object InstrumentEvent {
  @scala.inline
  def apply(
    childGuid: java.lang.String,
    detail: js.Any,
    eventName: java.lang.String,
    guid: java.lang.String,
    label: java.lang.String,
    timeStamp: scala.Double
  ): InstrumentEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("childGuid")(childGuid)
    __obj.updateDynamic("detail")(detail)
    __obj.updateDynamic("eventName")(eventName)
    __obj.updateDynamic("guid")(guid)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.asInstanceOf[InstrumentEvent]
  }
}

