package typings
package reactDashLeafletDashSidebarv2Lib.reactDashLeafletDashSidebarv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var anchor: js.UndefOr[Anchor] = js.undefined
  var closeIcon: js.UndefOr[Icon] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var header: java.lang.String
  var icon: Icon
  var id: java.lang.String
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var position: js.UndefOr[Position] = js.undefined
}

object TabProps {
  @scala.inline
  def apply(
    header: java.lang.String,
    icon: Icon,
    id: java.lang.String,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    anchor: Anchor = null,
    closeIcon: Icon = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onClose: () => scala.Unit = null,
    position: Position = null
  ): TabProps = {
    val __obj = js.Dynamic.literal(header = header, icon = icon.asInstanceOf[js.Any], id = id)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[TabProps]
  }
}

