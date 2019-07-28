package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BroadcastChannelEventMap extends js.Object {
  var message: MessageEvent
  var messageerror: MessageEvent
}

object BroadcastChannelEventMap {
  @scala.inline
  def apply(message: MessageEvent, messageerror: MessageEvent): BroadcastChannelEventMap = {
    val __obj = js.Dynamic.literal(message = message, messageerror = messageerror)
  
    __obj.asInstanceOf[BroadcastChannelEventMap]
  }
}

