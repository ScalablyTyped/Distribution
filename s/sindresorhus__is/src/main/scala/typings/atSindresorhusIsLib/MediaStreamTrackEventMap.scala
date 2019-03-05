package typings
package atSindresorhusIsLib

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
    val __obj = js.Dynamic.literal(ended = ended, isolationchange = isolationchange, mute = mute, overconstrained = overconstrained, unmute = unmute)
  
    __obj.asInstanceOf[MediaStreamTrackEventMap]
  }
}

