package typings.reactDashImageDashCrop.reactDashImageDashCropMod

import typings.reactDashImageDashCrop.reactDashImageDashCropStrings.Percentsign
import typings.reactDashImageDashCrop.reactDashImageDashCropStrings.px
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
    aspect: Int | Double = null,
    height: Int | Double = null,
    unit: px | Percentsign = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): Crop = {
    val __obj = js.Dynamic.literal()
    if (aspect != null) __obj.updateDynamic("aspect")(aspect.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crop]
  }
}

