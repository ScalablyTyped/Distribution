package typings.reactToastNotifications.anon

import typings.react.mod.ComponentType
import typings.reactToastNotifications.mod.ToastContainerProps
import typings.reactToastNotifications.mod.ToastProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Toast extends js.Object {
  var Toast: js.UndefOr[ComponentType[ToastProps]] = js.undefined
  var ToastContainer: js.UndefOr[ComponentType[ToastContainerProps]] = js.undefined
}

object Toast {
  @scala.inline
  def apply(Toast: ComponentType[ToastProps] = null, ToastContainer: ComponentType[ToastContainerProps] = null): Toast = {
    val __obj = js.Dynamic.literal()
    if (Toast != null) __obj.updateDynamic("Toast")(Toast.asInstanceOf[js.Any])
    if (ToastContainer != null) __obj.updateDynamic("ToastContainer")(ToastContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toast]
  }
}

