package typings.reduxSagaCore

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.redux.mod.Action
import typings.reduxSagaCore.anon.Context
import typings.reduxSagaCore.anon.ContextCtx
import typings.reduxSagaCore.anon.ContextFn
import typings.reduxSagaCore.anon.Fn
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
import typings.reduxSagaCore.reduxSagaCoreStrings.`@@redux-sagaSlashSELF_CANCELLATION`
import typings.reduxSagaCore.typesMod.FlushableChannel
import typings.reduxSagaCore.typesMod.PuttableChannel
import typings.reduxSagaCore.typesMod.TakeableChannel
import typings.std.Parameters
import typings.typescriptTuple.libMod.Reverse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEffectsMod {
  
  @JSImport("@redux-saga/core/types/effects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def actionChannel(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any
  ): ActionChannelEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("actionChannel")(pattern.asInstanceOf[js.Any]).asInstanceOf[ActionChannelEffect]
  inline def actionChannel(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any,
    buffer: Buffer
  ): ActionChannelEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("actionChannel")(pattern.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[ActionChannelEffect]
  
  inline def all[T](effects: js.Array[T]): AllEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(effects.asInstanceOf[js.Any]).asInstanceOf[AllEffect[T]]
  inline def all[T](effects: StringDictionary[T]): AllEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(effects.asInstanceOf[js.Any]).asInstanceOf[AllEffect[T]]
  
  inline def apply[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Any] */](ctx: Ctx, fn: Fn, args: Parameters[Fn]): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(ctx.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  
  inline def apply_CtxName[Ctx /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in Name ]: (this : Ctx, args : ...any): any} */ js.Any */, Name /* <: String */](
    ctx: Ctx,
    fnName: Name,
    args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(ctx.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  
  inline def call[Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  inline def call[Ctx /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in Name ]: (this : Ctx, args : ...any): any} */ js.Any */, Name /* <: String */](
    ctxAndFnName: Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  inline def call[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Any] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  inline def call[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Any] */](
    ctxAndFn: ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  
  inline def call_CtxName[Ctx /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in Name ]: (this : Ctx, args : ...any): any} */ js.Any */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  
  inline def cancel(): CancelEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")().asInstanceOf[CancelEffect]
  inline def cancel(
    task: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ Any
  ): CancelEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(task.asInstanceOf[js.Any]).asInstanceOf[CancelEffect]
  inline def cancel(
    tasks: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ Any
    ]
  ): CancelEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(tasks.asInstanceOf[js.Any]).asInstanceOf[CancelEffect]
  
  inline def cancelled(): CancelledEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelled")().asInstanceOf[CancelledEffect]
  
  inline def cps[Fn /* <: js.Function1[/* cb */ CpsCallback[Any], Any] */](fn: Fn): CpsEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("cps")(fn.asInstanceOf[js.Any]).asInstanceOf[CpsEffect]
  inline def cps[Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("cps")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CpsEffect]
  inline def cps[Ctx /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in Name ]: (this : Ctx, args : ...any): void} */ js.Any */, Name /* <: String */](
    ctxAndFnName: Fn[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Ctx[Name]> is not an array type */ args: CpsFunctionParameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CpsEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("cps")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CpsEffect]
  inline def cps[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Unit] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("cps")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CpsEffect]
  inline def cps[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Unit] */](
    ctxAndFn: ContextCtx[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("cps")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CpsEffect]
  
  inline def cps_CtxName[Ctx /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in Name ]: (this : Ctx, args : ...any): void} */ js.Any */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Ctx[Name]> is not an array type */ args: CpsFunctionParameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CpsEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("cps")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CpsEffect]
  
  inline def debounce[T](ms: Double, channel: TakeableChannel[T], worker: js.Function1[/* item */ T, Any]): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(ms.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def debounce[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any */](
    ms: Double,
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ Any, 
      Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def debounce[T, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    ms: Double,
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(ms.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def debounce[A /* <: Action[Any] */, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    ms: Double,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def debounce_A[A /* <: Action[Any] */](
    ms: Double,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ Any,
    worker: js.Function1[/* action */ A, Any]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def debounce_PFn[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any */, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    ms: Double,
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ Any, 
      Fn
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def delay[T](ms: Double): CallEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(ms.asInstanceOf[js.Any]).asInstanceOf[CallEffect]
  inline def delay[T](ms: Double, `val`: T): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(ms.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  
  object effectTypes {
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.ACTION_CHANNEL")
    @js.native
    def ACTION_CHANNEL: typings.reduxSagaCore.reduxSagaCoreStrings.ACTION_CHANNEL = js.native
    inline def ACTION_CHANNEL_=(x: ACTION_CHANNEL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTION_CHANNEL")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.ALL")
    @js.native
    def ALL: typings.reduxSagaCore.reduxSagaCoreStrings.ALL = js.native
    inline def ALL_=(x: ALL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.CALL")
    @js.native
    def CALL: typings.reduxSagaCore.reduxSagaCoreStrings.CALL = js.native
    inline def CALL_=(x: CALL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CALL")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.CANCEL")
    @js.native
    def CANCEL: typings.reduxSagaCore.reduxSagaCoreStrings.CANCEL = js.native
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.CANCELLED")
    @js.native
    def CANCELLED: typings.reduxSagaCore.reduxSagaCoreStrings.CANCELLED = js.native
    inline def CANCELLED_=(x: CANCELLED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELLED")(x.asInstanceOf[js.Any])
    
    inline def CANCEL_=(x: CANCEL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCEL")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.CPS")
    @js.native
    def CPS: typings.reduxSagaCore.reduxSagaCoreStrings.CPS = js.native
    inline def CPS_=(x: CPS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CPS")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.FLUSH")
    @js.native
    def FLUSH: typings.reduxSagaCore.reduxSagaCoreStrings.FLUSH = js.native
    inline def FLUSH_=(x: FLUSH): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLUSH")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.FORK")
    @js.native
    def FORK: typings.reduxSagaCore.reduxSagaCoreStrings.FORK = js.native
    inline def FORK_=(x: FORK): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORK")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.GET_CONTEXT")
    @js.native
    def GET_CONTEXT: typings.reduxSagaCore.reduxSagaCoreStrings.GET_CONTEXT = js.native
    inline def GET_CONTEXT_=(x: GET_CONTEXT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GET_CONTEXT")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.JOIN")
    @js.native
    def JOIN: typings.reduxSagaCore.reduxSagaCoreStrings.JOIN = js.native
    inline def JOIN_=(x: JOIN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JOIN")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.PUT")
    @js.native
    def PUT: typings.reduxSagaCore.reduxSagaCoreStrings.PUT = js.native
    inline def PUT_=(x: PUT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PUT")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.RACE")
    @js.native
    def RACE: typings.reduxSagaCore.reduxSagaCoreStrings.RACE = js.native
    inline def RACE_=(x: RACE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RACE")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.SELECT")
    @js.native
    def SELECT: typings.reduxSagaCore.reduxSagaCoreStrings.SELECT = js.native
    inline def SELECT_=(x: SELECT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECT")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.SET_CONTEXT")
    @js.native
    def SET_CONTEXT: typings.reduxSagaCore.reduxSagaCoreStrings.SET_CONTEXT = js.native
    inline def SET_CONTEXT_=(x: SET_CONTEXT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SET_CONTEXT")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.TAKE")
    @js.native
    def TAKE: typings.reduxSagaCore.reduxSagaCoreStrings.TAKE = js.native
    inline def TAKE_=(x: TAKE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAKE")(x.asInstanceOf[js.Any])
  }
  
  inline def flush[T](channel: FlushableChannel[T]): FlushEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")(channel.asInstanceOf[js.Any]).asInstanceOf[FlushEffect[T]]
  
  inline def fork[Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def fork[Ctx /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in Name ]: (this : Ctx, args : ...any): any} */ js.Any */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def fork[Ctx /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in Name ]: (this : Ctx, args : ...any): any} */ js.Any */, Name /* <: String */](
    ctxAndFnName: Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def fork[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Any] */](
    ctxAndFn: ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def fork_CtxFn[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Any] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def getContext(prop: String): GetContextEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")(prop.asInstanceOf[js.Any]).asInstanceOf[GetContextEffect]
  
  inline def join(
    task: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ Any
  ): JoinEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(task.asInstanceOf[js.Any]).asInstanceOf[JoinEffect]
  inline def join(
    tasks: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ Any
    ]
  ): JoinEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(tasks.asInstanceOf[js.Any]).asInstanceOf[JoinEffect]
  
  inline def put[A /* <: Action[Any] */](action: A): PutEffect[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(action.asInstanceOf[js.Any]).asInstanceOf[PutEffect[A]]
  inline def put[T](
    channel: PuttableChannel[T],
    action: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify END */ Any) | T
  ): ChannelPutEffect[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(channel.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[ChannelPutEffect[T]]
  
  inline def putResolve[A /* <: Action[Any] */](action: A): PutEffect[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("putResolve")(action.asInstanceOf[js.Any]).asInstanceOf[PutEffect[A]]
  
  inline def race[T](effects: js.Array[T]): RaceEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(effects.asInstanceOf[js.Any]).asInstanceOf[RaceEffect[T]]
  inline def race[T](effects: StringDictionary[T]): RaceEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(effects.asInstanceOf[js.Any]).asInstanceOf[RaceEffect[T]]
  
  inline def retry[Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    maxTries: Double,
    delayLength: Double,
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(maxTries.asInstanceOf[js.Any], delayLength.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  
  inline def select(): SelectEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("select")().asInstanceOf[SelectEffect]
  inline def select[Fn /* <: js.Function2[/* state */ Any, /* repeated */ Any, Any] */](
    selector: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Tail<Parameters<Fn>> is not an array type */ args: Tail[Parameters[Fn]]
  ): SelectEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[SelectEffect]
  
  inline def setContext[C /* <: js.Object */](props: C): SetContextEffect[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(props.asInstanceOf[js.Any]).asInstanceOf[SetContextEffect[C]]
  
  inline def spawn[Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def spawn[Ctx /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in Name ]: (this : Ctx, args : ...any): any} */ js.Any */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def spawn[Ctx /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in Name ]: (this : Ctx, args : ...any): any} */ js.Any */, Name /* <: String */](
    ctxAndFnName: Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def spawn[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Any] */](
    ctxAndFn: ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def spawn_CtxFn[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ Any, Any] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def take(): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("take")().asInstanceOf[TakeEffect]
  inline def take(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any
  ): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(pattern.asInstanceOf[js.Any]).asInstanceOf[TakeEffect]
  inline def take[T](channel: TakeableChannel[T]): ChannelTakeEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(channel.asInstanceOf[js.Any]).asInstanceOf[ChannelTakeEffect[T]]
  inline def take[T](
    channel: TakeableChannel[T],
    multicastPattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pattern<T> */ Any
  ): ChannelTakeEffect[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("take")(channel.asInstanceOf[js.Any], multicastPattern.asInstanceOf[js.Any])).asInstanceOf[ChannelTakeEffect[T]]
  
  inline def takeEvery[T](channel: TakeableChannel[T], worker: js.Function1[/* item */ T, Any]): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeEvery")(channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeEvery[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any */](
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ Any, 
      Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeEvery")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeEvery[T, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeEvery")(channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeEvery[A /* <: Action[Any] */, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeEvery")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def takeEvery_A[A /* <: Action[Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ Any,
    worker: js.Function1[/* action */ A, Any]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeEvery")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def takeEvery_PFn[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any */, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ Any, 
      Fn
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeEvery")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def takeLatest[T](channel: TakeableChannel[T], worker: js.Function1[/* item */ T, Any]): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLatest")(channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeLatest[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any */](
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ Any, 
      Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLatest")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeLatest[T, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLatest")(channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeLatest[A /* <: Action[Any] */, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLatest")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def takeLatest_A[A /* <: Action[Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ Any,
    worker: js.Function1[/* action */ A, Any]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLatest")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def takeLatest_PFn[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any */, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ Any, 
      Fn
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLatest")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def takeLeading[T](channel: TakeableChannel[T], worker: js.Function1[/* item */ T, Any]): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLeading")(channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeLeading[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any */](
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ Any, 
      Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLeading")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeLeading[T, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLeading")(channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeLeading[A /* <: Action[Any] */, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLeading")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def takeLeading_A[A /* <: Action[Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ Any,
    worker: js.Function1[/* action */ A, Any]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLeading")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def takeLeading_PFn[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any */, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ Any, 
      Fn
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLeading")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def takeMaybe(): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("takeMaybe")().asInstanceOf[TakeEffect]
  inline def takeMaybe(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any
  ): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("takeMaybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[TakeEffect]
  inline def takeMaybe[T](channel: TakeableChannel[T]): ChannelTakeEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeMaybe")(channel.asInstanceOf[js.Any]).asInstanceOf[ChannelTakeEffect[T]]
  inline def takeMaybe[T](
    channel: TakeableChannel[T],
    multicastPattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pattern<T> */ Any
  ): ChannelTakeEffect[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeMaybe")(channel.asInstanceOf[js.Any], multicastPattern.asInstanceOf[js.Any])).asInstanceOf[ChannelTakeEffect[T]]
  
  inline def takeMaybe_A[A /* <: Action[Any] */](): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("takeMaybe")().asInstanceOf[TakeEffect]
  inline def takeMaybe_A[A /* <: Action[Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ Any
  ): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("takeMaybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[TakeEffect]
  
  inline def take_A[A /* <: Action[Any] */](): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("take")().asInstanceOf[TakeEffect]
  inline def take_A[A /* <: Action[Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ Any
  ): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(pattern.asInstanceOf[js.Any]).asInstanceOf[TakeEffect]
  
  inline def throttle[T](ms: Double, channel: TakeableChannel[T], worker: js.Function1[/* item */ T, Any]): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(ms.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def throttle[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any */](
    ms: Double,
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ Any, 
      Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def throttle[T, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    ms: Double,
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(ms.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def throttle[A /* <: Action[Any] */, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    ms: Double,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def throttle_A[A /* <: Action[Any] */](
    ms: Double,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ Any,
    worker: js.Function1[/* action */ A, Any]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def throttle_PFn[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any */, Fn /* <: js.Function1[/* repeated */ Any, Any] */](
    ms: Double,
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ Any, 
      Fn
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  type ActionChannelEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'ACTION_CHANNEL', ActionChannelEffectDescriptor> */ Any
  
  trait ActionChannelEffectDescriptor extends StObject {
    
    var buffer: js.UndefOr[Buffer] = js.undefined
    
    var pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any
  }
  object ActionChannelEffectDescriptor {
    
    inline def apply(
      pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any
    ): ActionChannelEffectDescriptor = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionChannelEffectDescriptor]
    }
    
    extension [Self <: ActionChannelEffectDescriptor](x: Self) {
      
      inline def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setPattern(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any
      ): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
  
  type AllButLast[L /* <: js.Array[Any] */] = Reverse[Tail[Reverse[L]]]
  
  type AllEffect[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CombinatorEffect<'ALL', T> */ Any
  
  type AllEffectDescriptor[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CombinatorEffectDescriptor<T> */ Any
  
  type CallEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'CALL', CallEffectDescriptor> */ Any
  
  trait CallEffectDescriptor extends StObject {
    
    var args: js.Array[Any]
    
    var context: Any
    
    var fn: js.Function
  }
  object CallEffectDescriptor {
    
    inline def apply(args: js.Array[Any], context: Any, fn: js.Function): CallEffectDescriptor = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallEffectDescriptor]
    }
    
    extension [Self <: CallEffectDescriptor](x: Self) {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setFn(value: js.Function): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    }
  }
  
  type CancelEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'CANCEL', CancelEffectDescriptor> */ Any
  
  type CancelEffectDescriptor = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ Any) | (js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ Any
  ]) | SELF_CANCELLATION
  
  type CancelledEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'CANCELLED', CancelledEffectDescriptor> */ Any
  
  type CancelledEffectDescriptor = js.Object
  
  type ChannelPutEffect[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'PUT', ChannelPutEffectDescriptor<T>> */ Any
  
  trait ChannelPutEffectDescriptor[T] extends StObject {
    
    var action: T
    
    var channel: PuttableChannel[T]
  }
  object ChannelPutEffectDescriptor {
    
    inline def apply[T](action: T, channel: PuttableChannel[T]): ChannelPutEffectDescriptor[T] = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelPutEffectDescriptor[T]]
    }
    
    extension [Self <: ChannelPutEffectDescriptor[?], T](x: Self & ChannelPutEffectDescriptor[T]) {
      
      inline def setAction(value: T): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setChannel(value: PuttableChannel[T]): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    }
  }
  
  type ChannelTakeEffect[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'TAKE', ChannelTakeEffectDescriptor<T>> */ Any
  
  trait ChannelTakeEffectDescriptor[T] extends StObject {
    
    var channel: TakeableChannel[T]
    
    var maybe: js.UndefOr[Boolean] = js.undefined
    
    var pattern: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pattern<T> */ Any
      ] = js.undefined
  }
  object ChannelTakeEffectDescriptor {
    
    inline def apply[T](channel: TakeableChannel[T]): ChannelTakeEffectDescriptor[T] = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelTakeEffectDescriptor[T]]
    }
    
    extension [Self <: ChannelTakeEffectDescriptor[?], T](x: Self & ChannelTakeEffectDescriptor[T]) {
      
      inline def setChannel(value: TakeableChannel[T]): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setMaybe(value: Boolean): Self = StObject.set(x, "maybe", value.asInstanceOf[js.Any])
      
      inline def setMaybeUndefined: Self = StObject.set(x, "maybe", js.undefined)
      
      inline def setPattern(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pattern<T> */ Any
      ): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    }
  }
  
  @js.native
  trait CpsCallback[R] extends StObject {
    
    def apply(error: Any, result: R): Unit = js.native
    
    var cancel: js.UndefOr[js.Function0[Unit]] = js.native
  }
  
  type CpsEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'CPS', CallEffectDescriptor> */ Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    typescript-tuple.typescript-tuple/lib.Last<std.Parameters<Fn>> extends @redux-saga/core.@redux-saga/core/types/effects.CpsCallback<any> ? @redux-saga/core.@redux-saga/core/types/effects.AllButLast<std.Parameters<Fn>> : never
    }}}
    */
  @js.native
  trait CpsFunctionParameters[Fn /* <: js.Function1[/* repeated */ Any, Any] */] extends StObject
  
  type FlushEffect[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'FLUSH', FlushEffectDescriptor<T>> */ Any
  
  type FlushEffectDescriptor[T] = FlushableChannel[T]
  
  type ForkEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'FORK', ForkEffectDescriptor> */ Any
  
  trait ForkEffectDescriptor
    extends StObject
       with CallEffectDescriptor {
    
    var detached: js.UndefOr[Boolean] = js.undefined
  }
  object ForkEffectDescriptor {
    
    inline def apply(args: js.Array[Any], context: Any, fn: js.Function): ForkEffectDescriptor = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForkEffectDescriptor]
    }
    
    extension [Self <: ForkEffectDescriptor](x: Self) {
      
      inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    }
  }
  
  type GetContextEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'GET_CONTEXT', GetContextEffectDescriptor> */ Any
  
  type GetContextEffectDescriptor = String
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    typescript-tuple.typescript-tuple/lib.Last<std.Parameters<Fn>> extends T ? @redux-saga/core.@redux-saga/core/types/effects.AllButLast<std.Parameters<Fn>> : std.Parameters<Fn>
    }}}
    */
  @js.native
  trait HelperWorkerParameters[T, Fn /* <: js.Function1[/* repeated */ Any, Any] */] extends StObject
  
  type JoinEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'JOIN', JoinEffectDescriptor> */ Any
  
  type JoinEffectDescriptor = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ Any) | (js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ Any
  ])
  
  type PutEffect[A /* <: Action[Any] */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'PUT', PutEffectDescriptor<A>> */ Any
  
  trait PutEffectDescriptor[A /* <: Action[Any] */] extends StObject {
    
    var action: A
    
    var channel: Null
    
    var resolve: js.UndefOr[Boolean] = js.undefined
  }
  object PutEffectDescriptor {
    
    inline def apply[A /* <: Action[Any] */](action: A, channel: Null): PutEffectDescriptor[A] = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutEffectDescriptor[A]]
    }
    
    extension [Self <: PutEffectDescriptor[?], A /* <: Action[Any] */](x: Self & PutEffectDescriptor[A]) {
      
      inline def setAction(value: A): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setChannel(value: Null): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setResolve(value: Boolean): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    }
  }
  
  type RaceEffect[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CombinatorEffect<'RACE', T> */ Any
  
  type RaceEffectDescriptor[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CombinatorEffectDescriptor<T> */ Any
  
  type SELF_CANCELLATION = `@@redux-sagaSlashSELF_CANCELLATION`
  
  type SelectEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'SELECT', SelectEffectDescriptor> */ Any
  
  trait SelectEffectDescriptor extends StObject {
    
    var args: js.Array[Any]
    
    def selector(state: Any, args: Any*): Any
  }
  object SelectEffectDescriptor {
    
    inline def apply(args: js.Array[Any], selector: (Any, /* repeated */ Any) => Any): SelectEffectDescriptor = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], selector = js.Any.fromFunction2(selector))
      __obj.asInstanceOf[SelectEffectDescriptor]
    }
    
    extension [Self <: SelectEffectDescriptor](x: Self) {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setSelector(value: (Any, /* repeated */ Any) => Any): Self = StObject.set(x, "selector", js.Any.fromFunction2(value))
    }
  }
  
  type SetContextEffect[C /* <: js.Object */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'SET_CONTEXT', SetContextEffectDescriptor<C>> */ Any
  
  type SetContextEffectDescriptor[C /* <: js.Object */] = C
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    (l : L): any extends (h : any, t : infer T): any ? T : never
    }}}
    */
  @js.native
  trait Tail[L /* <: js.Array[Any] */] extends StObject
  
  type TakeEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'TAKE', TakeEffectDescriptor> */ Any
  
  trait TakeEffectDescriptor extends StObject {
    
    var maybe: js.UndefOr[Boolean] = js.undefined
    
    var pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any
  }
  object TakeEffectDescriptor {
    
    inline def apply(
      pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any
    ): TakeEffectDescriptor = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[TakeEffectDescriptor]
    }
    
    extension [Self <: TakeEffectDescriptor](x: Self) {
      
      inline def setMaybe(value: Boolean): Self = StObject.set(x, "maybe", value.asInstanceOf[js.Any])
      
      inline def setMaybeUndefined: Self = StObject.set(x, "maybe", js.undefined)
      
      inline def setPattern(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ Any
      ): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
}
