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
  def apply(container: StyleProp[ViewStyle], text: StyleProp[TextStyle]): MarkedDateCustomStyles = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MarkedDateCustomStyles]
  }
}

