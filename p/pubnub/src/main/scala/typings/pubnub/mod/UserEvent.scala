package typings.pubnub.mod

import typings.pubnub.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserEvent extends js.Object {
  var channel: String
  var message: AnonData
  var publisher: String
  var subscription: String
  var timetoken: String
}

object UserEvent {
  @scala.inline
  def apply(channel: String, message: AnonData, publisher: String, subscription: String, timetoken: String): UserEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserEvent]
  }
}

