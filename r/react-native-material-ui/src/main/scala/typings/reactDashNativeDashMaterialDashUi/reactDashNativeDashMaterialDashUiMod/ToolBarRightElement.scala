package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import typings.react.reactMod.Global.JSXNs.Element
import typings.reactDashNativeDashMaterialDashUi.Anon_IconLabels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarRightElement extends js.Object {
  var actions: js.UndefOr[js.Array[Element | String]] = js.undefined
  var menu: js.UndefOr[Anon_IconLabels] = js.undefined
}

object ToolBarRightElement {
  @scala.inline
  def apply(actions: js.Array[Element | String] = null, menu: Anon_IconLabels = null): ToolBarRightElement = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (menu != null) __obj.updateDynamic("menu")(menu)
    __obj.asInstanceOf[ToolBarRightElement]
  }
}

