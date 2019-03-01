package typings
package reactDashNumericDashInputLib.reactDashNumericDashInputMod.NumericInputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Exposed here for the function prop handlers that get the NumericInput instance as a parameter.
// Lifted directly from react-numeric-input@79874ccbe:/src/NumericInput.jsx#L63-L73
trait NumericInputState extends js.Object {
  var btnDownActive: js.UndefOr[scala.Boolean] = js.undefined
  var btnDownHover: js.UndefOr[scala.Boolean] = js.undefined
  var btnUpActive: js.UndefOr[scala.Boolean] = js.undefined
  var btnUpHover: js.UndefOr[scala.Boolean] = js.undefined
  var selectionEnd: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var selectionStart: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var stringValue: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object NumericInputState {
  @scala.inline
  def apply(
    btnDownActive: js.UndefOr[scala.Boolean] = js.undefined,
    btnDownHover: js.UndefOr[scala.Boolean] = js.undefined,
    btnUpActive: js.UndefOr[scala.Boolean] = js.undefined,
    btnUpHover: js.UndefOr[scala.Boolean] = js.undefined,
    selectionEnd: scala.Int | scala.Double = null,
    selectionStart: scala.Int | scala.Double = null,
    stringValue: java.lang.String = null,
    value: scala.Int | scala.Double = null
  ): NumericInputState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(btnDownActive)) __obj.updateDynamic("btnDownActive")(btnDownActive)
    if (!js.isUndefined(btnDownHover)) __obj.updateDynamic("btnDownHover")(btnDownHover)
    if (!js.isUndefined(btnUpActive)) __obj.updateDynamic("btnUpActive")(btnUpActive)
    if (!js.isUndefined(btnUpHover)) __obj.updateDynamic("btnUpHover")(btnUpHover)
    if (selectionEnd != null) __obj.updateDynamic("selectionEnd")(selectionEnd.asInstanceOf[js.Any])
    if (selectionStart != null) __obj.updateDynamic("selectionStart")(selectionStart.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericInputState]
  }
}

