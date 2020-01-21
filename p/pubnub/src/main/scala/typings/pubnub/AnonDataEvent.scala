package typings.pubnub

import typings.pubnub.mod.SpaceData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataEvent extends js.Object {
  var data: SpaceData
  var event: String
  var `type`: String
}

object AnonDataEvent {
  @scala.inline
  def apply(data: SpaceData, event: String, `type`: String): AnonDataEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataEvent]
  }
}

