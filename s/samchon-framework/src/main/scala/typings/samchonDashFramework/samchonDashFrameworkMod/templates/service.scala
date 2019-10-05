package typings.samchonDashFramework.samchonDashFrameworkMod.templates

import typings.samchon.protocolCommunicatorClientUnderscoreDriverWebClientDriverMod.WebClientDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon-framework", "templates.service")
@js.native
object service extends js.Object {
  @js.native
  abstract class Client protected ()
    extends typings.samchon.samchonMod.templates.service.Client {
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
    extends typings.samchon.samchonMod.templates.service.Server
  
  @js.native
  abstract class Service protected ()
    extends typings.samchon.samchonMod.templates.service.Service {
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
    extends typings.samchon.samchonMod.templates.service.User {
    /**
      * Construct from its parent {@link Server}.
      *
      * @param server The parent {@link Server} object.
      */
    def this(server: typings.samchon.templatesServiceServerMod.Server) = this()
  }
  
}

