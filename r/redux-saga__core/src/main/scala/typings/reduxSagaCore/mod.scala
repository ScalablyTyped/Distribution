package typings.reduxSagaCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.node.Buffer
import typings.redux.mod.Action
import typings.reduxSagaCore.anon.Context
import typings.reduxSagaCore.anon.ContextCtx
import typings.reduxSagaCore.anon.ContextFn
import typings.reduxSagaCore.anon.Fn
import typings.reduxSagaCore.effectsMod.ActionChannelEffect
import typings.reduxSagaCore.effectsMod.AllEffect
import typings.reduxSagaCore.effectsMod.CallEffect
import typings.reduxSagaCore.effectsMod.CancelEffect
import typings.reduxSagaCore.effectsMod.CancelledEffect
import typings.reduxSagaCore.effectsMod.ChannelPutEffect
import typings.reduxSagaCore.effectsMod.ChannelTakeEffect
import typings.reduxSagaCore.effectsMod.CpsCallback
import typings.reduxSagaCore.effectsMod.CpsEffect
import typings.reduxSagaCore.effectsMod.CpsFunctionParameters
import typings.reduxSagaCore.effectsMod.FlushEffect
import typings.reduxSagaCore.effectsMod.ForkEffect
import typings.reduxSagaCore.effectsMod.GetContextEffect
import typings.reduxSagaCore.effectsMod.HelperWorkerParameters
import typings.reduxSagaCore.effectsMod.JoinEffect
import typings.reduxSagaCore.effectsMod.PutEffect
import typings.reduxSagaCore.effectsMod.RaceEffect
import typings.reduxSagaCore.effectsMod.SelectEffect
import typings.reduxSagaCore.effectsMod.SetContextEffect
import typings.reduxSagaCore.effectsMod.Tail
import typings.reduxSagaCore.effectsMod.TakeEffect
import typings.reduxSagaCore.reduxSagaCoreStrings.ACTION_CHANNEL
import typings.reduxSagaCore.reduxSagaCoreStrings.ALL
import typings.reduxSagaCore.reduxSagaCoreStrings.CALL
import typings.reduxSagaCore.reduxSagaCoreStrings.CANCEL
import typings.reduxSagaCore.reduxSagaCoreStrings.CANCELLED
import typings.reduxSagaCore.reduxSagaCoreStrings.CPS
import typings.reduxSagaCore.reduxSagaCoreStrings.FLUSH
import typings.reduxSagaCore.reduxSagaCoreStrings.FORK
import typings.reduxSagaCore.reduxSagaCoreStrings.GET_CONTEXT
import typings.reduxSagaCore.reduxSagaCoreStrings.JOIN
import typings.reduxSagaCore.reduxSagaCoreStrings.PUT
import typings.reduxSagaCore.reduxSagaCoreStrings.RACE
import typings.reduxSagaCore.reduxSagaCoreStrings.SELECT
import typings.reduxSagaCore.reduxSagaCoreStrings.SET_CONTEXT
import typings.reduxSagaCore.reduxSagaCoreStrings.TAKE
import typings.reduxSagaCore.reduxSagaCoreStrings.apply
import typings.reduxSagaCore.reduxSagaCoreStrings.call_
import typings.reduxSagaCore.reduxSagaCoreStrings.cps_
import typings.reduxSagaCore.reduxSagaCoreStrings.fork_
import typings.reduxSagaCore.typesMod.FlushableChannel
import typings.reduxSagaCore.typesMod.PuttableChannel
import typings.reduxSagaCore.typesMod.TakeableChannel
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@redux-saga/core/effects/effects", "actionChannel")
  @js.native
  def actionChannel(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
  ): ActionChannelEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "actionChannel")
  @js.native
  def actionChannel(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any,
    buffer: Buffer
  ): ActionChannelEffect = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "all")
  @js.native
  def all[T](effects: js.Array[T]): AllEffect[T] = js.native
  @JSImport("@redux-saga/core/effects/effects", "all")
  @js.native
  def all[T](effects: StringDictionary[T]): AllEffect[T] = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "apply")
  @js.native
  def apply[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](ctx: Ctx, fn: Fn, args: Parameters[Fn]): CallEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "apply")
  @js.native
  def apply_Ctx_IntersectionapplyTopLevelAnyName_String[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ apply with TopLevel[js.Any] */, Name /* <: String */](
    ctx: Ctx,
    fnName: Name,
    args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CallEffect = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "call")
  @js.native
  def call[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "call")
  @js.native
  def call[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ call_ with TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CallEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "call")
  @js.native
  def call[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ call_ with TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CallEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "call")
  @js.native
  def call[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "call")
  @js.native
  def call_CtxFn_ThisFunction1CtxAnyWildcard[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "cancel")
  @js.native
  def cancel(): CancelEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "cancel")
  @js.native
  def cancel(
    task: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ js.Any
  ): CancelEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "cancel")
  @js.native
  def cancel(
    tasks: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ _
    ]
  ): CancelEffect = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "cancelled")
  @js.native
  def cancelled(): CancelledEffect = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "cps")
  @js.native
  def cps[Fn /* <: js.Function1[/* cb */ CpsCallback[_], _] */](fn: Fn): CpsEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "cps")
  @js.native
  def cps[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "cps")
  @js.native
  def cps[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): void}
    */ cps_ with TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: Fn[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Ctx[Name]> is not an array type */ args: CpsFunctionParameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CpsEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "cps")
  @js.native
  def cps[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, Unit] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "cps")
  @js.native
  def cps[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, Unit] */](
    ctxAndFn: ContextCtx[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "cps")
  @js.native
  def cps_Ctx_Intersectioncps_TopLevelAnyName_String[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): void}
    */ cps_ with TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Ctx[Name]> is not an array type */ args: CpsFunctionParameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CpsEffect = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "debounce")
  @js.native
  def debounce[T](ms: Double, channel: TakeableChannel[T], worker: js.Function1[/* item */ T, _]): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "debounce")
  @js.native
  def debounce[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    ms: Double,
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      _
    ]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "debounce")
  @js.native
  def debounce[A /* <: Action[_] */](
    ms: Double,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, _]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "debounce")
  @js.native
  def debounce[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "debounce")
  @js.native
  def debounce[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ _, 
      Fn
    ]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "debounce")
  @js.native
  def debounce[A /* <: Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "delay")
  @js.native
  def delay[T](ms: Double): CallEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "delay")
  @js.native
  def delay[T](ms: Double, `val`: T): CallEffect = js.native
  
  object effectTypes {
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.ACTION_CHANNEL")
    @js.native
    def ACTION_CHANNEL: typings.reduxSagaCore.reduxSagaCoreStrings.ACTION_CHANNEL = js.native
    @scala.inline
    def ACTION_CHANNEL_=(x: ACTION_CHANNEL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTION_CHANNEL")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.ALL")
    @js.native
    def ALL: typings.reduxSagaCore.reduxSagaCoreStrings.ALL = js.native
    @scala.inline
    def ALL_=(x: ALL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.CALL")
    @js.native
    def CALL: typings.reduxSagaCore.reduxSagaCoreStrings.CALL = js.native
    @scala.inline
    def CALL_=(x: CALL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CALL")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.CANCEL")
    @js.native
    def CANCEL: typings.reduxSagaCore.reduxSagaCoreStrings.CANCEL = js.native
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.CANCELLED")
    @js.native
    def CANCELLED: typings.reduxSagaCore.reduxSagaCoreStrings.CANCELLED = js.native
    @scala.inline
    def CANCELLED_=(x: CANCELLED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELLED")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def CANCEL_=(x: CANCEL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCEL")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.CPS")
    @js.native
    def CPS: typings.reduxSagaCore.reduxSagaCoreStrings.CPS = js.native
    @scala.inline
    def CPS_=(x: CPS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CPS")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.FLUSH")
    @js.native
    def FLUSH: typings.reduxSagaCore.reduxSagaCoreStrings.FLUSH = js.native
    @scala.inline
    def FLUSH_=(x: FLUSH): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLUSH")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.FORK")
    @js.native
    def FORK: typings.reduxSagaCore.reduxSagaCoreStrings.FORK = js.native
    @scala.inline
    def FORK_=(x: FORK): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORK")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.GET_CONTEXT")
    @js.native
    def GET_CONTEXT: typings.reduxSagaCore.reduxSagaCoreStrings.GET_CONTEXT = js.native
    @scala.inline
    def GET_CONTEXT_=(x: GET_CONTEXT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GET_CONTEXT")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.JOIN")
    @js.native
    def JOIN: typings.reduxSagaCore.reduxSagaCoreStrings.JOIN = js.native
    @scala.inline
    def JOIN_=(x: JOIN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JOIN")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.PUT")
    @js.native
    def PUT: typings.reduxSagaCore.reduxSagaCoreStrings.PUT = js.native
    @scala.inline
    def PUT_=(x: PUT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PUT")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.RACE")
    @js.native
    def RACE: typings.reduxSagaCore.reduxSagaCoreStrings.RACE = js.native
    @scala.inline
    def RACE_=(x: RACE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RACE")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.SELECT")
    @js.native
    def SELECT: typings.reduxSagaCore.reduxSagaCoreStrings.SELECT = js.native
    @scala.inline
    def SELECT_=(x: SELECT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECT")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.SET_CONTEXT")
    @js.native
    def SET_CONTEXT: typings.reduxSagaCore.reduxSagaCoreStrings.SET_CONTEXT = js.native
    @scala.inline
    def SET_CONTEXT_=(x: SET_CONTEXT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SET_CONTEXT")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.TAKE")
    @js.native
    def TAKE: typings.reduxSagaCore.reduxSagaCoreStrings.TAKE = js.native
    @scala.inline
    def TAKE_=(x: TAKE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAKE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@redux-saga/core/effects/effects", "flush")
  @js.native
  def flush[T](channel: FlushableChannel[T]): FlushEffect[T] = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "fork")
  @js.native
  def fork[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "fork")
  @js.native
  def fork[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ fork_ with TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "fork")
  @js.native
  def fork[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ fork_ with TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "fork")
  @js.native
  def fork[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "fork")
  @js.native
  def fork_CtxFn_ThisFunction1CtxAnyWildcard[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "getContext")
  @js.native
  def getContext(prop: String): GetContextEffect = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "join")
  @js.native
  def join(
    task: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ js.Any
  ): JoinEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "join")
  @js.native
  def join(
    tasks: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ _
    ]
  ): JoinEffect = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "put")
  @js.native
  def put[A /* <: Action[_] */](action: A): PutEffect[A] = js.native
  @JSImport("@redux-saga/core/effects/effects", "put")
  @js.native
  def put[T](channel: PuttableChannel[T], action: T): ChannelPutEffect[T] = js.native
  @JSImport("@redux-saga/core/effects/effects", "put")
  @js.native
  def put[T](
    channel: PuttableChannel[T],
    action: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify END */ js.Any
  ): ChannelPutEffect[T] = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "putResolve")
  @js.native
  def putResolve[A /* <: Action[_] */](action: A): PutEffect[A] = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "race")
  @js.native
  def race[T](effects: js.Array[T]): RaceEffect[T] = js.native
  @JSImport("@redux-saga/core/effects/effects", "race")
  @js.native
  def race[T](effects: StringDictionary[T]): RaceEffect[T] = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "retry")
  @js.native
  def retry[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    maxTries: Double,
    delayLength: Double,
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "select")
  @js.native
  def select(): SelectEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "select")
  @js.native
  def select[Fn /* <: js.Function2[/* state */ js.Any, /* repeated */ js.Any, _] */](
    selector: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Tail<Parameters<Fn>> is not an array type */ args: Tail[Parameters[Fn]]
  ): SelectEffect = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "setContext")
  @js.native
  def setContext[C /* <: js.Object */](props: C): SetContextEffect[C] = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "spawn")
  @js.native
  def spawn[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "spawn")
  @js.native
  def spawn[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ typings.reduxSagaCore.reduxSagaCoreStrings.spawn with TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "spawn")
  @js.native
  def spawn[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ typings.reduxSagaCore.reduxSagaCoreStrings.spawn with TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "spawn")
  @js.native
  def spawn[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "spawn")
  @js.native
  def spawn_CtxFn_ThisFunction1CtxAnyWildcard[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "take")
  @js.native
  def take(): TakeEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "take")
  @js.native
  def take(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
  ): TakeEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "take")
  @js.native
  def take[T](channel: TakeableChannel[T]): ChannelTakeEffect[T] = js.native
  @JSImport("@redux-saga/core/effects/effects", "take")
  @js.native
  def take[T](
    channel: TakeableChannel[T],
    multicastPattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pattern<T> */ js.Any
  ): ChannelTakeEffect[T] = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "takeEvery")
  @js.native
  def takeEvery[T](channel: TakeableChannel[T], worker: js.Function1[/* item */ T, _]): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "takeEvery")
  @js.native
  def takeEvery[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      _
    ]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "takeEvery")
  @js.native
  def takeEvery[A /* <: Action[_] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, _]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "takeEvery")
  @js.native
  def takeEvery[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "takeEvery")
  @js.native
  def takeEvery[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ _, 
      Fn
    ]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "takeEvery")
  @js.native
  def takeEvery[A /* <: Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "takeLatest")
  @js.native
  def takeLatest[T](channel: TakeableChannel[T], worker: js.Function1[/* item */ T, _]): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "takeLatest")
  @js.native
  def takeLatest[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      _
    ]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "takeLatest")
  @js.native
  def takeLatest[A /* <: Action[_] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, _]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "takeLatest")
  @js.native
  def takeLatest[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "takeLatest")
  @js.native
  def takeLatest[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ _, 
      Fn
    ]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "takeLatest")
  @js.native
  def takeLatest[A /* <: Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "takeLeading")
  @js.native
  def takeLeading[T](channel: TakeableChannel[T], worker: js.Function1[/* item */ T, _]): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "takeLeading")
  @js.native
  def takeLeading[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      _
    ]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "takeLeading")
  @js.native
  def takeLeading[A /* <: Action[_] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, _]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "takeLeading")
  @js.native
  def takeLeading[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "takeLeading")
  @js.native
  def takeLeading[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ _, 
      Fn
    ]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "takeLeading")
  @js.native
  def takeLeading[A /* <: Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "takeMaybe")
  @js.native
  def takeMaybe(): TakeEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "takeMaybe")
  @js.native
  def takeMaybe(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
  ): TakeEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "takeMaybe")
  @js.native
  def takeMaybe[T](channel: TakeableChannel[T]): ChannelTakeEffect[T] = js.native
  @JSImport("@redux-saga/core/effects/effects", "takeMaybe")
  @js.native
  def takeMaybe[T](
    channel: TakeableChannel[T],
    multicastPattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pattern<T> */ js.Any
  ): ChannelTakeEffect[T] = js.native
  @JSImport("@redux-saga/core/effects/effects", "takeMaybe")
  @js.native
  def takeMaybe_A_ActionWildcard[A /* <: Action[_] */](): TakeEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "takeMaybe")
  @js.native
  def takeMaybe_A_ActionWildcard[A /* <: Action[_] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any
  ): TakeEffect = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "take")
  @js.native
  def take_A_ActionWildcard[A /* <: Action[_] */](): TakeEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "take")
  @js.native
  def take_A_ActionWildcard[A /* <: Action[_] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any
  ): TakeEffect = js.native
  
  @JSImport("@redux-saga/core/effects/effects", "throttle")
  @js.native
  def throttle[T](ms: Double, channel: TakeableChannel[T], worker: js.Function1[/* item */ T, _]): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "throttle")
  @js.native
  def throttle[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    ms: Double,
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      _
    ]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "throttle")
  @js.native
  def throttle[A /* <: Action[_] */](
    ms: Double,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, _]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "throttle")
  @js.native
  def throttle[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "throttle")
  @js.native
  def throttle[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ _, 
      Fn
    ]
  ): ForkEffect = js.native
  @JSImport("@redux-saga/core/effects/effects", "throttle")
  @js.native
  def throttle[A /* <: Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: Double,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = js.native
}
