package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import typings.react.reactMod._Global_.JSX.Element
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
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogActionsProps]
  }
}

