package typings
package samchonLib.templatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates", "parallel")
@js.native
object parallelNs extends js.Object {
  @js.native
  class MediatorClient protected ()
    extends samchonLib.templatesParallelMod.MediatorClient {
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
  }
  
  @js.native
  class MediatorDedicatedWorkerServer ()
    extends samchonLib.templatesParallelMod.MediatorDedicatedWorkerServer
  
  @js.native
  class MediatorServer protected ()
    extends samchonLib.templatesParallelMod.MediatorServer {
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
      * @param port Port number of server to open.
      */
    def this(systemArray: samchonLib.templatesDistributedDistributedSystemArrayMediatorMod.DistributedSystemArrayMediator[samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem], port: scala.Double) = this()
    /**
      * Initializer Constructor.
      *
      * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
      * @param port Port number of server to open.
      */
    def this(systemArray: samchonLib.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[samchonLib.templatesParallelParallelSystemMod.ParallelSystem], port: scala.Double) = this()
  }
  
  @js.native
  class MediatorSharedWorkerClient ()
    extends samchonLib.templatesParallelMod.MediatorSharedWorkerClient
  
  @js.native
  class MediatorSharedWorkerServer ()
    extends samchonLib.templatesParallelMod.MediatorSharedWorkerServer
  
  @js.native
  abstract class MediatorSystem protected ()
    extends samchonLib.templatesParallelMod.MediatorSystem {
    /**
      * Construct from parent {@link DistributedSystemArrayMediator} object.
      *
      * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
      */
    def this(systemArray: samchonLib.templatesDistributedDistributedSystemArrayMediatorMod.DistributedSystemArrayMediator[samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem]) = this()
    /**
      * Construct from parent {@link ParallelSystemArrayMediator} object.
      *
      * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
      */
    def this(systemArray: samchonLib.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[samchonLib.templatesParallelParallelSystemMod.ParallelSystem]) = this()
  }
  
  @js.native
  class MediatorWebClient ()
    extends samchonLib.templatesParallelMod.MediatorWebClient
  
  @js.native
  class MediatorWebServer ()
    extends samchonLib.templatesParallelMod.MediatorWebServer
  
  @js.native
  /**
    * Default Constructor.
    */
  class PRInvokeHistory ()
    extends samchonLib.templatesParallelMod.PRInvokeHistory {
    /**
      * Construct from an {@link Invoke} message.
      *
      * @param invoke An {@link Invoke} message requesting a *parallel process*.
      */
    def this(invoke: samchonLib.protocolInvokeInvokeMod.Invoke) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelClientArray[System /* <: samchonLib.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends samchonLib.templatesParallelMod.ParallelClientArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelClientArrayMediator[System /* <: samchonLib.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends samchonLib.templatesParallelMod.ParallelClientArrayMediator[System]
  
  @js.native
  abstract class ParallelServer protected ()
    extends samchonLib.templatesParallelMod.ParallelServer {
    /**
      * Construct from parent {@link ParallelSystemArray}.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      */
    def this(systemArray: samchonLib.templatesParallelParallelSystemArrayMod.ParallelSystemArray[samchonLib.templatesParallelInterfacesIParallelServerMod.IParallelServer]) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerArray[System /* <: samchonLib.templatesParallelInterfacesIParallelServerMod.IParallelServer */] ()
    extends samchonLib.templatesParallelMod.ParallelServerArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerArrayMediator[System /* <: samchonLib.templatesParallelInterfacesIParallelServerMod.IParallelServer */] ()
    extends samchonLib.templatesParallelMod.ParallelServerArrayMediator[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerClientArray[System /* <: samchonLib.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends samchonLib.templatesParallelMod.ParallelServerClientArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelServerClientArrayMediator[System /* <: samchonLib.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends samchonLib.templatesParallelMod.ParallelServerClientArrayMediator[System]
  
  @js.native
  abstract class ParallelSystem protected ()
    extends samchonLib.templatesParallelMod.ParallelSystem {
    /**
      * Construct from parent {@link ParallelSystemArray}.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      */
    def this(systemArray: samchonLib.templatesParallelParallelSystemArrayMod.ParallelSystemArray[samchonLib.templatesParallelParallelSystemMod.ParallelSystem]) = this()
    /**
      * Construct from parent {@link ParallelSystemArray} and communicator.
      *
      * @param systemArray The parent {@link ParallelSystemArray} object.
      * @param communicator A communicator communicates with remote, the external system.
      */
    def this(systemArray: samchonLib.templatesParallelParallelSystemArrayMod.ParallelSystemArray[samchonLib.templatesParallelParallelSystemMod.ParallelSystem], communicator: samchonLib.protocolCommunicatorIClientDriverMod.IClientDriver) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelSystemArray[System /* <: samchonLib.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends samchonLib.templatesParallelMod.ParallelSystemArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelSystemArrayMediator[System /* <: samchonLib.templatesParallelParallelSystemMod.ParallelSystem */] ()
    extends samchonLib.templatesParallelMod.ParallelSystemArrayMediator[System]
  
}

