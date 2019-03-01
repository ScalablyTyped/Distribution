package typings
package reactDashReduxDashToastrLib.reactDashReduxDashToastrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmToastrOptions extends js.Object {
  var disableCancel: js.UndefOr[scala.Boolean] = js.undefined
  var onCancel: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onOk: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object ConfirmToastrOptions {
  @scala.inline
  def apply(
    disableCancel: js.UndefOr[scala.Boolean] = js.undefined,
    onCancel: js.Function0[scala.Unit] = null,
    onOk: js.Function0[scala.Unit] = null
  ): ConfirmToastrOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableCancel)) __obj.updateDynamic("disableCancel")(disableCancel)
    if (onCancel != null) __obj.updateDynamic("onCancel")(onCancel)
    if (onOk != null) __obj.updateDynamic("onOk")(onOk)
    __obj.asInstanceOf[ConfirmToastrOptions]
  }
}

