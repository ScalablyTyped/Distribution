package typings.samchon

import typings.samchon.protocolCommunicatorIClientDriverMod.IClientDriver
import typings.samchon.protocolServerIServerMod.IServer
import typings.samchon.templatesDistributedDistributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import typings.samchon.templatesParallelDerivedMediatorServerMod.MediatorServer
import typings.samchon.templatesParallelMediatorSystemMod.MediatorSystem
import typings.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator
import typings.samchon.templatesParallelParallelSystemMod.ParallelSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/parallel/derived/MediatorServer", JSImport.Namespace)
@js.native
object templatesParallelDerivedMediatorServerMod extends js.Object {
  @js.native
  class MediatorDedicatedWorkerServer () extends MediatorServer
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.samchon.protocolInvokeIProtocolMod.IProtocol because Already inherited
  - typings.samchon.templatesSlaveSlaveSystemMod.SlaveSystem because Already inherited
  - typings.samchon.templatesSlaveSlaveServerMod.ISlaveServer because var conflicts: _Complete_process, communicator_. Inlined  */ @js.native
  class MediatorServer protected ()
    extends MediatorSystem
       with IServer {
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
      * @param port Port number of server to open.
      */
    def this(systemArray: DistributedSystemArrayMediator[DistributedSystem], port: Double) = this()
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
      * @param port Port number of server to open.
      */
    def this(systemArray: ParallelSystemArrayMediator[ParallelSystem], port: Double) = this()
    /**
      * @hidden
      */
    var port: js.Any = js.native
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
      * Factory method creating {@link IServer} object.
      *
      * This method {@link createServerBase createServerBase()} determines which protocol is used in this server,
      * {@link MediatorServer}. Note that, **slave** (this {@link MediatorServer} object) must follow the **master**'s
      *
      *
      * Overrides and return one of them considering the which protocol to follow:
      *
      * - {@link ServerBase}
      * - {@link WebServerBase}
      * - {@link SharedWorkerServerBase}
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
  
  @js.native
  class MediatorSharedWorkerServer () extends MediatorServer
  
  @js.native
  class MediatorWebServer () extends MediatorServer
  
}

