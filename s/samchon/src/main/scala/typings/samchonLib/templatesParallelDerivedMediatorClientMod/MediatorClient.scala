package typings
package samchonLib.templatesParallelDerivedMediatorClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- samchonLib.templatesSlaveSlaveClientMod.ISlaveClient because var conflicts: _Complete_process, `communicator_`. Inlined connect */ @JSImport("samchon/templates/parallel/derived/MediatorClient", "MediatorClient")
@js.native
class MediatorClient protected ()
  extends samchonLib.templatesParallelMediatorSystemMod.MediatorSystem {
  /**
    * Initializer Constructor.
    *
    * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
    * @param ip IP address to connect.
    * @param port Port number to connect.
    */
  def this(systemArray: samchonLib.templatesDistributedDistributedSystemArrayMediatorMod.DistributedSystemArrayMediator[samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem], ip: java.lang.String, port: scala.Double) = this()
  /**
    * Initializer Constructor.
    *
    * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
    * @param ip IP address to connect.
    * @param port Port number to connect.
    */
  def this(systemArray: samchonLib.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[samchonLib.templatesParallelParallelSystemMod.ParallelSystem], ip: java.lang.String, port: scala.Double) = this()
  /**
    * @hidden
    */
  var ip: js.Any = js.native
  /**
    * @hidden
    */
  var port: js.Any = js.native
  /**
    * @inheritdoc
    */
  def connect(): scala.Unit = js.native
  def connect(ip: java.lang.String, port: scala.Double): scala.Unit = js.native
  /**
    * Factory method creating {@link IServerConnector} object.
    *
    * The {@link createServerConnector createServerConnector()} is an abstract method creating
    * {@link IServerConnector} object. Overrides and returns one of them, considering which protocol the **master**
    * server follows:
    *
    * - {@link ServerConnector}
    * - {@link WebServerConnector}
    * - {@link SharedWorkerServerConnector}
    *
    * @return A newly created {@link IServerConnector} object.
    */
  /* protected */ def createServerConnector(): samchonLib.protocolCommunicatorIServerConnectorMod.IServerConnector = js.native
}

