package typings.samchon.templatesMod

import typings.samchon.iclientdriverMod.IClientDriver
import typings.samchon.idistributedserverMod.IDistributedServer
import typings.samchon.invokeMod.Invoke
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributed {
  
  @JSImport("samchon/templates", "distributed.DSInvokeHistory")
  @js.native
  class DSInvokeHistory protected ()
    extends typings.samchon.distributedMod.DSInvokeHistory {
    /**
      * Construct from a DistributedSystem.
      *
      * @param system The {@link DistributedSystem} object who sent the {@link Invoke} message.
      */
    def this(system: typings.samchon.distributedSystemMod.DistributedSystem) = this()
    /**
      * Initilizer Constructor.
      *
      * @param system The {@link DistributedSystem} object who sent the {@link Invoke} message.
      * @param process The {@link DistributedProcess} object who sent the {@link Invoke} message.
      * @param invoke An {@link Invoke} message requesting the *distributed process*.
      * @param weight Weight of resource which indicates how heavy this {@link Invoke} message is.
      */
    def this(
      system: typings.samchon.distributedSystemMod.DistributedSystem,
      process: typings.samchon.distributedProcessMod.DistributedProcess,
      invoke: Invoke,
      weight: Double
    ) = this()
  }
  
  @JSImport("samchon/templates", "distributed.DistributedClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedClientArray[System /* <: typings.samchon.distributedSystemMod.DistributedSystem */] ()
    extends typings.samchon.distributedMod.DistributedClientArray[System]
  
  @JSImport("samchon/templates", "distributed.DistributedClientArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedClientArrayMediator[System /* <: typings.samchon.distributedSystemMod.DistributedSystem */] ()
    extends typings.samchon.distributedMod.DistributedClientArrayMediator[System]
  
  @JSImport("samchon/templates", "distributed.DistributedProcess")
  @js.native
  abstract class DistributedProcess protected ()
    extends typings.samchon.distributedMod.DistributedProcess {
    /**
      * Constrct from parent {@link DistributedSystemArray} object.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: typings.samchon.distributedSystemArrayMod.DistributedSystemArray[typings.samchon.distributedSystemMod.DistributedSystem]) = this()
  }
  
  @JSImport("samchon/templates", "distributed.DistributedServer")
  @js.native
  abstract class DistributedServer protected ()
    extends typings.samchon.distributedMod.DistributedServer {
    /**
      * Construct from parent {@link DistributedSystemArray}.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: typings.samchon.distributedSystemArrayMod.DistributedSystemArray[typings.samchon.distributedSystemMod.DistributedSystem]) = this()
  }
  
  @JSImport("samchon/templates", "distributed.DistributedServerArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerArray[System /* <: IDistributedServer */] ()
    extends typings.samchon.distributedMod.DistributedServerArray[System]
  
  @JSImport("samchon/templates", "distributed.DistributedServerArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerArrayMediator[System /* <: IDistributedServer */] ()
    extends typings.samchon.distributedMod.DistributedServerArrayMediator[System]
  
  @JSImport("samchon/templates", "distributed.DistributedServerClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerClientArray[System /* <: typings.samchon.distributedSystemMod.DistributedSystem */] ()
    extends typings.samchon.distributedMod.DistributedServerClientArray[System]
  
  @JSImport("samchon/templates", "distributed.DistributedServerClientArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerClientArrayMediator[System /* <: typings.samchon.distributedSystemMod.DistributedSystem */] ()
    extends typings.samchon.distributedMod.DistributedServerClientArrayMediator[System]
  
  @JSImport("samchon/templates", "distributed.DistributedSystem")
  @js.native
  abstract class DistributedSystem protected ()
    extends typings.samchon.distributedMod.DistributedSystem {
    /**
      * Construct from parent {@link DistributedSystemArray}.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: typings.samchon.distributedSystemArrayMod.DistributedSystemArray[typings.samchon.distributedSystemMod.DistributedSystem]) = this()
    /**
      * Constrct from parent {@link DistributedSystemArray} and communicator.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      * @param communicator A communicator communicates with remote, the external system.
      */
    def this(
      systemArray: typings.samchon.distributedSystemArrayMod.DistributedSystemArray[typings.samchon.distributedSystemMod.DistributedSystem],
      communicator: IClientDriver
    ) = this()
  }
  
  @JSImport("samchon/templates", "distributed.DistributedSystemArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedSystemArray[System /* <: typings.samchon.distributedSystemMod.DistributedSystem */] ()
    extends typings.samchon.distributedMod.DistributedSystemArray[System]
  
  @JSImport("samchon/templates", "distributed.DistributedSystemArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedSystemArrayMediator[System /* <: typings.samchon.distributedSystemMod.DistributedSystem */] ()
    extends typings.samchon.distributedMod.DistributedSystemArrayMediator[System]
}
