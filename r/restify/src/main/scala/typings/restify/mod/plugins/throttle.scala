package typings.restify.mod.plugins

import typings.restify.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("restify", "plugins.throttle")
@js.native
object throttle extends js.Object {
  
  /**
    *  throttles responses
    */
  def apply(): RequestHandler = js.native
  def apply(options: ThrottleOptions): RequestHandler = js.native
}
