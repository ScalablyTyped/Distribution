package typings.restify.mod.plugins

import typings.restify.mod.RequestHandler
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

