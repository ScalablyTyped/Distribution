package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceTransportEventMap extends js.Object {
  var gatheringstatechange: Event_
  var selectedcandidatepairchange: Event_
  var statechange: Event_
}

object RTCIceTransportEventMap {
  @scala.inline
  def apply(gatheringstatechange: Event_, selectedcandidatepairchange: Event_, statechange: Event_): RTCIceTransportEventMap = {
    val __obj = js.Dynamic.literal(gatheringstatechange = gatheringstatechange.asInstanceOf[js.Any], selectedcandidatepairchange = selectedcandidatepairchange.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RTCIceTransportEventMap]
  }
}

