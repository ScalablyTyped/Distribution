package typings
package reduxDashApiDashMiddlewareLib.reduxDashApiDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-api-middleware", "ApiError")
@js.native
class ApiError[T /* <: js.Object */] protected ()
  extends stdLib.Error {
  def this(status: scala.Double, statusText: java.lang.String, response: T) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  @JSName("name")
  var name_ApiError: reduxDashApiDashMiddlewareLib.reduxDashApiDashMiddlewareLibStrings.ApiError = js.native
  var response: T = js.native
  var status: scala.Double = js.native
  var statusText: java.lang.String = js.native
}

