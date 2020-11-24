package typings.restify.mod.plugins

import typings.restify.anon.MaxBodySize
import typings.restify.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("restify", "plugins.bodyReader")
@js.native
object bodyReader extends js.Object {
  
  /**
    * Reads the body of the request.
    */
  def apply(): RequestHandler = js.native
  def apply(options: MaxBodySize): RequestHandler = js.native
}
