package typings.rcFieldForm.anon

import typings.rcFieldForm.interfaceMod.ValidateMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var format: js.UndefOr[ValidateMessage] = js.undefined
  var invalid: js.UndefOr[ValidateMessage] = js.undefined
  var parse: js.UndefOr[ValidateMessage] = js.undefined
}

object Format {
  @scala.inline
  def apply(format: ValidateMessage = null, invalid: ValidateMessage = null, parse: ValidateMessage = null): Format = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (invalid != null) __obj.updateDynamic("invalid")(invalid.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

