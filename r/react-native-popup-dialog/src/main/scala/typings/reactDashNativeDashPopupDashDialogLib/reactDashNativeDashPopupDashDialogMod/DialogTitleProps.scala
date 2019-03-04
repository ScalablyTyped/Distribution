package typings
package reactDashNativeDashPopupDashDialogLib.reactDashNativeDashPopupDashDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogTitleProps extends js.Object {
  var align: js.UndefOr[AlignTypes] = js.undefined
  var hasTitleBar: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var textStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var title: java.lang.String
}

object DialogTitleProps {
  @scala.inline
  def apply(
    title: java.lang.String,
    align: AlignTypes = null,
    hasTitleBar: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    textStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null
  ): DialogTitleProps = {
    val __obj = js.Dynamic.literal(title = title)
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(hasTitleBar)) __obj.updateDynamic("hasTitleBar")(hasTitleBar)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogTitleProps]
  }
}

