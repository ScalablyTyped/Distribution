package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextTrackListEventMap extends js.Object {
  var addtrack: TrackEvent
}

object TextTrackListEventMap {
  @scala.inline
  def apply(addtrack: TrackEvent): TextTrackListEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addtrack")(addtrack)
    __obj.asInstanceOf[TextTrackListEventMap]
  }
}

