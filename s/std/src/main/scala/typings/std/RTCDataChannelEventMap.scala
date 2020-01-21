package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCDataChannelEventMap extends js.Object {
  var bufferedamountlow: Event_
  var close: Event_
  var error: RTCErrorEvent
  var message: MessageEvent
  var open: Event_
}

object RTCDataChannelEventMap {
  @scala.inline
  def apply(
    bufferedamountlow: Event_,
    close: Event_,
    error: RTCErrorEvent,
    message: MessageEvent,
    open: Event_
  ): RTCDataChannelEventMap = {
    val __obj = js.Dynamic.literal(bufferedamountlow = bufferedamountlow.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RTCDataChannelEventMap]
  }
}

