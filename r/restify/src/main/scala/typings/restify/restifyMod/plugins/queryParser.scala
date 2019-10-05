package typings.restify.restifyMod.plugins

import typings.restify.restifyMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify", "plugins.queryParser")
@js.native
object queryParser extends js.Object {
  /**
    * Parses URL query parameters into `req.query`. Many options correspond directly to option defined for the underlying [qs.parse](https://github.com/ljharb/qs)
    */
  def apply(): RequestHandler = js.native
  def apply(options: QueryParserOptions): RequestHandler = js.native
}

