package typings.pubnub

import typings.pubnub.mod.SpaceData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent extends js.Object {
  var data: SpaceData
  var event: String
  var `type`: String
}

object AnonEvent {
  @scala.inline
  def apply(data: SpaceData, event: String, `type`: String): AnonEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEvent]
  }
}

