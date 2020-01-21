package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveMessageActionParameters extends js.Object {
  var actionTimetoken: String
  var channel: String
  var messageTimetoken: String
}

object RemoveMessageActionParameters {
  @scala.inline
  def apply(actionTimetoken: String, channel: String, messageTimetoken: String): RemoveMessageActionParameters = {
    val __obj = js.Dynamic.literal(actionTimetoken = actionTimetoken.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], messageTimetoken = messageTimetoken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveMessageActionParameters]
  }
}

