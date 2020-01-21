package typings.qIo

import typings.q.mod.Promise
import typings.qIo.QioHTTP.Request_
import typings.qIo.QioHTTP.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-io/http", JSImport.Namespace)
@js.native
object httpMod extends js.Object {
  def normalizeRequest(request: Request_): Request_ = js.native
  def normalizeRequest(url: String): Request_ = js.native
  def normalizeResponse(response: Response): Response = js.native
  def read(request: Request_): Promise[String] = js.native
  def read(url: String): Promise[String] = js.native
  def request(request: Request_): Promise[Response] = js.native
  def request(url: String): Promise[Response] = js.native
}

