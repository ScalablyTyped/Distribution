package typings
package qDashIoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-io/http", JSImport.Namespace)
@js.native
object httpMod extends js.Object {
  def normalizeRequest(request: qDashIoLib.QioHTTPNs.Request): qDashIoLib.QioHTTPNs.Request = js.native
  def normalizeRequest(url: java.lang.String): qDashIoLib.QioHTTPNs.Request = js.native
  def normalizeResponse(response: qDashIoLib.QioHTTPNs.Response): qDashIoLib.QioHTTPNs.Response = js.native
  def read(request: qDashIoLib.QioHTTPNs.Request): qLib.qMod.QNs.Promise[java.lang.String] = js.native
  def read(url: java.lang.String): qLib.qMod.QNs.Promise[java.lang.String] = js.native
  def request(request: qDashIoLib.QioHTTPNs.Request): qLib.qMod.QNs.Promise[qDashIoLib.QioHTTPNs.Response] = js.native
  def request(url: java.lang.String): qLib.qMod.QNs.Promise[qDashIoLib.QioHTTPNs.Response] = js.native
}

