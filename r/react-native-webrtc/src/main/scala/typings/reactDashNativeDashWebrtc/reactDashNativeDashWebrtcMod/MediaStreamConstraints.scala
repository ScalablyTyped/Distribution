package typings.reactDashNativeDashWebrtc.reactDashNativeDashWebrtcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaStreamConstraints extends js.Object {
  var audio: js.UndefOr[Boolean] = js.undefined
  var video: js.UndefOr[Boolean | MediaTrackConstraints] = js.undefined
}

object MediaStreamConstraints {
  @scala.inline
  def apply(audio: js.UndefOr[Boolean] = js.undefined, video: Boolean | MediaTrackConstraints = null): MediaStreamConstraints = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audio)) __obj.updateDynamic("audio")(audio)
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamConstraints]
  }
}

