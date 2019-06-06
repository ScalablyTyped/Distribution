package typings
package atStorybookApiLib.distModulesNotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  var id: java.lang.String
  var onClear: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Notification {
  @scala.inline
  def apply(id: java.lang.String, onClear: () => scala.Unit = null): Notification = {
    val __obj = js.Dynamic.literal(id = id)
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction0(onClear))
    __obj.asInstanceOf[Notification]
  }
}

