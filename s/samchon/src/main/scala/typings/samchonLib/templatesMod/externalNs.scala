package typings
package samchonLib.templatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates", "external")
@js.native
object externalNs extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalClientArray[T /* <: samchonLib.templatesExternalExternalSystemMod.ExternalSystem */] ()
    extends samchonLib.templatesExternalMod.ExternalClientArray[T]
  
  @js.native
  abstract class ExternalServer protected ()
    extends samchonLib.templatesExternalMod.ExternalServer {
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
    extends samchonLib.templatesExternalMod.ExternalServerArray[T]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalServerClientArray[T /* <: samchonLib.templatesExternalExternalSystemMod.ExternalSystem */] ()
    extends samchonLib.templatesExternalMod.ExternalServerClientArray[T]
  
  @js.native
  abstract class ExternalSystem protected ()
    extends samchonLib.templatesExternalMod.ExternalSystem {
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
    extends samchonLib.templatesExternalMod.ExternalSystemArray[System]
  
  @js.native
  abstract class ExternalSystemRole protected ()
    extends samchonLib.templatesExternalMod.ExternalSystemRole {
    /**
      * Constructor from a system.
      *
      * @param system An external system containing this role.
      */
    def this(system: samchonLib.templatesExternalExternalSystemMod.ExternalSystem) = this()
  }
  
}

