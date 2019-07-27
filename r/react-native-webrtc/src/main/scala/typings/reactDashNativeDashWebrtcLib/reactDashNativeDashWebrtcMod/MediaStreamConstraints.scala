package typings
package reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaStreamConstraints extends js.Object {
  var audio: js.UndefOr[scala.Boolean] = js.undefined
  var video: js.UndefOr[scala.Boolean | MediaTrackConstraints] = js.undefined
}

object MediaStreamConstraints {
  @scala.inline
  def apply(
    audio: js.UndefOr[scala.Boolean] = js.undefined,
    video: scala.Boolean | MediaTrackConstraints = null
  ): MediaStreamConstraints = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audio)) __obj.updateDynamic("audio")(audio)
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamConstraints]
  }
}

