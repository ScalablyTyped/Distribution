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

object SockettyServer {
  @scala.inline
  def apply(connection: js.Function1[/* socket */ SockettySocket, scala.Unit] => scala.Unit): SockettyServer = {
    val __obj = js.Dynamic.literal(connection = js.Any.fromFunction1(connection))
  
    __obj.asInstanceOf[SockettyServer]
  }
}

