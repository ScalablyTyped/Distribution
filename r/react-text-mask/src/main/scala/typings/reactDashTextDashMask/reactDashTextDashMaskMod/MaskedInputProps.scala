package typings.reactDashTextDashMask.reactDashTextDashMaskMod

import typings.react.reactMod.InputHTMLAttributes
import typings.reactDashTextDashMask.Anon_IndexesOfPipedChars
import typings.reactDashTextDashMask.reactDashTextDashMaskNumbers.`false`
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskedInputProps extends InputHTMLAttributes[HTMLInputElement] {
  var guide: js.UndefOr[Boolean] = js.undefined
  var keepCharPositions: js.UndefOr[Boolean] = js.undefined
  var mask: js.UndefOr[maskArray | (js.Function1[/* value */ String, maskArray])] = js.undefined
  var pipe: js.UndefOr[
    js.Function2[
      /* conformedValue */ String, 
      /* config */ js.Any, 
      `false` | String | Anon_IndexesOfPipedChars
    ]
  ] = js.undefined
  var placeholderChar: js.UndefOr[String] = js.undefined
  var render: js.UndefOr[
    js.Function2[/* ref */ js.Function1[/* inputElement */ HTMLElement, Unit], /* props */ js.Any, _]
  ] = js.undefined
  var showMask: js.UndefOr[Boolean] = js.undefined
}

object MaskedInputProps {
  @scala.inline
  def apply(
    InputHTMLAttributes: InputHTMLAttributes[HTMLInputElement] = null,
    guide: js.UndefOr[Boolean] = js.undefined,
    keepCharPositions: js.UndefOr[Boolean] = js.undefined,
    mask: maskArray | (js.Function1[/* value */ String, maskArray]) = null,
    pipe: (/* conformedValue */ String, /* config */ js.Any) => `false` | String | Anon_IndexesOfPipedChars = null,
    placeholderChar: String = null,
    render: (/* ref */ js.Function1[/* inputElement */ HTMLElement, Unit], /* props */ js.Any) => _ = null,
    showMask: js.UndefOr[Boolean] = js.undefined
  ): MaskedInputProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    if (!js.isUndefined(guide)) __obj.updateDynamic("guide")(guide)
    if (!js.isUndefined(keepCharPositions)) __obj.updateDynamic("keepCharPositions")(keepCharPositions)
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (pipe != null) __obj.updateDynamic("pipe")(js.Any.fromFunction2(pipe))
    if (placeholderChar != null) __obj.updateDynamic("placeholderChar")(placeholderChar)
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2(render))
    if (!js.isUndefined(showMask)) __obj.updateDynamic("showMask")(showMask)
    __obj.asInstanceOf[MaskedInputProps]
  }
}

