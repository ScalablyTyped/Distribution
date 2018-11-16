package typings
package qDashRetryLib.qDashRetryMod.qMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "q")
@js.native
object qModMembers extends js.Object {
  def retry[U](process: js.Function0[U | qLib.qMod.QNs.IPromise[U]]): Promise[U] = js.native
  def retry[U](process: js.Function0[U | qLib.qMod.QNs.IPromise[U]], limit: scala.Double): Promise[U] = js.native
  def retry[U](
    process: js.Function0[U | qLib.qMod.QNs.IPromise[U]],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ scala.Double, scala.Unit]
  ): Promise[U] = js.native
  def retry[U](
    process: js.Function0[U | qLib.qMod.QNs.IPromise[U]],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ scala.Double, scala.Unit],
    limit: scala.Double
  ): Promise[U] = js.native
  def retry[U](
    process: js.Function0[U | qLib.qMod.QNs.IPromise[U]],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ scala.Double, scala.Unit],
    options: IRetryOptions
  ): Promise[U] = js.native
  def retry[U](process: js.Function0[U | qLib.qMod.QNs.IPromise[U]], options: IRetryOptions): Promise[U] = js.native
}

