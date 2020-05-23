package typings.reactNativeCalendars.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkedDateCustomStyles extends js.Object {
  var container: StyleProp[ViewStyle]
  var text: StyleProp[TextStyle]
}

object MarkedDateCustomStyles {
  @scala.inline
  def apply(
    container: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    text: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined
  ): MarkedDateCustomStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkedDateCustomStyles]
  }
}

