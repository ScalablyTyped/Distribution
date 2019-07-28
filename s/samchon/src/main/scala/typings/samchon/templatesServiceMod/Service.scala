package typings.samchon.templatesServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/service", "Service")
@js.native
abstract class Service protected ()
  extends typings.samchon.templatesServiceServiceMod.Service {
  /**
    * Construct from parent {@link Client} and requested path.
    *
    * @param client Driver of remote client.
    * @param path Requested path that identifies this {@link Service}.
    */
  def this(client: typings.samchon.templatesServiceClientMod.Client, path: String) = this()
}

