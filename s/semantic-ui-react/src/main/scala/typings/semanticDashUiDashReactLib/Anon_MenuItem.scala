package typings
package semanticDashUiDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MenuItem extends js.Object {
  var menuItem: js.UndefOr[js.Any] = js.undefined
  var pane: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsModulesTabTabPaneMod.TabPaneProps]
  ] = js.undefined
  var render: js.UndefOr[js.Function0[reactLib.reactMod.ReactNode]] = js.undefined
}

object Anon_MenuItem {
  @scala.inline
  def apply(
    menuItem: js.Any = null,
    pane: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsModulesTabTabPaneMod.TabPaneProps] = null,
    render: () => reactLib.reactMod.ReactNode = null
  ): Anon_MenuItem = {
    val __obj = js.Dynamic.literal()
    if (menuItem != null) __obj.updateDynamic("menuItem")(menuItem)
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction0(render))
    __obj.asInstanceOf[Anon_MenuItem]
  }
}

