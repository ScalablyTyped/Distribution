package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.AnonArray
import typings.rcFieldForm.AnonFormat
import typings.rcFieldForm.AnonLen
import typings.rcFieldForm.AnonMismatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateMessages extends js.Object {
  var array: js.UndefOr[AnonLen] = js.undefined
  var date: js.UndefOr[AnonFormat] = js.undefined
  var default: js.UndefOr[ValidateMessage] = js.undefined
  var enum: js.UndefOr[ValidateMessage] = js.undefined
  var number: js.UndefOr[AnonLen] = js.undefined
  var pattern: js.UndefOr[AnonMismatch] = js.undefined
  var required: js.UndefOr[ValidateMessage] = js.undefined
  var string: js.UndefOr[AnonLen] = js.undefined
  var types: js.UndefOr[AnonArray] = js.undefined
  var whitespace: js.UndefOr[ValidateMessage] = js.undefined
}

object ValidateMessages {
  @scala.inline
  def apply(
    array: AnonLen = null,
    date: AnonFormat = null,
    default: ValidateMessage = null,
    enum: ValidateMessage = null,
    number: AnonLen = null,
    pattern: AnonMismatch = null,
    required: ValidateMessage = null,
    string: AnonLen = null,
    types: AnonArray = null,
    whitespace: ValidateMessage = null
  ): ValidateMessages = {
    val __obj = js.Dynamic.literal()
    if (array != null) __obj.updateDynamic("array")(array.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (whitespace != null) __obj.updateDynamic("whitespace")(whitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateMessages]
  }
}

