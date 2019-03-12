package typings
package sockettyLib.sockettyMod.sockettyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Socketty extends js.Object {
  /**
    * Connect to a socketty server.
    * @param url The server url
    * @param callback The callback to be run when the connection is open
    * @return A Socket
    */
  def connect(url: java.lang.String, callback: js.Function1[/* socket */ SockettySocket, scala.Unit]): SockettySocket
  /**
    * Create a socketty server.
    * @param httpServer The HTTP server to use
    * @return A socketty server
    */
  def createServer(httpServer: js.Any): SockettyServer
}

object Socketty {
  @scala.inline
  def apply(
    connect: (java.lang.String, js.Function1[/* socket */ SockettySocket, scala.Unit]) => SockettySocket,
    createServer: js.Any => SockettyServer
  ): Socketty = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), createServer = js.Any.fromFunction1(createServer))
  
    __obj.asInstanceOf[Socketty]
  }
}

