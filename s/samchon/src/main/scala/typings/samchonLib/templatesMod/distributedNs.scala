package typings
package samchonLib.templatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates", "distributed")
@js.native
object distributedNs extends js.Object {
  @js.native
  class DSInvokeHistory protected ()
    extends samchonLib.templatesDistributedMod.DSInvokeHistory {
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
    extends samchonLib.templatesDistributedMod.DistributedClientArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedClientArrayMediator[System /* <: samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends samchonLib.templatesDistributedMod.DistributedClientArrayMediator[System]
  
  @js.native
  abstract class DistributedProcess protected ()
    extends samchonLib.templatesDistributedMod.DistributedProcess {
    /**
      * Constrct from parent {@link DistributedSystemArray} object.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: samchonLib.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem]) = this()
  }
  
  @js.native
  abstract class DistributedServer protected ()
    extends samchonLib.templatesDistributedMod.DistributedServer {
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
    extends samchonLib.templatesDistributedMod.DistributedServerArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerArrayMediator[System /* <: samchonLib.templatesDistributedInterfacesIDistributedServerMod.IDistributedServer */] ()
    extends samchonLib.templatesDistributedMod.DistributedServerArrayMediator[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerClientArray[System /* <: samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends samchonLib.templatesDistributedMod.DistributedServerClientArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerClientArrayMediator[System /* <: samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends samchonLib.templatesDistributedMod.DistributedServerClientArrayMediator[System]
  
  @js.native
  abstract class DistributedSystem protected ()
    extends samchonLib.templatesDistributedMod.DistributedSystem {
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
    extends samchonLib.templatesDistributedMod.DistributedSystemArray[System]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedSystemArrayMediator[System /* <: samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem */] ()
    extends samchonLib.templatesDistributedMod.DistributedSystemArrayMediator[System]
  
}

