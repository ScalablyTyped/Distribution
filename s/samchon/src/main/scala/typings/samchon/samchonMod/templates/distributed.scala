package typings.samchon.samchonMod.templates

import typings.samchon.protocolCommunicatorIClientDriverMod.IClientDriver
import typings.samchon.protocolInvokeInvokeMod.Invoke
import typings.samchon.templatesDistributedInterfacesIDistributedServerMod.IDistributedServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon", "templates.distributed")
@js.native
object distributed extends js.Object {
  @js.native
  class DSInvokeHistory protected ()
    extends typings.samchon.templatesMod.distributed.DSInvokeHistory {
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
    extends typings.samchon.templatesMod.distributed.DistributedClientArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedClientArrayMediator[System /* <: typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends typings.samchon.templatesMod.distributed.DistributedClientArrayMediator[System]
  
  @js.native
  abstract class DistributedProcess protected ()
    extends typings.samchon.templatesMod.distributed.DistributedProcess {
    /**
      * Constrct from parent {@link DistributedSystemArray} object.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: typings.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem]) = this()
  }
  
  @js.native
  abstract class DistributedServer protected ()
    extends typings.samchon.templatesMod.distributed.DistributedServer {
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
    extends typings.samchon.templatesMod.distributed.DistributedServerArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerArrayMediator[System /* <: IDistributedServer */] ()
    extends typings.samchon.templatesMod.distributed.DistributedServerArrayMediator[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerClientArray[System /* <: typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends typings.samchon.templatesMod.distributed.DistributedServerClientArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerClientArrayMediator[System /* <: typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends typings.samchon.templatesMod.distributed.DistributedServerClientArrayMediator[System]
  
  @js.native
  abstract class DistributedSystem protected ()
    extends typings.samchon.templatesMod.distributed.DistributedSystem {
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
    extends typings.samchon.templatesMod.distributed.DistributedSystemArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedSystemArrayMediator[System /* <: typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends typings.samchon.templatesMod.distributed.DistributedSystemArrayMediator[System]
  
}

