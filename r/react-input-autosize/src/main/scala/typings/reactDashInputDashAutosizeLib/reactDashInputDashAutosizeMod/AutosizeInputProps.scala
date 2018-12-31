package typings
package reactDashInputDashAutosizeLib.reactDashInputDashAutosizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutosizeInputProps
  extends reactLib.reactMod.ReactNs.InputHTMLAttributes[reactLib.HTMLInputElement]
     with reactLib.reactMod.ReactNs.ClassAttributes[reactLib.HTMLInputElement] {
  var inputClassName: js.UndefOr[java.lang.String] = js.undefined
  var inputRef: js.UndefOr[reactLib.reactMod.ReactNs.Ref[reactLib.HTMLInputElement]] = js.undefined
  var inputStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var minWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var onAutosize: js.UndefOr[js.Function1[/* inputWidth */ java.lang.String | scala.Double, scala.Unit]] = js.undefined
  var placeholderIsMinWidth: js.UndefOr[scala.Boolean] = js.undefined
}

