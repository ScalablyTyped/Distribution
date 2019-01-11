package typings
package reduxDashSagaLib.reduxDashSagaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-saga", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CANCEL: java.lang.String = js.native
  val END: reduxDashSagaLib.reduxDashSagaMod.END = js.native
  val buffers: reduxDashSagaLib.Anon_Dropping = js.native
  val takeLatest: reduxDashSagaLib.Anon_Arg1Arg2 = js.native
  def channel[T](): reduxDashSagaLib.reduxDashSagaMod.Channel[T] = js.native
  def channel[T](buffer: reduxDashSagaLib.reduxDashSagaMod.Buffer[T]): reduxDashSagaLib.reduxDashSagaMod.Channel[T] = js.native
  def default[C /* <: js.Object */](): reduxDashSagaLib.reduxDashSagaMod.SagaMiddleware[C] = js.native
  def default[C /* <: js.Object */](options: reduxDashSagaLib.reduxDashSagaMod.SagaMiddlewareOptions[C]): reduxDashSagaLib.reduxDashSagaMod.SagaMiddleware[C] = js.native
  def delay(ms: scala.Double): js.Promise[reduxDashSagaLib.reduxDashSagaLibNumbers.`true`] = js.native
  def delay[T](ms: scala.Double, `val`: T): js.Promise[T] = js.native
  def detach(forkEffect: reduxDashSagaLib.effectsMod.ForkEffect): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def eventChannel[T](subscribe: reduxDashSagaLib.Subscribe[T]): reduxDashSagaLib.reduxDashSagaMod.Channel[T] = js.native
  def eventChannel[T](subscribe: reduxDashSagaLib.Subscribe[T], buffer: reduxDashSagaLib.reduxDashSagaMod.Buffer[T]): reduxDashSagaLib.reduxDashSagaMod.Channel[T] = js.native
  def eventChannel[T](
    subscribe: reduxDashSagaLib.Subscribe[T],
    buffer: reduxDashSagaLib.reduxDashSagaMod.Buffer[T],
    matcher: reduxDashSagaLib.reduxDashSagaMod.Predicate[T]
  ): reduxDashSagaLib.reduxDashSagaMod.Channel[T] = js.native
  def runSaga[A, S](iterator: nodeLib.Iterator[_], options: reduxDashSagaLib.reduxDashSagaMod.RunSagaOptions[A, S]): reduxDashSagaLib.reduxDashSagaMod.Task = js.native
  def runSaga[A, S](
    storeInterface: reduxDashSagaLib.reduxDashSagaMod.RunSagaOptions[A, S],
    saga: reduxDashSagaLib.Saga0
  ): reduxDashSagaLib.reduxDashSagaMod.Task = js.native
  def runSaga[A, S, T1](
    storeInterface: reduxDashSagaLib.reduxDashSagaMod.RunSagaOptions[A, S],
    saga: reduxDashSagaLib.Saga1[T1],
    arg1: T1
  ): reduxDashSagaLib.reduxDashSagaMod.Task = js.native
  def runSaga[A, S, T1, T2](
    storeInterface: reduxDashSagaLib.reduxDashSagaMod.RunSagaOptions[A, S],
    saga: reduxDashSagaLib.Saga2[T1, T2],
    arg1: T1,
    arg2: T2
  ): reduxDashSagaLib.reduxDashSagaMod.Task = js.native
  def runSaga[A, S, T1, T2, T3](
    storeInterface: reduxDashSagaLib.reduxDashSagaMod.RunSagaOptions[A, S],
    saga: reduxDashSagaLib.Saga3[T1, T2, T3],
    arg1: T1,
    arg2: T2,
    arg3: T3
  ): reduxDashSagaLib.reduxDashSagaMod.Task = js.native
  def runSaga[A, S, T1, T2, T3, T4](
    storeInterface: reduxDashSagaLib.reduxDashSagaMod.RunSagaOptions[A, S],
    saga: reduxDashSagaLib.Saga4[T1, T2, T3, T4],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): reduxDashSagaLib.reduxDashSagaMod.Task = js.native
  def runSaga[A, S, T1, T2, T3, T4, T5](
    storeInterface: reduxDashSagaLib.reduxDashSagaMod.RunSagaOptions[A, S],
    saga: reduxDashSagaLib.Saga5[T1, T2, T3, T4, T5],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5
  ): reduxDashSagaLib.reduxDashSagaMod.Task = js.native
  def runSaga[A, S, T1, T2, T3, T4, T5, T6](
    storeInterface: reduxDashSagaLib.reduxDashSagaMod.RunSagaOptions[A, S],
    saga: reduxDashSagaLib.Saga6Rest[T1, T2, T3, T4, T5, T6],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5,
    arg6: T6,
    rest: js.Any*
  ): reduxDashSagaLib.reduxDashSagaMod.Task = js.native
  def takeEvery[T](channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T], worker: reduxDashSagaLib.HelperFunc0[T]): reduxDashSagaLib.reduxDashSagaMod.SagaIterator = js.native
  def takeEvery[A /* <: reduxLib.reduxMod.Action[_] */](pattern: reduxDashSagaLib.effectsMod.Pattern, worker: reduxDashSagaLib.HelperFunc0[A]): reduxDashSagaLib.reduxDashSagaMod.SagaIterator = js.native
  def takeEvery[T, T1](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: reduxDashSagaLib.HelperFunc1[T, T1],
    arg1: T1
  ): reduxDashSagaLib.reduxDashSagaMod.SagaIterator = js.native
  def takeEvery[A, T1](
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.HelperFunc1[A, T1],
    arg1: T1
  ): reduxDashSagaLib.reduxDashSagaMod.SagaIterator = js.native
  def takeEvery[T, T1, T2](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: reduxDashSagaLib.HelperFunc2[T, T1, T2],
    arg1: T1,
    arg2: T2
  ): reduxDashSagaLib.reduxDashSagaMod.SagaIterator = js.native
  def takeEvery[A, T1, T2](
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.HelperFunc2[A, T1, T2],
    arg1: T1,
    arg2: T2
  ): reduxDashSagaLib.reduxDashSagaMod.SagaIterator = js.native
  def takeEvery[T, T1, T2, T3](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: reduxDashSagaLib.HelperFunc3[T, T1, T2, T3],
    arg1: T1,
    arg2: T2,
    arg3: T3
  ): reduxDashSagaLib.reduxDashSagaMod.SagaIterator = js.native
  def takeEvery[A, T1, T2, T3](
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.HelperFunc3[A, T1, T2, T3],
    arg1: T1,
    arg2: T2,
    arg3: T3
  ): reduxDashSagaLib.reduxDashSagaMod.SagaIterator = js.native
  def takeEvery[T, T1, T2, T3, T4](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: reduxDashSagaLib.HelperFunc4[T, T1, T2, T3, T4],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): reduxDashSagaLib.reduxDashSagaMod.SagaIterator = js.native
  def takeEvery[A, T1, T2, T3, T4](
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.HelperFunc4[A, T1, T2, T3, T4],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): reduxDashSagaLib.reduxDashSagaMod.SagaIterator = js.native
  def takeEvery[T, T1, T2, T3, T4, T5](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: reduxDashSagaLib.HelperFunc5[T, T1, T2, T3, T4, T5],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5
  ): reduxDashSagaLib.reduxDashSagaMod.SagaIterator = js.native
  def takeEvery[A, T1, T2, T3, T4, T5](
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.HelperFunc5[A, T1, T2, T3, T4, T5],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5
  ): reduxDashSagaLib.reduxDashSagaMod.SagaIterator = js.native
  def takeEvery[T, T1, T2, T3, T4, T5, T6](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: reduxDashSagaLib.HelperFunc6Rest[T, T1, T2, T3, T4, T5, T6],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5,
    arg6: T6,
    rest: js.Any*
  ): reduxDashSagaLib.reduxDashSagaMod.SagaIterator = js.native
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
  ): reduxDashSagaLib.reduxDashSagaMod.SagaIterator = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */](
    ms: scala.Double,
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.HelperFunc0[A]
  ): reduxDashSagaLib.reduxDashSagaMod.SagaIterator = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, T1](
    ms: scala.Double,
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.HelperFunc1[A, T1],
    arg1: T1
  ): reduxDashSagaLib.reduxDashSagaMod.SagaIterator = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, T1, T2](
    ms: scala.Double,
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.HelperFunc2[A, T1, T2],
    arg1: T1,
    arg2: T2
  ): reduxDashSagaLib.reduxDashSagaMod.SagaIterator = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, T1, T2, T3](
    ms: scala.Double,
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.HelperFunc3[A, T1, T2, T3],
    arg1: T1,
    arg2: T2,
    arg3: T3
  ): reduxDashSagaLib.reduxDashSagaMod.SagaIterator = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, T1, T2, T3, T4](
    ms: scala.Double,
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.HelperFunc4[A, T1, T2, T3, T4],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): reduxDashSagaLib.reduxDashSagaMod.SagaIterator = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, T1, T2, T3, T4, T5](
    ms: scala.Double,
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.HelperFunc5[A, T1, T2, T3, T4, T5],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5
  ): reduxDashSagaLib.reduxDashSagaMod.SagaIterator = js.native
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
  ): reduxDashSagaLib.reduxDashSagaMod.SagaIterator = js.native
}

