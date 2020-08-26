package typings.reactSelect.menuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ==============================
// Menu List
// ==============================
@js.native
trait MenuListState extends js.Object {
  /** Set classname for isMulti */
  var isMulti: Boolean = js.native
  /* Set the max height of the Menu component  */
  var maxHeight: Double = js.native
}

object MenuListState {
  @scala.inline
  def apply(isMulti: Boolean, maxHeight: Double): MenuListState = {
    val __obj = js.Dynamic.literal(isMulti = isMulti.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuListState]
  }
  @scala.inline
  implicit class MenuListStateOps[Self <: MenuListState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsMulti(value: Boolean): Self = this.set("isMulti", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
  }
  
}

