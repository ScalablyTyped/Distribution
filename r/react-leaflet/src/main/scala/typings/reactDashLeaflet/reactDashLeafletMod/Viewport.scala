package typings.reactDashLeaflet.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewport extends js.Object {
  var center: js.UndefOr[(js.Tuple2[Double, Double]) | Null] = js.undefined
  var zoom: js.UndefOr[Double | Null] = js.undefined
}

object Viewport {
  @scala.inline
  def apply(center: js.Tuple2[Double, Double] = null, zoom: Int | Double = null): Viewport = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
}

