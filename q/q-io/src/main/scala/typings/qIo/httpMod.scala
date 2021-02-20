package typings.qIo

import typings.q.mod.Promise
import typings.qIo.QioHTTP.Request
import typings.qIo.QioHTTP.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  @JSImport("q-io/http", "normalizeRequest")
  @js.native
  def normalizeRequest(request: Request): Request = js.native
  @JSImport("q-io/http", "normalizeRequest")
  @js.native
  def normalizeRequest(url: String): Request = js.native
  
  @JSImport("q-io/http", "normalizeResponse")
  @js.native
  def normalizeResponse(response: Response): Response = js.native
  
  @JSImport("q-io/http", "read")
  @js.native
  def read(request: Request): Promise[String] = js.native
  @JSImport("q-io/http", "read")
  @js.native
  def read(url: String): Promise[String] = js.native
  
  @JSImport("q-io/http", "request")
  @js.native
  def request(request: Request): Promise[Response] = js.native
  @JSImport("q-io/http", "request")
  @js.native
  def request(url: String): Promise[Response] = js.native
}
