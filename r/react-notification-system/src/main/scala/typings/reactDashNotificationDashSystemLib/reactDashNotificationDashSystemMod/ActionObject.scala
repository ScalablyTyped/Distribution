package typings
package reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionObject extends js.Object {
  var callback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var label: java.lang.String
}

object ActionObject {
  @scala.inline
  def apply(label: java.lang.String, callback: () => scala.Unit = null): ActionObject = {
    val __obj = js.Dynamic.literal(label = label)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    __obj.asInstanceOf[ActionObject]
  }
}

