package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextTrackEventMap extends js.Object {
  var cuechange: Event
}

object TextTrackEventMap {
  @scala.inline
  def apply(cuechange: Event): TextTrackEventMap = {
    val __obj = js.Dynamic.literal(cuechange = cuechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackEventMap]
  }
}

