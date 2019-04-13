package typings
package retryDashRequestLib.retryDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("retry-request", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(requestOpts: requestLib.requestMod.Options): retryDashRequestLib.Anon_Abort = js.native
  def apply(requestOpts: requestLib.requestMod.Options, callback: requestLib.requestMod.RequestCallback): retryDashRequestLib.Anon_Abort = js.native
  def apply(requestOpts: requestLib.requestMod.Options, opts: Options): retryDashRequestLib.Anon_Abort = js.native
  def apply(
    requestOpts: requestLib.requestMod.Options,
    opts: Options,
    callback: requestLib.requestMod.RequestCallback
  ): retryDashRequestLib.Anon_Abort = js.native
  def getNextRetryDelay(retryNumber: scala.Double): scala.Unit = js.native
}

