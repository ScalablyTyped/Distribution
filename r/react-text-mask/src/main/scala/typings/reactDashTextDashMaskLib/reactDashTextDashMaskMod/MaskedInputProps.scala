package typings
package reactDashTextDashMaskLib.reactDashTextDashMaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskedInputProps
  extends reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement] {
  var guide: js.UndefOr[scala.Boolean] = js.undefined
  var keepCharPositions: js.UndefOr[scala.Boolean] = js.undefined
  var mask: js.UndefOr[maskArray | (js.Function1[/* value */ java.lang.String, maskArray])] = js.undefined
  var pipe: js.UndefOr[
    js.Function2[
      /* conformedValue */ java.lang.String, 
      /* config */ js.Any, 
      reactDashTextDashMaskLib.reactDashTextDashMaskLibNumbers.`false` | java.lang.String | reactDashTextDashMaskLib.Anon_IndexesOfPipedChars
    ]
  ] = js.undefined
  var placeholderChar: js.UndefOr[java.lang.String] = js.undefined
  var render: js.UndefOr[
    js.Function2[
      /* ref */ js.Function1[/* inputElement */ stdLib.HTMLElement, scala.Unit], 
      /* props */ js.Any, 
      _
    ]
  ] = js.undefined
  var showMask: js.UndefOr[scala.Boolean] = js.undefined
}

object MaskedInputProps {
  @scala.inline
  def apply(
    InputHTMLAttributes: reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement] = null,
    guide: js.UndefOr[scala.Boolean] = js.undefined,
    keepCharPositions: js.UndefOr[scala.Boolean] = js.undefined,
    mask: maskArray | (js.Function1[/* value */ java.lang.String, maskArray]) = null,
    pipe: (/* conformedValue */ java.lang.String, /* config */ js.Any) => reactDashTextDashMaskLib.reactDashTextDashMaskLibNumbers.`false` | java.lang.String | reactDashTextDashMaskLib.Anon_IndexesOfPipedChars = null,
    placeholderChar: java.lang.String = null,
    render: (/* ref */ js.Function1[/* inputElement */ stdLib.HTMLElement, scala.Unit], /* props */ js.Any) => _ = null,
    showMask: js.UndefOr[scala.Boolean] = js.undefined
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

