package typings.reactDashNotificationDashSystem.reactDashNotificationDashSystemMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapperStyle extends js.Object {
  var DefaultStyle: js.UndefOr[CSSProperties] = js.undefined
}

object WrapperStyle {
  @scala.inline
  def apply(DefaultStyle: CSSProperties = null): WrapperStyle = {
    val __obj = js.Dynamic.literal()
    if (DefaultStyle != null) __obj.updateDynamic("DefaultStyle")(DefaultStyle)
    __obj.asInstanceOf[WrapperStyle]
  }
}

