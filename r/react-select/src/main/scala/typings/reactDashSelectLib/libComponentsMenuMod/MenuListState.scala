package typings
package reactDashSelectLib.libComponentsMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ==============================
// Menu List
// ==============================
trait MenuListState extends js.Object {
  /** Set classname for isMulti */
  var isMulti: scala.Boolean
  /* Set the max height of the Menu component  */
  var maxHeight: scala.Double
}

object MenuListState {
  @scala.inline
  def apply(isMulti: scala.Boolean, maxHeight: scala.Double): MenuListState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isMulti")(isMulti)
    __obj.updateDynamic("maxHeight")(maxHeight)
    __obj.asInstanceOf[MenuListState]
  }
}

