package typings.reactNativePopupDialog.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
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
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    textStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined
  ): DialogTitleProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTitleBar)) __obj.updateDynamic("hasTitleBar")(hasTitleBar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(textStyle)) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogTitleProps]
  }
}

