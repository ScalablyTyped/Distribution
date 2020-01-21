package typings.reactSimpleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectionConfig extends js.Object {
  var precision: js.UndefOr[Double] = js.undefined
  var rotate: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var xOffset: js.UndefOr[Double] = js.undefined
  var yOffset: js.UndefOr[Double] = js.undefined
}

object ProjectionConfig {
  @scala.inline
  def apply(
    precision: Int | Double = null,
    rotate: js.Tuple3[Double, Double, Double] = null,
    scale: Int | Double = null,
    xOffset: Int | Double = null,
    yOffset: Int | Double = null
  ): ProjectionConfig = {
    val __obj = js.Dynamic.literal()
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (xOffset != null) __obj.updateDynamic("xOffset")(xOffset.asInstanceOf[js.Any])
    if (yOffset != null) __obj.updateDynamic("yOffset")(yOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectionConfig]
  }
}

