package typings.samchon.iserverMod

import typings.samchon.iclientdriverMod.IClientDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IServer extends js.Object {
  
  /**
    * Add a newly connected remote client.
    *
    * The {@link addClient addClient()} is an abstract method being called when a remote client is newly connected
    * with {@link IClientDriver} object who communicates with the remote system. Overrides this method and defines
    * what to do with the *driver*, a newly connected remote client.
    *
    * Below methods and example codes may be good for comprehending how to utilize this {@link addClient} method.
    *
    * - https://github.com/samchon/framework-examples/blob/master/calculator/calculator-server.ts
    * - https://github.com/samchon/framework-examples/blob/master/chat-server/server.ts
    * - {@link service.Server.addClient}
    * - {@link external.ExternalClientArray.addClient}
    * - {@link slave.SlaveServer.addClient}
    *
    * @param driver A {@link ICommunicator communicator} with (newly connected) remote client.
    */
  def addClient(driver: IClientDriver): Unit = js.native
  
  /**
    * Close server.
    *
    * Close opened server. All remote clients, have connected with this server, are also closed and their call back
    * functions, for closed connection, {@link IClientDriver.onClose} are also called.
    */
  def close(): Unit = js.native
  
  /**
    * Open server.
    *
    * @param port Port number to open.
    */
  def open(port: Double): Unit = js.native
}
object IServer {
  
  @scala.inline
  def apply(addClient: IClientDriver => Unit, close: () => Unit, open: Double => Unit): IServer = {
    val __obj = js.Dynamic.literal(addClient = js.Any.fromFunction1(addClient), close = js.Any.fromFunction0(close), open = js.Any.fromFunction1(open))
    __obj.asInstanceOf[IServer]
  }
  
  @scala.inline
  implicit class IServerOps[Self <: IServer] (val x: Self) extends AnyVal {
    
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
    def setAddClient(value: IClientDriver => Unit): Self = this.set("addClient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: Double => Unit): Self = this.set("open", js.Any.fromFunction1(value))
  }
}
