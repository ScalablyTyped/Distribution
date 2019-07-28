package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceTransportEventMap extends js.Object {
  var gatheringstatechange: Event
  var selectedcandidatepairchange: Event
  var statechange: Event
}

object RTCIceTransportEventMap {
  @scala.inline
  def apply(gatheringstatechange: Event, selectedcandidatepairchange: Event, statechange: Event): RTCIceTransportEventMap = {
    val __obj = js.Dynamic.literal(gatheringstatechange = gatheringstatechange, selectedcandidatepairchange = selectedcandidatepairchange, statechange = statechange)
  
    __obj.asInstanceOf[RTCIceTransportEventMap]
  }
}

