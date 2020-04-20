package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageEvent extends js.Object {
  /**
    * @deprecated
    */
  var actualChannel: String
  var channel: String
  var message: js.Any
  var publisher: String
  /**
    * @deprecated
    */
  var subscribedChannel: String
  var subscription: String
  var timetoken: String
}

object MessageEvent {
  @scala.inline
  def apply(
    actualChannel: String,
    channel: String,
    message: js.Any,
    publisher: String,
    subscribedChannel: String,
    subscription: String,
    timetoken: String
  ): MessageEvent = {
    val __obj = js.Dynamic.literal(actualChannel = actualChannel.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], subscribedChannel = subscribedChannel.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEvent]
  }
}

