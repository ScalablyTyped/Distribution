package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventList extends js.Object {
  /** EventList events */
  var events: js.UndefOr[js.Array[IEvent] | Null] = js.undefined
}

object IEventList {
  @scala.inline
  def apply(events: js.Array[IEvent] = null): IEventList = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventList]
  }
}

