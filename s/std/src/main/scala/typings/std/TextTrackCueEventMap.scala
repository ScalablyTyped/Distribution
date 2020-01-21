package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextTrackCueEventMap extends js.Object {
  var enter: Event_
  var exit: Event_
}

object TextTrackCueEventMap {
  @scala.inline
  def apply(enter: Event_, exit: Event_): TextTrackCueEventMap = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextTrackCueEventMap]
  }
}

