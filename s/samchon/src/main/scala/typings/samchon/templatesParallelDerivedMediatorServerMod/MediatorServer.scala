package typings.samchon.templatesParallelDerivedMediatorServerMod

import typings.samchon.protocolCommunicatorIClientDriverMod.IClientDriver
import typings.samchon.protocolServerIServerMod.IServer
import typings.samchon.templatesDistributedDistributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import typings.samchon.templatesParallelMediatorSystemMod.MediatorSystem
import typings.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator
import typings.samchon.templatesParallelParallelSystemMod.ParallelSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.samchon.templatesSlaveSlaveServerMod.ISlaveServer because var conflicts: _Complete_process, communicator_. Inlined  */ @JSImport("samchon/templates/parallel/derived/MediatorServer", "MediatorServer")
@js.native
class MediatorServer protected () extends MediatorSystem {
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
    * {@link MediatorServer} represents a **slave** dedicating to its **master**. In that reason, the
    * {@link MediatorServer} does not accept multiple **master** clients. It accepts only one. Thus, *listener* of
    * the *communicator* is {@link MediatorSystem} object, itself.
    *
    * @param driver A communicator with remote client.
    */
  def addClient(driver: IClientDriver): Unit = js.native
  /**
    * @inheritdoc
    */
  def close(): Unit = js.native
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
    * @inheritdoc
    */
  def open(port: Double): Unit = js.native
}

