package typings
package qDashIoLib.QioHTTPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("QioHTTP")
@js.native
object ^ extends js.Object {
  def normalizeRequest(request: Request): Request = js.native
  def normalizeRequest(url: java.lang.String): Request = js.native
  def normalizeResponse(response: Response): Response = js.native
  def read(request: Request): qLib.qMod.Promise[java.lang.String] = js.native
  def read(url: java.lang.String): qLib.qMod.Promise[java.lang.String] = js.native
  def request(request: Request): qLib.qMod.Promise[Response] = js.native
  def request(url: java.lang.String): qLib.qMod.Promise[Response] = js.native
}

