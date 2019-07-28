package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioTrackListEventMap extends js.Object {
  var addtrack: TrackEvent
  var change: Event
  var removetrack: TrackEvent
}

object AudioTrackListEventMap {
  @scala.inline
  def apply(addtrack: TrackEvent, change: Event, removetrack: TrackEvent): AudioTrackListEventMap = {
    val __obj = js.Dynamic.literal(addtrack = addtrack, change = change, removetrack = removetrack)
  
    __obj.asInstanceOf[AudioTrackListEventMap]
  }
}

