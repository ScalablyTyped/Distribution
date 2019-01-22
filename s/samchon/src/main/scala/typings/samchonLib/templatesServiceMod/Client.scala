package typings
package samchonLib.templatesServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/service", "Client")
@js.native
abstract class Client protected ()
  extends samchonLib.templatesServiceClientMod.Client {
  /**
    * Construct from parent {@link User} and communicator.
    *
    * @param user Parent {@link User} object.
    * @param driver Communicator with remote client.
    */
  def this(user: samchonLib.templatesServiceUserMod.User, driver: samchonLib.protocolCommunicatorClientUnderscoreDriverWebClientDriverMod.WebClientDriver) = this()
}

