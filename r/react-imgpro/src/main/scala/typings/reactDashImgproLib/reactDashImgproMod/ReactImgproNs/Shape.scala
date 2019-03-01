package typings
package reactDashImgproLib.reactDashImgproMod.ReactImgproNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shape extends js.Object {
  var height: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Shape {
  @scala.inline
  def apply(height: scala.Int | scala.Double = null, mode: Mode = null, width: scala.Int | scala.Double = null): Shape = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
}

