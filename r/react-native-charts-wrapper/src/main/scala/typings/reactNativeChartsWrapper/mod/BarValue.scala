package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarValue extends js.Object {
  var marker: js.UndefOr[String | js.Array[String]] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double | js.Array[Double]] = js.undefined
}

object BarValue {
  @scala.inline
  def apply(
    marker: String | js.Array[String] = null,
    x: Int | Double = null,
    y: Double | js.Array[Double] = null
  ): BarValue = {
    val __obj = js.Dynamic.literal()
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarValue]
  }
}

