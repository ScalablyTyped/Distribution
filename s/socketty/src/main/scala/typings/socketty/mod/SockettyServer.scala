package typings.socketty.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SockettyServer extends js.Object {
  
  /**
    * Specify a callback to be run when a new socket connects to the server.
    * @param callback The callback
    */
  def connection(callback: js.Function1[/* socket */ SockettySocket, Unit]): Unit = js.native
}
object SockettyServer {
  
  @scala.inline
  def apply(connection: js.Function1[/* socket */ SockettySocket, Unit] => Unit): SockettyServer = {
    val __obj = js.Dynamic.literal(connection = js.Any.fromFunction1(connection))
    __obj.asInstanceOf[SockettyServer]
  }
  
  @scala.inline
  implicit class SockettyServerOps[Self <: SockettyServer] (val x: Self) extends AnyVal {
    
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
    def setConnection(value: js.Function1[/* socket */ SockettySocket, Unit] => Unit): Self = this.set("connection", js.Any.fromFunction1(value))
  }
}
