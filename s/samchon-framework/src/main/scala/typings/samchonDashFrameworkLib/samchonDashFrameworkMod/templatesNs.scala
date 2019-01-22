package typings
package samchonDashFrameworkLib.samchonDashFrameworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon-framework", "templates")
@js.native
object templatesNs extends js.Object {
  @JSName("distributed")
  @js.native
  object distributedNs extends js.Object {
    @js.native
    class DSInvokeHistory protected ()
      extends samchonLib.samchonMod.templatesNs.distributedNs.DSInvokeHistory {
      /**
        * Construct from a DistributedSystem.
        *
        * @param system The {@link DistributedSystem} object who sent the {@link Invoke} message.
        */
      def this(system: samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem) = this()
      /**
        * Initilizer Constructor.
        *
        * @param system The {@link DistributedSystem} object who sent the {@link Invoke} message.
        * @param process The {@link DistributedProcess} object who sent the {@link Invoke} message.
        * @param invoke An {@link Invoke} message requesting the *distributed process*.
        * @param weight Weight of resource which indicates how heavy this {@link Invoke} message is.
        */
      def this(system: samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem, process: samchonLib.templatesDistributedDistributedProcessMod.DistributedProcess, invoke: samchonLib.protocolInvokeInvokeMod.Invoke, weight: scala.Double) = this()
    }
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class DistributedClientArray[System /* <: samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
      extends samchonLib.samchonMod.templatesNs.distributedNs.DistributedClientArray[System]
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class DistributedClientArrayMediator[System /* <: samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
      extends samchonLib.samchonMod.templatesNs.distributedNs.DistributedClientArrayMediator[System]
    
    @js.native
    abstract class DistributedProcess protected ()
      extends samchonLib.samchonMod.templatesNs.distributedNs.DistributedProcess {
      /**
        * Constrct from parent {@link DistributedSystemArray} object.
        *
        * @param systemArray The parent {@link DistributedSystemArray} object.
        */
      def this(systemArray: samchonLib.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem]) = this()
    }
    
    @js.native
    abstract class DistributedServer protected ()
      extends samchonLib.samchonMod.templatesNs.distributedNs.DistributedServer {
      /**
        * Construct from parent {@link DistributedSystemArray}.
        *
        * @param systemArray The parent {@link DistributedSystemArray} object.
        */
      def this(systemArray: samchonLib.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem]) = this()
    }
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class DistributedServerArray[System /* <: samchonLib.templatesDistributedInterfacesIDistributedServerMod.IDistributedServer */] ()
      extends samchonLib.samchonMod.templatesNs.distributedNs.DistributedServerArray[System]
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class DistributedServerArrayMediator[System /* <: samchonLib.templatesDistributedInterfacesIDistributedServerMod.IDistributedServer */] ()
      extends samchonLib.samchonMod.templatesNs.distributedNs.DistributedServerArrayMediator[System]
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class DistributedServerClientArray[System /* <: samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
      extends samchonLib.samchonMod.templatesNs.distributedNs.DistributedServerClientArray[System]
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class DistributedServerClientArrayMediator[System /* <: samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
      extends samchonLib.samchonMod.templatesNs.distributedNs.DistributedServerClientArrayMediator[System]
    
    @js.native
    abstract class DistributedSystem protected ()
      extends samchonLib.samchonMod.templatesNs.distributedNs.DistributedSystem {
      /**
        * Construct from parent {@link DistributedSystemArray}.
        *
        * @param systemArray The parent {@link DistributedSystemArray} object.
        */
      def this(systemArray: samchonLib.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem]) = this()
      /**
        * Constrct from parent {@link DistributedSystemArray} and communicator.
        *
        * @param systemArray The parent {@link DistributedSystemArray} object.
        * @param communicator A communicator communicates with remote, the external system.
        */
      def this(systemArray: samchonLib.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem], communicator: samchonLib.protocolCommunicatorIClientDriverMod.IClientDriver) = this()
    }
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class DistributedSystemArray[System /* <: samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
      extends samchonLib.samchonMod.templatesNs.distributedNs.DistributedSystemArray[System]
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class DistributedSystemArrayMediator[System /* <: samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
      extends samchonLib.samchonMod.templatesNs.distributedNs.DistributedSystemArrayMediator[System]
    
  }
  
  @JSName("external")
  @js.native
  object externalNs extends js.Object {
    @js.native
    /**
      * Default Constructor.
      */
    abstract class ExternalClientArray[T /* <: samchonLib.templatesExternalExternalSystemMod.ExternalSystem */] ()
      extends samchonLib.samchonMod.templatesNs.externalNs.ExternalClientArray[T]
    
    @js.native
    abstract class ExternalServer protected ()
      extends samchonLib.samchonMod.templatesNs.externalNs.ExternalServer {
      /**
        * Construct from parent {@link ExternalSystemArray}.
        *
        * @param systemArray The parent {@link ExternalSystemArray} object.
        */
      def this(systemArray: samchonLib.templatesExternalExternalSystemArrayMod.ExternalSystemArray[samchonLib.templatesExternalInterfacesIExternalServerMod.IExternalServer]) = this()
    }
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class ExternalServerArray[T /* <: samchonLib.templatesExternalInterfacesIExternalServerMod.IExternalServer */] ()
      extends samchonLib.samchonMod.templatesNs.externalNs.ExternalServerArray[T]
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class ExternalServerClientArray[T /* <: samchonLib.templatesExternalExternalSystemMod.ExternalSystem */] ()
      extends samchonLib.samchonMod.templatesNs.externalNs.ExternalServerClientArray[T]
    
    @js.native
    abstract class ExternalSystem protected ()
      extends samchonLib.samchonMod.templatesNs.externalNs.ExternalSystem {
      /**
        * Construct from parent {@link ExternalSystemArray}.
        *
        * @param systemArray The parent {@link ExternalSystemArray} object.
        */
      def this(systemArray: samchonLib.templatesExternalExternalSystemArrayMod.ExternalSystemArray[samchonLib.templatesExternalExternalSystemMod.ExternalSystem]) = this()
      /**
        * Constrct from parent {@link ExternalSystemArray} and communicator.
        *
        * @param systemArray The parent {@link ExternalSystemArray} object.
        * @param communicator Communicator with the remote, external system.
        */
      def this(systemArray: samchonLib.templatesExternalExternalSystemArrayMod.ExternalSystemArray[samchonLib.templatesExternalExternalSystemMod.ExternalSystem], communicator: samchonLib.protocolCommunicatorIClientDriverMod.IClientDriver) = this()
    }
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class ExternalSystemArray[System /* <: samchonLib.templatesExternalExternalSystemMod.ExternalSystem */] ()
      extends samchonLib.samchonMod.templatesNs.externalNs.ExternalSystemArray[System]
    
    @js.native
    abstract class ExternalSystemRole protected ()
      extends samchonLib.samchonMod.templatesNs.externalNs.ExternalSystemRole {
      /**
        * Constructor from a system.
        *
        * @param system An external system containing this role.
        */
      def this(system: samchonLib.templatesExternalExternalSystemMod.ExternalSystem) = this()
    }
    
  }
  
  @JSName("parallel")
  @js.native
  object parallelNs extends js.Object {
    @js.native
    class MediatorClient protected ()
      extends samchonLib.samchonMod.templatesNs.parallelNs.MediatorClient {
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
      extends samchonLib.samchonMod.templatesNs.parallelNs.MediatorDedicatedWorkerServer
    
    @js.native
    class MediatorServer protected ()
      extends samchonLib.samchonMod.templatesNs.parallelNs.MediatorServer {
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
      extends samchonLib.samchonMod.templatesNs.parallelNs.MediatorSharedWorkerClient
    
    @js.native
    class MediatorSharedWorkerServer ()
      extends samchonLib.samchonMod.templatesNs.parallelNs.MediatorSharedWorkerServer
    
    @js.native
    abstract class MediatorSystem protected ()
      extends samchonLib.samchonMod.templatesNs.parallelNs.MediatorSystem {
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
      extends samchonLib.samchonMod.templatesNs.parallelNs.MediatorWebClient
    
    @js.native
    class MediatorWebServer ()
      extends samchonLib.samchonMod.templatesNs.parallelNs.MediatorWebServer
    
    @js.native
    /**
      * Default Constructor.
      */
    class PRInvokeHistory ()
      extends samchonLib.samchonMod.templatesNs.parallelNs.PRInvokeHistory {
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
      extends samchonLib.samchonMod.templatesNs.parallelNs.ParallelClientArray[System]
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class ParallelClientArrayMediator[System /* <: samchonLib.templatesParallelParallelSystemMod.ParallelSystem */] ()
      extends samchonLib.samchonMod.templatesNs.parallelNs.ParallelClientArrayMediator[System]
    
    @js.native
    abstract class ParallelServer protected ()
      extends samchonLib.samchonMod.templatesNs.parallelNs.ParallelServer {
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
      extends samchonLib.samchonMod.templatesNs.parallelNs.ParallelServerArray[System]
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class ParallelServerArrayMediator[System /* <: samchonLib.templatesParallelInterfacesIParallelServerMod.IParallelServer */] ()
      extends samchonLib.samchonMod.templatesNs.parallelNs.ParallelServerArrayMediator[System]
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class ParallelServerClientArray[System /* <: samchonLib.templatesParallelParallelSystemMod.ParallelSystem */] ()
      extends samchonLib.samchonMod.templatesNs.parallelNs.ParallelServerClientArray[System]
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class ParallelServerClientArrayMediator[System /* <: samchonLib.templatesParallelParallelSystemMod.ParallelSystem */] ()
      extends samchonLib.samchonMod.templatesNs.parallelNs.ParallelServerClientArrayMediator[System]
    
    @js.native
    abstract class ParallelSystem protected ()
      extends samchonLib.samchonMod.templatesNs.parallelNs.ParallelSystem {
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
      extends samchonLib.samchonMod.templatesNs.parallelNs.ParallelSystemArray[System]
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class ParallelSystemArrayMediator[System /* <: samchonLib.templatesParallelParallelSystemMod.ParallelSystem */] ()
      extends samchonLib.samchonMod.templatesNs.parallelNs.ParallelSystemArrayMediator[System]
    
  }
  
  @JSName("service")
  @js.native
  object serviceNs extends js.Object {
    @js.native
    abstract class Client protected ()
      extends samchonLib.samchonMod.templatesNs.serviceNs.Client {
      /**
        * Construct from parent {@link User} and communicator.
        *
        * @param user Parent {@link User} object.
        * @param driver Communicator with remote client.
        */
      def this(user: samchonLib.templatesServiceUserMod.User, driver: samchonLib.protocolCommunicatorClientUnderscoreDriverWebClientDriverMod.WebClientDriver) = this()
    }
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class Server ()
      extends samchonLib.samchonMod.templatesNs.serviceNs.Server
    
    @js.native
    abstract class Service protected ()
      extends samchonLib.samchonMod.templatesNs.serviceNs.Service {
      /**
        * Construct from parent {@link Client} and requested path.
        *
        * @param client Driver of remote client.
        * @param path Requested path that identifies this {@link Service}.
        */
      def this(client: samchonLib.templatesServiceClientMod.Client, path: java.lang.String) = this()
    }
    
    @js.native
    abstract class User protected ()
      extends samchonLib.samchonMod.templatesNs.serviceNs.User {
      /**
        * Construct from its parent {@link Server}.
        *
        * @param server The parent {@link Server} object.
        */
      def this(server: samchonLib.templatesServiceServerMod.Server) = this()
    }
    
  }
  
  @JSName("slave")
  @js.native
  object slaveNs extends js.Object {
    @js.native
    /**
      * Default Constructor.
      */
    class InvokeHistory ()
      extends samchonLib.samchonMod.templatesNs.slaveNs.InvokeHistory {
      /**
        * Construct from an {@link Invoke} message.
        *
        * @param invoke An {@link Invoke} message requesting a *parallel or distributed process*.
        */
      def this(invoke: samchonLib.protocolInvokeInvokeMod.Invoke) = this()
    }
    
    @js.native
    class PInvoke protected ()
      extends samchonLib.samchonMod.templatesNs.slaveNs.PInvoke {
      /**
        * Initializer Constructor.
        *
        * @param invoke Original {@link Invoke} message.
        * @param history {@link InvokeHistory} object archiving execution time.
        * @param slaveSystem Related {@link SlaveSystem} object who gets those processes from its master.
        */
      def this(invoke: samchonLib.protocolInvokeInvokeMod.Invoke, history: samchonLib.templatesSlaveInvokeHistoryMod.InvokeHistory, slaveSystem: samchonLib.templatesSlaveSlaveSystemMod.SlaveSystem) = this()
    }
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class SlaveClient ()
      extends samchonLib.samchonMod.templatesNs.slaveNs.SlaveClient
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class SlaveServer ()
      extends samchonLib.samchonMod.templatesNs.slaveNs.SlaveServer
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class SlaveSystem ()
      extends samchonLib.samchonMod.templatesNs.slaveNs.SlaveSystem
    
  }
  
}

