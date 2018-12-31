package typings
package reduxDashSagaLib.reduxDashSagaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-saga", JSImport.Namespace)
@js.native
object reduxDashSagaModMembers extends js.Object {
  val CANCEL: java.lang.String = js.native
  val END: END = js.native
  val buffers: reduxDashSagaLib.Anon_Sliding = js.native
  val takeLatest: reduxDashSagaLib.Anon_ChannelWorker = js.native
  def channel[T](): Channel[T] = js.native
  def channel[T](buffer: Buffer[T]): Channel[T] = js.native
  def default[C /* <: js.Object */](): SagaMiddleware[C] = js.native
  def default[C /* <: js.Object */](options: SagaMiddlewareOptions[C]): SagaMiddleware[C] = js.native
  def delay(ms: scala.Double): js.Promise[reduxDashSagaLib.reduxDashSagaLibNumbers.`true`] = js.native
  def delay[T](ms: scala.Double, `val`: T): js.Promise[T] = js.native
  def detach(forkEffect: reduxDashSagaLib.effectsMod.ForkEffect): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def eventChannel[T](subscribe: reduxDashSagaLib.Subscribe[T]): Channel[T] = js.native
  def eventChannel[T](subscribe: reduxDashSagaLib.Subscribe[T], buffer: Buffer[T]): Channel[T] = js.native
  def eventChannel[T](subscribe: reduxDashSagaLib.Subscribe[T], buffer: Buffer[T], matcher: Predicate[T]): Channel[T] = js.native
  def runSaga[A, S](iterator: nodeLib.Iterator[_], options: RunSagaOptions[A, S]): Task = js.native
  def runSaga[A, S](storeInterface: RunSagaOptions[A, S], saga: reduxDashSagaLib.Saga0): Task = js.native
  def runSaga[A, S, T1](storeInterface: RunSagaOptions[A, S], saga: reduxDashSagaLib.Saga1[T1], arg1: T1): Task = js.native
  def runSaga[A, S, T1, T2](storeInterface: RunSagaOptions[A, S], saga: reduxDashSagaLib.Saga2[T1, T2], arg1: T1, arg2: T2): Task = js.native
  def runSaga[A, S, T1, T2, T3](
    storeInterface: RunSagaOptions[A, S],
    saga: reduxDashSagaLib.Saga3[T1, T2, T3],
    arg1: T1,
    arg2: T2,
    arg3: T3
  ): Task = js.native
  def runSaga[A, S, T1, T2, T3, T4](
    storeInterface: RunSagaOptions[A, S],
    saga: reduxDashSagaLib.Saga4[T1, T2, T3, T4],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): Task = js.native
  def runSaga[A, S, T1, T2, T3, T4, T5](
    storeInterface: RunSagaOptions[A, S],
    saga: reduxDashSagaLib.Saga5[T1, T2, T3, T4, T5],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5
  ): Task = js.native
  def runSaga[A, S, T1, T2, T3, T4, T5, T6](
    storeInterface: RunSagaOptions[A, S],
    saga: reduxDashSagaLib.Saga6Rest[T1, T2, T3, T4, T5, T6],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5,
    arg6: T6,
    rest: js.Any*
  ): Task = js.native
  def takeEvery[T](channel: Channel[T], worker: reduxDashSagaLib.HelperFunc0[T]): SagaIterator = js.native
  def takeEvery[A /* <: reduxLib.reduxMod.Action[_] */](pattern: reduxDashSagaLib.effectsMod.Pattern, worker: reduxDashSagaLib.HelperFunc0[A]): SagaIterator = js.native
  def takeEvery[T, T1](channel: Channel[T], worker: reduxDashSagaLib.HelperFunc1[T, T1], arg1: T1): SagaIterator = js.native
  def takeEvery[A, T1](
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.HelperFunc1[A, T1],
    arg1: T1
  ): SagaIterator = js.native
  def takeEvery[T, T1, T2](channel: Channel[T], worker: reduxDashSagaLib.HelperFunc2[T, T1, T2], arg1: T1, arg2: T2): SagaIterator = js.native
  def takeEvery[A, T1, T2](
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.HelperFunc2[A, T1, T2],
    arg1: T1,
    arg2: T2
  ): SagaIterator = js.native
  def takeEvery[T, T1, T2, T3](
    channel: Channel[T],
    worker: reduxDashSagaLib.HelperFunc3[T, T1, T2, T3],
    arg1: T1,
    arg2: T2,
    arg3: T3
  ): SagaIterator = js.native
  def takeEvery[A, T1, T2, T3](
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.HelperFunc3[A, T1, T2, T3],
    arg1: T1,
    arg2: T2,
    arg3: T3
  ): SagaIterator = js.native
  def takeEvery[T, T1, T2, T3, T4](
    channel: Channel[T],
    worker: reduxDashSagaLib.HelperFunc4[T, T1, T2, T3, T4],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): SagaIterator = js.native
  def takeEvery[A, T1, T2, T3, T4](
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.HelperFunc4[A, T1, T2, T3, T4],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): SagaIterator = js.native
  def takeEvery[T, T1, T2, T3, T4, T5](
    channel: Channel[T],
    worker: reduxDashSagaLib.HelperFunc5[T, T1, T2, T3, T4, T5],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5
  ): SagaIterator = js.native
  def takeEvery[A, T1, T2, T3, T4, T5](
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.HelperFunc5[A, T1, T2, T3, T4, T5],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5
  ): SagaIterator = js.native
  def takeEvery[T, T1, T2, T3, T4, T5, T6](
    channel: Channel[T],
    worker: reduxDashSagaLib.HelperFunc6Rest[T, T1, T2, T3, T4, T5, T6],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5,
    arg6: T6,
    rest: js.Any*
  ): SagaIterator = js.native
  def takeEvery[A, T1, T2, T3, T4, T5, T6](
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.HelperFunc6Rest[A, T1, T2, T3, T4, T5, T6],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5,
    arg6: T6,
    rest: js.Any*
  ): SagaIterator = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */](
    ms: scala.Double,
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.HelperFunc0[A]
  ): SagaIterator = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, T1](
    ms: scala.Double,
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.HelperFunc1[A, T1],
    arg1: T1
  ): SagaIterator = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, T1, T2](
    ms: scala.Double,
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.HelperFunc2[A, T1, T2],
    arg1: T1,
    arg2: T2
  ): SagaIterator = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, T1, T2, T3](
    ms: scala.Double,
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.HelperFunc3[A, T1, T2, T3],
    arg1: T1,
    arg2: T2,
    arg3: T3
  ): SagaIterator = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, T1, T2, T3, T4](
    ms: scala.Double,
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.HelperFunc4[A, T1, T2, T3, T4],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): SagaIterator = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, T1, T2, T3, T4, T5](
    ms: scala.Double,
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.HelperFunc5[A, T1, T2, T3, T4, T5],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5
  ): SagaIterator = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, T1, T2, T3, T4, T5, T6](
    ms: scala.Double,
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.HelperFunc6Rest[A, T1, T2, T3, T4, T5, T6],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5,
    arg6: T6,
    rest: js.Any*
  ): SagaIterator = js.native
}

