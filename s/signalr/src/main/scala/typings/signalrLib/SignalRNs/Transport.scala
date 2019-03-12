package typings
package signalrLib.SignalRNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transport extends js.Object {
  var name: java.lang.String
  def abort(connection: Connection, async: scala.Boolean): scala.Unit
  def lostConnection(connection: Connection): scala.Unit
  def reconnect(connection: Connection): scala.Unit
  def send(connection: Connection, data: js.Any): scala.Unit
  def start(
    connection: Connection,
    onSuccess: js.Function0[scala.Unit],
    onFailed: js.Function1[/* error */ js.UndefOr[ConnectionError], scala.Unit]
  ): scala.Unit
  def stop(connection: Connection): scala.Unit
  def supportsKeepAlive(): scala.Boolean
}

object Transport {
  @scala.inline
  def apply(
    abort: (Connection, scala.Boolean) => scala.Unit,
    lostConnection: Connection => scala.Unit,
    name: java.lang.String,
    reconnect: Connection => scala.Unit,
    send: (Connection, js.Any) => scala.Unit,
    start: (Connection, js.Function0[scala.Unit], js.Function1[/* error */ js.UndefOr[ConnectionError], scala.Unit]) => scala.Unit,
    stop: Connection => scala.Unit,
    supportsKeepAlive: () => scala.Boolean
  ): Transport = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction2(abort), lostConnection = js.Any.fromFunction1(lostConnection), name = name, reconnect = js.Any.fromFunction1(reconnect), send = js.Any.fromFunction2(send), start = js.Any.fromFunction3(start), stop = js.Any.fromFunction1(stop), supportsKeepAlive = js.Any.fromFunction0(supportsKeepAlive))
  
    __obj.asInstanceOf[Transport]
  }
}

