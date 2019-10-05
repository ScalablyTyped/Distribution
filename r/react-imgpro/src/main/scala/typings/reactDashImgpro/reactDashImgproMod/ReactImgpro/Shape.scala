package typings.reactDashImgpro.reactDashImgproMod.ReactImgpro

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
  def apply(height: Int | Double = null, mode: Mode = null, width: Int | Double = null): Shape = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
}

