package typings.reactDashNativeDashCalendars.reactDashNativeDashCalendarsMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkedDateCustomStyles extends js.Object {
  var container: StyleProp[ViewStyle]
  var text: StyleProp[TextStyle]
}

object MarkedDateCustomStyles {
  @scala.inline
  def apply(container: StyleProp[ViewStyle] = null, text: StyleProp[TextStyle] = null): MarkedDateCustomStyles = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkedDateCustomStyles]
  }
}

