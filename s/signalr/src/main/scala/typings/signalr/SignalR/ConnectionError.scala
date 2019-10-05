package typings.signalr.SignalR

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionError extends Error {
  var context: ConnectionErrorContext
  var source: js.UndefOr[String] = js.undefined
  var transport: js.UndefOr[String] = js.undefined
}

object ConnectionError {
  @scala.inline
  def apply(
    context: ConnectionErrorContext,
    message: String,
    name: String,
    source: String = null,
    stack: String = null,
    transport: String = null
  ): ConnectionError = {
    val __obj = js.Dynamic.literal(context = context, message = message, name = name)
    if (source != null) __obj.updateDynamic("source")(source)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (transport != null) __obj.updateDynamic("transport")(transport)
    __obj.asInstanceOf[ConnectionError]
  }
}

