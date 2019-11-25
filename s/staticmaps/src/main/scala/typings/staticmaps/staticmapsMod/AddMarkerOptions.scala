package typings.staticmaps.staticmapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddMarkerOptions extends js.Object {
  var coord: js.Tuple2[Double, Double]
  var height: Double
  var img: String
  var offsetX: js.UndefOr[Double] = js.undefined
  var offsetY: js.UndefOr[Double] = js.undefined
  var width: Double
}

object AddMarkerOptions {
  @scala.inline
  def apply(
    coord: js.Tuple2[Double, Double],
    height: Double,
    img: String,
    width: Double,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null
  ): AddMarkerOptions = {
    val __obj = js.Dynamic.literal(coord = coord.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddMarkerOptions]
  }
}

