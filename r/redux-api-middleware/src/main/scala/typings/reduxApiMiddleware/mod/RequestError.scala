package typings.reduxApiMiddleware.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-api-middleware", "RequestError")
@js.native
class RequestError protected () extends Error {
  def this(message: String) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  @JSName("name")
  var name_RequestError: typings.reduxApiMiddleware.reduxApiMiddlewareStrings.RequestError = js.native
}

