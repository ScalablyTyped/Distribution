package typings.reactDashNumericDashInput.reactDashNumericDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Exposed here for the function prop handlers that get the NumericInput instance as a parameter.
// Lifted directly from react-numeric-input@79874ccbe:/src/NumericInput.jsx#L63-L73
trait NumericInputState extends js.Object {
  var btnDownActive: js.UndefOr[Boolean] = js.undefined
  var btnDownHover: js.UndefOr[Boolean] = js.undefined
  var btnUpActive: js.UndefOr[Boolean] = js.undefined
  var btnUpHover: js.UndefOr[Boolean] = js.undefined
  var selectionEnd: js.UndefOr[Double | Null] = js.undefined
  var selectionStart: js.UndefOr[Double | Null] = js.undefined
  var stringValue: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double | Null] = js.undefined
}

object NumericInputState {
  @scala.inline
  def apply(
    btnDownActive: js.UndefOr[Boolean] = js.undefined,
    btnDownHover: js.UndefOr[Boolean] = js.undefined,
    btnUpActive: js.UndefOr[Boolean] = js.undefined,
    btnUpHover: js.UndefOr[Boolean] = js.undefined,
    selectionEnd: Int | Double = null,
    selectionStart: Int | Double = null,
    stringValue: String = null,
    value: Int | Double = null
  ): NumericInputState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(btnDownActive)) __obj.updateDynamic("btnDownActive")(btnDownActive.asInstanceOf[js.Any])
    if (!js.isUndefined(btnDownHover)) __obj.updateDynamic("btnDownHover")(btnDownHover.asInstanceOf[js.Any])
    if (!js.isUndefined(btnUpActive)) __obj.updateDynamic("btnUpActive")(btnUpActive.asInstanceOf[js.Any])
    if (!js.isUndefined(btnUpHover)) __obj.updateDynamic("btnUpHover")(btnUpHover.asInstanceOf[js.Any])
    if (selectionEnd != null) __obj.updateDynamic("selectionEnd")(selectionEnd.asInstanceOf[js.Any])
    if (selectionStart != null) __obj.updateDynamic("selectionStart")(selectionStart.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericInputState]
  }
}

