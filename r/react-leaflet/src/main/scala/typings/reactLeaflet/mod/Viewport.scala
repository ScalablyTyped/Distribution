package typings.reactLeaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewport extends js.Object {
  var center: js.UndefOr[(js.Tuple2[Double, Double]) | Null] = js.undefined
  var zoom: js.UndefOr[Double | Null] = js.undefined
}

object Viewport {
  @scala.inline
  def apply(
    center: js.UndefOr[Null | (js.Tuple2[Double, Double])] = js.undefined,
    zoom: js.UndefOr[Null | Double] = js.undefined
  ): Viewport = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
}

