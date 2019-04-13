package typings
package reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapperStyle extends js.Object {
  var DefaultStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object WrapperStyle {
  @scala.inline
  def apply(DefaultStyle: reactLib.reactMod.CSSProperties = null): WrapperStyle = {
    val __obj = js.Dynamic.literal()
    if (DefaultStyle != null) __obj.updateDynamic("DefaultStyle")(DefaultStyle)
    __obj.asInstanceOf[WrapperStyle]
  }
}

