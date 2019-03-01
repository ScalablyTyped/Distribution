package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarRightElement extends js.Object {
  var actions: js.UndefOr[js.Array[reactLib.reactMod.Global.JSXNs.Element | java.lang.String]] = js.undefined
  var menu: js.UndefOr[reactDashNativeDashMaterialDashUiLib.Anon_IconLabels] = js.undefined
}

object ToolBarRightElement {
  @scala.inline
  def apply(
    actions: js.Array[reactLib.reactMod.Global.JSXNs.Element | java.lang.String] = null,
    menu: reactDashNativeDashMaterialDashUiLib.Anon_IconLabels = null
  ): ToolBarRightElement = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (menu != null) __obj.updateDynamic("menu")(menu)
    __obj.asInstanceOf[ToolBarRightElement]
  }
}

