package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextTrackListEventMap extends js.Object {
  var addtrack: TrackEvent
  var change: Event
  var removetrack: TrackEvent
}

object TextTrackListEventMap {
  @scala.inline
  def apply(addtrack: TrackEvent, change: Event, removetrack: TrackEvent): TextTrackListEventMap = {
    val __obj = js.Dynamic.literal(addtrack = addtrack.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], removetrack = removetrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackListEventMap]
  }
}

