package typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-api-middleware", "ApiError")
@js.native
class ApiError[T /* <: js.Object */] protected () extends Error {
  def this(status: Double, statusText: String, response: T) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  @JSName("name")
  var name_ApiError: typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareStrings.ApiError = js.native
  var response: T = js.native
  var status: Double = js.native
  var statusText: String = js.native
}

