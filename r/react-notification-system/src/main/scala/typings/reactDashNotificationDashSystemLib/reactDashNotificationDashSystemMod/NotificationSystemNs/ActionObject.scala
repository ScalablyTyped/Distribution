package typings
package reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod.NotificationSystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionObject extends js.Object {
  var callback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var label: java.lang.String
}

object ActionObject {
  @scala.inline
  def apply(label: java.lang.String, callback: js.Function0[scala.Unit] = null): ActionObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    __obj.asInstanceOf[ActionObject]
  }
}

