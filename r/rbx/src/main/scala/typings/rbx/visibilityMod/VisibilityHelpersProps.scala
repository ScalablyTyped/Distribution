package typings.rbx.visibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisibilityHelpersProps extends js.Object {
  var hidden: js.UndefOr[Boolean] = js.undefined
  var invisible: js.UndefOr[Boolean] = js.undefined
  var srOnly: js.UndefOr[Boolean] = js.undefined
}

object VisibilityHelpersProps {
  @scala.inline
  def apply(
    hidden: js.UndefOr[Boolean] = js.undefined,
    invisible: js.UndefOr[Boolean] = js.undefined,
    srOnly: js.UndefOr[Boolean] = js.undefined
  ): VisibilityHelpersProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(invisible)) __obj.updateDynamic("invisible")(invisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(srOnly)) __obj.updateDynamic("srOnly")(srOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibilityHelpersProps]
  }
}

