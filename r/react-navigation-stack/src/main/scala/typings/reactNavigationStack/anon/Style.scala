package typings.reactNavigationStack.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
  var style: StyleProp[ViewStyle]
}

object Style {
  @scala.inline
  def apply(style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined): Style = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
}

