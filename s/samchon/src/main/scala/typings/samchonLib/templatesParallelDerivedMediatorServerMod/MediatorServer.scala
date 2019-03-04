package typings
package samchonLib.templatesParallelDerivedMediatorServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- samchonLib.templatesSlaveSlaveServerMod.ISlaveServer because var conflicts: _Complete_process, communicator_. Inlined  */ @JSImport("samchon/templates/parallel/derived/MediatorServer", "MediatorServer")
@js.native
class MediatorServer protected ()
  extends samchonLib.templatesParallelMediatorSystemMod.MediatorSystem {
  /**
    * Initializer Constructor.
    *
    * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
    * @param port Port number of server to open.
    */
  def this(systemArray: samchonLib.templatesDistributedDistributedSystemArrayMediatorMod.DistributedSystemArrayMediator[samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem], port: scala.Double) = this()
  /**
    * Initializer Constructor.
    *
    * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
    * @param port Port number of server to open.
    */
  def this(systemArray: samchonLib.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[samchonLib.templatesParallelParallelSystemMod.ParallelSystem], port: scala.Double) = this()
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
  def addClient(driver: samchonLib.protocolCommunicatorIClientDriverMod.IClientDriver): scala.Unit = js.native
  /**
    * @inheritdoc
    */
  def close(): scala.Unit = js.native
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
  /* protected */ def createServerBase(): samchonLib.protocolServerIServerMod.IServer = js.native
  /**
    * @inheritdoc
    */
  def open(port: scala.Double): scala.Unit = js.native
}

