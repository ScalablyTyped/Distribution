package typings
package rmcDashFeedbackLib.libPropTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITouchProps extends js.Object {
  var activeClassName: js.UndefOr[java.lang.String] = js.undefined
  var activeStyle: js.UndefOr[js.Any] = js.undefined
  var children: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
}

object ITouchProps {
  @scala.inline
  def apply(
    activeClassName: java.lang.String = null,
    activeStyle: js.Any = null,
    children: js.Any = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined
  ): ITouchProps = {
    val __obj = js.Dynamic.literal()
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName)
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle)
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[ITouchProps]
  }
}

