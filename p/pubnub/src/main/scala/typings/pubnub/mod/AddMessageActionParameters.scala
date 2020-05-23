package typings.pubnub.mod

import typings.pubnub.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddMessageActionParameters extends js.Object {
  var action: Value
  var channel: String
  var messageTimetoken: String
}

object AddMessageActionParameters {
  @scala.inline
  def apply(action: Value, channel: String, messageTimetoken: String): AddMessageActionParameters = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], messageTimetoken = messageTimetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddMessageActionParameters]
  }
}

