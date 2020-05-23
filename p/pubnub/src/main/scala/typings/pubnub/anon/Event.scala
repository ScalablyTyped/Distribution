package typings.pubnub.anon

import typings.pubnub.mod.SpaceData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var data: SpaceData
  var event: String
  var `type`: String
}

object Event {
  @scala.inline
  def apply(data: SpaceData, event: String, `type`: String): Event = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

