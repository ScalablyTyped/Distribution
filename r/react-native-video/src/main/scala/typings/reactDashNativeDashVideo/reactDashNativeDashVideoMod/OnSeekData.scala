package typings.reactDashNativeDashVideo.reactDashNativeDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSeekData extends js.Object {
  var currentTime: Double
  var seekTime: Double
  var target: js.UndefOr[Double] = js.undefined
}

object OnSeekData {
  @scala.inline
  def apply(currentTime: Double, seekTime: Double, target: Int | Double = null): OnSeekData = {
    val __obj = js.Dynamic.literal(currentTime = currentTime, seekTime = seekTime)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSeekData]
  }
}

