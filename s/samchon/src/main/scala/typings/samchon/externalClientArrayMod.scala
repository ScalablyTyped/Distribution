package typings.samchon

import typings.samchon.externalSystemMod.ExternalSystem
import typings.samchon.iclientdriverMod.IClientDriver
import typings.samchon.iexternalclientarrayMod.IExternalClientArray
import typings.samchon.iserverMod.IServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object externalClientArrayMod {
  
  @JSImport("samchon/templates/external/derived/ExternalClientArray", "ExternalClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalClientArray[T /* <: ExternalSystem */] () extends IExternalClientArray[T] {
    
    /**
      * Factory method creating a child {@link ExternalSystem} object.
      *
      * @param driver A communicator with connected client.
      * @return A newly created {@link ExternalSystem} object.
      */
    /* protected */ def createExternalClient(driver: IClientDriver): T = js.native
    
    /**
      * Factory method creating {@link IServerBase} object.
      *
      * This method {@link createServerBase createServerBase()} determines which templates is used in this server,
      * {@link ExternalClientArray}. If the templates is determined, then {@link ExternalSystem external clients} who
      * may connect to {@link ExternalClientArray this server} must follow the specified templates.
      *
      * Creates and returns one of them:
      *
      * - {@link ServerBase}
      * - {@link WebServerBase}
      * - {@link SharedWorkerServerBase}
      *
      * @return A new {@link IServerBase} object.
      */
    /* protected */ def createServerBase(): IServer = js.native
    
    /**
      * @hidden
      */
    var server_base_ : js.Any = js.native
  }
}
