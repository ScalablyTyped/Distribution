package typings.reactNativeChartsWrapper

import typings.reactNativeChartsWrapper.mod.yAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeftRight extends js.Object {
  var left: js.UndefOr[yAxis] = js.undefined
  var right: js.UndefOr[yAxis] = js.undefined
}

object AnonLeftRight {
  @scala.inline
  def apply(left: yAxis = null, right: yAxis = null): AnonLeftRight = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeftRight]
  }
}

