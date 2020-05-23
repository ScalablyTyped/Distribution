package typings.reactImageCrop.mod

import typings.reactImageCrop.reactImageCropStrings.Percentsign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PercentCrop extends Crop {
  @JSName("unit")
  var unit_PercentCrop: js.UndefOr[Percentsign] = js.undefined
}

object PercentCrop {
  @scala.inline
  def apply(
    aspect: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    unit: Percentsign = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): PercentCrop = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aspect)) __obj.updateDynamic("aspect")(aspect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PercentCrop]
  }
}

