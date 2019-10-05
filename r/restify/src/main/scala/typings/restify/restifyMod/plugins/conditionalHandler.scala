package typings.restify.restifyMod.plugins

import typings.restify.restifyMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify", "plugins.conditionalHandler")
@js.native
object conditionalHandler extends js.Object {
  def apply(candidates: js.Array[HandlerCandidate]): RequestHandler = js.native
  /**
    * Runs first handler that matches to the condition
    */
  def apply(candidates: HandlerCandidate): RequestHandler = js.native
}

