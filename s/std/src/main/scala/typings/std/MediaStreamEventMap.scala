package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaStreamEventMap extends js.Object {
  var addtrack: MediaStreamTrackEvent
  var removetrack: MediaStreamTrackEvent
}

object MediaStreamEventMap {
  @scala.inline
  def apply(addtrack: MediaStreamTrackEvent, removetrack: MediaStreamTrackEvent): MediaStreamEventMap = {
    val __obj = js.Dynamic.literal(addtrack = addtrack.asInstanceOf[js.Any], removetrack = removetrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamEventMap]
  }
}

