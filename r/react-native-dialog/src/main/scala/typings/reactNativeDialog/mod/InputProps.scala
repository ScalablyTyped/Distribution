package typings.reactNativeDialog.mod

import typings.react.mod.Ref
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputProps[T] extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var textInputRef: js.UndefOr[Ref[T]] = js.undefined
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object InputProps {
  @scala.inline
  def apply[T](
    label: String = null,
    textInputRef: js.UndefOr[Null | Ref[T]] = js.undefined,
    wrapperStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined
  ): InputProps[T] = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(textInputRef)) __obj.updateDynamic("textInputRef")(textInputRef.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapperStyle)) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProps[T]]
  }
}

