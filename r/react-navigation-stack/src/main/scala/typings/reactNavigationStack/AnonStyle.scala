package typings.reactNavigationStack

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStyle extends js.Object {
  var style: StyleProp[ViewStyle]
}

object AnonStyle {
  @scala.inline
  def apply(style: StyleProp[ViewStyle] = null): AnonStyle = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStyle]
  }
}

