package typings.samchon.templatesMod

import typings.samchon.protocolCommunicatorClientUnderscoreDriverWebClientDriverMod.WebClientDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates", "service")
@js.native
object serviceNs extends js.Object {
  @js.native
  abstract class Client protected ()
    extends typings.samchon.templatesServiceMod.Client {
    /**
      * Construct from parent {@link User} and communicator.
      *
      * @param user Parent {@link User} object.
      * @param driver Communicator with remote client.
      */
    def this(user: typings.samchon.templatesServiceUserMod.User, driver: WebClientDriver) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class Server ()
    extends typings.samchon.templatesServiceMod.Server
  
  @js.native
  abstract class Service protected ()
    extends typings.samchon.templatesServiceMod.Service {
    /**
      * Construct from parent {@link Client} and requested path.
      *
      * @param client Driver of remote client.
      * @param path Requested path that identifies this {@link Service}.
      */
    def this(client: typings.samchon.templatesServiceClientMod.Client, path: String) = this()
  }
  
  @js.native
  abstract class User protected ()
    extends typings.samchon.templatesServiceMod.User {
    /**
      * Construct from its parent {@link Server}.
      *
      * @param server The parent {@link Server} object.
      */
    def this(server: typings.samchon.templatesServiceServerMod.Server) = this()
  }
  
}

