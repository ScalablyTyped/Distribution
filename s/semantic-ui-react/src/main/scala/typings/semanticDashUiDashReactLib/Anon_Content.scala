package typings
package semanticDashUiDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsModulesTabTabPaneMod.TabPaneProps]
  ] = js.undefined
  var menuItem: js.UndefOr[js.Any] = js.undefined
  var render: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
}

object Anon_Content {
  @scala.inline
  def apply(
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsModulesTabTabPaneMod.TabPaneProps] = null,
    menuItem: js.Any = null,
    render: () => reactLib.reactMod.ReactNs.ReactNode = null
  ): Anon_Content = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (menuItem != null) __obj.updateDynamic("menuItem")(menuItem)
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction0(render))
    __obj.asInstanceOf[Anon_Content]
  }
}

