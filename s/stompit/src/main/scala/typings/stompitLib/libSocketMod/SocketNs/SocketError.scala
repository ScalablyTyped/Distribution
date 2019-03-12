package typings
package stompitLib.libSocketMod.SocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketError
  extends stdLib.Error {
  def isApplicationError(): scala.Boolean
  def isProtocolError(): scala.Boolean
  def isTransportError(): scala.Boolean
}

object SocketError {
  @scala.inline
  def apply(
    isApplicationError: () => scala.Boolean,
    isProtocolError: () => scala.Boolean,
    isTransportError: () => scala.Boolean,
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null
  ): SocketError = {
    val __obj = js.Dynamic.literal(isApplicationError = js.Any.fromFunction0(isApplicationError), isProtocolError = js.Any.fromFunction0(isProtocolError), isTransportError = js.Any.fromFunction0(isTransportError), message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[SocketError]
  }
}

