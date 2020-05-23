package typings.rdflib.fetcherMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchError extends Error {
  var response: js.UndefOr[ExtendedResponse] = js.undefined
  var status: js.UndefOr[StatusValues] = js.undefined
  var statusText: js.UndefOr[String] = js.undefined
}

object FetchError {
  @scala.inline
  def apply(
    message: String,
    name: String,
    response: ExtendedResponse = null,
    stack: String = null,
    status: StatusValues = null,
    statusText: String = null
  ): FetchError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchError]
  }
}

