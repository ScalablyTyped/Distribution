package typings
package reactDashTextDashMaskLib.reactDashTextDashMaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MaskedInputProps
  extends reactLib.reactMod.ReactNs.InputHTMLAttributes[reactLib.HTMLInputElement] {
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
      /* ref */ js.Function1[/* inputElement */ reactLib.HTMLElement, scala.Unit], 
      /* props */ js.Any, 
      _
    ]
  ] = js.undefined
  var showMask: js.UndefOr[scala.Boolean] = js.undefined
}

