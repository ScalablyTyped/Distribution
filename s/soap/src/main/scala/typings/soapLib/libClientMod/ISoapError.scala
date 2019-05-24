package typings
package soapLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISoapError
  extends stdLib.Error {
  var body: js.UndefOr[js.Any] = js.undefined
  var response: js.UndefOr[js.Any] = js.undefined
}

object ISoapError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: java.lang.String,
    body: js.Any = null,
    response: js.Any = null,
    stack: java.lang.String = null
  ): ISoapError = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (body != null) __obj.updateDynamic("body")(body)
    if (response != null) __obj.updateDynamic("response")(response)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ISoapError]
  }
}

