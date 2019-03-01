package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaStreamTrackEventMap extends js.Object {
  var ended: MediaStreamErrorEvent
  var isolationchange: Event
  var mute: Event
  var overconstrained: MediaStreamErrorEvent
  var unmute: Event
}

object MediaStreamTrackEventMap {
  @scala.inline
  def apply(
    ended: MediaStreamErrorEvent,
    isolationchange: Event,
    mute: Event,
    overconstrained: MediaStreamErrorEvent,
    unmute: Event
  ): MediaStreamTrackEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ended")(ended)
    __obj.updateDynamic("isolationchange")(isolationchange)
    __obj.updateDynamic("mute")(mute)
    __obj.updateDynamic("overconstrained")(overconstrained)
    __obj.updateDynamic("unmute")(unmute)
    __obj.asInstanceOf[MediaStreamTrackEventMap]
  }
}

