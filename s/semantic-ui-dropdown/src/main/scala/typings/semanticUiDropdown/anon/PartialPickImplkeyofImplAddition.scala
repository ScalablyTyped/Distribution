package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.SelectorSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.SelectorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplAddition extends js.Object {
  var addition: js.UndefOr[String] = js.native
  var dropdown: js.UndefOr[String] = js.native
  var icon: js.UndefOr[String] = js.native
  var input: js.UndefOr[String] = js.native
  var item: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var menu: js.UndefOr[String] = js.native
  var menuIcon: js.UndefOr[String] = js.native
  var message: js.UndefOr[String] = js.native
  var remove: js.UndefOr[String] = js.native
  var search: js.UndefOr[String] = js.native
  var siblingLabel: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplAddition {
  @scala.inline
  def apply(): PartialPickImplkeyofImplAddition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplAddition]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplAdditionOps[Self <: PartialPickImplkeyofImplAddition] (val x: Self) extends AnyVal {
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
    def setAddition(value: String): Self = this.set("addition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddition: Self = this.set("addition", js.undefined)
    @scala.inline
    def setDropdown(value: String): Self = this.set("dropdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdown: Self = this.set("dropdown", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setItem(value: String): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMenu(value: String): Self = this.set("menu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    @scala.inline
    def setMenuIcon(value: String): Self = this.set("menuIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuIcon: Self = this.set("menuIcon", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setRemove(value: String): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    @scala.inline
    def setSiblingLabel(value: String): Self = this.set("siblingLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiblingLabel: Self = this.set("siblingLabel", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

