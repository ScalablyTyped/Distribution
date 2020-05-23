package typings.staticmaps.mod

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
    size: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): AddTextOptions = {
    val __obj = js.Dynamic.literal(coord = coord.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTextOptions]
  }
}

