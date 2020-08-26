package typings.pusherJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connected extends js.Object {
  def backoff(): Unit = js.native
  def connected(handshake: js.Any): Unit = js.native
  def refused(): Unit = js.native
  def retry(): Unit = js.native
  def ssl_only(): Unit = js.native
}

object Connected {
  @scala.inline
  def apply(
    backoff: () => Unit,
    connected: js.Any => Unit,
    refused: () => Unit,
    retry: () => Unit,
    ssl_only: () => Unit
  ): Connected = {
    val __obj = js.Dynamic.literal(backoff = js.Any.fromFunction0(backoff), connected = js.Any.fromFunction1(connected), refused = js.Any.fromFunction0(refused), retry = js.Any.fromFunction0(retry), ssl_only = js.Any.fromFunction0(ssl_only))
    __obj.asInstanceOf[Connected]
  }
  @scala.inline
  implicit class ConnectedOps[Self <: Connected] (val x: Self) extends AnyVal {
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
    def setBackoff(value: () => Unit): Self = this.set("backoff", js.Any.fromFunction0(value))
    @scala.inline
    def setConnected(value: js.Any => Unit): Self = this.set("connected", js.Any.fromFunction1(value))
    @scala.inline
    def setRefused(value: () => Unit): Self = this.set("refused", js.Any.fromFunction0(value))
    @scala.inline
    def setRetry(value: () => Unit): Self = this.set("retry", js.Any.fromFunction0(value))
    @scala.inline
    def setSsl_only(value: () => Unit): Self = this.set("ssl_only", js.Any.fromFunction0(value))
  }
  
}

