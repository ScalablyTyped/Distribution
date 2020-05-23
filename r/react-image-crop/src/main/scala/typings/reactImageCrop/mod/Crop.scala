package typings.reactImageCrop.mod

import typings.reactImageCrop.reactImageCropStrings.Percentsign
import typings.reactImageCrop.reactImageCropStrings.px
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Crop extends js.Object {
  var aspect: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var unit: js.UndefOr[px | Percentsign] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object Crop {
  @scala.inline
  def apply(
    aspect: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    unit: px | Percentsign = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): Crop = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aspect)) __obj.updateDynamic("aspect")(aspect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crop]
  }
}

