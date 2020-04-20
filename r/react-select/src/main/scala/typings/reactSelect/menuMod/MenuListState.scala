package typings.reactSelect.menuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ==============================
// Menu List
// ==============================
trait MenuListState extends js.Object {
  /** Set classname for isMulti */
  var isMulti: Boolean
  /* Set the max height of the Menu component  */
  var maxHeight: Double
}

object MenuListState {
  @scala.inline
  def apply(isMulti: Boolean, maxHeight: Double): MenuListState = {
    val __obj = js.Dynamic.literal(isMulti = isMulti.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuListState]
  }
}

