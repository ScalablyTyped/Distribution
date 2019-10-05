package typings.samchon

import typings.samchon.protocolCommunicatorIClientDriverMod.IClientDriver
import typings.samchon.templatesExternalInterfacesIExternalServerMod.IExternalServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external", JSImport.Namespace)
@js.native
object templatesExternalMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalClientArray[T /* <: typings.samchon.templatesExternalExternalSystemMod.ExternalSystem */] ()
    extends typings.samchon.templatesExternalDerivedExternalClientArrayMod.ExternalClientArray[T]
  
  @js.native
  abstract class ExternalServer protected ()
    extends typings.samchon.templatesExternalDerivedExternalServerMod.ExternalServer {
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
    extends typings.samchon.templatesExternalDerivedExternalServerArrayMod.ExternalServerArray[T]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalServerClientArray[T /* <: typings.samchon.templatesExternalExternalSystemMod.ExternalSystem */] ()
    extends typings.samchon.templatesExternalDerivedExternalServerClientArrayMod.ExternalServerClientArray[T]
  
  @js.native
  abstract class ExternalSystem protected ()
    extends typings.samchon.templatesExternalExternalSystemMod.ExternalSystem {
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
    extends typings.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray[System]
  
  @js.native
  abstract class ExternalSystemRole protected ()
    extends typings.samchon.templatesExternalExternalSystemRoleMod.ExternalSystemRole {
    /**
      * Constructor from a system.
      *
      * @param system An external system containing this role.
      */
    def this(system: typings.samchon.templatesExternalExternalSystemMod.ExternalSystem) = this()
  }
  
}

