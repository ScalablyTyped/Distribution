package typings.reactRange.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITrackBackground extends js.Object {
  var colors: js.Array[String]
  var direction: js.UndefOr[Direction] = js.undefined
  var max: Double
  var min: Double
  var rtl: js.UndefOr[Boolean] = js.undefined
  var values: js.Array[Double]
}

object ITrackBackground {
  @scala.inline
  def apply(
    colors: js.Array[String],
    max: Double,
    min: Double,
    values: js.Array[Double],
    direction: Direction = null,
    rtl: js.UndefOr[Boolean] = js.undefined
  ): ITrackBackground = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITrackBackground]
  }
}

