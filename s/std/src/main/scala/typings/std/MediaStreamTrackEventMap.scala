package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaStreamTrackEventMap extends js.Object {
  var ended: Event
  var isolationchange: Event
  var mute: Event
  var unmute: Event
}

object MediaStreamTrackEventMap {
  @scala.inline
  def apply(ended: Event, isolationchange: Event, mute: Event, unmute: Event): MediaStreamTrackEventMap = {
    val __obj = js.Dynamic.literal(ended = ended.asInstanceOf[js.Any], isolationchange = isolationchange.asInstanceOf[js.Any], mute = mute.asInstanceOf[js.Any], unmute = unmute.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamTrackEventMap]
  }
}

