package typings.pubnub.pubnubMod

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
    val __obj = js.Dynamic.literal(actualChannel = actualChannel, channel = channel, message = message, publisher = publisher, subscribedChannel = subscribedChannel, subscription = subscription, timetoken = timetoken)
  
    __obj.asInstanceOf[MessageEvent]
  }
}

