package typings
package reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemStyle extends js.Object {
  var DefaultStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var error: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var info: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var success: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var warning: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object ItemStyle {
  @scala.inline
  def apply(
    DefaultStyle: reactLib.reactMod.CSSProperties = null,
    error: reactLib.reactMod.CSSProperties = null,
    info: reactLib.reactMod.CSSProperties = null,
    success: reactLib.reactMod.CSSProperties = null,
    warning: reactLib.reactMod.CSSProperties = null
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

