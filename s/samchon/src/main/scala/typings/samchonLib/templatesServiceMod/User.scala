package typings
package samchonLib.templatesServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/service", "User")
@js.native
abstract class User protected ()
  extends samchonLib.templatesServiceUserMod.User {
  /**
    * Construct from its parent {@link Server}.
    *
    * @param server The parent {@link Server} object.
    */
  def this(server: samchonLib.templatesServiceServerMod.Server) = this()
}

