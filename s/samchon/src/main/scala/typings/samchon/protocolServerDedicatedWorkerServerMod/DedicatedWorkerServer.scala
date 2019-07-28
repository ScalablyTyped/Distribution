package typings.samchon.protocolServerDedicatedWorkerServerMod

import typings.samchon.protocolCommunicatorClientUnderscoreDriverDedicatedWorkerClientDriverMod.DedicatedWorkerClientDriver
import typings.samchon.protocolCommunicatorIClientDriverMod.IClientDriver
import typings.samchon.protocolServerIServerMod.IServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/server/DedicatedWorkerServer", "DedicatedWorkerServer")
@js.native
abstract class DedicatedWorkerServer () extends IServer {
  /**
    * @inheritdoc
    */
  def addClient(driver: DedicatedWorkerClientDriver): Unit = js.native
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
  def open(): Unit = js.native
  /**
    * Open server.
    *
    * @param port Port number to open.
    */
  /* CompleteClass */
  override def open(port: Double): Unit = js.native
}

