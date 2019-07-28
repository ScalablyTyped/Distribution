package typings.qDashIo

import typings.q.qMod.Promise
import typings.qDashIo.QioHTTPNs.Request
import typings.qDashIo.QioHTTPNs.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-io/http", JSImport.Namespace)
@js.native
object httpMod extends js.Object {
  def normalizeRequest(request: Request): Request = js.native
  def normalizeRequest(url: String): Request = js.native
  def normalizeResponse(response: Response): Response = js.native
  def read(request: Request): Promise[String] = js.native
  def read(url: String): Promise[String] = js.native
  def request(request: Request): Promise[Response] = js.native
  def request(url: String): Promise[Response] = js.native
}

