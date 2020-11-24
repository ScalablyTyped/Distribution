package typings.reduxApiMiddleware.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-api-middleware", "InternalError")
@js.native
class InternalError protected () extends Error {
  def this(message: String) = this()
  
  @JSName("name")
  var name_InternalError: typings.reduxApiMiddleware.reduxApiMiddlewareStrings.InternalError = js.native
}
