package typings
package reduxDashSagaLib.effectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-saga/effects", JSImport.Namespace)
@js.native
object effectsModMembers extends js.Object {
  val call: CallEffectFactory[CallEffect] = js.native
  val fork: CallEffectFactory[ForkEffect] = js.native
  val put: Put = js.native
  val spawn: CallEffectFactory[ForkEffect] = js.native
  val take: Take = js.native
  val takeLatest: reduxDashSagaLib.Anon_Arg1 = js.native
  val takem: reduxDashSagaLib.Anon_Channel = js.native
  def actionChannel(pattern: Pattern): ActionChannelEffect = js.native
  def actionChannel(pattern: Pattern, buffer: reduxDashSagaLib.reduxDashSagaMod.Buffer[reduxLib.reduxMod.Action[_]]): ActionChannelEffect = js.native
  def all(effects: js.Array[Effect]): AllEffect = js.native
  def all(effects: org.scalablytyped.runtime.StringDictionary[Effect]): AllEffect = js.native
  @JSName("all")
  def all_TGenericAllEffect[T](effects: js.Array[T]): GenericAllEffect[T] = js.native
  @JSName("all")
  def all_TGenericAllEffect[T](effects: org.scalablytyped.runtime.StringDictionary[T]): GenericAllEffect[T] = js.native
  @JSName("apply")
  def apply(context: js.Any, fn: Func0): CallEffect = js.native
  @JSName("apply")
  def apply[T1](context: js.Any, fn: Func1[T1], args: js.Array[T1]): CallEffect = js.native
  @JSName("apply")
  def apply[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.apply with js.Any */, N /* <: java.lang.String */](context: C, fn: N): CallEffect = js.native
  @JSName("apply")
  def apply[T1, T2](context: js.Any, fn: Func2[T1, T2], args: js.Tuple2[T1, T2]): CallEffect = js.native
  @JSName("apply")
  def apply[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.apply with js.Any */, N /* <: java.lang.String */, T1](context: C, fn: N, args: js.Array[T1]): CallEffect = js.native
  @JSName("apply")
  def apply[T1, T2, T3](context: js.Any, fn: Func3[T1, T2, T3], args: js.Tuple3[T1, T2, T3]): CallEffect = js.native
  @JSName("apply")
  def apply[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.apply with js.Any */, N /* <: java.lang.String */, T1, T2](context: C, fn: N, args: js.Tuple2[T1, T2]): CallEffect = js.native
  @JSName("apply")
  def apply[T1, T2, T3, T4](context: js.Any, fn: Func4[T1, T2, T3, T4], args: js.Tuple4[T1, T2, T3, T4]): CallEffect = js.native
  @JSName("apply")
  def apply[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.apply with js.Any */, N /* <: java.lang.String */, T1, T2, T3](context: C, fn: N, args: js.Tuple3[T1, T2, T3]): CallEffect = js.native
  @JSName("apply")
  def apply[T1, T2, T3, T4, T5](context: js.Any, fn: Func5[T1, T2, T3, T4, T5], args: js.Tuple5[T1, T2, T3, T4, T5]): CallEffect = js.native
  @JSName("apply")
  def apply[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.apply with js.Any */, N /* <: java.lang.String */, T1, T2, T3, T4](context: C, fn: N, args: js.Tuple4[T1, T2, T3, T4]): CallEffect = js.native
  @JSName("apply")
  def apply[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.apply with js.Any */, N /* <: java.lang.String */, T1, T2, T3, T4, T5](context: C, fn: N, args: js.Tuple5[T1, T2, T3, T4, T5]): CallEffect = js.native
  @JSName("apply")
  def apply[T1, T2, T3, T4, T5, T6, AA /* <: js.Array[_] with (reduxDashSagaLib.Anon_0[T1, T3, T5, T4, T2, T6]) */](context: js.Any, fn: Func6Rest[T1, T2, T3, T4, T5, T6], args: AA): CallEffect = js.native
  @JSName("apply")
  def apply[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.apply with js.Any */, N /* <: java.lang.String */, T1, T2, T3, T4, T5, T6, AA /* <: js.Array[_] with (reduxDashSagaLib.Anon_0[T1, T3, T5, T4, T2, T6]) */](context: C, fn: N, args: AA): CallEffect = js.native
  def cancel(): CancelEffect = js.native
  def cancel(task: reduxDashSagaLib.reduxDashSagaMod.Task): CancelEffect = js.native
  def cancel(tasks: reduxDashSagaLib.reduxDashSagaMod.Task*): js.Array[CancelEffect] = js.native
  def cancelled(): CancelledEffect = js.native
  def cps(fn: CallEffectFn[Func1[CpsCallback]]): CpsEffect = js.native
  def cps[T1](fn: CallEffectFn[Func2[T1, CpsCallback]], arg1: T1): CpsEffect = js.native
  def cps[T1, T2](fn: CallEffectFn[Func3[T1, T2, CpsCallback]], arg1: T1, arg2: T2): CpsEffect = js.native
  def cps[T1, T2, T3](fn: CallEffectFn[Func4[T1, T2, T3, CpsCallback]], arg1: T1, arg2: T2, arg3: T3): CpsEffect = js.native
  def cps[T1, T2, T3, T4](fn: CallEffectFn[Func5[T1, T2, T3, T4, CpsCallback]], arg1: T1, arg2: T2, arg3: T3, arg4: T4): CpsEffect = js.native
  def cps[T1, T2, T3, T4, T5](
    fn: CallEffectFn[Func6Rest[T1, T2, T3, T4, T5, _]],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5,
    rest: js.Any*
  ): CpsEffect = js.native
  @JSName("cps")
  def `cps_C<intersection>NString`[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.cps with js.Any */, N /* <: java.lang.String */](fn: CallEffectNamedFn[C, N]): CpsEffect = js.native
  @JSName("cps")
  def `cps_C<intersection>NStringT1`[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.cps with js.Any */, N /* <: java.lang.String */, T1](fn: CallEffectNamedFn[C, N], arg1: T1): CpsEffect = js.native
  @JSName("cps")
  def `cps_C<intersection>NStringT1T2`[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.cps with js.Any */, N /* <: java.lang.String */, T1, T2](fn: CallEffectNamedFn[C, N], arg1: T1, arg2: T2): CpsEffect = js.native
  @JSName("cps")
  def `cps_C<intersection>NStringT1T2T3`[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.cps with js.Any */, N /* <: java.lang.String */, T1, T2, T3](fn: CallEffectNamedFn[C, N], arg1: T1, arg2: T2, arg3: T3): CpsEffect = js.native
  @JSName("cps")
  def `cps_C<intersection>NStringT1T2T3T4`[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.cps with js.Any */, N /* <: java.lang.String */, T1, T2, T3, T4](fn: CallEffectNamedFn[C, N], arg1: T1, arg2: T2, arg3: T3, arg4: T4): CpsEffect = js.native
  @JSName("cps")
  def `cps_C<intersection>NStringT1T2T3T4T5`[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.cps with js.Any */, N /* <: java.lang.String */, T1, T2, T3, T4, T5](fn: CallEffectNamedFn[C, N], arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, rest: js.Any*): CpsEffect = js.native
  def flush[T](channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T]): FlushEffect[T] = js.native
  def getContext(prop: java.lang.String): GetContextEffect = js.native
  def join(
    task1: reduxDashSagaLib.reduxDashSagaMod.Task,
    task2: reduxDashSagaLib.reduxDashSagaMod.Task,
    tasks: reduxDashSagaLib.reduxDashSagaMod.Task*
  ): js.Array[JoinEffect] = js.native
  def join(task: reduxDashSagaLib.reduxDashSagaMod.Task): JoinEffect = js.native
  def race(effects: org.scalablytyped.runtime.StringDictionary[Effect]): RaceEffect = js.native
  @JSName("race")
  def race_TGenericRaceEffect[T](effects: org.scalablytyped.runtime.StringDictionary[T]): GenericRaceEffect[T] = js.native
  def select(): SelectEffect = js.native
  def select[S](selector: Func1[S]): SelectEffect = js.native
  def select[S, T1](selector: Func2[S, T1], arg1: T1): SelectEffect = js.native
  def select[S, T1, T2](selector: Func3[S, T1, T2], arg1: T1, arg2: T2): SelectEffect = js.native
  def select[S, T1, T2, T3](selector: Func4[S, T1, T2, T3], arg1: T1, arg2: T2, arg3: T3): SelectEffect = js.native
  def select[S, T1, T2, T3, T4](selector: Func5[S, T1, T2, T3, T4], arg1: T1, arg2: T2, arg3: T3, arg4: T4): SelectEffect = js.native
  def select[S, T1, T2, T3, T4, T5](
    selector: Func6Rest[S, T1, T2, T3, T4, T5],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5,
    rest: js.Any*
  ): SelectEffect = js.native
  def setContext[C /* <: js.Object */](props: C): SetContextEffect[C] = js.native
  def takeEvery[T](channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T], worker: HelperFunc0[T]): ForkEffect = js.native
  def takeEvery[A /* <: reduxLib.reduxMod.Action[_] */](pattern: Pattern, worker: HelperFunc0[A]): ForkEffect = js.native
  def takeEvery[T, T1](channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T], worker: HelperFunc1[T, T1], arg1: T1): ForkEffect = js.native
  def takeEvery[A, T1](pattern: Pattern, worker: HelperFunc1[A, T1], arg1: T1): ForkEffect = js.native
  def takeEvery[T, T1, T2](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: HelperFunc2[T, T1, T2],
    arg1: T1,
    arg2: T2
  ): ForkEffect = js.native
  def takeEvery[A, T1, T2](pattern: Pattern, worker: HelperFunc2[A, T1, T2], arg1: T1, arg2: T2): ForkEffect = js.native
  def takeEvery[T, T1, T2, T3](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: HelperFunc3[T, T1, T2, T3],
    arg1: T1,
    arg2: T2,
    arg3: T3
  ): ForkEffect = js.native
  def takeEvery[A, T1, T2, T3](pattern: Pattern, worker: HelperFunc3[A, T1, T2, T3], arg1: T1, arg2: T2, arg3: T3): ForkEffect = js.native
  def takeEvery[T, T1, T2, T3, T4](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: HelperFunc4[T, T1, T2, T3, T4],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): ForkEffect = js.native
  def takeEvery[A, T1, T2, T3, T4](pattern: Pattern, worker: HelperFunc4[A, T1, T2, T3, T4], arg1: T1, arg2: T2, arg3: T3, arg4: T4): ForkEffect = js.native
  def takeEvery[T, T1, T2, T3, T4, T5](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: HelperFunc5[T, T1, T2, T3, T4, T5],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5
  ): ForkEffect = js.native
  def takeEvery[A, T1, T2, T3, T4, T5](
    pattern: Pattern,
    worker: HelperFunc5[A, T1, T2, T3, T4, T5],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5
  ): ForkEffect = js.native
  def takeEvery[T, T1, T2, T3, T4, T5, T6](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: HelperFunc6Rest[T, T1, T2, T3, T4, T5, T6],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5,
    arg6: T6,
    rest: js.Any*
  ): ForkEffect = js.native
  def takeEvery[A, T1, T2, T3, T4, T5, T6](
    pattern: Pattern,
    worker: HelperFunc6Rest[A, T1, T2, T3, T4, T5, T6],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5,
    arg6: T6,
    rest: js.Any*
  ): ForkEffect = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */](ms: scala.Double, pattern: Pattern, worker: HelperFunc0[A]): ForkEffect = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, T1](ms: scala.Double, pattern: Pattern, worker: HelperFunc1[A, T1], arg1: T1): ForkEffect = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, T1, T2](ms: scala.Double, pattern: Pattern, worker: HelperFunc2[A, T1, T2], arg1: T1, arg2: T2): ForkEffect = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, T1, T2, T3](
    ms: scala.Double,
    pattern: Pattern,
    worker: HelperFunc3[A, T1, T2, T3],
    arg1: T1,
    arg2: T2,
    arg3: T3
  ): ForkEffect = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, T1, T2, T3, T4](
    ms: scala.Double,
    pattern: Pattern,
    worker: HelperFunc4[A, T1, T2, T3, T4],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): ForkEffect = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, T1, T2, T3, T4, T5](
    ms: scala.Double,
    pattern: Pattern,
    worker: HelperFunc5[A, T1, T2, T3, T4, T5],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5
  ): ForkEffect = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, T1, T2, T3, T4, T5, T6](
    ms: scala.Double,
    pattern: Pattern,
    worker: HelperFunc6Rest[A, T1, T2, T3, T4, T5, T6],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5,
    arg6: T6,
    rest: js.Any*
  ): ForkEffect = js.native
}

