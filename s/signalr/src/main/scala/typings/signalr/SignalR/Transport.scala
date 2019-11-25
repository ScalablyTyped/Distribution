package typings.signalr.SignalR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transport extends js.Object {
  var name: String
  def abort(connection: Connection, async: Boolean): Unit
  def lostConnection(connection: Connection): Unit
  def reconnect(connection: Connection): Unit
  def send(connection: Connection, data: js.Any): Unit
  def start(
    connection: Connection,
    onSuccess: js.Function0[Unit],
    onFailed: js.Function1[/* error */ js.UndefOr[ConnectionError], Unit]
  ): Unit
  def stop(connection: Connection): Unit
  def supportsKeepAlive(): Boolean
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
}

