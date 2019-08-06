package typings.staticmaps.staticmapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddPolygonOptions extends AddLineOptions {
  var fill: js.UndefOr[String] = js.undefined
}

object AddPolygonOptions {
  @scala.inline
  def apply(
    coords: js.Array[js.Tuple2[Double, Double]],
    color: String = null,
    fill: String = null,
    width: Int | Double = null
  ): AddPolygonOptions = {
    val __obj = js.Dynamic.literal(coords = coords)
    if (color != null) __obj.updateDynamic("color")(color)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPolygonOptions]
  }
}

