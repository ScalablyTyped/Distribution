package typings
package requestretryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_HTTPOrNetworkError extends js.Object {
  @JSName("HTTPOrNetworkError")
  var HTTPOrNetworkError_Original: requestretryLib.requestretryMod.requestretryNs.RetryStrategy = js.native
  @JSName("HttpError")
  var HttpError_Original: requestretryLib.requestretryMod.requestretryNs.RetryStrategy = js.native
  @JSName("NetworkError")
  var NetworkError_Original: requestretryLib.requestretryMod.requestretryNs.RetryStrategy = js.native
  def HTTPOrNetworkError(err: stdLib.Error, response: nodeLib.httpMod.IncomingMessage, body: js.Any): scala.Boolean = js.native
  def HttpError(err: stdLib.Error, response: nodeLib.httpMod.IncomingMessage, body: js.Any): scala.Boolean = js.native
  def NetworkError(err: stdLib.Error, response: nodeLib.httpMod.IncomingMessage, body: js.Any): scala.Boolean = js.native
}

