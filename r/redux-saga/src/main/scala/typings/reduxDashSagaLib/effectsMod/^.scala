package typings
package reduxDashSagaLib.effectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-saga/effects", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val call: reduxDashSagaLib.effectsMod.CallEffectFactory[reduxDashSagaLib.effectsMod.CallEffect] = js.native
  val fork: reduxDashSagaLib.effectsMod.CallEffectFactory[reduxDashSagaLib.effectsMod.ForkEffect] = js.native
  val put: reduxDashSagaLib.effectsMod.Put = js.native
  val spawn: reduxDashSagaLib.effectsMod.CallEffectFactory[reduxDashSagaLib.effectsMod.ForkEffect] = js.native
  val take: reduxDashSagaLib.effectsMod.Take = js.native
  val takeLatest: reduxDashSagaLib.Anon_Arg1 = js.native
  val takem: reduxDashSagaLib.Anon_Channel = js.native
  def actionChannel(pattern: reduxDashSagaLib.effectsMod.Pattern): reduxDashSagaLib.effectsMod.ActionChannelEffect = js.native
  def actionChannel(
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    buffer: reduxDashSagaLib.reduxDashSagaMod.Buffer[reduxLib.reduxMod.Action[_]]
  ): reduxDashSagaLib.effectsMod.ActionChannelEffect = js.native
  def all(effects: js.Array[reduxDashSagaLib.effectsMod.Effect]): reduxDashSagaLib.effectsMod.AllEffect = js.native
  def all(effects: org.scalablytyped.runtime.StringDictionary[reduxDashSagaLib.effectsMod.Effect]): reduxDashSagaLib.effectsMod.AllEffect = js.native
  @JSName("all")
  def all_TGenericAllEffect[T](effects: js.Array[T]): reduxDashSagaLib.effectsMod.GenericAllEffect[T] = js.native
  @JSName("all")
  def all_TGenericAllEffect[T](effects: org.scalablytyped.runtime.StringDictionary[T]): reduxDashSagaLib.effectsMod.GenericAllEffect[T] = js.native
  @JSName("apply")
  def apply(context: js.Any, fn: reduxDashSagaLib.effectsMod.Func0): reduxDashSagaLib.effectsMod.CallEffect = js.native
  @JSName("apply")
  def apply[T1](context: js.Any, fn: reduxDashSagaLib.effectsMod.Func1[T1], args: js.Array[T1]): reduxDashSagaLib.effectsMod.CallEffect = js.native
  @JSName("apply")
  def apply[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.apply with js.Any */, N /* <: java.lang.String */](context: C, fn: N): reduxDashSagaLib.effectsMod.CallEffect = js.native
  @JSName("apply")
  def apply[T1, T2](context: js.Any, fn: reduxDashSagaLib.effectsMod.Func2[T1, T2], args: js.Tuple2[T1, T2]): reduxDashSagaLib.effectsMod.CallEffect = js.native
  @JSName("apply")
  def apply[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.apply with js.Any */, N /* <: java.lang.String */, T1](context: C, fn: N, args: js.Array[T1]): reduxDashSagaLib.effectsMod.CallEffect = js.native
  @JSName("apply")
  def apply[T1, T2, T3](context: js.Any, fn: reduxDashSagaLib.effectsMod.Func3[T1, T2, T3], args: js.Tuple3[T1, T2, T3]): reduxDashSagaLib.effectsMod.CallEffect = js.native
  @JSName("apply")
  def apply[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.apply with js.Any */, N /* <: java.lang.String */, T1, T2](context: C, fn: N, args: js.Tuple2[T1, T2]): reduxDashSagaLib.effectsMod.CallEffect = js.native
  @JSName("apply")
  def apply[T1, T2, T3, T4](
    context: js.Any,
    fn: reduxDashSagaLib.effectsMod.Func4[T1, T2, T3, T4],
    args: js.Tuple4[T1, T2, T3, T4]
  ): reduxDashSagaLib.effectsMod.CallEffect = js.native
  @JSName("apply")
  def apply[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.apply with js.Any */, N /* <: java.lang.String */, T1, T2, T3](context: C, fn: N, args: js.Tuple3[T1, T2, T3]): reduxDashSagaLib.effectsMod.CallEffect = js.native
  @JSName("apply")
  def apply[T1, T2, T3, T4, T5](
    context: js.Any,
    fn: reduxDashSagaLib.effectsMod.Func5[T1, T2, T3, T4, T5],
    args: js.Tuple5[T1, T2, T3, T4, T5]
  ): reduxDashSagaLib.effectsMod.CallEffect = js.native
  @JSName("apply")
  def apply[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.apply with js.Any */, N /* <: java.lang.String */, T1, T2, T3, T4](context: C, fn: N, args: js.Tuple4[T1, T2, T3, T4]): reduxDashSagaLib.effectsMod.CallEffect = js.native
  @JSName("apply")
  def apply[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.apply with js.Any */, N /* <: java.lang.String */, T1, T2, T3, T4, T5](context: C, fn: N, args: js.Tuple5[T1, T2, T3, T4, T5]): reduxDashSagaLib.effectsMod.CallEffect = js.native
  @JSName("apply")
  def apply[T1, T2, T3, T4, T5, T6, AA /* <: js.Array[_] with (reduxDashSagaLib.Anon_0[T1, T3, T5, T4, T2, T6]) */](context: js.Any, fn: reduxDashSagaLib.effectsMod.Func6Rest[T1, T2, T3, T4, T5, T6], args: AA): reduxDashSagaLib.effectsMod.CallEffect = js.native
  @JSName("apply")
  def apply[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.apply with js.Any */, N /* <: java.lang.String */, T1, T2, T3, T4, T5, T6, AA /* <: js.Array[_] with (reduxDashSagaLib.Anon_0[T1, T3, T5, T4, T2, T6]) */](context: C, fn: N, args: AA): reduxDashSagaLib.effectsMod.CallEffect = js.native
  def cancel(): reduxDashSagaLib.effectsMod.CancelEffect = js.native
  def cancel(task: reduxDashSagaLib.reduxDashSagaMod.Task): reduxDashSagaLib.effectsMod.CancelEffect = js.native
  def cancel(tasks: reduxDashSagaLib.reduxDashSagaMod.Task*): js.Array[reduxDashSagaLib.effectsMod.CancelEffect] = js.native
  def cancelled(): reduxDashSagaLib.effectsMod.CancelledEffect = js.native
  def cps(
    fn: reduxDashSagaLib.effectsMod.CallEffectFn[reduxDashSagaLib.effectsMod.Func1[reduxDashSagaLib.effectsMod.CpsCallback]]
  ): reduxDashSagaLib.effectsMod.CpsEffect = js.native
  def cps[T1](
    fn: reduxDashSagaLib.effectsMod.CallEffectFn[reduxDashSagaLib.effectsMod.Func2[T1, reduxDashSagaLib.effectsMod.CpsCallback]],
    arg1: T1
  ): reduxDashSagaLib.effectsMod.CpsEffect = js.native
  def cps[T1, T2](
    fn: reduxDashSagaLib.effectsMod.CallEffectFn[
      reduxDashSagaLib.effectsMod.Func3[T1, T2, reduxDashSagaLib.effectsMod.CpsCallback]
    ],
    arg1: T1,
    arg2: T2
  ): reduxDashSagaLib.effectsMod.CpsEffect = js.native
  def cps[T1, T2, T3](
    fn: reduxDashSagaLib.effectsMod.CallEffectFn[
      reduxDashSagaLib.effectsMod.Func4[T1, T2, T3, reduxDashSagaLib.effectsMod.CpsCallback]
    ],
    arg1: T1,
    arg2: T2,
    arg3: T3
  ): reduxDashSagaLib.effectsMod.CpsEffect = js.native
  def cps[T1, T2, T3, T4](
    fn: reduxDashSagaLib.effectsMod.CallEffectFn[
      reduxDashSagaLib.effectsMod.Func5[T1, T2, T3, T4, reduxDashSagaLib.effectsMod.CpsCallback]
    ],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): reduxDashSagaLib.effectsMod.CpsEffect = js.native
  def cps[T1, T2, T3, T4, T5](
    fn: reduxDashSagaLib.effectsMod.CallEffectFn[reduxDashSagaLib.effectsMod.Func6Rest[T1, T2, T3, T4, T5, _]],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5,
    rest: js.Any*
  ): reduxDashSagaLib.effectsMod.CpsEffect = js.native
  @JSName("cps")
  def `cps_C<intersection>NString`[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.cps with js.Any */, N /* <: java.lang.String */](fn: reduxDashSagaLib.effectsMod.CallEffectNamedFn[C, N]): reduxDashSagaLib.effectsMod.CpsEffect = js.native
  @JSName("cps")
  def `cps_C<intersection>NStringT1`[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.cps with js.Any */, N /* <: java.lang.String */, T1](fn: reduxDashSagaLib.effectsMod.CallEffectNamedFn[C, N], arg1: T1): reduxDashSagaLib.effectsMod.CpsEffect = js.native
  @JSName("cps")
  def `cps_C<intersection>NStringT1T2`[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.cps with js.Any */, N /* <: java.lang.String */, T1, T2](fn: reduxDashSagaLib.effectsMod.CallEffectNamedFn[C, N], arg1: T1, arg2: T2): reduxDashSagaLib.effectsMod.CpsEffect = js.native
  @JSName("cps")
  def `cps_C<intersection>NStringT1T2T3`[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.cps with js.Any */, N /* <: java.lang.String */, T1, T2, T3](fn: reduxDashSagaLib.effectsMod.CallEffectNamedFn[C, N], arg1: T1, arg2: T2, arg3: T3): reduxDashSagaLib.effectsMod.CpsEffect = js.native
  @JSName("cps")
  def `cps_C<intersection>NStringT1T2T3T4`[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.cps with js.Any */, N /* <: java.lang.String */, T1, T2, T3, T4](fn: reduxDashSagaLib.effectsMod.CallEffectNamedFn[C, N], arg1: T1, arg2: T2, arg3: T3, arg4: T4): reduxDashSagaLib.effectsMod.CpsEffect = js.native
  @JSName("cps")
  def `cps_C<intersection>NStringT1T2T3T4T5`[C /* <: reduxDashSagaLib.reduxDashSagaLibStrings.cps with js.Any */, N /* <: java.lang.String */, T1, T2, T3, T4, T5](
    fn: reduxDashSagaLib.effectsMod.CallEffectNamedFn[C, N],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5,
    rest: js.Any*
  ): reduxDashSagaLib.effectsMod.CpsEffect = js.native
  def flush[T](channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T]): reduxDashSagaLib.effectsMod.FlushEffect[T] = js.native
  def getContext(prop: java.lang.String): reduxDashSagaLib.effectsMod.GetContextEffect = js.native
  def join(
    task1: reduxDashSagaLib.reduxDashSagaMod.Task,
    task2: reduxDashSagaLib.reduxDashSagaMod.Task,
    tasks: reduxDashSagaLib.reduxDashSagaMod.Task*
  ): js.Array[reduxDashSagaLib.effectsMod.JoinEffect] = js.native
  def join(task: reduxDashSagaLib.reduxDashSagaMod.Task): reduxDashSagaLib.effectsMod.JoinEffect = js.native
  def race(effects: org.scalablytyped.runtime.StringDictionary[reduxDashSagaLib.effectsMod.Effect]): reduxDashSagaLib.effectsMod.RaceEffect = js.native
  @JSName("race")
  def race_TGenericRaceEffect[T](effects: org.scalablytyped.runtime.StringDictionary[T]): reduxDashSagaLib.effectsMod.GenericRaceEffect[T] = js.native
  def select(): reduxDashSagaLib.effectsMod.SelectEffect = js.native
  def select[S](selector: reduxDashSagaLib.effectsMod.Func1[S]): reduxDashSagaLib.effectsMod.SelectEffect = js.native
  def select[S, T1](selector: reduxDashSagaLib.effectsMod.Func2[S, T1], arg1: T1): reduxDashSagaLib.effectsMod.SelectEffect = js.native
  def select[S, T1, T2](selector: reduxDashSagaLib.effectsMod.Func3[S, T1, T2], arg1: T1, arg2: T2): reduxDashSagaLib.effectsMod.SelectEffect = js.native
  def select[S, T1, T2, T3](selector: reduxDashSagaLib.effectsMod.Func4[S, T1, T2, T3], arg1: T1, arg2: T2, arg3: T3): reduxDashSagaLib.effectsMod.SelectEffect = js.native
  def select[S, T1, T2, T3, T4](
    selector: reduxDashSagaLib.effectsMod.Func5[S, T1, T2, T3, T4],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): reduxDashSagaLib.effectsMod.SelectEffect = js.native
  def select[S, T1, T2, T3, T4, T5](
    selector: reduxDashSagaLib.effectsMod.Func6Rest[S, T1, T2, T3, T4, T5],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5,
    rest: js.Any*
  ): reduxDashSagaLib.effectsMod.SelectEffect = js.native
  def setContext[C /* <: js.Object */](props: C): reduxDashSagaLib.effectsMod.SetContextEffect[C] = js.native
  def takeEvery[T](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: reduxDashSagaLib.effectsMod.HelperFunc0[T]
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def takeEvery[A /* <: reduxLib.reduxMod.Action[_] */](pattern: reduxDashSagaLib.effectsMod.Pattern, worker: reduxDashSagaLib.effectsMod.HelperFunc0[A]): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def takeEvery[T, T1](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: reduxDashSagaLib.effectsMod.HelperFunc1[T, T1],
    arg1: T1
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def takeEvery[A, T1](
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.effectsMod.HelperFunc1[A, T1],
    arg1: T1
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def takeEvery[T, T1, T2](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: reduxDashSagaLib.effectsMod.HelperFunc2[T, T1, T2],
    arg1: T1,
    arg2: T2
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def takeEvery[A, T1, T2](
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.effectsMod.HelperFunc2[A, T1, T2],
    arg1: T1,
    arg2: T2
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def takeEvery[T, T1, T2, T3](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: reduxDashSagaLib.effectsMod.HelperFunc3[T, T1, T2, T3],
    arg1: T1,
    arg2: T2,
    arg3: T3
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def takeEvery[A, T1, T2, T3](
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.effectsMod.HelperFunc3[A, T1, T2, T3],
    arg1: T1,
    arg2: T2,
    arg3: T3
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def takeEvery[T, T1, T2, T3, T4](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: reduxDashSagaLib.effectsMod.HelperFunc4[T, T1, T2, T3, T4],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def takeEvery[A, T1, T2, T3, T4](
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.effectsMod.HelperFunc4[A, T1, T2, T3, T4],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def takeEvery[T, T1, T2, T3, T4, T5](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: reduxDashSagaLib.effectsMod.HelperFunc5[T, T1, T2, T3, T4, T5],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def takeEvery[A, T1, T2, T3, T4, T5](
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.effectsMod.HelperFunc5[A, T1, T2, T3, T4, T5],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def takeEvery[T, T1, T2, T3, T4, T5, T6](
    channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T],
    worker: reduxDashSagaLib.effectsMod.HelperFunc6Rest[T, T1, T2, T3, T4, T5, T6],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5,
    arg6: T6,
    rest: js.Any*
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def takeEvery[A, T1, T2, T3, T4, T5, T6](
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.effectsMod.HelperFunc6Rest[A, T1, T2, T3, T4, T5, T6],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5,
    arg6: T6,
    rest: js.Any*
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */](
    ms: scala.Double,
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.effectsMod.HelperFunc0[A]
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, T1](
    ms: scala.Double,
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.effectsMod.HelperFunc1[A, T1],
    arg1: T1
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, T1, T2](
    ms: scala.Double,
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.effectsMod.HelperFunc2[A, T1, T2],
    arg1: T1,
    arg2: T2
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, T1, T2, T3](
    ms: scala.Double,
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.effectsMod.HelperFunc3[A, T1, T2, T3],
    arg1: T1,
    arg2: T2,
    arg3: T3
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, T1, T2, T3, T4](
    ms: scala.Double,
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.effectsMod.HelperFunc4[A, T1, T2, T3, T4],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, T1, T2, T3, T4, T5](
    ms: scala.Double,
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.effectsMod.HelperFunc5[A, T1, T2, T3, T4, T5],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, T1, T2, T3, T4, T5, T6](
    ms: scala.Double,
    pattern: reduxDashSagaLib.effectsMod.Pattern,
    worker: reduxDashSagaLib.effectsMod.HelperFunc6Rest[A, T1, T2, T3, T4, T5, T6],
    arg1: T1,
    arg2: T2,
    arg3: T3,
    arg4: T4,
    arg5: T5,
    arg6: T6,
    rest: js.Any*
  ): reduxDashSagaLib.effectsMod.ForkEffect = js.native
}

