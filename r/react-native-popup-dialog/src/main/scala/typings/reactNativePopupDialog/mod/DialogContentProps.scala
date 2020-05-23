package typings.reactNativePopupDialog.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogContentProps extends js.Object {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object DialogContentProps {
  @scala.inline
  def apply(style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined): DialogContentProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogContentProps]
  }
}

