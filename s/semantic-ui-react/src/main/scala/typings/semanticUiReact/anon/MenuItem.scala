package typings.semanticUiReact.anon

import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.tabPaneMod.TabPaneProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItem extends js.Object {
  var menuItem: js.UndefOr[js.Any] = js.undefined
  var pane: js.UndefOr[SemanticShorthandItem[TabPaneProps]] = js.undefined
  var render: js.UndefOr[js.Function0[ReactNode]] = js.undefined
}

object MenuItem {
  @scala.inline
  def apply(
    menuItem: js.Any = null,
    pane: SemanticShorthandItem[TabPaneProps] = null,
    render: () => ReactNode = null
  ): MenuItem = {
    val __obj = js.Dynamic.literal()
    if (menuItem != null) __obj.updateDynamic("menuItem")(menuItem.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction0(render))
    __obj.asInstanceOf[MenuItem]
  }
}

