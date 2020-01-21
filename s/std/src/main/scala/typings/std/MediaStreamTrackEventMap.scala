package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaStreamTrackEventMap extends js.Object {
  var ended: Event_
  var isolationchange: Event_
  var mute: Event_
  var unmute: Event_
}

object MediaStreamTrackEventMap {
  @scala.inline
  def apply(ended: Event_, isolationchange: Event_, mute: Event_, unmute: Event_): MediaStreamTrackEventMap = {
    val __obj = js.Dynamic.literal(ended = ended.asInstanceOf[js.Any], isolationchange = isolationchange.asInstanceOf[js.Any], mute = mute.asInstanceOf[js.Any], unmute = unmute.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MediaStreamTrackEventMap]
  }
}

