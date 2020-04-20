package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePortEventMap extends js.Object {
  var message: MessageEvent
  var messageerror: MessageEvent
}

object MessagePortEventMap {
  @scala.inline
  def apply(message: MessageEvent, messageerror: MessageEvent): MessagePortEventMap = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePortEventMap]
  }
}

