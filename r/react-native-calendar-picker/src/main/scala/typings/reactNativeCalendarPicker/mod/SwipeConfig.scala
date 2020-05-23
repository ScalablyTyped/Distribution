package typings.reactNativeCalendarPicker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeConfig extends js.Object {
  var directionalOffsetThreshold: js.UndefOr[Double] = js.undefined
  var velocityThreshold: js.UndefOr[Double] = js.undefined
}

object SwipeConfig {
  @scala.inline
  def apply(
    directionalOffsetThreshold: js.UndefOr[Double] = js.undefined,
    velocityThreshold: js.UndefOr[Double] = js.undefined
  ): SwipeConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(directionalOffsetThreshold)) __obj.updateDynamic("directionalOffsetThreshold")(directionalOffsetThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(velocityThreshold)) __obj.updateDynamic("velocityThreshold")(velocityThreshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeConfig]
  }
}

