package typings.staticmaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddMultiPolygonOptions extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var coords: js.Array[js.Array[js.Tuple2[Double, Double]]]
  var fill: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AddMultiPolygonOptions {
  @scala.inline
  def apply(
    coords: js.Array[js.Array[js.Tuple2[Double, Double]]],
    color: String = null,
    fill: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): AddMultiPolygonOptions = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddMultiPolygonOptions]
  }
}

