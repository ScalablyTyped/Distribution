package typings.pubnub.mod

import typings.pubnub.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddMessageActionParameters extends js.Object {
  var action: AnonValue
  var channel: String
  var messageTimetoken: String
}

object AddMessageActionParameters {
  @scala.inline
  def apply(action: AnonValue, channel: String, messageTimetoken: String): AddMessageActionParameters = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], messageTimetoken = messageTimetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddMessageActionParameters]
  }
}

