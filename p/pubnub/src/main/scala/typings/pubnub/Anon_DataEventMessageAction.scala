package typings.pubnub

import typings.pubnub.pubnubMod.MessageAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataEventMessageAction extends js.Object {
  var data: MessageAction
  var event: String
}

object Anon_DataEventMessageAction {
  @scala.inline
  def apply(data: MessageAction, event: String): Anon_DataEventMessageAction = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DataEventMessageAction]
  }
}

