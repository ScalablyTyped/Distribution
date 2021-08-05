package typings.samchon

import typings.samchon.distributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typings.samchon.distributedSystemMod.DistributedSystem
import typings.samchon.iserverconnectorMod.IServerConnector
import typings.samchon.mediatorSystemMod.MediatorSystem
import typings.samchon.parallelSystemArrayMediatorMod.ParallelSystemArrayMediator
import typings.samchon.parallelSystemMod.ParallelSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediatorClientMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.samchon.iprotocolMod.IProtocol because Already inherited
  - typings.samchon.slaveSystemMod.SlaveSystem because Already inherited
  - typings.samchon.slaveClientMod.ISlaveClient because var conflicts: _Complete_process, communicator_. Inlined connect */ @JSImport("samchon/templates/parallel/derived/MediatorClient", "MediatorClient")
  @js.native
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
    
    /**
      * @hidden
      */
    /* private */ var ip: js.Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var port: js.Any = js.native
  }
  
  @JSImport("samchon/templates/parallel/derived/MediatorClient", "MediatorSharedWorkerClient")
  @js.native
  class MediatorSharedWorkerClient protected () extends MediatorClient {
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
  }
  
  @JSImport("samchon/templates/parallel/derived/MediatorClient", "MediatorWebClient")
  @js.native
  class MediatorWebClient protected () extends MediatorClient {
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
  }
}
