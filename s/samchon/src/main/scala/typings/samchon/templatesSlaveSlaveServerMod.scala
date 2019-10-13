package typings.samchon

import typings.samchon.protocolCommunicatorIClientDriverMod.IClientDriver
import typings.samchon.protocolServerIServerMod.IServer
import typings.samchon.templatesSlaveSlaveSystemMod.SlaveSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/slave/SlaveServer", JSImport.Namespace)
@js.native
object templatesSlaveSlaveServerMod extends js.Object {
  @js.native
  trait ISlaveServer
    extends SlaveSystem
       with IServer
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveServer ()
    extends SlaveSystem
       with IServer {
    /**
      * @hidden
      */
    var server_base_ : js.Any = js.native
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
    /* CompleteClass */
    override def addClient(driver: IClientDriver): Unit = js.native
    /**
      * Close server.
      *
      * Close opened server. All remote clients, have connected with this server, are also closed and their call back
      * functions, for closed connection, {@link IClientDriver.onClose} are also called.
      */
    /* CompleteClass */
    override def close(): Unit = js.native
    /**
      * @inheritdoc
      */
    /* protected */ def createServerBase(): IServer = js.native
    /**
      * Open server.
      *
      * @param port Port number to open.
      */
    /* CompleteClass */
    override def open(port: Double): Unit = js.native
  }
  
}

