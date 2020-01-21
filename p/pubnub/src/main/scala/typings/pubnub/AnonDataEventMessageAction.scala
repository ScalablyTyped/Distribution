package typings.pubnub

import typings.pubnub.mod.MessageAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataEventMessageAction extends js.Object {
  var data: MessageAction
  var event: String
}

object AnonDataEventMessageAction {
  @scala.inline
  def apply(data: MessageAction, event: String): AnonDataEventMessageAction = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataEventMessageAction]
  }
}

