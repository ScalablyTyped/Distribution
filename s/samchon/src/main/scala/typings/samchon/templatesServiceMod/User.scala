package typings.samchon.templatesServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/service", "User")
@js.native
abstract class User protected ()
  extends typings.samchon.templatesServiceUserMod.User {
  /**
    * Construct from its parent {@link Server}.
    *
    * @param server The parent {@link Server} object.
    */
  def this(server: typings.samchon.templatesServiceServerMod.Server) = this()
}

