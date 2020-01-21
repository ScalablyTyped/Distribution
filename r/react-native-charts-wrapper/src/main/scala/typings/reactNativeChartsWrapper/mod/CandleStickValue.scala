package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CandleStickValue extends js.Object {
  var close: Double
  var marker: js.UndefOr[String] = js.undefined
  var open: Double
  var shadowH: Double
  var shadowL: Double
  var x: js.UndefOr[Double] = js.undefined
}

object CandleStickValue {
  @scala.inline
  def apply(
    close: Double,
    open: Double,
    shadowH: Double,
    shadowL: Double,
    marker: String = null,
    x: Int | Double = null
  ): CandleStickValue = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], shadowH = shadowH.asInstanceOf[js.Any], shadowL = shadowL.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandleStickValue]
  }
}

