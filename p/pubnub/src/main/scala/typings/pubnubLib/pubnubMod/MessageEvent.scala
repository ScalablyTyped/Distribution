package typings
package pubnubLib.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageEvent extends js.Object {
  /**
    * @deprecated
    */
  var actualChannel: java.lang.String
  var channel: java.lang.String
  var message: js.Any
  var publisher: java.lang.String
  /**
    * @deprecated
    */
  var subscribedChannel: java.lang.String
  var subscription: java.lang.String
  var timetoken: java.lang.String
}

object MessageEvent {
  @scala.inline
  def apply(
    actualChannel: java.lang.String,
    channel: java.lang.String,
    message: js.Any,
    publisher: java.lang.String,
    subscribedChannel: java.lang.String,
    subscription: java.lang.String,
    timetoken: java.lang.String
  ): MessageEvent = {
    val __obj = js.Dynamic.literal(actualChannel = actualChannel, channel = channel, message = message, publisher = publisher, subscribedChannel = subscribedChannel, subscription = subscription, timetoken = timetoken)
  
    __obj.asInstanceOf[MessageEvent]
  }
}

