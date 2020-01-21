package typings.qRetry.mod

import typings.q.mod.IWhenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "when")
@js.native
object when extends js.Object {
  def apply(): typings.q.mod.Promise[Unit] = js.native
  def apply[T](value: IWhenable[T]): typings.q.mod.Promise[T] = js.native
  def apply[T, U](value: IWhenable[T], onFulfilled: js.Function1[/* val */ T, IWhenable[U]]): typings.q.mod.Promise[U] = js.native
  def apply[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]]
  ): typings.q.mod.Promise[U] = js.native
  def apply[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]],
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): typings.q.mod.Promise[U] = js.native
  def apply[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: Null,
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): typings.q.mod.Promise[U] = js.native
}

