package typings.stompit.socketMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketError extends Error {
  def isApplicationError(): Boolean
  def isProtocolError(): Boolean
  def isTransportError(): Boolean
}

object SocketError {
  @scala.inline
  def apply(
    isApplicationError: () => Boolean,
    isProtocolError: () => Boolean,
    isTransportError: () => Boolean,
    message: String,
    name: String,
    stack: String = null
  ): SocketError = {
    val __obj = js.Dynamic.literal(isApplicationError = js.Any.fromFunction0(isApplicationError), isProtocolError = js.Any.fromFunction0(isProtocolError), isTransportError = js.Any.fromFunction0(isTransportError), message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketError]
  }
}

