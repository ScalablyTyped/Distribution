package typings.samchonFramework.mod.templates

import typings.samchon.protocolCommunicatorIclientdriverMod.IClientDriver
import typings.samchon.protocolInvokeInvokeMod.Invoke
import typings.samchon.templatesDistributedDistributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import typings.samchon.templatesParallelInterfacesIparallelserverMod.IParallelServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parallel {
  
  @JSImport("samchon-framework", "templates.parallel.MediatorClient")
  @js.native
  open class MediatorClient protected ()
    extends typings.samchon.mod.templates.parallel.MediatorClient {
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
  
  @JSImport("samchon-framework", "templates.parallel.MediatorDedicatedWorkerServer")
  @js.native
  open class MediatorDedicatedWorkerServer protected ()
    extends typings.samchon.mod.templates.parallel.MediatorDedicatedWorkerServer {
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
  
  @JSImport("samchon-framework", "templates.parallel.MediatorServer")
  @js.native
  open class MediatorServer protected ()
    extends typings.samchon.mod.templates.parallel.MediatorServer {
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
  
  @JSImport("samchon-framework", "templates.parallel.MediatorSharedWorkerClient")
  @js.native
  open class MediatorSharedWorkerClient protected ()
    extends typings.samchon.mod.templates.parallel.MediatorSharedWorkerClient {
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
  
  @JSImport("samchon-framework", "templates.parallel.MediatorSharedWorkerServer")
  @js.native
  open class MediatorSharedWorkerServer protected ()
    extends typings.samchon.mod.templates.parallel.MediatorSharedWorkerServer {
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
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.parallel.MediatorSystem")
  @js.native
  open class MediatorSystem protected ()
    extends typings.samchon.mod.templates.parallel.MediatorSystem {
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
  
  @JSImport("samchon-framework", "templates.parallel.MediatorWebClient")
  @js.native
  open class MediatorWebClient protected ()
    extends typings.samchon.mod.templates.parallel.MediatorWebClient {
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
  
  @JSImport("samchon-framework", "templates.parallel.MediatorWebServer")
  @js.native
  open class MediatorWebServer protected ()
    extends typings.samchon.mod.templates.parallel.MediatorWebServer {
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
  
  @JSImport("samchon-framework", "templates.parallel.PRInvokeHistory")
  @js.native
  /**
    * Default Constructor.
    */
  open class PRInvokeHistory ()
    extends typings.samchon.mod.templates.parallel.PRInvokeHistory {
    /**
      * Construct from an {@link Invoke} message.
      *
      * @param invoke An {@link Invoke} message requesting a *parallel process*.
      */
    def this(invoke: Invoke) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.parallel.ParallelClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelClientArray[System /* <: typings.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends typings.samchon.mod.templates.parallel.ParallelClientArray[System]
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.parallel.ParallelClientArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelClientArrayMediator[System /* <: typings.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends typings.samchon.mod.templates.parallel.ParallelClientArrayMediator[System]
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.parallel.ParallelServer")
  @js.native
  open class ParallelServer protected ()
    extends typings.samchon.mod.templates.parallel.ParallelServer {
    /**
      * Construct from parent {@link ParallelSystemArray}.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      */
    def this(systemArray: typings.samchon.templatesParallelParallelSystemArrayMod.ParallelSystemArray[IParallelServer]) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.parallel.ParallelServerArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelServerArray[System /* <: IParallelServer */] ()
    extends typings.samchon.mod.templates.parallel.ParallelServerArray[System]
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.parallel.ParallelServerArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelServerArrayMediator[System /* <: IParallelServer */] ()
    extends typings.samchon.mod.templates.parallel.ParallelServerArrayMediator[System]
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.parallel.ParallelServerClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelServerClientArray[System /* <: typings.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends typings.samchon.mod.templates.parallel.ParallelServerClientArray[System]
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.parallel.ParallelServerClientArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelServerClientArrayMediator[System /* <: typings.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends typings.samchon.mod.templates.parallel.ParallelServerClientArrayMediator[System]
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.parallel.ParallelSystem")
  @js.native
  open class ParallelSystem protected ()
    extends typings.samchon.mod.templates.parallel.ParallelSystem {
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
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.parallel.ParallelSystemArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelSystemArray[System /* <: typings.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends typings.samchon.mod.templates.parallel.ParallelSystemArray[System]
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.parallel.ParallelSystemArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  open class ParallelSystemArrayMediator[System /* <: typings.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends typings.samchon.mod.templates.parallel.ParallelSystemArrayMediator[System]
}
