package typings
package samchonLib.templatesDistributedDerivedDistributedServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- samchonLib.templatesExternalInterfacesIExternalServerMod.IExternalServer because var conflicts: _Compute_col_size, _Fetch_index, _Handle_close, _Insert_to_end, _Insert_to_middle, _Notify_erase, _Notify_insert, _Try_add_row_at_back, _Try_add_row_at_front, _Try_expand_capacity, `capacity_`, communicator, `communicator_`, `dispatcher_`, iterator, iterator_IContainer, `matrix_`, name, `size_`, `system_array_`. Inlined connect */ @JSImport("samchon/templates/distributed/derived/DistributedServer", "DistributedServer")
@js.native
abstract class DistributedServer protected ()
  extends samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem {
  /**
    * Construct from parent {@link DistributedSystemArray}.
    *
    * @param systemArray The parent {@link DistributedSystemArray} object.
    */
  def this(systemArray: samchonLib.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem]) = this()
  /**
    * IP address of target external system to connect.
    */
  var ip: java.lang.String = js.native
  /**
    * Port number of target external system to connect.
    */
  var port: scala.Double = js.native
  /**
    * @inheritdoc
    */
  /**
    * Connect to the external server.
    */
  def connect(): scala.Unit = js.native
  /**
    * Factory method creating {@link IServerConnector} object.
    *
    * The {@link createServerConnector createServerConnector()} is an abstract method creating
    * {@link IServerConnector} object. Overrides and returns one of them, considering which protocol the slave server
    * follows:
    *
    * - {@link ServerConnector}
    * - {@link WebServerConnector}
    * - {@link DedicatedWorkerServerConnector}
    * - {@link SharedWorkerServerConnector}
    *
    * @return A newly created {@link IServerConnector} object.
    */
  /* protected */ def createServerConnector(): samchonLib.protocolCommunicatorIServerConnectorMod.IServerConnector = js.native
}

