package typings
package stompitLib.libSocketMod.SocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketError
  extends nodeLib.Error {
  def isApplicationError(): scala.Boolean
  def isProtocolError(): scala.Boolean
  def isTransportError(): scala.Boolean
}

object SocketError {
  @scala.inline
  def apply(
    isApplicationError: js.Function0[scala.Boolean],
    isProtocolError: js.Function0[scala.Boolean],
    isTransportError: js.Function0[scala.Boolean],
    stack: java.lang.String = null
  ): SocketError = {
    val __obj = js.Dynamic.literal(isApplicationError = isApplicationError, isProtocolError = isProtocolError, isTransportError = isTransportError)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[SocketError]
  }
}

