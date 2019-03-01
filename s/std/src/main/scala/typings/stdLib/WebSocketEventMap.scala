package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSocketEventMap extends js.Object {
  var close: CloseEvent
  var error: Event
  var message: MessageEvent
  var open: Event
}

object WebSocketEventMap {
  @scala.inline
  def apply(close: CloseEvent, error: Event, message: MessageEvent, open: Event): WebSocketEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[WebSocketEventMap]
  }
}

