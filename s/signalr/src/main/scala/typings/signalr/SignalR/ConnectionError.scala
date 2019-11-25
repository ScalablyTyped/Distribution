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
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionError]
  }
}

