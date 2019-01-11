package typings
package qDashRetryLib.qDashRetryMod.qMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "q")
@js.native
object ^ extends js.Object {
  def retry[U](process: js.Function0[qLib.qMod.QNs.IPromise[U] | U]): qDashRetryLib.qDashRetryMod.qMod.Promise[U] = js.native
  def retry[U](process: js.Function0[qLib.qMod.QNs.IPromise[U] | U], limit: scala.Double): qDashRetryLib.qDashRetryMod.qMod.Promise[U] = js.native
  def retry[U](
    process: js.Function0[qLib.qMod.QNs.IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ scala.Double, scala.Unit]
  ): qDashRetryLib.qDashRetryMod.qMod.Promise[U] = js.native
  def retry[U](
    process: js.Function0[qLib.qMod.QNs.IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ scala.Double, scala.Unit],
    limit: scala.Double
  ): qDashRetryLib.qDashRetryMod.qMod.Promise[U] = js.native
  def retry[U](
    process: js.Function0[qLib.qMod.QNs.IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ scala.Double, scala.Unit],
    options: qDashRetryLib.qDashRetryMod.qMod.IRetryOptions
  ): qDashRetryLib.qDashRetryMod.qMod.Promise[U] = js.native
  def retry[U](
    process: js.Function0[qLib.qMod.QNs.IPromise[U] | U],
    options: qDashRetryLib.qDashRetryMod.qMod.IRetryOptions
  ): qDashRetryLib.qDashRetryMod.qMod.Promise[U] = js.native
}

