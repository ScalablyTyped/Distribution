package typings.pubnub

import typings.pubnub.mod.MessageAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataMessageAction extends js.Object {
  var data: MessageAction
}

object AnonDataMessageAction {
  @scala.inline
  def apply(data: MessageAction): AnonDataMessageAction = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataMessageAction]
  }
}

