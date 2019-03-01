package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCDataChannelEventMap extends js.Object {
  var bufferedamountlow: Event
  var close: Event
  var error: RTCErrorEvent
  var message: MessageEvent
  var open: Event
}

object RTCDataChannelEventMap {
  @scala.inline
  def apply(bufferedamountlow: Event, close: Event, error: RTCErrorEvent, message: MessageEvent, open: Event): RTCDataChannelEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bufferedamountlow")(bufferedamountlow)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[RTCDataChannelEventMap]
  }
}

