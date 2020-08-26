package typings.stompit.socketMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketError extends Error {
  def isApplicationError(): Boolean = js.native
  def isProtocolError(): Boolean = js.native
  def isTransportError(): Boolean = js.native
}

object SocketError {
  @scala.inline
  def apply(
    isApplicationError: () => Boolean,
    isProtocolError: () => Boolean,
    isTransportError: () => Boolean,
    message: String,
    name: String
  ): SocketError = {
    val __obj = js.Dynamic.literal(isApplicationError = js.Any.fromFunction0(isApplicationError), isProtocolError = js.Any.fromFunction0(isProtocolError), isTransportError = js.Any.fromFunction0(isTransportError), message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketError]
  }
  @scala.inline
  implicit class SocketErrorOps[Self <: SocketError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsApplicationError(value: () => Boolean): Self = this.set("isApplicationError", js.Any.fromFunction0(value))
    @scala.inline
    def setIsProtocolError(value: () => Boolean): Self = this.set("isProtocolError", js.Any.fromFunction0(value))
    @scala.inline
    def setIsTransportError(value: () => Boolean): Self = this.set("isTransportError", js.Any.fromFunction0(value))
  }
  
}

