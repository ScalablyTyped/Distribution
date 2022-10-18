package typings.samchonFramework.mod.templates

import typings.samchon.protocolCommunicatorIclientdriverMod.IClientDriver
import typings.samchon.templatesExternalInterfacesIexternalserverMod.IExternalServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object external {
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.external.ExternalClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class ExternalClientArray[T /* <: typings.samchon.templatesExternalExternalSystemMod.ExternalSystem */] ()
    extends typings.samchon.mod.templates.external.ExternalClientArray[T]
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.external.ExternalServer")
  @js.native
  open class ExternalServer protected ()
    extends typings.samchon.mod.templates.external.ExternalServer {
    /**
      * Construct from parent {@link ExternalSystemArray}.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      */
    def this(systemArray: typings.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray[IExternalServer]) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.external.ExternalServerArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class ExternalServerArray[T /* <: IExternalServer */] ()
    extends typings.samchon.mod.templates.external.ExternalServerArray[T]
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.external.ExternalServerClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class ExternalServerClientArray[T /* <: typings.samchon.templatesExternalExternalSystemMod.ExternalSystem */] ()
    extends typings.samchon.mod.templates.external.ExternalServerClientArray[T]
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.external.ExternalSystem")
  @js.native
  open class ExternalSystem protected ()
    extends typings.samchon.mod.templates.external.ExternalSystem {
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
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.external.ExternalSystemArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class ExternalSystemArray[System /* <: typings.samchon.templatesExternalExternalSystemMod.ExternalSystem */] ()
    extends typings.samchon.mod.templates.external.ExternalSystemArray[System]
  
  /* note: abstract class */ @JSImport("samchon-framework", "templates.external.ExternalSystemRole")
  @js.native
  open class ExternalSystemRole protected ()
    extends typings.samchon.mod.templates.external.ExternalSystemRole {
    /**
      * Constructor from a system.
      *
      * @param system An external system containing this role.
      */
    def this(system: typings.samchon.templatesExternalExternalSystemMod.ExternalSystem) = this()
  }
}
