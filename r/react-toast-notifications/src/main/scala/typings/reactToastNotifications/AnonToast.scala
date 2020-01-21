package typings.reactToastNotifications

import typings.react.mod.ComponentType
import typings.reactToastNotifications.mod.ToastContainerProps
import typings.reactToastNotifications.mod.ToastProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToast extends js.Object {
  var Toast: js.UndefOr[ComponentType[ToastProps]] = js.undefined
  var ToastContainer: js.UndefOr[ComponentType[ToastContainerProps]] = js.undefined
}

object AnonToast {
  @scala.inline
  def apply(Toast: ComponentType[ToastProps] = null, ToastContainer: ComponentType[ToastContainerProps] = null): AnonToast = {
    val __obj = js.Dynamic.literal()
    if (Toast != null) __obj.updateDynamic("Toast")(Toast.asInstanceOf[js.Any])
    if (ToastContainer != null) __obj.updateDynamic("ToastContainer")(ToastContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonToast]
  }
}

