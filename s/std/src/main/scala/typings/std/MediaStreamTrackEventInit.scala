package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaStreamTrackEventInit extends EventInit {
  var track: MediaStreamTrack
}

object MediaStreamTrackEventInit {
  @scala.inline
  def apply(
    track: MediaStreamTrack,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined
  ): MediaStreamTrackEventInit = {
    val __obj = js.Dynamic.literal(track = track)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    __obj.asInstanceOf[MediaStreamTrackEventInit]
  }
}

