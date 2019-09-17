package typings.atReduxDashSagaCore.typesEffectsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atReduxDashSagaCore.Anon_Context
import typings.atReduxDashSagaCore.Anon_ContextFn
import typings.atReduxDashSagaCore.Anon_ContextFnCtx
import typings.atReduxDashSagaCore.Anon_ContextFnCtx_735312900
import typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.cps
import typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.fork
import typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.spawn
import typings.atReduxDashSagaCore.typesMod.FlushableChannel
import typings.atReduxDashSagaCore.typesMod.PuttableChannel
import typings.atReduxDashSagaCore.typesMod.TakeableChannel
import typings.node.Buffer
import typings.redux.reduxMod.Action
import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@redux-saga/core/types/effects", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def actionChannel(
    pattern: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
  ): ActionChannelEffect = js.native
  def actionChannel(
    pattern: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern */ js.Any,
    buffer: Buffer
  ): ActionChannelEffect = js.native
  def all[T](effects: js.Array[T]): AllEffect[T] = js.native
  def all[T](effects: StringDictionary[T]): AllEffect[T] = js.native
  @JSName("apply")
  def apply[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.apply with js.Any */, Name /* <: String */](
    ctx: Ctx,
    fnName: Name,
    args: Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): CallEffect = js.native
  @JSName("apply")
  def apply_CtxFn_ThisFunction1CtxAnyWildcard[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](ctx: Ctx, fn: Fn, args: Parameters[Fn]): CallEffect = js.native
  def call[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = js.native
  def call[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.call with js.Any */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): CallEffect = js.native
  def call[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.call with js.Any */, Name /* <: String */](
    ctxAndFnName: Anon_Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): CallEffect = js.native
  def call[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: Anon_ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = js.native
  @JSName("call")
  def call_CtxFn_ThisFunction1CtxAnyWildcard[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = js.native
  def cancel(): CancelEffect = js.native
  def cancel(task: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Task */ js.Any): CancelEffect = js.native
  def cancel(
    tasks: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Task */ _
    ]
  ): CancelEffect = js.native
  def cancelled(): CancelledEffect = js.native
  def cps[Fn /* <: js.Function1[/* cb */ CpsCallback[_], _] */](fn: Fn): CpsEffect = js.native
  def cps[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = js.native
  def cps[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): void}
    */ typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.cps with js.Any */, Name /* <: String */](
    ctxAndFnName: Anon_ContextFnCtx[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type CpsFunctionParameters<Ctx[Name]> is not an array type */ args: CpsFunctionParameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): CpsEffect = js.native
  def cps[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, Unit] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = js.native
  def cps[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, Unit] */](
    ctxAndFn: Anon_ContextFnCtx_735312900[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = js.native
  @JSName("cps")
  def cps_Ctx_IntersectioncpsAnyName_String[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): void}
    */ cps with js.Any */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type CpsFunctionParameters<Ctx[Name]> is not an array type */ args: CpsFunctionParameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): CpsEffect = js.native
  def debounce[T](ms: Double, channel: TakeableChannel[T], worker: js.Function1[/* item */ T, _]): ForkEffect = js.native
  def debounce[P /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    ms: Double,
    pattern: P,
    worker: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      _
    ]
  ): ForkEffect = js.native
  def debounce[A /* <: Action[_] */](
    ms: Double,
    pattern: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, _]
  ): ForkEffect = js.native
  def debounce[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  def debounce[P /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ _, 
      Fn
    ]
  ): ForkEffect = js.native
  def debounce[A /* <: Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
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
  def join(task: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Task */ js.Any): JoinEffect = js.native
  def join(
    tasks: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Task */ _
    ]
  ): JoinEffect = js.native
  def put[A /* <: Action[_] */](action: A): PutEffect[A] = js.native
  def put[T](channel: PuttableChannel[T], action: T): ChannelPutEffect[T] = js.native
  def put[T](
    channel: PuttableChannel[T],
    action: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify END */ js.Any
  ): ChannelPutEffect[T] = js.native
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
  def take(
    pattern: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
  ): TakeEffect = js.native
  def take[T](channel: TakeableChannel[T]): ChannelTakeEffect[T] = js.native
  def take[T](
    channel: TakeableChannel[T],
    multicastPattern: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Pattern<T> */ js.Any
  ): ChannelTakeEffect[T] = js.native
  def takeEvery[T](channel: TakeableChannel[T], worker: js.Function1[/* item */ T, _]): ForkEffect = js.native
  def takeEvery[P /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    pattern: P,
    worker: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      _
    ]
  ): ForkEffect = js.native
  def takeEvery[A /* <: Action[_] */](
    pattern: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, _]
  ): ForkEffect = js.native
  def takeEvery[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  def takeEvery[P /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ _, 
      Fn
    ]
  ): ForkEffect = js.native
  def takeEvery[A /* <: Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
  def takeLatest[T](channel: TakeableChannel[T], worker: js.Function1[/* item */ T, _]): ForkEffect = js.native
  def takeLatest[P /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    pattern: P,
    worker: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      _
    ]
  ): ForkEffect = js.native
  def takeLatest[A /* <: Action[_] */](
    pattern: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, _]
  ): ForkEffect = js.native
  def takeLatest[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  def takeLatest[P /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ _, 
      Fn
    ]
  ): ForkEffect = js.native
  def takeLatest[A /* <: Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
  def takeLeading[T](channel: TakeableChannel[T], worker: js.Function1[/* item */ T, _]): ForkEffect = js.native
  def takeLeading[P /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    pattern: P,
    worker: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      _
    ]
  ): ForkEffect = js.native
  def takeLeading[A /* <: Action[_] */](
    pattern: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, _]
  ): ForkEffect = js.native
  def takeLeading[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  def takeLeading[P /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ _, 
      Fn
    ]
  ): ForkEffect = js.native
  def takeLeading[A /* <: Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
  def takeMaybe(): TakeEffect = js.native
  def takeMaybe(
    pattern: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
  ): TakeEffect = js.native
  def takeMaybe[T](channel: TakeableChannel[T]): ChannelTakeEffect[T] = js.native
  def takeMaybe[T](
    channel: TakeableChannel[T],
    multicastPattern: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Pattern<T> */ js.Any
  ): ChannelTakeEffect[T] = js.native
  @JSName("takeMaybe")
  def takeMaybe_A_ActionWildcard[A /* <: Action[_] */](): TakeEffect = js.native
  @JSName("takeMaybe")
  def takeMaybe_A_ActionWildcard[A /* <: Action[_] */](
    pattern: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any
  ): TakeEffect = js.native
  @JSName("take")
  def take_A_ActionWildcard[A /* <: Action[_] */](): TakeEffect = js.native
  @JSName("take")
  def take_A_ActionWildcard[A /* <: Action[_] */](
    pattern: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any
  ): TakeEffect = js.native
  def throttle[T](ms: Double, channel: TakeableChannel[T], worker: js.Function1[/* item */ T, _]): ForkEffect = js.native
  def throttle[P /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    ms: Double,
    pattern: P,
    worker: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      _
    ]
  ): ForkEffect = js.native
  def throttle[A /* <: Action[_] */](
    ms: Double,
    pattern: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, _]
  ): ForkEffect = js.native
  def throttle[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  def throttle[P /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ _, 
      Fn
    ]
  ): ForkEffect = js.native
  def throttle[A /* <: Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
}

