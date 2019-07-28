package typings.samchon.templatesParallelDerivedParallelClientArrayMediatorMod

import typings.samchon.protocolCommunicatorIClientDriverMod.IClientDriver
import typings.samchon.protocolServerIServerMod.IServer
import typings.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator
import typings.samchon.templatesParallelParallelSystemMod.ParallelSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.samchon.templatesExternalInterfacesIExternalClientArrayMod.IExternalClientArray because var conflicts: _Compute_col_size, _Fetch_index, _Handle_system_erase, _Insert_to_end, _Insert_to_middle, _Notify_erase, _Notify_insert, _Swap, _Try_add_row_at_back, _Try_add_row_at_front, _Try_expand_capacity, capacity_, dispatcher_, iterator, iterator_IContainer, matrix_, size_. Inlined  */ @JSImport("samchon/templates/parallel/derived/ParallelClientArrayMediator", "ParallelClientArrayMediator")
@js.native
/**
  * Default Constructor.
  */
abstract class ParallelClientArrayMediator[System /* <: ParallelSystem */] () extends ParallelSystemArrayMediator[System] {
  /**
    * @hidden
    */
  var server_base_ : js.Any = js.native
  /**
    * Add a newly connected remote client.
    *
    * When a {@link IClientDriver remote client} connects to this *master server of parallel processing system*,
    * then this {@link ParallelClientArrayMediator} creates a child {@link ParallelSystem parallel client} object
    * through the {@link createExternalClient createExternalClient()} method and {@link insert inserts} it.
    *
    * @param driver A communicator for parallel client.
    */
  def addClient(driver: IClientDriver): Unit = js.native
  /**
    * @inheritdoc
    */
  def close(): Unit = js.native
  /**
    * Factory method creating {@link ParallelSystem} object.
    *
    * The method {@link createExternalClient createExternalClient()} is a factory method creating a child
    * {@link ParallelSystem} object, that is called whenever a parallel client has connected, by
    * {@link addClient addClient()}.
    *
    * Overrides this {@link createExternalClient} method and creates a type of {@link ParallelSystem} object with
    * the *driver* that communicates with the parallel client. After the creation, returns the {@link ParallelSystem}
    * object. Then whenever a parallel client has connected, matched {@link ParallelSystem} object will be
    * constructed and {@link insert inserted} into this {@link ParallelClientArrayMediator} object.
    *
    * @param driver A communicator with the parallel client.
    * @return A newly created {@link ParallelSystem} object.
    */
  /* protected */ def createExternalClient(driver: IClientDriver): System = js.native
  /**
    * Factory method creating {@link IServerBase} object.
    *
    * This method {@link createServerBase createServerBase()} determines which protocol is used in this server,
    * {@link ParallelClientArrayMediator}. If the protocol is determined, then
    * {@link ParallelSystem parallel clients} who may connect to {@link ParallelClientArrayMediator this server}
    * must follow the specified
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

