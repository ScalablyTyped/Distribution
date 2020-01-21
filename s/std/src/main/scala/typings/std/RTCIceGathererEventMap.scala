package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceGathererEventMap extends js.Object {
  var error: Event_
  var localcandidate: RTCIceGathererEvent
}

object RTCIceGathererEventMap {
  @scala.inline
  def apply(error: Event_, localcandidate: RTCIceGathererEvent): RTCIceGathererEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], localcandidate = localcandidate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RTCIceGathererEventMap]
  }
}

