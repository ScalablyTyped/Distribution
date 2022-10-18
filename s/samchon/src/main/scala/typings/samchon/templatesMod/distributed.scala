package typings.samchon.templatesMod

import typings.samchon.protocolCommunicatorIclientdriverMod.IClientDriver
import typings.samchon.protocolInvokeInvokeMod.Invoke
import typings.samchon.templatesDistributedInterfacesIdistributedserverMod.IDistributedServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributed {
  
  @JSImport("samchon/templates", "distributed.DSInvokeHistory")
  @js.native
  open class DSInvokeHistory protected ()
    extends typings.samchon.templatesDistributedMod.DSInvokeHistory {
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
  
  /* note: abstract class */ @JSImport("samchon/templates", "distributed.DistributedClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class DistributedClientArray[System /* <: typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends typings.samchon.templatesDistributedMod.DistributedClientArray[System]
  
  /* note: abstract class */ @JSImport("samchon/templates", "distributed.DistributedClientArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  open class DistributedClientArrayMediator[System /* <: typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends typings.samchon.templatesDistributedMod.DistributedClientArrayMediator[System]
  
  /* note: abstract class */ @JSImport("samchon/templates", "distributed.DistributedProcess")
  @js.native
  open class DistributedProcess protected ()
    extends typings.samchon.templatesDistributedMod.DistributedProcess {
    /**
      * Constrct from parent {@link DistributedSystemArray} object.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: typings.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem]) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon/templates", "distributed.DistributedServer")
  @js.native
  open class DistributedServer protected ()
    extends typings.samchon.templatesDistributedMod.DistributedServer {
    /**
      * Construct from parent {@link DistributedSystemArray}.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: typings.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem]) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon/templates", "distributed.DistributedServerArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class DistributedServerArray[System /* <: IDistributedServer */] ()
    extends typings.samchon.templatesDistributedMod.DistributedServerArray[System]
  
  /* note: abstract class */ @JSImport("samchon/templates", "distributed.DistributedServerArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  open class DistributedServerArrayMediator[System /* <: IDistributedServer */] ()
    extends typings.samchon.templatesDistributedMod.DistributedServerArrayMediator[System]
  
  /* note: abstract class */ @JSImport("samchon/templates", "distributed.DistributedServerClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class DistributedServerClientArray[System /* <: typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends typings.samchon.templatesDistributedMod.DistributedServerClientArray[System]
  
  /* note: abstract class */ @JSImport("samchon/templates", "distributed.DistributedServerClientArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  open class DistributedServerClientArrayMediator[System /* <: typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends typings.samchon.templatesDistributedMod.DistributedServerClientArrayMediator[System]
  
  /* note: abstract class */ @JSImport("samchon/templates", "distributed.DistributedSystem")
  @js.native
  open class DistributedSystem protected ()
    extends typings.samchon.templatesDistributedMod.DistributedSystem {
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
  
  /* note: abstract class */ @JSImport("samchon/templates", "distributed.DistributedSystemArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class DistributedSystemArray[System /* <: typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends typings.samchon.templatesDistributedMod.DistributedSystemArray[System]
  
  /* note: abstract class */ @JSImport("samchon/templates", "distributed.DistributedSystemArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  open class DistributedSystemArrayMediator[System /* <: typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends typings.samchon.templatesDistributedMod.DistributedSystemArrayMediator[System]
}
