package typings.restify.mod.plugins

import typings.restify.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify", "plugins.requestLogger")
@js.native
object requestLogger extends js.Object {
  /**
    * Adds timers for each handler in your request chain
    *
    * `options.properties` properties to pass to bunyan's `log.child()` method
    */
  def apply(): RequestHandler = js.native
  def apply(options: RequestLogger_): RequestHandler = js.native
}

