package typings.samchon.templatesMod

import typings.samchon.iclientdriverMod.IClientDriver
import typings.samchon.iexternalserverMod.IExternalServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object external {
  
  @JSImport("samchon/templates", "external.ExternalClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalClientArray[T /* <: typings.samchon.externalSystemMod.ExternalSystem */] ()
    extends typings.samchon.externalMod.ExternalClientArray[T]
  
  @JSImport("samchon/templates", "external.ExternalServer")
  @js.native
  abstract class ExternalServer protected ()
    extends typings.samchon.externalMod.ExternalServer {
    /**
      * Construct from parent {@link ExternalSystemArray}.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      */
    def this(systemArray: typings.samchon.externalSystemArrayMod.ExternalSystemArray[IExternalServer]) = this()
  }
  
  @JSImport("samchon/templates", "external.ExternalServerArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalServerArray[T /* <: IExternalServer */] ()
    extends typings.samchon.externalMod.ExternalServerArray[T]
  
  @JSImport("samchon/templates", "external.ExternalServerClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalServerClientArray[T /* <: typings.samchon.externalSystemMod.ExternalSystem */] ()
    extends typings.samchon.externalMod.ExternalServerClientArray[T]
  
  @JSImport("samchon/templates", "external.ExternalSystem")
  @js.native
  abstract class ExternalSystem protected ()
    extends typings.samchon.externalMod.ExternalSystem {
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
  
  @JSImport("samchon/templates", "external.ExternalSystemArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalSystemArray[System /* <: typings.samchon.externalSystemMod.ExternalSystem */] ()
    extends typings.samchon.externalMod.ExternalSystemArray[System]
  
  @JSImport("samchon/templates", "external.ExternalSystemRole")
  @js.native
  abstract class ExternalSystemRole protected ()
    extends typings.samchon.externalMod.ExternalSystemRole {
    /**
      * Constructor from a system.
      *
      * @param system An external system containing this role.
      */
    def this(system: typings.samchon.externalSystemMod.ExternalSystem) = this()
  }
}
