package typings
package reactDashRangeLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITrackBackground extends js.Object {
  var colors: js.Array[java.lang.String]
  var direction: js.UndefOr[Direction] = js.undefined
  var max: scala.Double
  var min: scala.Double
  var values: js.Array[scala.Double]
}

object ITrackBackground {
  @scala.inline
  def apply(
    colors: js.Array[java.lang.String],
    max: scala.Double,
    min: scala.Double,
    values: js.Array[scala.Double],
    direction: Direction = null
  ): ITrackBackground = {
    val __obj = js.Dynamic.literal(colors = colors, max = max, min = min, values = values)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    __obj.asInstanceOf[ITrackBackground]
  }
}

