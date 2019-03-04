package typings
package samchonLib.protocolServerIServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def addClient(driver: samchonLib.protocolCommunicatorIClientDriverMod.IClientDriver): scala.Unit
  /**
    * Close server.
    *
    * Close opened server. All remote clients, have connected with this server, are also closed and their call back
    * functions, for closed connection, {@link IClientDriver.onClose} are also called.
    */
  def close(): scala.Unit
  /**
    * Open server.
    *
    * @param port Port number to open.
    */
  def open(port: scala.Double): scala.Unit
}

object IServer {
  @scala.inline
  def apply(
    addClient: js.Function1[samchonLib.protocolCommunicatorIClientDriverMod.IClientDriver, scala.Unit],
    close: js.Function0[scala.Unit],
    open: js.Function1[scala.Double, scala.Unit]
  ): IServer = {
    val __obj = js.Dynamic.literal(addClient = addClient, close = close, open = open)
  
    __obj.asInstanceOf[IServer]
  }
}

