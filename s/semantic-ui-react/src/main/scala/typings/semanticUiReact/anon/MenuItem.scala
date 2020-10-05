package typings.semanticUiReact.anon

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.ReactType
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.tabPaneMod.TabPaneProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItem extends js.Object {
  var menuItem: js.UndefOr[js.Any] = js.native
  var pane: js.UndefOr[SemanticShorthandItem[TabPaneProps]] = js.native
  var render: js.UndefOr[js.Function0[ReactNode]] = js.native
}

object MenuItem {
  @scala.inline
  def apply(): MenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItem]
  }
  @scala.inline
  implicit class MenuItemOps[Self <: MenuItem] (val x: Self) extends AnyVal {
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
    def setMenuItem(value: js.Any): Self = this.set("menuItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuItem: Self = this.set("menuItem", js.undefined)
    @scala.inline
    def setPaneFunction3(
      value: (/* component */ ReactType[TabPaneProps], TabPaneProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("pane", js.Any.fromFunction3(value))
    @scala.inline
    def setPane(value: SemanticShorthandItem[TabPaneProps]): Self = this.set("pane", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePane: Self = this.set("pane", js.undefined)
    @scala.inline
    def setRender(value: () => ReactNode): Self = this.set("render", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
  
}

