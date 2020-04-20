package typings.reactToastNotifications

import typings.react.mod.ReactNode
import typings.reactToastNotifications.mod.AddToast
import typings.reactToastNotifications.mod.Options
import typings.reactToastNotifications.mod.RemoveAllToasts
import typings.reactToastNotifications.mod.RemoveToast
import typings.reactToastNotifications.mod.UpdateToast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddToast extends js.Object {
  var addToast: AddToast
  var removeAllToasts: RemoveAllToasts
  var removeToast: RemoveToast
  var toastStack: js.Array[AnonAppearance]
  var updateToast: UpdateToast
}

object AnonAddToast {
  @scala.inline
  def apply(
    addToast: (/* content */ ReactNode, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit,
    removeAllToasts: () => Unit,
    removeToast: (/* id */ String, /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit,
    toastStack: js.Array[AnonAppearance],
    updateToast: (/* id */ String, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit
  ): AnonAddToast = {
    val __obj = js.Dynamic.literal(addToast = js.Any.fromFunction3(addToast), removeAllToasts = js.Any.fromFunction0(removeAllToasts), removeToast = js.Any.fromFunction2(removeToast), toastStack = toastStack.asInstanceOf[js.Any], updateToast = js.Any.fromFunction3(updateToast))
    __obj.asInstanceOf[AnonAddToast]
  }
}

