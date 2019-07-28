package typings.atReduxDashSagaCore.effectsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atReduxDashSagaCore.Anon_Context
import typings.atReduxDashSagaCore.Anon_ContextFn
import typings.atReduxDashSagaCore.Anon_ContextFnCtx
import typings.atReduxDashSagaCore.Anon_ContextFnCtx_735312900
import typings.atReduxDashSagaCore.atReduxDashSagaCoreMod.FlushableChannel
import typings.atReduxDashSagaCore.atReduxDashSagaCoreMod.PuttableChannel
import typings.atReduxDashSagaCore.atReduxDashSagaCoreMod.TakeableChannel
import typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.apply
import typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.call
import typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.fork
import typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.spawn
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.ActionMatchingPattern
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.ActionPattern
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.ActionSubPattern
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.Buffer
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.END
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.Pattern
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.StringableActionCreator
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.Task
import typings.redux.reduxMod.Action
import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@redux-saga/core/effects", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def actionChannel(pattern: ActionPattern[Action[_]]): ActionChannelEffect = js.native
  def actionChannel(pattern: ActionPattern[Action[_]], buffer: Buffer[Action[_]]): ActionChannelEffect = js.native
  def all[T](effects: js.Array[T]): AllEffect[T] = js.native
  def all[T](effects: StringDictionary[T]): AllEffect[T] = js.native
  @JSName("apply")
  def apply[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](ctx: Ctx, fn: Fn, args: Parameters[Fn]): CallEffect = js.native
  @JSName("apply")
  def apply_Ctx_IntersectionapplyAnyName_String[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ apply with js.Any */, Name /* <: String */](
    ctx: Ctx,
    fnName: Name,
    args: Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): CallEffect = js.native
  def call[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = js.native
  def call[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.call with js.Any */, Name /* <: String */](
    ctxAndFnName: Anon_Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): CallEffect = js.native
  def call[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = js.native
  def call[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: Anon_ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = js.native
  @JSName("call")
  def call_Ctx_IntersectioncallAnyName_String[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ call with js.Any */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): CallEffect = js.native
  def cancel(): CancelEffect = js.native
  def cancel(tasks: js.Array[Task]): CancelEffect = js.native
  def cancel(task: Task): CancelEffect = js.native
  def cancelled(): CancelledEffect = js.native
  def cps[Fn /* <: js.Function1[/* cb */ CpsCallback[_], _] */](fn: Fn): CpsEffect = js.native
  def cps[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = js.native
  def cps[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): void}
    */ typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.cps with js.Any */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type CpsFunctionParameters<Ctx[Name]> is not an array type */ args: CpsFunctionParameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): CpsEffect = js.native
  def cps[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): void}
    */ typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.cps with js.Any */, Name /* <: String */](
    ctxAndFnName: Anon_ContextFnCtx[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type CpsFunctionParameters<Ctx[Name]> is not an array type */ args: CpsFunctionParameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): CpsEffect = js.native
  def cps[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, Unit] */](
    ctxAndFn: Anon_ContextFnCtx_735312900[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = js.native
  @JSName("cps")
  def cps_CtxFn_ThisFunction1CtxAnyUnit[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, Unit] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = js.native
  def debounce(ms: Double, pattern: String, worker: js.Function1[/* action */ ActionMatchingPattern[String], _]): ForkEffect = js.native
  def debounce(
    ms: Double,
    pattern: js.Array[ActionSubPattern[Action[_]]],
    worker: js.Function1[/* action */ ActionMatchingPattern[js.Array[ActionSubPattern[Action[_]]]], _]
  ): ForkEffect = js.native
  def debounce(
    ms: Double,
    pattern: js.Symbol,
    worker: js.Function1[/* action */ ActionMatchingPattern[js.Symbol], _]
  ): ForkEffect = js.native
  def debounce(ms: Double, pattern: Double, worker: js.Function1[/* action */ ActionMatchingPattern[Double], _]): ForkEffect = js.native
  def debounce(
    ms: Double,
    pattern: StringableActionCreator[Action[_]],
    worker: js.Function1[/* action */ ActionMatchingPattern[StringableActionCreator[Action[_]]], _]
  ): ForkEffect = js.native
  def debounce[T](ms: Double, channel: TakeableChannel[T], worker: js.Function1[/* item */ T, _]): ForkEffect = js.native
  def debounce[P /* <: js.Function1[/* arg */ Action[_], /* is redux.redux.Action<any> */ Boolean] */](ms: Double, pattern: P, worker: js.Function1[/* action */ ActionMatchingPattern[P], _]): ForkEffect = js.native
  def debounce[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: String,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[String], Fn]
  ): ForkEffect = js.native
  def debounce[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: js.Array[ActionSubPattern[Action[_]]],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[js.Array[ActionSubPattern[Action[_]]]], Fn]
  ): ForkEffect = js.native
  def debounce[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: js.Symbol,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[js.Symbol], Fn]
  ): ForkEffect = js.native
  def debounce[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: Double,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[Double], Fn]
  ): ForkEffect = js.native
  def debounce[A /* <: Action[_] */](ms: Double, pattern: ActionPattern[A], worker: js.Function1[/* action */ A, _]): ForkEffect = js.native
  def debounce[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: StringableActionCreator[Action[_]],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[StringableActionCreator[Action[_]]], Fn]
  ): ForkEffect = js.native
  def debounce[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  def debounce[P /* <: js.Function1[/* arg */ Action[_], /* is redux.redux.Action<any> */ Boolean] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[P], Fn]
  ): ForkEffect = js.native
  def debounce[A /* <: Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: ActionPattern[A],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
  def delay[T](ms: Double): CallEffect = js.native
  def delay[T](ms: Double, `val`: T): CallEffect = js.native
  def flush[T](channel: FlushableChannel[T]): FlushEffect[T] = js.native
  def fork[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = js.native
  def fork[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.fork with js.Any */, Name /* <: String */](
    ctxAndFnName: Anon_Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): ForkEffect = js.native
  def fork[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = js.native
  def fork[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: Anon_ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = js.native
  @JSName("fork")
  def fork_Ctx_IntersectionforkAnyName_String[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ fork with js.Any */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): ForkEffect = js.native
  def getContext(prop: String): GetContextEffect = js.native
  def join(tasks: js.Array[Task]): JoinEffect = js.native
  def join(task: Task): JoinEffect = js.native
  def put[A /* <: Action[_] */](action: A): PutEffect[A] = js.native
  def put[T](channel: PuttableChannel[T], action: T): ChannelPutEffect[T] = js.native
  def put[T](channel: PuttableChannel[T], action: END): ChannelPutEffect[T] = js.native
  def putResolve[A /* <: Action[_] */](action: A): PutEffect[A] = js.native
  def race[T](effects: js.Array[T]): RaceEffect[T] = js.native
  def race[T](effects: StringDictionary[T]): RaceEffect[T] = js.native
  def retry[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    maxTries: Double,
    delayLength: Double,
    fn: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = js.native
  def select(): SelectEffect = js.native
  def select[Fn /* <: js.Function2[/* state */ js.Any, /* repeated */ js.Any, _] */](
    selector: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Tail<Parameters<Fn>> is not an array type */ args: Tail[Parameters[Fn]]
  ): SelectEffect = js.native
  def setContext[C /* <: js.Object */](props: C): SetContextEffect[C] = js.native
  def spawn[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = js.native
  def spawn[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.spawn with js.Any */, Name /* <: String */](
    ctxAndFnName: Anon_Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): ForkEffect = js.native
  def spawn[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = js.native
  def spawn[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: Anon_ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = js.native
  @JSName("spawn")
  def spawn_Ctx_IntersectionspawnAnyName_String[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ spawn with js.Any */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): ForkEffect = js.native
  def take(): TakeEffect = js.native
  def take(pattern: ActionPattern[Action[_]]): TakeEffect = js.native
  def take[T](channel: TakeableChannel[T]): ChannelTakeEffect[T] = js.native
  def take[T](channel: TakeableChannel[T], multicastPattern: Pattern[T]): ChannelTakeEffect[T] = js.native
  def takeEvery(pattern: String, worker: js.Function1[/* action */ ActionMatchingPattern[String], _]): ForkEffect = js.native
  def takeEvery(
    pattern: js.Array[ActionSubPattern[Action[_]]],
    worker: js.Function1[/* action */ ActionMatchingPattern[js.Array[ActionSubPattern[Action[_]]]], _]
  ): ForkEffect = js.native
  def takeEvery(pattern: js.Symbol, worker: js.Function1[/* action */ ActionMatchingPattern[js.Symbol], _]): ForkEffect = js.native
  def takeEvery(pattern: Double, worker: js.Function1[/* action */ ActionMatchingPattern[Double], _]): ForkEffect = js.native
  def takeEvery(
    pattern: StringableActionCreator[Action[_]],
    worker: js.Function1[/* action */ ActionMatchingPattern[StringableActionCreator[Action[_]]], _]
  ): ForkEffect = js.native
  def takeEvery[T](channel: TakeableChannel[T], worker: js.Function1[/* item */ T, _]): ForkEffect = js.native
  def takeEvery[P /* <: js.Function1[/* arg */ Action[_], /* is redux.redux.Action<any> */ Boolean] */](pattern: P, worker: js.Function1[/* action */ ActionMatchingPattern[P], _]): ForkEffect = js.native
  def takeEvery[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: String,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[String], Fn]
  ): ForkEffect = js.native
  def takeEvery[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: js.Array[ActionSubPattern[Action[_]]],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[js.Array[ActionSubPattern[Action[_]]]], Fn]
  ): ForkEffect = js.native
  def takeEvery[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: js.Symbol,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[js.Symbol], Fn]
  ): ForkEffect = js.native
  def takeEvery[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: Double,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[Double], Fn]
  ): ForkEffect = js.native
  def takeEvery[A /* <: Action[_] */](pattern: ActionPattern[A], worker: js.Function1[/* action */ A, _]): ForkEffect = js.native
  def takeEvery[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: StringableActionCreator[Action[_]],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[StringableActionCreator[Action[_]]], Fn]
  ): ForkEffect = js.native
  def takeEvery[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  def takeEvery[P /* <: js.Function1[/* arg */ Action[_], /* is redux.redux.Action<any> */ Boolean] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[P], Fn]
  ): ForkEffect = js.native
  def takeEvery[A /* <: Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: ActionPattern[A],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
  def takeLatest(pattern: String, worker: js.Function1[/* action */ ActionMatchingPattern[String], _]): ForkEffect = js.native
  def takeLatest(
    pattern: js.Array[ActionSubPattern[Action[_]]],
    worker: js.Function1[/* action */ ActionMatchingPattern[js.Array[ActionSubPattern[Action[_]]]], _]
  ): ForkEffect = js.native
  def takeLatest(pattern: js.Symbol, worker: js.Function1[/* action */ ActionMatchingPattern[js.Symbol], _]): ForkEffect = js.native
  def takeLatest(pattern: Double, worker: js.Function1[/* action */ ActionMatchingPattern[Double], _]): ForkEffect = js.native
  def takeLatest(
    pattern: StringableActionCreator[Action[_]],
    worker: js.Function1[/* action */ ActionMatchingPattern[StringableActionCreator[Action[_]]], _]
  ): ForkEffect = js.native
  def takeLatest[T](channel: TakeableChannel[T], worker: js.Function1[/* item */ T, _]): ForkEffect = js.native
  def takeLatest[P /* <: js.Function1[/* arg */ Action[_], /* is redux.redux.Action<any> */ Boolean] */](pattern: P, worker: js.Function1[/* action */ ActionMatchingPattern[P], _]): ForkEffect = js.native
  def takeLatest[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: String,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[String], Fn]
  ): ForkEffect = js.native
  def takeLatest[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: js.Array[ActionSubPattern[Action[_]]],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[js.Array[ActionSubPattern[Action[_]]]], Fn]
  ): ForkEffect = js.native
  def takeLatest[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: js.Symbol,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[js.Symbol], Fn]
  ): ForkEffect = js.native
  def takeLatest[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: Double,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[Double], Fn]
  ): ForkEffect = js.native
  def takeLatest[A /* <: Action[_] */](pattern: ActionPattern[A], worker: js.Function1[/* action */ A, _]): ForkEffect = js.native
  def takeLatest[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: StringableActionCreator[Action[_]],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[StringableActionCreator[Action[_]]], Fn]
  ): ForkEffect = js.native
  def takeLatest[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  def takeLatest[P /* <: js.Function1[/* arg */ Action[_], /* is redux.redux.Action<any> */ Boolean] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[P], Fn]
  ): ForkEffect = js.native
  def takeLatest[A /* <: Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: ActionPattern[A],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
  def takeLeading(pattern: String, worker: js.Function1[/* action */ ActionMatchingPattern[String], _]): ForkEffect = js.native
  def takeLeading(
    pattern: js.Array[ActionSubPattern[Action[_]]],
    worker: js.Function1[/* action */ ActionMatchingPattern[js.Array[ActionSubPattern[Action[_]]]], _]
  ): ForkEffect = js.native
  def takeLeading(pattern: js.Symbol, worker: js.Function1[/* action */ ActionMatchingPattern[js.Symbol], _]): ForkEffect = js.native
  def takeLeading(pattern: Double, worker: js.Function1[/* action */ ActionMatchingPattern[Double], _]): ForkEffect = js.native
  def takeLeading(
    pattern: StringableActionCreator[Action[_]],
    worker: js.Function1[/* action */ ActionMatchingPattern[StringableActionCreator[Action[_]]], _]
  ): ForkEffect = js.native
  def takeLeading[T](channel: TakeableChannel[T], worker: js.Function1[/* item */ T, _]): ForkEffect = js.native
  def takeLeading[P /* <: js.Function1[/* arg */ Action[_], /* is redux.redux.Action<any> */ Boolean] */](pattern: P, worker: js.Function1[/* action */ ActionMatchingPattern[P], _]): ForkEffect = js.native
  def takeLeading[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: String,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[String], Fn]
  ): ForkEffect = js.native
  def takeLeading[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: js.Array[ActionSubPattern[Action[_]]],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[js.Array[ActionSubPattern[Action[_]]]], Fn]
  ): ForkEffect = js.native
  def takeLeading[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: js.Symbol,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[js.Symbol], Fn]
  ): ForkEffect = js.native
  def takeLeading[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: Double,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[Double], Fn]
  ): ForkEffect = js.native
  def takeLeading[A /* <: Action[_] */](pattern: ActionPattern[A], worker: js.Function1[/* action */ A, _]): ForkEffect = js.native
  def takeLeading[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: StringableActionCreator[Action[_]],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[StringableActionCreator[Action[_]]], Fn]
  ): ForkEffect = js.native
  def takeLeading[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  def takeLeading[P /* <: js.Function1[/* arg */ Action[_], /* is redux.redux.Action<any> */ Boolean] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[P], Fn]
  ): ForkEffect = js.native
  def takeLeading[A /* <: Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: ActionPattern[A],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
  def takeMaybe(): TakeEffect = js.native
  def takeMaybe(pattern: ActionPattern[Action[_]]): TakeEffect = js.native
  def takeMaybe[T](channel: TakeableChannel[T]): ChannelTakeEffect[T] = js.native
  def takeMaybe[T](channel: TakeableChannel[T], multicastPattern: Pattern[T]): ChannelTakeEffect[T] = js.native
  @JSName("takeMaybe")
  def takeMaybe_A_ActionWildcard[A /* <: Action[_] */](): TakeEffect = js.native
  @JSName("takeMaybe")
  def takeMaybe_A_ActionWildcard[A /* <: Action[_] */](pattern: ActionPattern[A]): TakeEffect = js.native
  @JSName("take")
  def take_A_ActionWildcard[A /* <: Action[_] */](): TakeEffect = js.native
  @JSName("take")
  def take_A_ActionWildcard[A /* <: Action[_] */](pattern: ActionPattern[A]): TakeEffect = js.native
  def throttle(ms: Double, pattern: String, worker: js.Function1[/* action */ ActionMatchingPattern[String], _]): ForkEffect = js.native
  def throttle(
    ms: Double,
    pattern: js.Array[ActionSubPattern[Action[_]]],
    worker: js.Function1[/* action */ ActionMatchingPattern[js.Array[ActionSubPattern[Action[_]]]], _]
  ): ForkEffect = js.native
  def throttle(
    ms: Double,
    pattern: js.Symbol,
    worker: js.Function1[/* action */ ActionMatchingPattern[js.Symbol], _]
  ): ForkEffect = js.native
  def throttle(ms: Double, pattern: Double, worker: js.Function1[/* action */ ActionMatchingPattern[Double], _]): ForkEffect = js.native
  def throttle(
    ms: Double,
    pattern: StringableActionCreator[Action[_]],
    worker: js.Function1[/* action */ ActionMatchingPattern[StringableActionCreator[Action[_]]], _]
  ): ForkEffect = js.native
  def throttle[T](ms: Double, channel: TakeableChannel[T], worker: js.Function1[/* item */ T, _]): ForkEffect = js.native
  def throttle[P /* <: js.Function1[/* arg */ Action[_], /* is redux.redux.Action<any> */ Boolean] */](ms: Double, pattern: P, worker: js.Function1[/* action */ ActionMatchingPattern[P], _]): ForkEffect = js.native
  def throttle[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: String,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[String], Fn]
  ): ForkEffect = js.native
  def throttle[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: js.Array[ActionSubPattern[Action[_]]],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[js.Array[ActionSubPattern[Action[_]]]], Fn]
  ): ForkEffect = js.native
  def throttle[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: js.Symbol,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[js.Symbol], Fn]
  ): ForkEffect = js.native
  def throttle[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: Double,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[Double], Fn]
  ): ForkEffect = js.native
  def throttle[A /* <: Action[_] */](ms: Double, pattern: ActionPattern[A], worker: js.Function1[/* action */ A, _]): ForkEffect = js.native
  def throttle[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: StringableActionCreator[Action[_]],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[StringableActionCreator[Action[_]]], Fn]
  ): ForkEffect = js.native
  def throttle[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  def throttle[P /* <: js.Function1[/* arg */ Action[_], /* is redux.redux.Action<any> */ Boolean] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[ActionMatchingPattern[P], Fn]
  ): ForkEffect = js.native
  def throttle[A /* <: Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: ActionPattern[A],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
}

