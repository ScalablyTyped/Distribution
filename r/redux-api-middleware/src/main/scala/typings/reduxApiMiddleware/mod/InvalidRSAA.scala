package typings.reduxApiMiddleware.mod

import typings.reduxApiMiddleware.reduxApiMiddlewareStrings.`Invalid RSAA`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-api-middleware", "InvalidRSAA")
@js.native
class InvalidRSAA protected () extends Error {
  def this(validationErrors: js.Array[String]) = this()
  
  @JSName("message")
  var message_InvalidRSAA: `Invalid RSAA` = js.native
  
  @JSName("name")
  var name_InvalidRSAA: typings.reduxApiMiddleware.reduxApiMiddlewareStrings.InvalidRSAA = js.native
  
  var validationErrors: js.Array[String] = js.native
}
