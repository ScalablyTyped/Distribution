package typings
package reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkedDateCustomStyles extends js.Object {
  var container: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  var text: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
}

object MarkedDateCustomStyles {
  @scala.inline
  def apply(
    container: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle],
    text: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ): MarkedDateCustomStyles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkedDateCustomStyles]
  }
}

