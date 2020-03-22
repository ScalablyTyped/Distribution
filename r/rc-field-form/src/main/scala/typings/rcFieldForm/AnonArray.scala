package typings.rcFieldForm

import typings.rcFieldForm.interfaceMod.ValidateMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArray extends js.Object {
  var array: js.UndefOr[ValidateMessage] = js.undefined
  var boolean: js.UndefOr[ValidateMessage] = js.undefined
  var date: js.UndefOr[ValidateMessage] = js.undefined
  var email: js.UndefOr[ValidateMessage] = js.undefined
  var float: js.UndefOr[ValidateMessage] = js.undefined
  var hex: js.UndefOr[ValidateMessage] = js.undefined
  var integer: js.UndefOr[ValidateMessage] = js.undefined
  var method: js.UndefOr[ValidateMessage] = js.undefined
  var number: js.UndefOr[ValidateMessage] = js.undefined
  var `object`: js.UndefOr[ValidateMessage] = js.undefined
  var regexp: js.UndefOr[ValidateMessage] = js.undefined
  var string: js.UndefOr[ValidateMessage] = js.undefined
  var url: js.UndefOr[ValidateMessage] = js.undefined
}

object AnonArray {
  @scala.inline
  def apply(
    array: ValidateMessage = null,
    boolean: ValidateMessage = null,
    date: ValidateMessage = null,
    email: ValidateMessage = null,
    float: ValidateMessage = null,
    hex: ValidateMessage = null,
    integer: ValidateMessage = null,
    method: ValidateMessage = null,
    number: ValidateMessage = null,
    `object`: ValidateMessage = null,
    regexp: ValidateMessage = null,
    string: ValidateMessage = null,
    url: ValidateMessage = null
  ): AnonArray = {
    val __obj = js.Dynamic.literal()
    if (array != null) __obj.updateDynamic("array")(array.asInstanceOf[js.Any])
    if (boolean != null) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (hex != null) __obj.updateDynamic("hex")(hex.asInstanceOf[js.Any])
    if (integer != null) __obj.updateDynamic("integer")(integer.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (regexp != null) __obj.updateDynamic("regexp")(regexp.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArray]
  }
}

