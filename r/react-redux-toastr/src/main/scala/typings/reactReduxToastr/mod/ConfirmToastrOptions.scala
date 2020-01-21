package typings.reactReduxToastr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmToastrOptions extends js.Object {
  var disableCancel: js.UndefOr[Boolean] = js.undefined
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOk: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ConfirmToastrOptions {
  @scala.inline
  def apply(
    disableCancel: js.UndefOr[Boolean] = js.undefined,
    onCancel: () => Unit = null,
    onOk: () => Unit = null
  ): ConfirmToastrOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableCancel)) __obj.updateDynamic("disableCancel")(disableCancel.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction0(onCancel))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction0(onOk))
    __obj.asInstanceOf[ConfirmToastrOptions]
  }
}

