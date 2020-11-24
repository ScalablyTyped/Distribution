package typings.restify.mod.plugins

import typings.restify.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("restify", "plugins.dateParser")
@js.native
object dateParser extends js.Object {
  
  // ******************** The module includes the following response plugins:
  /**
    * expires requests based on current time + delta
    * @param delta - age in seconds
    */
  def apply(): RequestHandler = js.native
  def apply(delta: Double): RequestHandler = js.native
}
