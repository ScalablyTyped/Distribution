package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCDtlsTransportEventMap extends js.Object {
  var error: RTCErrorEvent = js.native
  var statechange: Event = js.native
}

object RTCDtlsTransportEventMap {
  @scala.inline
  def apply(error: RTCErrorEvent, statechange: Event): RTCDtlsTransportEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDtlsTransportEventMap]
  }
  @scala.inline
  implicit class RTCDtlsTransportEventMapOps[Self <: RTCDtlsTransportEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: RTCErrorEvent): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatechange(value: Event): Self = this.set("statechange", value.asInstanceOf[js.Any])
  }
  
}

