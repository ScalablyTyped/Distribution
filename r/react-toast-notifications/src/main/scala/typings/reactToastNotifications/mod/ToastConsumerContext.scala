package typings.reactToastNotifications.mod

import typings.react.mod.ReactNode
import typings.reactToastNotifications.AnonAppearance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastConsumerContext extends js.Object {
  var add: AddToast
  var remove: RemoveToast
  var toasts: js.Array[AnonAppearance]
}

object ToastConsumerContext {
  @scala.inline
  def apply(
    add: (/* content */ ReactNode, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit,
    remove: (/* id */ String, /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit,
    toasts: js.Array[AnonAppearance]
  ): ToastConsumerContext = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), remove = js.Any.fromFunction2(remove), toasts = toasts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ToastConsumerContext]
  }
}

