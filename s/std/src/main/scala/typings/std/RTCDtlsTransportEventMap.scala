package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCDtlsTransportEventMap extends js.Object {
  var error: RTCErrorEvent
  var statechange: Event
}

object RTCDtlsTransportEventMap {
  @scala.inline
  def apply(error: RTCErrorEvent, statechange: Event): RTCDtlsTransportEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDtlsTransportEventMap]
  }
}

