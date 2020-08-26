package typings.reactBootstrapTable.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardNavigation extends js.Object {
  /**
    * Set to false to disable click to navigate, usually user wants to click to select row instead of navigation.
    */
  var clickToNav: js.UndefOr[Boolean] = js.native
  /**
    * Return a style object which will be applied on the navigating cell.
    */
  var customStyle: js.UndefOr[js.Function2[/* cell */ js.Any, /* row */ js.Any, CSSProperties]] = js.native
  /**
    * Return a style object which will be applied on the both of navigating and editing cell.
    */
  var customStyleOnEditCell: js.UndefOr[js.Function2[/* cell */ js.Any, /* row */ js.Any, CSSProperties]] = js.native
  /**
    * When set to true, pressing ENTER will begin to edit the cell if cellEdit is also enabled.
    */
  var enterToEdit: js.UndefOr[Boolean] = js.native
  /**
    * When set to true, pressing ENTER will expand or collapse the current row.
    */
  var enterToExpand: js.UndefOr[Boolean] = js.native
  /**
    * When set to true, pressing ENTER will select or unselect the current row.
    */
  var enterToSelect: js.UndefOr[Boolean] = js.native
}

object KeyboardNavigation {
  @scala.inline
  def apply(): KeyboardNavigation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardNavigation]
  }
  @scala.inline
  implicit class KeyboardNavigationOps[Self <: KeyboardNavigation] (val x: Self) extends AnyVal {
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
    def setClickToNav(value: Boolean): Self = this.set("clickToNav", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickToNav: Self = this.set("clickToNav", js.undefined)
    @scala.inline
    def setCustomStyle(value: (/* cell */ js.Any, /* row */ js.Any) => CSSProperties): Self = this.set("customStyle", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCustomStyle: Self = this.set("customStyle", js.undefined)
    @scala.inline
    def setCustomStyleOnEditCell(value: (/* cell */ js.Any, /* row */ js.Any) => CSSProperties): Self = this.set("customStyleOnEditCell", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCustomStyleOnEditCell: Self = this.set("customStyleOnEditCell", js.undefined)
    @scala.inline
    def setEnterToEdit(value: Boolean): Self = this.set("enterToEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterToEdit: Self = this.set("enterToEdit", js.undefined)
    @scala.inline
    def setEnterToExpand(value: Boolean): Self = this.set("enterToExpand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterToExpand: Self = this.set("enterToExpand", js.undefined)
    @scala.inline
    def setEnterToSelect(value: Boolean): Self = this.set("enterToSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterToSelect: Self = this.set("enterToSelect", js.undefined)
  }
  
}

