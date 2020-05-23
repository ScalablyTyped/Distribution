package typings.reactNativeChartsWrapper.anon

import typings.reactNativeChartsWrapper.mod.yAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Right extends js.Object {
  var left: js.UndefOr[yAxis] = js.undefined
  var right: js.UndefOr[yAxis] = js.undefined
}

object Right {
  @scala.inline
  def apply(left: yAxis = null, right: yAxis = null): Right = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Right]
  }
}

