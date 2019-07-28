package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import typings.react.reactMod.Global.JSXNs.Element
import typings.reactDashNativeDashMaterialDashUi.Anon_ActionsContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogActionsProps extends js.Object {
  var children: Element
  var style: js.UndefOr[Anon_ActionsContainer] = js.undefined
}

object DialogActionsProps {
  @scala.inline
  def apply(children: Element, style: Anon_ActionsContainer = null): DialogActionsProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[DialogActionsProps]
  }
}

