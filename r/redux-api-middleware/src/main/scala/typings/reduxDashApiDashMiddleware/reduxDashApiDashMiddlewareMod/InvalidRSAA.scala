package typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareMod

import typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareStrings.`Invalid RSAA`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-api-middleware", "InvalidRSAA")
@js.native
class InvalidRSAA protected () extends Error {
  def this(validationErrors: js.Array[String]) = this()
  /* CompleteClass */
  override var message: String = js.native
  @JSName("message")
  var message_InvalidRSAA: `Invalid RSAA` = js.native
  /* CompleteClass */
  override var name: String = js.native
  @JSName("name")
  var name_InvalidRSAA: typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareStrings.InvalidRSAA = js.native
  var validationErrors: js.Array[String] = js.native
}

