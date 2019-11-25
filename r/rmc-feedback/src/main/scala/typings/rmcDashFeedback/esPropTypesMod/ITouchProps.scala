package typings.rmcDashFeedback.esPropTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITouchProps extends js.Object {
  var activeClassName: js.UndefOr[String] = js.undefined
  var activeStyle: js.UndefOr[js.Any] = js.undefined
  var children: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
}

object ITouchProps {
  @scala.inline
  def apply(
    activeClassName: String = null,
    activeStyle: js.Any = null,
    children: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined
  ): ITouchProps = {
    val __obj = js.Dynamic.literal()
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName.asInstanceOf[js.Any])
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITouchProps]
  }
}

