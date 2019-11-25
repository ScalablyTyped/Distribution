package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextTrackListEventMap extends js.Object {
  var addtrack: TrackEvent
}

object TextTrackListEventMap {
  @scala.inline
  def apply(addtrack: TrackEvent): TextTrackListEventMap = {
    val __obj = js.Dynamic.literal(addtrack = addtrack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextTrackListEventMap]
  }
}

