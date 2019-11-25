package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertOptions extends js.Object {
  /** @platform android */
  var cancelable: js.UndefOr[Boolean] = js.undefined
  /** @platform android */
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AlertOptions {
  @scala.inline
  def apply(cancelable: js.UndefOr[Boolean] = js.undefined, onDismiss: () => Unit = null): AlertOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[AlertOptions]
  }
}

