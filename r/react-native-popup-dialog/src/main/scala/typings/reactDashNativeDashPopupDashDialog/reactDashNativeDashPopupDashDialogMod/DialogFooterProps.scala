package typings.reactDashNativeDashPopupDashDialog.reactDashNativeDashPopupDashDialogMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogFooterProps extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object DialogFooterProps {
  @scala.inline
  def apply(bordered: js.UndefOr[Boolean] = js.undefined, style: StyleProp[ViewStyle] = null): DialogFooterProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogFooterProps]
  }
}

