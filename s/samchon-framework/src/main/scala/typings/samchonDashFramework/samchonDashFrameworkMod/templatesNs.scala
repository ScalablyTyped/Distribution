package typings.samchonDashFramework.samchonDashFrameworkMod

import typings.samchon.protocolCommunicatorClientUnderscoreDriverWebClientDriverMod.WebClientDriver
import typings.samchon.protocolCommunicatorIClientDriverMod.IClientDriver
import typings.samchon.protocolInvokeInvokeMod.Invoke
import typings.samchon.templatesDistributedDistributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import typings.samchon.templatesDistributedInterfacesIDistributedServerMod.IDistributedServer
import typings.samchon.templatesExternalInterfacesIExternalServerMod.IExternalServer
import typings.samchon.templatesParallelInterfacesIParallelServerMod.IParallelServer
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
      extends typings.samchon.samchonMod.templatesNs.distributedNs.DSInvokeHistory {
      /**
        * Construct from a DistributedSystem.
        *
        * @param system The {@link DistributedSystem} object who sent the {@link Invoke} message.
        */
      def this(system: typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem) = this()
      /**
        * Initilizer Constructor.
        *
        * @param system The {@link DistributedSystem} object who sent the {@link Invoke} message.
        * @param process The {@link DistributedProcess} object who sent the {@link Invoke} message.
        * @param invoke An {@link Invoke} message requesting the *distributed process*.
        * @param weight Weight of resource which indicates how heavy this {@link Invoke} message is.
        */
      def this(
        system: typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem,
        process: typings.samchon.templatesDistributedDistributedProcessMod.DistributedProcess,
        invoke: Invoke,
        weight: Double
      ) = this()
    }
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class DistributedClientArray[System /* <: typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
      extends typings.samchon.samchonMod.templatesNs.distributedNs.DistributedClientArray[System]
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class DistributedClientArrayMediator[System /* <: typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
      extends typings.samchon.samchonMod.templatesNs.distributedNs.DistributedClientArrayMediator[System]
    
    @js.native
    abstract class DistributedProcess protected ()
      extends typings.samchon.samchonMod.templatesNs.distributedNs.DistributedProcess {
      /**
        * Constrct from parent {@link DistributedSystemArray} object.
        *
        * @param systemArray The parent {@link DistributedSystemArray} object.
        */
      def this(systemArray: typings.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem]) = this()
    }
    
    @js.native
    abstract class DistributedServer protected ()
      extends typings.samchon.samchonMod.templatesNs.distributedNs.DistributedServer {
      /**
        * Construct from parent {@link DistributedSystemArray}.
        *
        * @param systemArray The parent {@link DistributedSystemArray} object.
        */
      def this(systemArray: typings.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem]) = this()
    }
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class DistributedServerArray[System /* <: IDistributedServer */] ()
      extends typings.samchon.samchonMod.templatesNs.distributedNs.DistributedServerArray[System]
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class DistributedServerArrayMediator[System /* <: IDistributedServer */] ()
      extends typings.samchon.samchonMod.templatesNs.distributedNs.DistributedServerArrayMediator[System]
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class DistributedServerClientArray[System /* <: typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
      extends typings.samchon.samchonMod.templatesNs.distributedNs.DistributedServerClientArray[System]
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class DistributedServerClientArrayMediator[System /* <: typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
      extends typings.samchon.samchonMod.templatesNs.distributedNs.DistributedServerClientArrayMediator[System]
    
    @js.native
    abstract class DistributedSystem protected ()
      extends typings.samchon.samchonMod.templatesNs.distributedNs.DistributedSystem {
      /**
        * Construct from parent {@link DistributedSystemArray}.
        *
        * @param systemArray The parent {@link DistributedSystemArray} object.
        */
      def this(systemArray: typings.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem]) = this()
      /**
        * Constrct from parent {@link DistributedSystemArray} and communicator.
        *
        * @param systemArray The parent {@link DistributedSystemArray} object.
        * @param communicator A communicator communicates with remote, the external system.
        */
      def this(
        systemArray: typings.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem],
        communicator: IClientDriver
      ) = this()
    }
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class DistributedSystemArray[System /* <: typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
      extends typings.samchon.samchonMod.templatesNs.distributedNs.DistributedSystemArray[System]
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class DistributedSystemArrayMediator[System /* <: typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
      extends typings.samchon.samchonMod.templatesNs.distributedNs.DistributedSystemArrayMediator[System]
    
  }
  
  @JSName("external")
  @js.native
  object externalNs extends js.Object {
    @js.native
    /**
      * Default Constructor.
      */
    abstract class ExternalClientArray[T /* <: typings.samchon.templatesExternalExternalSystemMod.ExternalSystem */] ()
      extends typings.samchon.samchonMod.templatesNs.externalNs.ExternalClientArray[T]
    
    @js.native
    abstract class ExternalServer protected ()
      extends typings.samchon.samchonMod.templatesNs.externalNs.ExternalServer {
      /**
        * Construct from parent {@link ExternalSystemArray}.
        *
        * @param systemArray The parent {@link ExternalSystemArray} object.
        */
      def this(systemArray: typings.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray[IExternalServer]) = this()
    }
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class ExternalServerArray[T /* <: IExternalServer */] ()
      extends typings.samchon.samchonMod.templatesNs.externalNs.ExternalServerArray[T]
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class ExternalServerClientArray[T /* <: typings.samchon.templatesExternalExternalSystemMod.ExternalSystem */] ()
      extends typings.samchon.samchonMod.templatesNs.externalNs.ExternalServerClientArray[T]
    
    @js.native
    abstract class ExternalSystem protected ()
      extends typings.samchon.samchonMod.templatesNs.externalNs.ExternalSystem {
      /**
        * Construct from parent {@link ExternalSystemArray}.
        *
        * @param systemArray The parent {@link ExternalSystemArray} object.
        */
      def this(systemArray: typings.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray[typings.samchon.templatesExternalExternalSystemMod.ExternalSystem]) = this()
      /**
        * Constrct from parent {@link ExternalSystemArray} and communicator.
        *
        * @param systemArray The parent {@link ExternalSystemArray} object.
        * @param communicator Communicator with the remote, external system.
        */
      def this(
        systemArray: typings.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray[typings.samchon.templatesExternalExternalSystemMod.ExternalSystem],
        communicator: IClientDriver
      ) = this()
    }
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class ExternalSystemArray[System /* <: typings.samchon.templatesExternalExternalSystemMod.ExternalSystem */] ()
      extends typings.samchon.samchonMod.templatesNs.externalNs.ExternalSystemArray[System]
    
    @js.native
    abstract class ExternalSystemRole protected ()
      extends typings.samchon.samchonMod.templatesNs.externalNs.ExternalSystemRole {
      /**
        * Constructor from a system.
        *
        * @param system An external system containing this role.
        */
      def this(system: typings.samchon.templatesExternalExternalSystemMod.ExternalSystem) = this()
    }
    
  }
  
  @JSName("parallel")
  @js.native
  object parallelNs extends js.Object {
    @js.native
    class MediatorClient protected ()
      extends typings.samchon.samchonMod.templatesNs.parallelNs.MediatorClient {
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
    
    @js.native
    class MediatorDedicatedWorkerServer ()
      extends typings.samchon.samchonMod.templatesNs.parallelNs.MediatorDedicatedWorkerServer
    
    @js.native
    class MediatorServer protected ()
      extends typings.samchon.samchonMod.templatesNs.parallelNs.MediatorServer {
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
    
    @js.native
    class MediatorSharedWorkerClient ()
      extends typings.samchon.samchonMod.templatesNs.parallelNs.MediatorSharedWorkerClient
    
    @js.native
    class MediatorSharedWorkerServer ()
      extends typings.samchon.samchonMod.templatesNs.parallelNs.MediatorSharedWorkerServer
    
    @js.native
    abstract class MediatorSystem protected ()
      extends typings.samchon.samchonMod.templatesNs.parallelNs.MediatorSystem {
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
    
    @js.native
    class MediatorWebClient ()
      extends typings.samchon.samchonMod.templatesNs.parallelNs.MediatorWebClient
    
    @js.native
    class MediatorWebServer ()
      extends typings.samchon.samchonMod.templatesNs.parallelNs.MediatorWebServer
    
    @js.native
    /**
      * Default Constructor.
      */
    class PRInvokeHistory ()
      extends typings.samchon.samchonMod.templatesNs.parallelNs.PRInvokeHistory {
      /**
        * Construct from an {@link Invoke} message.
        *
        * @param invoke An {@link Invoke} message requesting a *parallel process*.
        */
      def this(invoke: Invoke) = this()
    }
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class ParallelClientArray[System /* <: typings.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
      extends typings.samchon.samchonMod.templatesNs.parallelNs.ParallelClientArray[System]
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class ParallelClientArrayMediator[System /* <: typings.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
      extends typings.samchon.samchonMod.templatesNs.parallelNs.ParallelClientArrayMediator[System]
    
    @js.native
    abstract class ParallelServer protected ()
      extends typings.samchon.samchonMod.templatesNs.parallelNs.ParallelServer {
      /**
        * Construct from parent {@link ParallelSystemArray}.
        *
        * @param systemArray The parent {@link ParallelSystemArray} object.
        */
      def this(systemArray: typings.samchon.templatesParallelParallelSystemArrayMod.ParallelSystemArray[IParallelServer]) = this()
    }
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class ParallelServerArray[System /* <: IParallelServer */] ()
      extends typings.samchon.samchonMod.templatesNs.parallelNs.ParallelServerArray[System]
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class ParallelServerArrayMediator[System /* <: IParallelServer */] ()
      extends typings.samchon.samchonMod.templatesNs.parallelNs.ParallelServerArrayMediator[System]
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class ParallelServerClientArray[System /* <: typings.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
      extends typings.samchon.samchonMod.templatesNs.parallelNs.ParallelServerClientArray[System]
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class ParallelServerClientArrayMediator[System /* <: typings.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
      extends typings.samchon.samchonMod.templatesNs.parallelNs.ParallelServerClientArrayMediator[System]
    
    @js.native
    abstract class ParallelSystem protected ()
      extends typings.samchon.samchonMod.templatesNs.parallelNs.ParallelSystem {
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
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class ParallelSystemArray[System /* <: typings.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
      extends typings.samchon.samchonMod.templatesNs.parallelNs.ParallelSystemArray[System]
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class ParallelSystemArrayMediator[System /* <: typings.samchon.templatesParallelParallelSystemMod.ParallelSystem */] ()
      extends typings.samchon.samchonMod.templatesNs.parallelNs.ParallelSystemArrayMediator[System]
    
  }
  
  @JSName("service")
  @js.native
  object serviceNs extends js.Object {
    @js.native
    abstract class Client protected ()
      extends typings.samchon.samchonMod.templatesNs.serviceNs.Client {
      /**
        * Construct from parent {@link User} and communicator.
        *
        * @param user Parent {@link User} object.
        * @param driver Communicator with remote client.
        */
      def this(user: typings.samchon.templatesServiceUserMod.User, driver: WebClientDriver) = this()
    }
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class Server ()
      extends typings.samchon.samchonMod.templatesNs.serviceNs.Server
    
    @js.native
    abstract class Service protected ()
      extends typings.samchon.samchonMod.templatesNs.serviceNs.Service {
      /**
        * Construct from parent {@link Client} and requested path.
        *
        * @param client Driver of remote client.
        * @param path Requested path that identifies this {@link Service}.
        */
      def this(client: typings.samchon.templatesServiceClientMod.Client, path: String) = this()
    }
    
    @js.native
    abstract class User protected ()
      extends typings.samchon.samchonMod.templatesNs.serviceNs.User {
      /**
        * Construct from its parent {@link Server}.
        *
        * @param server The parent {@link Server} object.
        */
      def this(server: typings.samchon.templatesServiceServerMod.Server) = this()
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
      extends typings.samchon.samchonMod.templatesNs.slaveNs.InvokeHistory {
      /**
        * Construct from an {@link Invoke} message.
        *
        * @param invoke An {@link Invoke} message requesting a *parallel or distributed process*.
        */
      def this(invoke: Invoke) = this()
    }
    
    @js.native
    class PInvoke protected ()
      extends typings.samchon.samchonMod.templatesNs.slaveNs.PInvoke {
      /**
        * Initializer Constructor.
        *
        * @param invoke Original {@link Invoke} message.
        * @param history {@link InvokeHistory} object archiving execution time.
        * @param slaveSystem Related {@link SlaveSystem} object who gets those processes from its master.
        */
      def this(
        invoke: Invoke,
        history: typings.samchon.templatesSlaveInvokeHistoryMod.InvokeHistory,
        slaveSystem: typings.samchon.templatesSlaveSlaveSystemMod.SlaveSystem
      ) = this()
    }
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class SlaveClient ()
      extends typings.samchon.samchonMod.templatesNs.slaveNs.SlaveClient
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class SlaveServer ()
      extends typings.samchon.samchonMod.templatesNs.slaveNs.SlaveServer
    
    @js.native
    /**
      * Default Constructor.
      */
    abstract class SlaveSystem ()
      extends typings.samchon.samchonMod.templatesNs.slaveNs.SlaveSystem
    
  }
  
}

