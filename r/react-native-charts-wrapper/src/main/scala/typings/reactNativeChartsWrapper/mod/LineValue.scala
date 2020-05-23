package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineValue extends js.Object {
  var marker: js.UndefOr[String] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: Double
}

object LineValue {
  @scala.inline
  def apply(y: Double, marker: String = null, x: js.UndefOr[Double] = js.undefined): LineValue = {
    val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineValue]
  }
}

