package typings
package stdLib

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gatheringstatechange")(gatheringstatechange)
    __obj.updateDynamic("selectedcandidatepairchange")(selectedcandidatepairchange)
    __obj.updateDynamic("statechange")(statechange)
    __obj.asInstanceOf[RTCIceTransportEventMap]
  }
}

