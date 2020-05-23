package typings.restifyPlugins.mod

import typings.restify.mod.RequestHandler
import typings.restifyPlugins.anon.MapParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify-plugins", "jsonBodyParser")
@js.native
object jsonBodyParser extends js.Object {
  def apply(): js.Array[RequestHandler] = js.native
  def apply(options: MapParams): js.Array[RequestHandler] = js.native
}

