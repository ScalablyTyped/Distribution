package typings
package reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod.NotificationSystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemStyle extends js.Object {
  var DefaultStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var error: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var info: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var success: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var warning: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object ItemStyle {
  @scala.inline
  def apply(
    DefaultStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    error: reactLib.reactMod.ReactNs.CSSProperties = null,
    info: reactLib.reactMod.ReactNs.CSSProperties = null,
    success: reactLib.reactMod.ReactNs.CSSProperties = null,
    warning: reactLib.reactMod.ReactNs.CSSProperties = null
  ): ItemStyle = {
    val __obj = js.Dynamic.literal()
    if (DefaultStyle != null) __obj.updateDynamic("DefaultStyle")(DefaultStyle)
    if (error != null) __obj.updateDynamic("error")(error)
    if (info != null) __obj.updateDynamic("info")(info)
    if (success != null) __obj.updateDynamic("success")(success)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[ItemStyle]
  }
}

