package typings.qDashRetry.qDashRetryMod

import typings.q.qMod.IWhenable
import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "spread")
@js.native
object spread extends js.Object {
  def apply[T, U](promises: js.Array[IWhenable[T]], onFulfilled: js.Function1[/* repeated */ T, IWhenable[U]]): Promise[U] = js.native
  def apply[T, U](
    promises: js.Array[IWhenable[T]],
    onFulfilled: js.Function1[/* repeated */ T, IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]]
  ): Promise[U] = js.native
}

