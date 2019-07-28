package typings.requestretry

import typings.node.httpMod.IncomingMessage
import typings.requestretry.requestretryMod.RetryStrategy
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_HTTPOrNetworkError extends js.Object {
  @JSName("HTTPOrNetworkError")
  var HTTPOrNetworkError_Original: RetryStrategy = js.native
  @JSName("HttpError")
  var HttpError_Original: RetryStrategy = js.native
  @JSName("NetworkError")
  var NetworkError_Original: RetryStrategy = js.native
  def HTTPOrNetworkError(err: Error, response: IncomingMessage, body: js.Any): Boolean = js.native
  def HttpError(err: Error, response: IncomingMessage, body: js.Any): Boolean = js.native
  def NetworkError(err: Error, response: IncomingMessage, body: js.Any): Boolean = js.native
}

