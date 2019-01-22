package typings
package samchonLib.templatesParallelDerivedParallelClientArrayMediatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- samchonLib.templatesExternalInterfacesIExternalClientArrayMod.IExternalClientArray because var conflicts: _Compute_col_size, _Fetch_index, _Handle_system_erase, _Insert_to_end, _Insert_to_middle, _Notify_erase, _Notify_insert, _Try_add_row_at_back, _Try_add_row_at_front, _Try_expand_capacity, `capacity_`, `dispatcher_`, iterator, iterator_IContainer, `matrix_`, `size_`. Inlined  */ @JSImport("samchon/templates/parallel/derived/ParallelClientArrayMediator", "ParallelClientArrayMediator")
@js.native
/**
  * Default Constructor.
  */
abstract class ParallelClientArrayMediator[System /* <: samchonLib.templatesParallelParallelSystemMod.ParallelSystem */] ()
  extends samchonLib.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[System] {
  /**
    * @hidden
    */
  var `server_base_`: js.Any = js.native
  /**
    * Add a newly connected remote client.
    *
    * When a {@link IClientDriver remote client} connects to this *master server of parallel processing system*,
    * then this {@link ParallelClientArrayMediator} creates a child {@link ParallelSystem parallel client} object
    * through the {@link createExternalClient createExternalClient()} method and {@link insert inserts} it.
    *
    * @param driver A communicator for parallel client.
    */
  def addClient(driver: samchonLib.protocolCommunicatorIClientDriverMod.IClientDriver): scala.Unit = js.native
  /**
    * @inheritdoc
    */
  def close(): scala.Unit = js.native
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
  /* protected */ def createExternalClient(driver: samchonLib.protocolCommunicatorIClientDriverMod.IClientDriver): System = js.native
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
  /* protected */ def createServerBase(): samchonLib.protocolServerIServerMod.IServer = js.native
  /**
    * @inheritdoc
    */
  def open(port: scala.Double): scala.Unit = js.native
}

