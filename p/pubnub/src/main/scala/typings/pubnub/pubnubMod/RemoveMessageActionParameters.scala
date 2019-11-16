package typings.pubnub.pubnubMod

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
    val __obj = js.Dynamic.literal(actionTimetoken = actionTimetoken, channel = channel, messageTimetoken = messageTimetoken)
  
    __obj.asInstanceOf[RemoveMessageActionParameters]
  }
}

