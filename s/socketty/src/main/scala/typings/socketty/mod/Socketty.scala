package typings.socketty.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Socketty extends js.Object {
  
  /**
    * Connect to a socketty server.
    * @param url The server url
    * @param callback The callback to be run when the connection is open
    * @return A Socket
    */
  def connect(url: String, callback: js.Function1[/* socket */ SockettySocket, Unit]): SockettySocket = js.native
  
  /**
    * Create a socketty server.
    * @param httpServer The HTTP server to use
    * @return A socketty server
    */
  def createServer(httpServer: js.Any): SockettyServer = js.native
}
object Socketty {
  
  @scala.inline
  def apply(
    connect: (String, js.Function1[/* socket */ SockettySocket, Unit]) => SockettySocket,
    createServer: js.Any => SockettyServer
  ): Socketty = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), createServer = js.Any.fromFunction1(createServer))
    __obj.asInstanceOf[Socketty]
  }
  
  @scala.inline
  implicit class SockettyOps[Self <: Socketty] (val x: Self) extends AnyVal {
    
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
    def setConnect(value: (String, js.Function1[/* socket */ SockettySocket, Unit]) => SockettySocket): Self = this.set("connect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateServer(value: js.Any => SockettyServer): Self = this.set("createServer", js.Any.fromFunction1(value))
  }
}
