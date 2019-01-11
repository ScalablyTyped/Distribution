package typings
package reactDashRequestLib.reactDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-request", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clearRequestCache(): scala.Unit = js.native
  def clearResponseCache(): scala.Unit = js.native
  def fetchDedupe(input: js.Any): js.Promise[reactDashRequestLib.reactDashRequestMod.ProxyRequest] = js.native
  def fetchDedupe(input: js.Any, init: js.Any): js.Promise[reactDashRequestLib.reactDashRequestMod.ProxyRequest] = js.native
  def fetchDedupe(input: js.Any, init: js.Any, dedupeOptions: js.Any): js.Promise[reactDashRequestLib.reactDashRequestMod.ProxyRequest] = js.native
  def getRequestKey(): java.lang.String = js.native
  def getRequestKey(keyOptions: reactDashRequestLib.reactDashRequestMod.RequestKeyOptions): java.lang.String = js.native
  def isRequestInFlight(): scala.Boolean = js.native
}

