package typings.reactNativeVideo.mod

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
  def apply(currentTime: Double, seekTime: Double, target: js.UndefOr[Double] = js.undefined): OnSeekData = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], seekTime = seekTime.asInstanceOf[js.Any])
    if (!js.isUndefined(target)) __obj.updateDynamic("target")(target.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSeekData]
  }
}

