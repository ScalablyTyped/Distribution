package typings.reactDashToastDashNotifications

import typings.react.reactMod.ComponentType
import typings.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.ToastContainerProps
import typings.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.ToastProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Toast extends js.Object {
  var Toast: js.UndefOr[ComponentType[ToastProps]] = js.undefined
  var ToastContainer: js.UndefOr[ComponentType[ToastContainerProps]] = js.undefined
}

object Anon_Toast {
  @scala.inline
  def apply(Toast: ComponentType[ToastProps] = null, ToastContainer: ComponentType[ToastContainerProps] = null): Anon_Toast = {
    val __obj = js.Dynamic.literal()
    if (Toast != null) __obj.updateDynamic("Toast")(Toast.asInstanceOf[js.Any])
    if (ToastContainer != null) __obj.updateDynamic("ToastContainer")(ToastContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Toast]
  }
}

