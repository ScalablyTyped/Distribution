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
    abort: js.Function2[Connection, scala.Boolean, scala.Unit],
    lostConnection: js.Function1[Connection, scala.Unit],
    name: java.lang.String,
    reconnect: js.Function1[Connection, scala.Unit],
    send: js.Function2[Connection, js.Any, scala.Unit],
    start: js.Function3[
      Connection, 
      js.Function0[scala.Unit], 
      js.Function1[/* error */ js.UndefOr[ConnectionError], scala.Unit], 
      scala.Unit
    ],
    stop: js.Function1[Connection, scala.Unit],
    supportsKeepAlive: js.Function0[scala.Boolean]
  ): Transport = {
    val __obj = js.Dynamic.literal(abort = abort, lostConnection = lostConnection, name = name, reconnect = reconnect, send = send, start = start, stop = stop, supportsKeepAlive = supportsKeepAlive)
  
    __obj.asInstanceOf[Transport]
  }
}

