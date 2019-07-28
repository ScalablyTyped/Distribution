package typings.reactDashRequest.reactDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-request", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clearRequestCache(): Unit = js.native
  def clearResponseCache(): Unit = js.native
  def fetchDedupe(input: js.Any): js.Promise[ProxyRequest] = js.native
  def fetchDedupe(input: js.Any, init: js.Any): js.Promise[ProxyRequest] = js.native
  def fetchDedupe(input: js.Any, init: js.Any, dedupeOptions: js.Any): js.Promise[ProxyRequest] = js.native
  def getRequestKey(): String = js.native
  def getRequestKey(keyOptions: RequestKeyOptions): String = js.native
  def isRequestInFlight(): Boolean = js.native
}

