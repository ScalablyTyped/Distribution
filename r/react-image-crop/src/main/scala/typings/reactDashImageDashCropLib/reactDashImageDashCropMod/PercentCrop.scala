package typings
package reactDashImageDashCropLib.reactDashImageDashCropMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PercentCrop extends Crop {
  @JSName("unit")
  var unit_PercentCrop: js.UndefOr[reactDashImageDashCropLib.reactDashImageDashCropLibStrings.`%`] = js.undefined
}

object PercentCrop {
  @scala.inline
  def apply(
    aspect: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    unit: reactDashImageDashCropLib.reactDashImageDashCropLibStrings.`%` = null,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): PercentCrop = {
    val __obj = js.Dynamic.literal()
    if (aspect != null) __obj.updateDynamic("aspect")(aspect.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PercentCrop]
  }
}

