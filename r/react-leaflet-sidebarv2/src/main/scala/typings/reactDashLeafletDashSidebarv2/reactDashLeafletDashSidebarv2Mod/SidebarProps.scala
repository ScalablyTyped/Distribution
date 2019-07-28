package typings.reactDashLeafletDashSidebarv2.reactDashLeafletDashSidebarv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarProps extends js.Object {
  var children: TabType
  var closeIcon: js.UndefOr[Icon] = js.undefined
  var collapsed: Boolean
  var id: String
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var position: Position
  var selected: String
}

object SidebarProps {
  @scala.inline
  def apply(
    children: TabType,
    collapsed: Boolean,
    id: String,
    position: Position,
    selected: String,
    closeIcon: Icon = null,
    onClose: () => Unit = null,
    onOpen: () => Unit = null
  ): SidebarProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], collapsed = collapsed, id = id, position = position, selected = selected)
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    __obj.asInstanceOf[SidebarProps]
  }
}

