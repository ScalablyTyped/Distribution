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
  def apply(directionalOffsetThreshold: Int | Double = null, velocityThreshold: Int | Double = null): SwipeConfig = {
    val __obj = js.Dynamic.literal()
    if (directionalOffsetThreshold != null) __obj.updateDynamic("directionalOffsetThreshold")(directionalOffsetThreshold.asInstanceOf[js.Any])
    if (velocityThreshold != null) __obj.updateDynamic("velocityThreshold")(velocityThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeConfig]
  }
}

