package typings.signalr.SignalR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transport extends js.Object {
  var name: String = js.native
  def abort(connection: Connection, async: Boolean): Unit = js.native
  def lostConnection(connection: Connection): Unit = js.native
  def reconnect(connection: Connection): Unit = js.native
  def send(connection: Connection, data: js.Any): Unit = js.native
  def start(
    connection: Connection,
    onSuccess: js.Function0[Unit],
    onFailed: js.Function1[/* error */ js.UndefOr[ConnectionError], Unit]
  ): Unit = js.native
  def stop(connection: Connection): Unit = js.native
  def supportsKeepAlive(): Boolean = js.native
}

object Transport {
  @scala.inline
  def apply(
    abort: (Connection, Boolean) => Unit,
    lostConnection: Connection => Unit,
    name: String,
    reconnect: Connection => Unit,
    send: (Connection, js.Any) => Unit,
    start: (Connection, js.Function0[Unit], js.Function1[/* error */ js.UndefOr[ConnectionError], Unit]) => Unit,
    stop: Connection => Unit,
    supportsKeepAlive: () => Boolean
  ): Transport = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction2(abort), lostConnection = js.Any.fromFunction1(lostConnection), name = name.asInstanceOf[js.Any], reconnect = js.Any.fromFunction1(reconnect), send = js.Any.fromFunction2(send), start = js.Any.fromFunction3(start), stop = js.Any.fromFunction1(stop), supportsKeepAlive = js.Any.fromFunction0(supportsKeepAlive))
    __obj.asInstanceOf[Transport]
  }
  @scala.inline
  implicit class TransportOps[Self <: Transport] (val x: Self) extends AnyVal {
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
    def setAbort(value: (Connection, Boolean) => Unit): Self = this.set("abort", js.Any.fromFunction2(value))
    @scala.inline
    def setLostConnection(value: Connection => Unit): Self = this.set("lostConnection", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setReconnect(value: Connection => Unit): Self = this.set("reconnect", js.Any.fromFunction1(value))
    @scala.inline
    def setSend(value: (Connection, js.Any) => Unit): Self = this.set("send", js.Any.fromFunction2(value))
    @scala.inline
    def setStart(
      value: (Connection, js.Function0[Unit], js.Function1[/* error */ js.UndefOr[ConnectionError], Unit]) => Unit
    ): Self = this.set("start", js.Any.fromFunction3(value))
    @scala.inline
    def setStop(value: Connection => Unit): Self = this.set("stop", js.Any.fromFunction1(value))
    @scala.inline
    def setSupportsKeepAlive(value: () => Boolean): Self = this.set("supportsKeepAlive", js.Any.fromFunction0(value))
  }
  
}

