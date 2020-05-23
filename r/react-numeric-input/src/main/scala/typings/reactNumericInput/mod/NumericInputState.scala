package typings.reactNumericInput.mod

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
    selectionEnd: js.UndefOr[Null | Double] = js.undefined,
    selectionStart: js.UndefOr[Null | Double] = js.undefined,
    stringValue: String = null,
    value: js.UndefOr[Null | Double] = js.undefined
  ): NumericInputState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(btnDownActive)) __obj.updateDynamic("btnDownActive")(btnDownActive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(btnDownHover)) __obj.updateDynamic("btnDownHover")(btnDownHover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(btnUpActive)) __obj.updateDynamic("btnUpActive")(btnUpActive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(btnUpHover)) __obj.updateDynamic("btnUpHover")(btnUpHover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionEnd)) __obj.updateDynamic("selectionEnd")(selectionEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionStart)) __obj.updateDynamic("selectionStart")(selectionStart.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericInputState]
  }
}

