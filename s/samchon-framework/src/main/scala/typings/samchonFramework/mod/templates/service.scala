package typings.samchonFramework.mod.templates

import typings.samchon.webClientDriverMod.WebClientDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object service {
  
  @JSImport("samchon-framework", "templates.service.Client")
  @js.native
  abstract class Client protected ()
    extends typings.samchon.mod.templates.service.Client {
    /**
      * Construct from parent {@link User} and communicator.
      *
      * @param user Parent {@link User} object.
      * @param driver Communicator with remote client.
      */
    def this(user: typings.samchon.userMod.User, driver: WebClientDriver) = this()
  }
  
  @JSImport("samchon-framework", "templates.service.Server")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class Server ()
    extends typings.samchon.mod.templates.service.Server
  
  @JSImport("samchon-framework", "templates.service.Service")
  @js.native
  abstract class Service protected ()
    extends typings.samchon.mod.templates.service.Service {
    /**
      * Construct from parent {@link Client} and requested path.
      *
      * @param client Driver of remote client.
      * @param path Requested path that identifies this {@link Service}.
      */
    def this(client: typings.samchon.clientMod.Client, path: String) = this()
  }
  
  @JSImport("samchon-framework", "templates.service.User")
  @js.native
  abstract class User protected ()
    extends typings.samchon.mod.templates.service.User {
    /**
      * Construct from its parent {@link Server}.
      *
      * @param server The parent {@link Server} object.
      */
    def this(server: typings.samchon.serviceServerMod.Server) = this()
  }
}
