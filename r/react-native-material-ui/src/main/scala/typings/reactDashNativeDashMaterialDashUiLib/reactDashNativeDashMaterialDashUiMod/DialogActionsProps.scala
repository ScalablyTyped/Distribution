package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogActionsProps extends js.Object {
  var children: reactLib.reactMod.Global.JSXNs.Element
  var style: js.UndefOr[reactDashNativeDashMaterialDashUiLib.Anon_ActionsContainer] = js.undefined
}

object DialogActionsProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.Global.JSXNs.Element,
    style: reactDashNativeDashMaterialDashUiLib.Anon_ActionsContainer = null
  ): DialogActionsProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[DialogActionsProps]
  }
}

