package typings.reactDashNativeDashPopupDashDialog.reactDashNativeDashPopupDashDialogMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogContentProps extends js.Object {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object DialogContentProps {
  @scala.inline
  def apply(style: StyleProp[ViewStyle] = null): DialogContentProps = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogContentProps]
  }
}

