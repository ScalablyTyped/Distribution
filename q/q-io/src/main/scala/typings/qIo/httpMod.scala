package typings.qIo

import typings.q.mod.Promise
import typings.qIo.QioHTTP.Request
import typings.qIo.QioHTTP.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
