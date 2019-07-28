package typings.reactDashNativeDashPopupDashDialog.reactDashNativeDashPopupDashDialogMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogTitleProps extends js.Object {
  var align: js.UndefOr[AlignTypes] = js.undefined
  var hasTitleBar: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var title: String
}

object DialogTitleProps {
  @scala.inline
  def apply(
    title: String,
    align: AlignTypes = null,
    hasTitleBar: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    textStyle: StyleProp[TextStyle] = null
  ): DialogTitleProps = {
    val __obj = js.Dynamic.literal(title = title)
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(hasTitleBar)) __obj.updateDynamic("hasTitleBar")(hasTitleBar)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogTitleProps]
  }
}

