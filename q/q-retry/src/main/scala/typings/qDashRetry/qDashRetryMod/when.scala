package typings.qDashRetry.qDashRetryMod

import typings.q.qMod.IWhenable
import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "when")
@js.native
object when extends js.Object {
  def apply(): Promise[Unit] = js.native
  def apply[T](value: IWhenable[T]): Promise[T] = js.native
  def apply[T, U](value: IWhenable[T], onFulfilled: js.Function1[/* val */ T, IWhenable[U]]): Promise[U] = js.native
  def apply[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]]
  ): Promise[U] = js.native
  def apply[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]],
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): Promise[U] = js.native
  def apply[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: Null,
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): Promise[U] = js.native
}

