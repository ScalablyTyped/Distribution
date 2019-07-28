package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackEventInit extends EventInit {
  var track: js.UndefOr[VideoTrack | AudioTrack | TextTrack | Null] = js.undefined
}

object TrackEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    track: VideoTrack | AudioTrack | TextTrack = null
  ): TrackEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackEventInit]
  }
}

