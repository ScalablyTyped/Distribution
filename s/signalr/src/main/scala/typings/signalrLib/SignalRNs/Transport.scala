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

