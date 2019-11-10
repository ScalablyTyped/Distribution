package typings.reactDashToastDashNotifications

import typings.react.reactMod.ReactNode
import typings.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.AddToast
import typings.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.Options
import typings.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.RemoveToast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddToast extends js.Object {
  var addToast: AddToast
  var removeToast: RemoveToast
  var toastStack: js.Array[Anon_Appearance]
}

object Anon_AddToast {
  @scala.inline
  def apply(
    addToast: (/* content */ ReactNode, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit,
    removeToast: (/* id */ String, /* callback */ js.Function0[Unit]) => Unit,
    toastStack: js.Array[Anon_Appearance]
  ): Anon_AddToast = {
    val __obj = js.Dynamic.literal(addToast = js.Any.fromFunction3(addToast), removeToast = js.Any.fromFunction2(removeToast), toastStack = toastStack)
  
    __obj.asInstanceOf[Anon_AddToast]
  }
}

