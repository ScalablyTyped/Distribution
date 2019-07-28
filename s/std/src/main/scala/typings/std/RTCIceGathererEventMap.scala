package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceGathererEventMap extends js.Object {
  var error: Event
  var localcandidate: RTCIceGathererEvent
}

object RTCIceGathererEventMap {
  @scala.inline
  def apply(error: Event, localcandidate: RTCIceGathererEvent): RTCIceGathererEventMap = {
    val __obj = js.Dynamic.literal(error = error, localcandidate = localcandidate)
  
    __obj.asInstanceOf[RTCIceGathererEventMap]
  }
}

