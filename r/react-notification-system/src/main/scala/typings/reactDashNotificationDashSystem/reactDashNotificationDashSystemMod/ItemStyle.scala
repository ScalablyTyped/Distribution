package typings.reactDashNotificationDashSystem.reactDashNotificationDashSystemMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemStyle extends js.Object {
  var DefaultStyle: js.UndefOr[CSSProperties] = js.undefined
  var error: js.UndefOr[CSSProperties] = js.undefined
  var info: js.UndefOr[CSSProperties] = js.undefined
  var success: js.UndefOr[CSSProperties] = js.undefined
  var warning: js.UndefOr[CSSProperties] = js.undefined
}

object ItemStyle {
  @scala.inline
  def apply(
    DefaultStyle: CSSProperties = null,
    error: CSSProperties = null,
    info: CSSProperties = null,
    success: CSSProperties = null,
    warning: CSSProperties = null
  ): ItemStyle = {
    val __obj = js.Dynamic.literal()
    if (DefaultStyle != null) __obj.updateDynamic("DefaultStyle")(DefaultStyle.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemStyle]
  }
}

