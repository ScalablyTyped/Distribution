package typings
package retryDashRequestLib.retryDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("retry-request", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(requestOpts: requestLib.requestMod.requestNs.Options): retryDashRequestLib.Anon_Abort = js.native
  def apply(
    requestOpts: requestLib.requestMod.requestNs.Options,
    callback: requestLib.requestMod.requestNs.RequestCallback
  ): retryDashRequestLib.Anon_Abort = js.native
  def apply(
    requestOpts: requestLib.requestMod.requestNs.Options,
    opts: retryDashRequestLib.retryDashRequestMod.retryRequestNs.Options
  ): retryDashRequestLib.Anon_Abort = js.native
  def apply(
    requestOpts: requestLib.requestMod.requestNs.Options,
    opts: retryDashRequestLib.retryDashRequestMod.retryRequestNs.Options,
    callback: requestLib.requestMod.requestNs.RequestCallback
  ): retryDashRequestLib.Anon_Abort = js.native
  def getNextRetryDelay(retryNumber: scala.Double): scala.Unit = js.native
}

