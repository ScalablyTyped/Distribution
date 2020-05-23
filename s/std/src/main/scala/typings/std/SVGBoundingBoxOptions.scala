package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGBoundingBoxOptions extends js.Object {
  var clipped: js.UndefOr[scala.Boolean] = js.undefined
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  var markers: js.UndefOr[scala.Boolean] = js.undefined
  var stroke: js.UndefOr[scala.Boolean] = js.undefined
}

object SVGBoundingBoxOptions {
  @scala.inline
  def apply(
    clipped: js.UndefOr[scala.Boolean] = js.undefined,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    markers: js.UndefOr[scala.Boolean] = js.undefined,
    stroke: js.UndefOr[scala.Boolean] = js.undefined
  ): SVGBoundingBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clipped)) __obj.updateDynamic("clipped")(clipped.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.get.asInstanceOf[js.Any])
    if (!js.isUndefined(markers)) __obj.updateDynamic("markers")(markers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stroke)) __obj.updateDynamic("stroke")(stroke.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGBoundingBoxOptions]
  }
}

