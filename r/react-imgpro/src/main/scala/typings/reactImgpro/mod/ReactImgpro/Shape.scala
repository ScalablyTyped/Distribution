package typings.reactImgpro.mod.ReactImgpro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shape extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Shape {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    mode: Mode = null,
    width: js.UndefOr[Double] = js.undefined
  ): Shape = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
}

