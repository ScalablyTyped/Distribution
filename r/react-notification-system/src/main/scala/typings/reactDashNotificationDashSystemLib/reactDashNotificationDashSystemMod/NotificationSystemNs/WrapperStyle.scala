package typings
package reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod.NotificationSystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapperStyle extends js.Object {
  var DefaultStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object WrapperStyle {
  @scala.inline
  def apply(DefaultStyle: reactLib.reactMod.ReactNs.CSSProperties = null): WrapperStyle = {
    val __obj = js.Dynamic.literal()
    if (DefaultStyle != null) __obj.updateDynamic("DefaultStyle")(DefaultStyle)
    __obj.asInstanceOf[WrapperStyle]
  }
}

