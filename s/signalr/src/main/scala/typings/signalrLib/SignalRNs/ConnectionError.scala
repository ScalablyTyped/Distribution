package typings
package signalrLib.SignalRNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionError
  extends stdLib.Error {
  var context: ConnectionErrorContext
  var source: js.UndefOr[java.lang.String] = js.undefined
  var transport: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectionError {
  @scala.inline
  def apply(
    context: ConnectionErrorContext,
    message: java.lang.String,
    name: java.lang.String,
    source: java.lang.String = null,
    stack: java.lang.String = null,
    transport: java.lang.String = null
  ): ConnectionError = {
    val __obj = js.Dynamic.literal(context = context, message = message, name = name)
    if (source != null) __obj.updateDynamic("source")(source)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (transport != null) __obj.updateDynamic("transport")(transport)
    __obj.asInstanceOf[ConnectionError]
  }
}

