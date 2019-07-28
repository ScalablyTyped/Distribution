package typings.reactDashInputDashAutosize.reactDashInputDashAutosizeMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.InputHTMLAttributes
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutosizeInputProps
  extends InputHTMLAttributes[HTMLInputElement]
     with ClassAttributes[HTMLInputElement] {
  var inputClassName: js.UndefOr[String] = js.undefined
  var inputRef: js.UndefOr[js.Function1[/* instance */ HTMLInputElement | Null, Unit]] = js.undefined
  var inputStyle: js.UndefOr[CSSProperties] = js.undefined
  var minWidth: js.UndefOr[String | Double] = js.undefined
  var onAutosize: js.UndefOr[js.Function1[/* inputWidth */ String | Double, Unit]] = js.undefined
  var placeholderIsMinWidth: js.UndefOr[Boolean] = js.undefined
}

object AutosizeInputProps {
  @scala.inline
  def apply(
    ClassAttributes: ClassAttributes[HTMLInputElement] = null,
    InputHTMLAttributes: InputHTMLAttributes[HTMLInputElement] = null,
    inputClassName: String = null,
    inputRef: /* instance */ HTMLInputElement | Null => Unit = null,
    inputStyle: CSSProperties = null,
    minWidth: String | Double = null,
    onAutosize: /* inputWidth */ String | Double => Unit = null,
    placeholderIsMinWidth: js.UndefOr[Boolean] = js.undefined
  ): AutosizeInputProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName)
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1(inputRef))
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onAutosize != null) __obj.updateDynamic("onAutosize")(js.Any.fromFunction1(onAutosize))
    if (!js.isUndefined(placeholderIsMinWidth)) __obj.updateDynamic("placeholderIsMinWidth")(placeholderIsMinWidth)
    __obj.asInstanceOf[AutosizeInputProps]
  }
}

