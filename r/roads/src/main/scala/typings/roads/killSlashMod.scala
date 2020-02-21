package typings.roads

import typings.roads.roadMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roads/types/middleware/killSlash", JSImport.Namespace)
@js.native
object killSlashMod extends js.Object {
  /**
    * Any requests with trailing slashes will immediately return a Response object redirecting to a non-trailing-slash path
    */
  var default: Middleware = js.native
}

