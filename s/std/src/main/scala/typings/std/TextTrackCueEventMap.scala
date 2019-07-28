package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextTrackCueEventMap extends js.Object {
  var enter: Event
  var exit: Event
}

object TextTrackCueEventMap {
  @scala.inline
  def apply(enter: Event, exit: Event): TextTrackCueEventMap = {
    val __obj = js.Dynamic.literal(enter = enter, exit = exit)
  
    __obj.asInstanceOf[TextTrackCueEventMap]
  }
}

