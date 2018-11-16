package typings
package reduxDashSagaLib.reduxDashSagaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SagaMiddleware[C]
  extends reduxLib.reduxMod.Middleware[js.Object, js.Any, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]] {
  def run(saga: reduxDashSagaLib.Saga0): Task = js.native
  def run[T1](saga: reduxDashSagaLib.Saga1[T1], arg1: T1): Task = js.native
  def run[T1, T2](saga: reduxDashSagaLib.Saga2[T1, T2], arg1: T1, arg2: T2): Task = js.native
  def run[T1, T2, T3](saga: reduxDashSagaLib.Saga3[T1, T2, T3], arg1: T1, arg2: T2, arg3: T3): Task = js.native
  def run[T1, T2, T3, T4](saga: reduxDashSagaLib.Saga4[T1, T2, T3, T4], arg1: T1, arg2: T2, arg3: T3, arg4: T4): Task = js.native
  def run[T1, T2, T3, T4, T5](saga: reduxDashSagaLib.Saga5[T1, T2, T3, T4, T5], arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5): Task = js.native
  def run[T1, T2, T3, T4, T5, T6](
    saga: reduxDashSagaLib.Saga6Rest[T1, T2, T3, T4, T5, T6],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5,
    arg6: T6,
    rest: js.Any*
  ): Task = js.native
  def setContext(props: stdLib.Partial[C]): scala.Unit = js.native
}

