package typings.staticmaps.mod

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
    offsetX: js.UndefOr[Double] = js.undefined,
    offsetY: js.UndefOr[Double] = js.undefined
  ): AddMarkerOptions = {
    val __obj = js.Dynamic.literal(coord = coord.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetX)) __obj.updateDynamic("offsetX")(offsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetY)) __obj.updateDynamic("offsetY")(offsetY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddMarkerOptions]
  }
}

