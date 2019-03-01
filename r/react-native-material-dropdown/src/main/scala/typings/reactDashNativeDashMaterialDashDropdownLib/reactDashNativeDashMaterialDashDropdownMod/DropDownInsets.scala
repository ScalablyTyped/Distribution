package typings
package reactDashNativeDashMaterialDashDropdownLib.reactDashNativeDashMaterialDashDropdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownInsets extends js.Object {
  /** Bottom */
  var bottom: scala.Double
  /** Left */
  var left: scala.Double
  /** Right */
  var right: scala.Double
  /** Top */
  var top: scala.Double
}

object DropDownInsets {
  @scala.inline
  def apply(bottom: scala.Double, left: scala.Double, right: scala.Double, top: scala.Double): DropDownInsets = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bottom")(bottom)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("right")(right)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[DropDownInsets]
  }
}

