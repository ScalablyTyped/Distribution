package typings.reactDashNativeDashChartsDashWrapper

import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperMod.yAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LeftRight extends js.Object {
  var left: js.UndefOr[yAxis] = js.undefined
  var right: js.UndefOr[yAxis] = js.undefined
}

object Anon_LeftRight {
  @scala.inline
  def apply(left: yAxis = null, right: yAxis = null): Anon_LeftRight = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LeftRight]
  }
}

