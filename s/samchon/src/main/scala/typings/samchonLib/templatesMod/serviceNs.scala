package typings
package samchonLib.templatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates", "service")
@js.native
object serviceNs extends js.Object {
  @js.native
  abstract class Client protected ()
    extends samchonLib.templatesServiceMod.Client {
    /**
      * Construct from parent {@link User} and communicator.
      *
      * @param user Parent {@link User} object.
      * @param driver Communicator with remote client.
      */
    def this(user: samchonLib.templatesServiceUserMod.User, driver: samchonLib.protocolCommunicatorClientUnderscoreDriverWebClientDriverMod.WebClientDriver) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class Server ()
    extends samchonLib.templatesServiceMod.Server
  
  @js.native
  abstract class Service protected ()
    extends samchonLib.templatesServiceMod.Service {
    /**
      * Construct from parent {@link Client} and requested path.
      *
      * @param client Driver of remote client.
      * @param path Requested path that identifies this {@link Service}.
      */
    def this(client: samchonLib.templatesServiceClientMod.Client, path: java.lang.String) = this()
  }
  
  @js.native
  abstract class User protected ()
    extends samchonLib.templatesServiceMod.User {
    /**
      * Construct from its parent {@link Server}.
      *
      * @param server The parent {@link Server} object.
      */
    def this(server: samchonLib.templatesServiceServerMod.Server) = this()
  }
  
}

