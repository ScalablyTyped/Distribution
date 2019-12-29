package typings.samchon

import typings.samchon.protocolCommunicatorIServerConnectorMod.IServerConnector
import typings.samchon.templatesDistributedDistributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import typings.samchon.templatesParallelMediatorSystemMod.MediatorSystem
import typings.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator
import typings.samchon.templatesParallelParallelSystemMod.ParallelSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/parallel/derived/MediatorClient", JSImport.Namespace)
@js.native
object templatesParallelDerivedMediatorClientMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.samchon.protocolInvokeIProtocolMod.IProtocol because Already inherited
  - typings.samchon.templatesSlaveSlaveSystemMod.SlaveSystem because Already inherited
  - typings.samchon.templatesSlaveSlaveClientMod.ISlaveClient because var conflicts: _Complete_process, communicator_. Inlined connect */ @js.native
  class MediatorClient protected () extends MediatorSystem {
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
      * @param ip IP address to connect.
      * @param port Port number to connect.
      */
    def this(systemArray: DistributedSystemArrayMediator[DistributedSystem], ip: String, port: Double) = this()
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
      * @param ip IP address to connect.
      * @param port Port number to connect.
      */
    def this(systemArray: ParallelSystemArrayMediator[ParallelSystem], ip: String, port: Double) = this()
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
    def connect(): Unit = js.native
    def connect(ip: String, port: Double): Unit = js.native
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
    /* protected */ def createServerConnector(): IServerConnector = js.native
  }
  
  @js.native
  class MediatorSharedWorkerClient () extends MediatorClient
  
  @js.native
  class MediatorWebClient () extends MediatorClient
  
}

