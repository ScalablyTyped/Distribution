package typings
package reactDashLeafletDashSidebarv2Lib.reactDashLeafletDashSidebarv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarProps extends js.Object {
  var children: reactDashLeafletDashSidebarv2Lib.TabType
  var closeIcon: js.UndefOr[reactDashLeafletDashSidebarv2Lib.Icon] = js.undefined
  var collapsed: scala.Boolean
  var id: java.lang.String
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var position: reactDashLeafletDashSidebarv2Lib.Position
  var selected: java.lang.String
}

object SidebarProps {
  @scala.inline
  def apply(
    children: reactDashLeafletDashSidebarv2Lib.TabType,
    collapsed: scala.Boolean,
    id: java.lang.String,
    position: reactDashLeafletDashSidebarv2Lib.Position,
    selected: java.lang.String,
    closeIcon: reactDashLeafletDashSidebarv2Lib.Icon = null,
    onClose: () => scala.Unit = null,
    onOpen: () => scala.Unit = null
  ): SidebarProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], collapsed = collapsed, id = id, position = position, selected = selected)
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    __obj.asInstanceOf[SidebarProps]
  }
}

