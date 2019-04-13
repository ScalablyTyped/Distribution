package typings
package qDashRetryLib.qDashRetryMod.qMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promise[T] extends js.Object {
  def retry[U](process: js.Function1[/* value */ T, qLib.qMod.IPromise[U] | U]): Promise[U] = js.native
  def retry[U](process: js.Function1[/* value */ T, qLib.qMod.IPromise[U] | U], limit: scala.Double): Promise[U] = js.native
  def retry[U](
    process: js.Function1[/* value */ T, qLib.qMod.IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ scala.Double, scala.Unit]
  ): Promise[U] = js.native
  def retry[U](
    process: js.Function1[/* value */ T, qLib.qMod.IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ scala.Double, scala.Unit],
    limit: scala.Double
  ): Promise[U] = js.native
  def retry[U](
    process: js.Function1[/* value */ T, qLib.qMod.IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ scala.Double, scala.Unit],
    options: IRetryOptions
  ): Promise[U] = js.native
  def retry[U](process: js.Function1[/* value */ T, qLib.qMod.IPromise[U] | U], options: IRetryOptions): Promise[U] = js.native
}

