package typings
package stdLib

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addtrack")(addtrack)
    __obj.updateDynamic("change")(change)
    __obj.updateDynamic("removetrack")(removetrack)
    __obj.asInstanceOf[VideoTrackListEventMap]
  }
}

