package typings.samchon

import typings.samchon.distributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typings.samchon.distributedSystemMod.DistributedSystem
import typings.samchon.iclientdriverMod.IClientDriver
import typings.samchon.invokeMod.Invoke
import typings.samchon.iparallelserverMod.IParallelServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parallelMod {
  
  @JSImport("samchon/templates/parallel", "MediatorClient")
  @js.native
  open class MediatorClient protected ()
    extends typings.samchon.mediatorClientMod.MediatorClient {
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
    def this(
      systemArray: typings.samchon.parallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typings.samchon.parallelSystemMod.ParallelSystem],
      ip: String,
      port: Double
    ) = this()
  }
  
  @JSImport("samchon/templates/parallel", "MediatorDedicatedWorkerServer")
  @js.native
  open class MediatorDedicatedWorkerServer protected ()
    extends typings.samchon.mediatorServerMod.MediatorDedicatedWorkerServer {
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
    def this(
      systemArray: typings.samchon.parallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typings.samchon.parallelSystemMod.ParallelSystem],
      port: Double
    ) = this()
  }
  
  @JSImport("samchon/templates/parallel", "MediatorServer")
  @js.native
  open class MediatorServer protected ()
    extends typings.samchon.mediatorServerMod.MediatorServer {
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
    def this(
      systemArray: typings.samchon.parallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typings.samchon.parallelSystemMod.ParallelSystem],
      port: Double
    ) = this()
  }
  
  @JSImport("samchon/templates/parallel", "MediatorSharedWorkerClient")
  @js.native
  open class MediatorSharedWorkerClient protected ()
    extends typings.samchon.mediatorClientMod.MediatorSharedWorkerClient {
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
    def this(
      systemArray: typings.samchon.parallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typings.samchon.parallelSystemMod.ParallelSystem],
      ip: String,
      port: Double
    ) = this()
  }
  
  @JSImport("samchon/templates/parallel", "MediatorSharedWorkerServer")
  @js.native
  open class MediatorSharedWorkerServer protected ()
    extends typings.samchon.mediatorServerMod.MediatorSharedWorkerServer {
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
    def this(
      systemArray: typings.samchon.parallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typings.samchon.parallelSystemMod.ParallelSystem],
      port: Double
    ) = this()
  }
  
  @JSImport("samchon/templates/parallel", "MediatorSystem")
  @js.native
  abstract class MediatorSystem protected ()
    extends typings.samchon.mediatorSystemMod.MediatorSystem {
    /**
      * Construct from parent {@link DistributedSystemArrayMediator} object.
      *
      * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
      */
    def this(systemArray: DistributedSystemArrayMediator[DistributedSystem]) = this()
    /**
      * Construct from parent {@link ParallelSystemArrayMediator} object.
      *
      * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
      */
    def this(systemArray: typings.samchon.parallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typings.samchon.parallelSystemMod.ParallelSystem]) = this()
  }
  
  @JSImport("samchon/templates/parallel", "MediatorWebClient")
  @js.native
  open class MediatorWebClient protected ()
    extends typings.samchon.mediatorClientMod.MediatorWebClient {
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
    def this(
      systemArray: typings.samchon.parallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typings.samchon.parallelSystemMod.ParallelSystem],
      ip: String,
      port: Double
    ) = this()
  }
  
  @JSImport("samchon/templates/parallel", "MediatorWebServer")
  @js.native
  open class MediatorWebServer protected ()
    extends typings.samchon.mediatorServerMod.MediatorWebServer {
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
    def this(
      systemArray: typings.samchon.parallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typings.samchon.parallelSystemMod.ParallelSystem],
      port: Double
    ) = this()
  }
  
  @JSImport("samchon/templates/parallel", "PRInvokeHistory")
  @js.native
  /**
    * Default Constructor.
    */
  open class PRInvokeHistory ()
    extends typings.samchon.prinvokehistoryMod.PRInvokeHistory {
    /**
      * Construct from an {@link Invoke} message.
      *
      * @param invoke An {@link Invoke} message requesting a *parallel process*.
      */
    def this(invoke: Invoke) = this()
  }
  
  @JSImport("samchon/templates/parallel", "ParallelClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelClientArray[System /* <: typings.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typings.samchon.parallelClientArrayMod.ParallelClientArray[System]
  
  @JSImport("samchon/templates/parallel", "ParallelClientArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelClientArrayMediator[System /* <: typings.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typings.samchon.parallelClientArrayMediatorMod.ParallelClientArrayMediator[System]
  
  @JSImport("samchon/templates/parallel", "ParallelServer")
  @js.native
  abstract class ParallelServer protected ()
    extends typings.samchon.parallelServerMod.ParallelServer {
    /**
      * Construct from parent {@link ParallelSystemArray}.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      */
    def this(systemArray: typings.samchon.parallelSystemArrayMod.ParallelSystemArray[IParallelServer]) = this()
  }
  
  @JSImport("samchon/templates/parallel", "ParallelServerArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerArray[System /* <: IParallelServer */] ()
    extends typings.samchon.parallelServerArrayMod.ParallelServerArray[System]
  
  @JSImport("samchon/templates/parallel", "ParallelServerArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerArrayMediator[System /* <: IParallelServer */] ()
    extends typings.samchon.parallelServerArrayMediatorMod.ParallelServerArrayMediator[System]
  
  @JSImport("samchon/templates/parallel", "ParallelServerClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerClientArray[System /* <: typings.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typings.samchon.parallelServerClientArrayMod.ParallelServerClientArray[System]
  
  @JSImport("samchon/templates/parallel", "ParallelServerClientArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerClientArrayMediator[System /* <: typings.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typings.samchon.parallelServerClientArrayMediatorMod.ParallelServerClientArrayMediator[System]
  
  @JSImport("samchon/templates/parallel", "ParallelSystem")
  @js.native
  abstract class ParallelSystem protected ()
    extends typings.samchon.parallelSystemMod.ParallelSystem {
    /**
      * Construct from parent {@link ParallelSystemArray}.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      */
    def this(systemArray: typings.samchon.parallelSystemArrayMod.ParallelSystemArray[typings.samchon.parallelSystemMod.ParallelSystem]) = this()
    /**
      * Construct from parent {@link ParallelSystemArray} and communicator.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      * @param communicator A communicator communicates with remote, the external system.
      */
    def this(
      systemArray: typings.samchon.parallelSystemArrayMod.ParallelSystemArray[typings.samchon.parallelSystemMod.ParallelSystem],
      communicator: IClientDriver
    ) = this()
  }
  
  @JSImport("samchon/templates/parallel", "ParallelSystemArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelSystemArray[System /* <: typings.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typings.samchon.parallelSystemArrayMod.ParallelSystemArray[System]
  
  @JSImport("samchon/templates/parallel", "ParallelSystemArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelSystemArrayMediator[System /* <: typings.samchon.parallelSystemMod.ParallelSystem */] ()
    extends typings.samchon.parallelSystemArrayMediatorMod.ParallelSystemArrayMediator[System]
}
