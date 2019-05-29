package typings
package reactDashNativeDashVideoLib.reactDashNativeDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSeekData extends js.Object {
  var currentTime: scala.Double
  var seekTime: scala.Double
  var target: js.UndefOr[scala.Double] = js.undefined
}

object OnSeekData {
  @scala.inline
  def apply(currentTime: scala.Double, seekTime: scala.Double, target: scala.Int | scala.Double = null): OnSeekData = {
    val __obj = js.Dynamic.literal(currentTime = currentTime, seekTime = seekTime)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSeekData]
  }
}

