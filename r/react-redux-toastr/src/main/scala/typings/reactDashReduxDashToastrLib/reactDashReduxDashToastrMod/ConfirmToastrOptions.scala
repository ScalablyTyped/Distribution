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
    onCancel: () => scala.Unit = null,
    onOk: () => scala.Unit = null
  ): ConfirmToastrOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableCancel)) __obj.updateDynamic("disableCancel")(disableCancel)
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction0(onCancel))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction0(onOk))
    __obj.asInstanceOf[ConfirmToastrOptions]
  }
}

