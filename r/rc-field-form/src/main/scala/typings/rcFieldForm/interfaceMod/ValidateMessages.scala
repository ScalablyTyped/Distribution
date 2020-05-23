package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.anon.Array
import typings.rcFieldForm.anon.Format
import typings.rcFieldForm.anon.Len
import typings.rcFieldForm.anon.Mismatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateMessages extends js.Object {
  var array: js.UndefOr[Len] = js.undefined
  var date: js.UndefOr[Format] = js.undefined
  var default: js.UndefOr[ValidateMessage] = js.undefined
  var enum: js.UndefOr[ValidateMessage] = js.undefined
  var number: js.UndefOr[Len] = js.undefined
  var pattern: js.UndefOr[Mismatch] = js.undefined
  var required: js.UndefOr[ValidateMessage] = js.undefined
  var string: js.UndefOr[Len] = js.undefined
  var types: js.UndefOr[Array] = js.undefined
  var whitespace: js.UndefOr[ValidateMessage] = js.undefined
}

object ValidateMessages {
  @scala.inline
  def apply(
    array: Len = null,
    date: Format = null,
    default: ValidateMessage = null,
    enum: ValidateMessage = null,
    number: Len = null,
    pattern: Mismatch = null,
    required: ValidateMessage = null,
    string: Len = null,
    types: Array = null,
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

