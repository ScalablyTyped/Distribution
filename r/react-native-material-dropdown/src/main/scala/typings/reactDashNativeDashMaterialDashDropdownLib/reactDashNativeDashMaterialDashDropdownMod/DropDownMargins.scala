package typings
package reactDashNativeDashMaterialDashDropdownLib.reactDashNativeDashMaterialDashDropdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownMargins extends js.Object {
  /** Maximum value */
  var max: scala.Double
  /** Minimum value */
  var min: scala.Double
}

object DropDownMargins {
  @scala.inline
  def apply(max: scala.Double, min: scala.Double): DropDownMargins = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    __obj.asInstanceOf[DropDownMargins]
  }
}

