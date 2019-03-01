package typings
package reactDashNativeDashModalDashDropdownLib.reactDashNativeDashModalDashDropdownMod.RNModalDropdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionStyle extends js.Object {
  var left: js.UndefOr[scala.Double] = js.undefined
  var right: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object PositionStyle {
  @scala.inline
  def apply(
    left: scala.Int | scala.Double = null,
    right: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): PositionStyle = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionStyle]
  }
}

