package typings.pubnub

import typings.pubnub.mod.MessageAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataEvent extends js.Object {
  var data: MessageAction
  var event: String
}

object AnonDataEvent {
  @scala.inline
  def apply(data: MessageAction, event: String): AnonDataEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataEvent]
  }
}

