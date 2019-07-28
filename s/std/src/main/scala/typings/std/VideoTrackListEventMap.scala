package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoTrackListEventMap extends js.Object {
  var addtrack: TrackEvent
  var change: Event
  var removetrack: TrackEvent
}

object VideoTrackListEventMap {
  @scala.inline
  def apply(addtrack: TrackEvent, change: Event, removetrack: TrackEvent): VideoTrackListEventMap = {
    val __obj = js.Dynamic.literal(addtrack = addtrack, change = change, removetrack = removetrack)
  
    __obj.asInstanceOf[VideoTrackListEventMap]
  }
}

