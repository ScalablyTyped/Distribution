package typings.restifyPlugins.mod

import typings.restify.mod.RequestHandler
import typings.restifyPlugins.AnonMaxBodySize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify-plugins", "bodyReader")
@js.native
object bodyReader extends js.Object {
  def apply(): RequestHandler = js.native
  def apply(options: AnonMaxBodySize): RequestHandler = js.native
}

