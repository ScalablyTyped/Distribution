package typings
package sockettyLib.sockettyMod.sockettyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SockettyServer extends js.Object {
  /**
           * Specify a callback to be run when a new socket connects to the server.
           * @param callback The callback
           */
  def connection(callback: js.Function1[/* socket */ SockettySocket, scala.Unit]): scala.Unit
}

