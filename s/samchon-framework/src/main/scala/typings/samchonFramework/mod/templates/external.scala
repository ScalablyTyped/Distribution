package typings.samchonFramework.mod.templates

import typings.samchon.iclientdriverMod.IClientDriver
import typings.samchon.iexternalserverMod.IExternalServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object external {
  
  @JSImport("samchon-framework", "templates.external.ExternalClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalClientArray[T /* <: typings.samchon.externalSystemMod.ExternalSystem */] ()
    extends typings.samchon.mod.templates.external.ExternalClientArray[T]
  
  @JSImport("samchon-framework", "templates.external.ExternalServer")
  @js.native
  abstract class ExternalServer protected ()
    extends typings.samchon.mod.templates.external.ExternalServer {
    /**
      * Construct from parent {@link ExternalSystemArray}.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      */
    def this(systemArray: typings.samchon.externalSystemArrayMod.ExternalSystemArray[IExternalServer]) = this()
  }
  
  @JSImport("samchon-framework", "templates.external.ExternalServerArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalServerArray[T /* <: IExternalServer */] ()
    extends typings.samchon.mod.templates.external.ExternalServerArray[T]
  
  @JSImport("samchon-framework", "templates.external.ExternalServerClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalServerClientArray[T /* <: typings.samchon.externalSystemMod.ExternalSystem */] ()
    extends typings.samchon.mod.templates.external.ExternalServerClientArray[T]
  
  @JSImport("samchon-framework", "templates.external.ExternalSystem")
  @js.native
  abstract class ExternalSystem protected ()
    extends typings.samchon.mod.templates.external.ExternalSystem {
    /**
      * Construct from parent {@link ExternalSystemArray}.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      */
    def this(systemArray: typings.samchon.externalSystemArrayMod.ExternalSystemArray[typings.samchon.externalSystemMod.ExternalSystem]) = this()
    /**
      * Constrct from parent {@link ExternalSystemArray} and communicator.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      * @param communicator Communicator with the remote, external system.
      */
    def this(
      systemArray: typings.samchon.externalSystemArrayMod.ExternalSystemArray[typings.samchon.externalSystemMod.ExternalSystem],
      communicator: IClientDriver
    ) = this()
  }
  
  @JSImport("samchon-framework", "templates.external.ExternalSystemArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalSystemArray[System /* <: typings.samchon.externalSystemMod.ExternalSystem */] ()
    extends typings.samchon.mod.templates.external.ExternalSystemArray[System]
  
  @JSImport("samchon-framework", "templates.external.ExternalSystemRole")
  @js.native
  abstract class ExternalSystemRole protected ()
    extends typings.samchon.mod.templates.external.ExternalSystemRole {
    /**
      * Constructor from a system.
      *
      * @param system An external system containing this role.
      */
    def this(system: typings.samchon.externalSystemMod.ExternalSystem) = this()
  }
}
