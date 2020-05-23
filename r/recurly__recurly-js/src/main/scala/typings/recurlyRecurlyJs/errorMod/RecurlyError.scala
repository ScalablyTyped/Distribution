package typings.recurlyRecurlyJs.errorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecurlyError extends Error {
  var classification: String
  var code: String
  var help: js.UndefOr[String] = js.undefined
}

object RecurlyError {
  @scala.inline
  def apply(
    classification: String,
    code: String,
    message: String,
    name: String,
    help: String = null,
    stack: String = null
  ): RecurlyError = {
    val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurlyError]
  }
}

