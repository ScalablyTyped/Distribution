package typings
package rxDashCoreLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Promise A+
     */
@js.native
trait IPromise[T] extends js.Object {
  def `then`[R](): IPromise[R] = js.native
  def `then`[R](onFulfilled: js.Function1[/* value */ T, R | IPromise[R]]): IPromise[R] = js.native
  def `then`[R](
    onFulfilled: js.Function1[/* value */ T, R | IPromise[R]],
    onRejected: js.Function1[/* reason */ js.Any, R | IPromise[R]]
  ): IPromise[R] = js.native
}

