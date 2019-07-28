package typings.samchon.templatesDistributedDerivedDistributedServerMod

import typings.samchon.protocolCommunicatorIServerConnectorMod.IServerConnector
import typings.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray
import typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.samchon.templatesExternalInterfacesIExternalServerMod.IExternalServer because var conflicts: _Compute_col_size, _Fetch_index, _Handle_close, _Insert_to_end, _Insert_to_middle, _Notify_erase, _Notify_insert, _Swap, _Try_add_row_at_back, _Try_add_row_at_front, _Try_expand_capacity, capacity_, communicator, communicator_, dispatcher_, iterator, iterator_IContainer, matrix_, name, size_, system_array_. Inlined connect */ @JSImport("samchon/templates/distributed/derived/DistributedServer", "DistributedServer")
@js.native
abstract class DistributedServer protected () extends DistributedSystem {
  /**
    * Construct from parent {@link DistributedSystemArray}.
    *
    * @param systemArray The parent {@link DistributedSystemArray} object.
    */
  def this(systemArray: DistributedSystemArray[DistributedSystem]) = this()
  /**
    * IP address of target external system to connect.
    */
  var ip: String = js.native
  /**
    * Port number of target external system to connect.
    */
  var port: Double = js.native
  /**
    * @inheritdoc
    */
  /**
    * Connect to the external server.
    */
  def connect(): Unit = js.native
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
  /* protected */ def createServerConnector(): IServerConnector = js.native
}

