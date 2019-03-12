package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertOptions extends js.Object {
  /** @platform android */
  var cancelable: js.UndefOr[scala.Boolean] = js.undefined
  /** @platform android */
  var onDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object AlertOptions {
  @scala.inline
  def apply(cancelable: js.UndefOr[scala.Boolean] = js.undefined, onDismiss: () => scala.Unit = null): AlertOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[AlertOptions]
  }
}

