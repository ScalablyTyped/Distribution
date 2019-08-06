package typings.staticmaps.staticmapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTextOptions extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var coord: js.Tuple2[Double, Double]
  var fill: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var text: String
  var width: js.UndefOr[Double] = js.undefined
}

object AddTextOptions {
  @scala.inline
  def apply(
    coord: js.Tuple2[Double, Double],
    text: String,
    color: String = null,
    fill: String = null,
    font: String = null,
    size: Int | Double = null,
    width: Int | Double = null
  ): AddTextOptions = {
    val __obj = js.Dynamic.literal(coord = coord, text = text)
    if (color != null) __obj.updateDynamic("color")(color)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTextOptions]
  }
}

