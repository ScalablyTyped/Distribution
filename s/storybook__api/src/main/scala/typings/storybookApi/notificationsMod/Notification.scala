package typings.storybookApi.notificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  var id: String
  var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Notification {
  @scala.inline
  def apply(id: String, onClear: () => Unit = null): Notification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction0(onClear))
    __obj.asInstanceOf[Notification]
  }
}

