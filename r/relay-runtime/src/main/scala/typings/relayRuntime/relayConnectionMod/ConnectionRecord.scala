package typings.relayRuntime.relayConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionRecord extends js.Object {
  var __id: ConnectionID
  var __typename: String
  var events: js.Array[ConnectionInternalEvent]
}

object ConnectionRecord {
  @scala.inline
  def apply(__id: ConnectionID, __typename: String, events: js.Array[ConnectionInternalEvent]): ConnectionRecord = {
    val __obj = js.Dynamic.literal(__id = __id.asInstanceOf[js.Any], __typename = __typename.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionRecord]
  }
}

