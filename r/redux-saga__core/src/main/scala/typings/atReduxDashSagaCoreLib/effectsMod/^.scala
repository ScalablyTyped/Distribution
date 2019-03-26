package typings
package atReduxDashSagaCoreLib.effectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@redux-saga/core/effects", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val effectTypes: atReduxDashSagaCoreLib.Anon_ACTIONCHANNEL = js.native
  def actionChannel(
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[reduxLib.reduxMod.Action[_]]
  ): ActionChannelEffect = js.native
  def actionChannel(
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[reduxLib.reduxMod.Action[_]],
    buffer: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Buffer[reduxLib.reduxMod.Action[_]]
  ): ActionChannelEffect = js.native
  def all[T](effects: js.Array[T]): AllEffect[T] = js.native
  def all[T](effects: org.scalablytyped.runtime.StringDictionary[T]): AllEffect[T] = js.native
  @JSName("apply")
  def apply[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](ctx: Ctx, fn: Fn, args: stdLib.Parameters[Fn]): CallEffect = js.native
  @JSName("apply")
  def `apply_Ctx<intersection>NameString`[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.apply with js.Any */, Name /* <: java.lang.String */](
    ctx: Ctx,
    fnName: Name,
    args: stdLib.Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): CallEffect = js.native
  def call[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: stdLib.Parameters[Fn]
  ): CallEffect = js.native
  def call[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.call with js.Any */, Name /* <: java.lang.String */](
    ctxAndFnName: atReduxDashSagaCoreLib.Anon_Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: stdLib.Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): CallEffect = js.native
  def call[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: atReduxDashSagaCoreLib.Anon_ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: stdLib.Parameters[Fn]
  ): CallEffect = js.native
  def call[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: stdLib.Parameters[Fn]
  ): CallEffect = js.native
  @JSName("call")
  def `call_Ctx<intersection>NameString`[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.call with js.Any */, Name /* <: java.lang.String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: stdLib.Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): CallEffect = js.native
  def cancel(): CancelEffect = js.native
  def cancel(task: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Task): CancelEffect = js.native
  def cancel(tasks: js.Array[atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Task]): CancelEffect = js.native
  def cancelled(): CancelledEffect = js.native
  def cps[Fn /* <: js.Function1[/* cb */ CpsCallback[_], _] */](fn: Fn): CpsEffect = js.native
  def cps[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = js.native
  def cps[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): void}
    */ atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.cps with js.Any */, Name /* <: java.lang.String */](
    ctxAndFnName: atReduxDashSagaCoreLib.Anon_ContextFnCtx[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type CpsFunctionParameters<Ctx[Name]> is not an array type */ args: CpsFunctionParameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): CpsEffect = js.native
  def cps[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, scala.Unit] */](
    ctxAndFn: atReduxDashSagaCoreLib.Anon_ContextFnCtx_735312900[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = js.native
  def cps[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, scala.Unit] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = js.native
  @JSName("cps")
  def `cps_Ctx<intersection>NameString`[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): void}
    */ atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.cps with js.Any */, Name /* <: java.lang.String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type CpsFunctionParameters<Ctx[Name]> is not an array type */ args: CpsFunctionParameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): CpsEffect = js.native
  def debounce[T](
    ms: scala.Double,
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    worker: js.Function1[/* item */ T, _]
  ): ForkEffect = js.native
  def debounce[P /* <: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[reduxLib.reduxMod.Action[_]] */](
    ms: scala.Double,
    pattern: P,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[P], 
      _
    ]
  ): ForkEffect = js.native
  def debounce[A /* <: reduxLib.reduxMod.Action[_] */](
    ms: scala.Double,
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[A],
    worker: js.Function1[/* action */ A, _]
  ): ForkEffect = js.native
  def debounce[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: scala.Double,
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  def debounce[P /* <: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[reduxLib.reduxMod.Action[_]] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: scala.Double,
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[P], Fn]
  ): ForkEffect = js.native
  def debounce[A /* <: reduxLib.reduxMod.Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: scala.Double,
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[A],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
  def delay[T](ms: scala.Double): CallEffect = js.native
  def delay[T](ms: scala.Double, `val`: T): CallEffect = js.native
  def flush[T](channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.FlushableChannel[T]): FlushEffect[T] = js.native
  def fork[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: stdLib.Parameters[Fn]
  ): ForkEffect = js.native
  def fork[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.fork with js.Any */, Name /* <: java.lang.String */](
    ctxAndFnName: atReduxDashSagaCoreLib.Anon_Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: stdLib.Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): ForkEffect = js.native
  def fork[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: atReduxDashSagaCoreLib.Anon_ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: stdLib.Parameters[Fn]
  ): ForkEffect = js.native
  def fork[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: stdLib.Parameters[Fn]
  ): ForkEffect = js.native
  @JSName("fork")
  def `fork_Ctx<intersection>NameString`[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.fork with js.Any */, Name /* <: java.lang.String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: stdLib.Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): ForkEffect = js.native
  def getContext(prop: java.lang.String): GetContextEffect = js.native
  def join(task: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Task): JoinEffect = js.native
  def join(tasks: js.Array[atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Task]): JoinEffect = js.native
  def put[A /* <: reduxLib.reduxMod.Action[_] */](action: A): PutEffect[A] = js.native
  def put[T](channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.PuttableChannel[T], action: T): ChannelPutEffect[T] = js.native
  def put[T](
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.PuttableChannel[T],
    action: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.END
  ): ChannelPutEffect[T] = js.native
  def putResolve[A /* <: reduxLib.reduxMod.Action[_] */](action: A): PutEffect[A] = js.native
  def race[T](effects: js.Array[T]): RaceEffect[T] = js.native
  def race[T](effects: org.scalablytyped.runtime.StringDictionary[T]): RaceEffect[T] = js.native
  def retry[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    maxTries: scala.Double,
    delayLength: scala.Double,
    fn: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: stdLib.Parameters[Fn]
  ): CallEffect = js.native
  def select(): SelectEffect = js.native
  def select[Fn /* <: js.Function2[/* state */ js.Any, /* repeated */ js.Any, _] */](
    selector: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Tail<Parameters<Fn>> is not an array type */ args: Tail[stdLib.Parameters[Fn]]
  ): SelectEffect = js.native
  def setContext[C /* <: js.Object */](props: C): SetContextEffect[C] = js.native
  def spawn[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: stdLib.Parameters[Fn]
  ): ForkEffect = js.native
  def spawn[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.spawn with js.Any */, Name /* <: java.lang.String */](
    ctxAndFnName: atReduxDashSagaCoreLib.Anon_Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: stdLib.Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): ForkEffect = js.native
  def spawn[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: atReduxDashSagaCoreLib.Anon_ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: stdLib.Parameters[Fn]
  ): ForkEffect = js.native
  def spawn[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: stdLib.Parameters[Fn]
  ): ForkEffect = js.native
  @JSName("spawn")
  def `spawn_Ctx<intersection>NameString`[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ atReduxDashSagaCoreLib.atReduxDashSagaCoreLibStrings.spawn with js.Any */, Name /* <: java.lang.String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: stdLib.Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): ForkEffect = js.native
  def take(): TakeEffect = js.native
  def take(
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[reduxLib.reduxMod.Action[_]]
  ): TakeEffect = js.native
  def take[T](channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T]): ChannelTakeEffect[T] = js.native
  def take[T](
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    multicastPattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Pattern[T]
  ): ChannelTakeEffect[T] = js.native
  def takeEvery[T](
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    worker: js.Function1[/* item */ T, _]
  ): ForkEffect = js.native
  def takeEvery[P /* <: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[reduxLib.reduxMod.Action[_]] */](
    pattern: P,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[P], 
      _
    ]
  ): ForkEffect = js.native
  def takeEvery[A /* <: reduxLib.reduxMod.Action[_] */](
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[A],
    worker: js.Function1[/* action */ A, _]
  ): ForkEffect = js.native
  def takeEvery[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  def takeEvery[P /* <: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[reduxLib.reduxMod.Action[_]] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[P], Fn]
  ): ForkEffect = js.native
  def takeEvery[A /* <: reduxLib.reduxMod.Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[A],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
  def takeLatest[T](
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    worker: js.Function1[/* item */ T, _]
  ): ForkEffect = js.native
  def takeLatest[P /* <: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[reduxLib.reduxMod.Action[_]] */](
    pattern: P,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[P], 
      _
    ]
  ): ForkEffect = js.native
  def takeLatest[A /* <: reduxLib.reduxMod.Action[_] */](
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[A],
    worker: js.Function1[/* action */ A, _]
  ): ForkEffect = js.native
  def takeLatest[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  def takeLatest[P /* <: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[reduxLib.reduxMod.Action[_]] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[P], Fn]
  ): ForkEffect = js.native
  def takeLatest[A /* <: reduxLib.reduxMod.Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[A],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
  def takeLeading[T](
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    worker: js.Function1[/* item */ T, _]
  ): ForkEffect = js.native
  def takeLeading[P /* <: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[reduxLib.reduxMod.Action[_]] */](
    pattern: P,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[P], 
      _
    ]
  ): ForkEffect = js.native
  def takeLeading[A /* <: reduxLib.reduxMod.Action[_] */](
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[A],
    worker: js.Function1[/* action */ A, _]
  ): ForkEffect = js.native
  def takeLeading[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  def takeLeading[P /* <: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[reduxLib.reduxMod.Action[_]] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[P], Fn]
  ): ForkEffect = js.native
  def takeLeading[A /* <: reduxLib.reduxMod.Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[A],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
  def takeMaybe(): TakeEffect = js.native
  def takeMaybe(
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[reduxLib.reduxMod.Action[_]]
  ): TakeEffect = js.native
  def takeMaybe[T](channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T]): ChannelTakeEffect[T] = js.native
  def takeMaybe[T](
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    multicastPattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Pattern[T]
  ): ChannelTakeEffect[T] = js.native
  @JSName("takeMaybe")
  def takeMaybe_AAction[A /* <: reduxLib.reduxMod.Action[_] */](): TakeEffect = js.native
  @JSName("takeMaybe")
  def takeMaybe_AAction[A /* <: reduxLib.reduxMod.Action[_] */](pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[A]): TakeEffect = js.native
  @JSName("take")
  def take_AAction[A /* <: reduxLib.reduxMod.Action[_] */](): TakeEffect = js.native
  @JSName("take")
  def take_AAction[A /* <: reduxLib.reduxMod.Action[_] */](pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[A]): TakeEffect = js.native
  def throttle[T](
    ms: scala.Double,
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    worker: js.Function1[/* item */ T, _]
  ): ForkEffect = js.native
  def throttle[P /* <: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[reduxLib.reduxMod.Action[_]] */](
    ms: scala.Double,
    pattern: P,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[P], 
      _
    ]
  ): ForkEffect = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */](
    ms: scala.Double,
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[A],
    worker: js.Function1[/* action */ A, _]
  ): ForkEffect = js.native
  def throttle[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: scala.Double,
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  def throttle[P /* <: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[reduxLib.reduxMod.Action[_]] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: scala.Double,
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[P], Fn]
  ): ForkEffect = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: scala.Double,
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[A],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
}

