package typings.samchon.templatesServiceMod

import typings.samchon.protocolCommunicatorClientUnderscoreDriverWebClientDriverMod.WebClientDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/service", "Client")
@js.native
abstract class Client protected ()
  extends typings.samchon.templatesServiceClientMod.Client {
  /**
    * Construct from parent {@link User} and communicator.
    *
    * @param user Parent {@link User} object.
    * @param driver Communicator with remote client.
    */
  def this(user: typings.samchon.templatesServiceUserMod.User, driver: WebClientDriver) = this()
}

