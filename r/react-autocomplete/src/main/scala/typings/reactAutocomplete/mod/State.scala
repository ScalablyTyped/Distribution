package typings.reactAutocomplete.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  /**
    * Index of the highlighted item, `null` if none currently is.
    */
  var highlightedIndex: Double | Null = js.native
  /**
    * True when the menu is visible. Provided to `onMenuVisibilityChange`.
    */
  var isOpen: Boolean = js.native
  /**
    * These three `menu___` values are used in CSS to layout the menu.
    */
  var menuLeft: js.UndefOr[Double] = js.native
  var menuTop: js.UndefOr[Double] = js.native
  var menuWidth: js.UndefOr[Double] = js.native
}

object State {
  @scala.inline
  def apply(isOpen: Boolean): State = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
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
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightedIndex(value: Double): Self = this.set("highlightedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightedIndexNull: Self = this.set("highlightedIndex", null)
    @scala.inline
    def setMenuLeft(value: Double): Self = this.set("menuLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuLeft: Self = this.set("menuLeft", js.undefined)
    @scala.inline
    def setMenuTop(value: Double): Self = this.set("menuTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuTop: Self = this.set("menuTop", js.undefined)
    @scala.inline
    def setMenuWidth(value: Double): Self = this.set("menuWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuWidth: Self = this.set("menuWidth", js.undefined)
  }
  
}

