package typings.reactNativeMaterialUi.mod

import typings.react.mod.global.JSX.Element
import typings.reactNativeMaterialUi.anon.ActionsContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogActionsProps extends js.Object {
  var children: Element
  var style: js.UndefOr[ActionsContainer] = js.undefined
}

object DialogActionsProps {
  @scala.inline
  def apply(children: Element, style: ActionsContainer = null): DialogActionsProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogActionsProps]
  }
}

