package typings.reactDashRange.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITrackBackground extends js.Object {
  var colors: js.Array[String]
  var direction: js.UndefOr[Direction] = js.undefined
  var max: Double
  var min: Double
  var values: js.Array[Double]
}

object ITrackBackground {
  @scala.inline
  def apply(
    colors: js.Array[String],
    max: Double,
    min: Double,
    values: js.Array[Double],
    direction: Direction = null
  ): ITrackBackground = {
    val __obj = js.Dynamic.literal(colors = colors, max = max, min = min, values = values)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    __obj.asInstanceOf[ITrackBackground]
  }
}

