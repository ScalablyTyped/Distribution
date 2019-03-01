package typings
package stdLib

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addtrack")(addtrack)
    __obj.updateDynamic("change")(change)
    __obj.updateDynamic("removetrack")(removetrack)
    __obj.asInstanceOf[AudioTrackListEventMap]
  }
}

