package typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BubbleValue extends js.Object {
  var marker: js.UndefOr[String] = js.undefined
  var size: Double
  var x: js.UndefOr[Double] = js.undefined
  var y: Double
}

object BubbleValue {
  @scala.inline
  def apply(size: Double, y: Double, marker: String = null, x: Int | Double = null): BubbleValue = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.asInstanceOf[BubbleValue]
  }
}

