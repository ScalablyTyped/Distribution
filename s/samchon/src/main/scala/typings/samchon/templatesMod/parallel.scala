package typings.samchon.templatesMod

import typings.samchon.protocolCommunicatorIclientdriverMod.IClientDriver
import typings.samchon.protocolInvokeInvokeMod.Invoke
import typings.samchon.templatesDistributedDistributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import typings.samchon.templatesParallelInterfacesIparallelserverMod.IParallelServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parallel {
  
  @JSImport("samchon/templates", "parallel.MediatorClient")
  @js.native
  open class MediatorClient protected ()
    extends typings.samchon.templatesParallelMod.MediatorClient {
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
      systemArray: typings.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typings.samchon.templatesParallelParallelSystemMod.ParallelSystem],
      ip: String,
      port: Double
    ) = this()
  }
  
  @JSImport("samchon/templates", "parallel.MediatorDedicatedWorkerServer")
  @js.native
  open class MediatorDedicatedWorkerServer protected ()
    extends typings.samchon.templatesParallelMod.MediatorDedicatedWorkerServer {
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
      systemArray: typings.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typings.samchon.templatesParallelParallelSystemMod.ParallelSystem],
      port: Double
    ) = this()
  }
  
  @JSImport("samchon/templates", "parallel.MediatorServer")
  @js.native
  open class MediatorServer protected ()
    extends typings.samchon.templatesParallelMod.MediatorServer {
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
      systemArray: typings.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typings.samchon.templatesParallelParallelSystemMod.ParallelSystem],
      port: Double
    ) = this()
  }
  
  @JSImport("samchon/templates", "parallel.MediatorSharedWorkerClient")
  @js.native
  open class MediatorSharedWorkerClient protected ()
    extends typings.samchon.templatesParallelMod.MediatorSharedWorkerClient {
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
      systemArray: typings.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typings.samchon.templatesParallelParallelSystemMod.ParallelSystem],
      ip: String,
      port: Double
    ) = this()
  }
  
  @JSImport("samchon/templates", "parallel.MediatorSharedWorkerServer")
  @js.native
  open class MediatorSharedWorkerServer protected ()
    extends typings.samchon.templatesParallelMod.MediatorSharedWorkerServer {
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
      systemArray: typings.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typings.samchon.templatesParallelParallelSystemMod.ParallelSystem],
      port: Double
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon/templates", "parallel.MediatorSystem")
  @js.native
  open class MediatorSystem protected ()
    extends typings.samchon.templatesParallelMod.MediatorSystem {
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
    def this(systemArray: typings.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typings.samchon.templatesParallelParallelSystemMod.ParallelSystem]) = this()
  }
  
  @JSImport("samchon/templates", "parallel.MediatorWebClient")
  @js.native
  open class MediatorWebClient protected ()
    extends typings.samchon.templatesParallelMod.MediatorWebClient {
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
      systemArray: typings.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typings.samchon.templatesParallelParallelSystemMod.ParallelSystem],
      ip: String,
      port: Double
    ) = this()
  }
  
  @JSImport("samchon/templates", "parallel.MediatorWebServer")
  @js.native
  open class MediatorWebServer protected ()
    extends typings.samchon.templatesParallelMod.MediatorWebServer {
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
      systemArray: typings.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typings.samchon.templatesParallelParallelSystemMod.ParallelSystem],
      port: Double
    ) = this()
  }
  
  @JSImport("samchon/templates", "parallel.PRInvokeHistory")
  @js.native
  /**
    * Default Constructor.
    */
  open class PRInvokeHistory ()
    extends typings.samchon.templatesParallelMod.PRInvokeHistory {
    /**
      * Construct from an {@link Invoke} message.
      *
      * @param invoke An {@link Invoke} message requesting a *parallel process*.
      */
    def this(invoke: Invoke) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon/templates", "parallel.ParallelClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelClientArray[System /* <: typings.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends typings.samchon.templatesParallelMod.ParallelClientArray[System]
  
  /* note: abstract class */ @JSImport("samchon/templates", "parallel.ParallelClientArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelClientArrayMediator[System /* <: typings.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends typings.samchon.templatesParallelMod.ParallelClientArrayMediator[System]
  
  /* note: abstract class */ @JSImport("samchon/templates", "parallel.ParallelServer")
  @js.native
  open class ParallelServer protected ()
    extends typings.samchon.templatesParallelMod.ParallelServer {
    /**
      * Construct from parent {@link ParallelSystemArray}.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      */
    def this(systemArray: typings.samchon.templatesParallelParallelSystemArrayMod.ParallelSystemArray[IParallelServer]) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon/templates", "parallel.ParallelServerArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelServerArray[System /* <: IParallelServer */] ()
    extends typings.samchon.templatesParallelMod.ParallelServerArray[System]
  
  /* note: abstract class */ @JSImport("samchon/templates", "parallel.ParallelServerArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelServerArrayMediator[System /* <: IParallelServer */] ()
    extends typings.samchon.templatesParallelMod.ParallelServerArrayMediator[System]
  
  /* note: abstract class */ @JSImport("samchon/templates", "parallel.ParallelServerClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelServerClientArray[System /* <: typings.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends typings.samchon.templatesParallelMod.ParallelServerClientArray[System]
  
  /* note: abstract class */ @JSImport("samchon/templates", "parallel.ParallelServerClientArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelServerClientArrayMediator[System /* <: typings.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends typings.samchon.templatesParallelMod.ParallelServerClientArrayMediator[System]
  
  /* note: abstract class */ @JSImport("samchon/templates", "parallel.ParallelSystem")
  @js.native
  open class ParallelSystem protected ()
    extends typings.samchon.templatesParallelMod.ParallelSystem {
    /**
      * Construct from parent {@link ParallelSystemArray}.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      */
    def this(systemArray: typings.samchon.templatesParallelParallelSystemArrayMod.ParallelSystemArray[typings.samchon.templatesParallelParallelSystemMod.ParallelSystem]) = this()
    /**
      * Construct from parent {@link ParallelSystemArray} and communicator.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      * @param communicator A communicator communicates with remote, the external system.
      */
    def this(
      systemArray: typings.samchon.templatesParallelParallelSystemArrayMod.ParallelSystemArray[typings.samchon.templatesParallelParallelSystemMod.ParallelSystem],
      communicator: IClientDriver
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon/templates", "parallel.ParallelSystemArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelSystemArray[System /* <: typings.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends typings.samchon.templatesParallelMod.ParallelSystemArray[System]
  
  /* note: abstract class */ @JSImport("samchon/templates", "parallel.ParallelSystemArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelSystemArrayMediator[System /* <: typings.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends typings.samchon.templatesParallelMod.ParallelSystemArrayMediator[System]
}
