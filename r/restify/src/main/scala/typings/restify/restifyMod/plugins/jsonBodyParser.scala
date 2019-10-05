package typings.restify.restifyMod.plugins

import typings.restify.restifyMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify", "plugins.jsonBodyParser")
@js.native
object jsonBodyParser extends js.Object {
  /**
    * Parses JSON POST bodies
    */
  def apply(): js.Array[RequestHandler] = js.native
  def apply(options: JsonBodyParserOptions): js.Array[RequestHandler] = js.native
}

