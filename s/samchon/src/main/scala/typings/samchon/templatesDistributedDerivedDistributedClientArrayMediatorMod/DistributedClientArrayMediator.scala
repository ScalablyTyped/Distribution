package typings.samchon.templatesDistributedDerivedDistributedClientArrayMediatorMod

import typings.samchon.protocolCommunicatorIClientDriverMod.IClientDriver
import typings.samchon.protocolServerIServerMod.IServer
import typings.samchon.templatesDistributedDistributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.samchon.templatesExternalInterfacesIExternalClientArrayMod.IExternalClientArray because var conflicts: _Compute_col_size, _Fetch_index, _Handle_system_erase, _Insert_to_end, _Insert_to_middle, _Notify_erase, _Notify_insert, _Swap, _Try_add_row_at_back, _Try_add_row_at_front, _Try_expand_capacity, capacity_, dispatcher_, iterator, iterator_IContainer, matrix_, size_. Inlined  */ @JSImport("samchon/templates/distributed/derived/DistributedClientArrayMediator", "DistributedClientArrayMediator")
@js.native
/**
  * Default Constructor.
  */
abstract class DistributedClientArrayMediator[System /* <: DistributedSystem */] () extends DistributedSystemArrayMediator[System] {
  /**
    * A subrogator of {@link IServer server}'s role instead of this {@link ExternalClientArray}.
    */
  var server_base_ : js.Any = js.native
  /**
    * Add a newly connected remote client.
    *
    * When a {@link IClientDriver remote client} connects to this *master server of distributed processing system*,
    * then this {@link DistributedClientArrayMediator} creates a child {@link Distributed distributed client} object
    * through the {@link createExternalClient createExternalClient()} method.
    *
    * @param driver A communicator for external client.
    */
  def addClient(driver: IClientDriver): Unit = js.native
  /**
    * @inheritdoc
    */
  def close(): Unit = js.native
  /**
    * Factory method creating {@link DistributedSystem} object.
    *
    * The method {@link createExternalClient createExternalClient()} is a factory method creating a child
    * {@link DistributedSystem} object, that is called whenever a distributed client has connected, by
    * {@link addClient addClient()}.
    *
    * Overrides this {@link createExternalClient} method and creates a type of {@link DistributedSystem} object with
    * the *driver* that communicates with the distributed client. After the creation, returns the object. Then whenever
    * a distributed client has connected, matched {@link DistributedSystem} object will be constructed and
    * {@link insert inserted} into this {@link DistributedClientArrayMediator} object.
    *
    * @param driver A communicator with the distributed client.
    * @return A newly created {@link DistributedSystem} object.
    */
  /* protected */ def createExternalClient(driver: IClientDriver): System = js.native
  /**
    * Factory method creating {@link IServerBase} object.
    *
    * This method {@link createServerBase createServerBase()} determines which protocol is used in this
    * {@link DistributedClientArrayMediator} object as a **master**. If the protocol is determined, then
    * {@link DistributedSystem distributed clients} who may connect to {@link DistributedClientArrayMediator this
    * server} must follow the specified protocol.
    *
    * Overrides the {@link createServerBase createServerBase()} method to create and return one of them:
    *
    * - {@link ServerBase}
    * - {@link WebServerBase}
    * - {@link SharedWorkerServerBase}
    *
    * @return A new {@link IServerBase} object.
    */
  /* protected */ def createServerBase(): IServer = js.native
  /**
    * @inheritdoc
    */
  def open(port: Double): Unit = js.native
}

