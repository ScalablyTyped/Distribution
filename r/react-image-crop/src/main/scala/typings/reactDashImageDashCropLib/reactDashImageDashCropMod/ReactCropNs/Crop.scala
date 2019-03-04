package typings
package reactDashImageDashCropLib.reactDashImageDashCropMod.ReactCropNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Crop extends js.Object {
  var aspect: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var x: scala.Double
  var y: scala.Double
}

object Crop {
  @scala.inline
  def apply(
    x: scala.Double,
    y: scala.Double,
    aspect: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Crop = {
    val __obj = js.Dynamic.literal(x = x, y = y)
    if (aspect != null) __obj.updateDynamic("aspect")(aspect.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crop]
  }
}

