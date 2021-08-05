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
import typings.reduxSagaCore.reduxSagaCoreStrings.call_
import typings.reduxSagaCore.reduxSagaCoreStrings.cps_
import typings.reduxSagaCore.reduxSagaCoreStrings.fork_
import typings.reduxSagaCore.typesMod.FlushableChannel
import typings.reduxSagaCore.typesMod.PuttableChannel
import typings.reduxSagaCore.typesMod.TakeableChannel
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@redux-saga/core/effects/effects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def actionChannel(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
  ): ActionChannelEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("actionChannel")(pattern.asInstanceOf[js.Any]).asInstanceOf[ActionChannelEffect]
  inline def actionChannel(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any,
    buffer: Buffer
  ): ActionChannelEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("actionChannel")(pattern.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[ActionChannelEffect]
  
  inline def all[T](effects: js.Array[T]): AllEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(effects.asInstanceOf[js.Any]).asInstanceOf[AllEffect[T]]
  inline def all[T](effects: StringDictionary[T]): AllEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(effects.asInstanceOf[js.Any]).asInstanceOf[AllEffect[T]]
  
  inline def apply[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ typings.reduxSagaCore.reduxSagaCoreStrings.apply & TopLevel[js.Any] */, Name /* <: String */](
    ctx: Ctx,
    fnName: Name,
    args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(ctx.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  
  inline def apply_CtxFn_ThisFunction1CtxAnyAny[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, js.Any] */](ctx: Ctx, fn: Fn, args: Parameters[Fn]): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(ctx.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  
  inline def call[Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  inline def call[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ call_ & TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  inline def call[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ call_ & TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  inline def call[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, js.Any] */](
    ctxAndFn: ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  
  inline def call_CtxFn_ThisFunction1CtxAnyAny[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, js.Any] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  
  inline def cancel(): CancelEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")().asInstanceOf[CancelEffect]
  inline def cancel(
    task: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ js.Any
  ): CancelEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(task.asInstanceOf[js.Any]).asInstanceOf[CancelEffect]
  inline def cancel(
    tasks: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ js.Any
    ]
  ): CancelEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(tasks.asInstanceOf[js.Any]).asInstanceOf[CancelEffect]
  
  inline def cancelled(): CancelledEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelled")().asInstanceOf[CancelledEffect]
  
  inline def cps[Fn /* <: js.Function1[/* cb */ CpsCallback[js.Any], js.Any] */](fn: Fn): CpsEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("cps")(fn.asInstanceOf[js.Any]).asInstanceOf[CpsEffect]
  inline def cps[Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("cps")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CpsEffect]
  inline def cps[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): void}
    */ cps_ & TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: Fn[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Ctx[Name]> is not an array type */ args: CpsFunctionParameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CpsEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("cps")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CpsEffect]
  inline def cps[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, Unit] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("cps")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CpsEffect]
  inline def cps[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, Unit] */](
    ctxAndFn: ContextCtx[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("cps")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CpsEffect]
  
  inline def cps_Ctx_Intersectioncps_TopLevelAnyName_String[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): void}
    */ cps_ & TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Ctx[Name]> is not an array type */ args: CpsFunctionParameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CpsEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("cps")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CpsEffect]
  
  inline def debounce[T](ms: Double, channel: TakeableChannel[T], worker: js.Function1[/* item */ T, js.Any]): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(ms.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def debounce[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    ms: Double,
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def debounce[A /* <: Action[js.Any] */](
    ms: Double,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, js.Any]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def debounce[T, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    ms: Double,
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(ms.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def debounce[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    ms: Double,
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ js.Any, 
      Fn
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def debounce[A /* <: Action[js.Any] */, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    ms: Double,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def delay[T](ms: Double): CallEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(ms.asInstanceOf[js.Any]).asInstanceOf[CallEffect]
  inline def delay[T](ms: Double, `val`: T): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(ms.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  
  object effectTypes {
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.ACTION_CHANNEL")
    @js.native
    def ACTION_CHANNEL: typings.reduxSagaCore.reduxSagaCoreStrings.ACTION_CHANNEL = js.native
    inline def ACTION_CHANNEL_=(x: ACTION_CHANNEL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTION_CHANNEL")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.ALL")
    @js.native
    def ALL: typings.reduxSagaCore.reduxSagaCoreStrings.ALL = js.native
    inline def ALL_=(x: ALL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.CALL")
    @js.native
    def CALL: typings.reduxSagaCore.reduxSagaCoreStrings.CALL = js.native
    inline def CALL_=(x: CALL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CALL")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.CANCEL")
    @js.native
    def CANCEL: typings.reduxSagaCore.reduxSagaCoreStrings.CANCEL = js.native
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.CANCELLED")
    @js.native
    def CANCELLED: typings.reduxSagaCore.reduxSagaCoreStrings.CANCELLED = js.native
    inline def CANCELLED_=(x: CANCELLED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELLED")(x.asInstanceOf[js.Any])
    
    inline def CANCEL_=(x: CANCEL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCEL")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.CPS")
    @js.native
    def CPS: typings.reduxSagaCore.reduxSagaCoreStrings.CPS = js.native
    inline def CPS_=(x: CPS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CPS")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.FLUSH")
    @js.native
    def FLUSH: typings.reduxSagaCore.reduxSagaCoreStrings.FLUSH = js.native
    inline def FLUSH_=(x: FLUSH): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLUSH")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.FORK")
    @js.native
    def FORK: typings.reduxSagaCore.reduxSagaCoreStrings.FORK = js.native
    inline def FORK_=(x: FORK): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORK")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.GET_CONTEXT")
    @js.native
    def GET_CONTEXT: typings.reduxSagaCore.reduxSagaCoreStrings.GET_CONTEXT = js.native
    inline def GET_CONTEXT_=(x: GET_CONTEXT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GET_CONTEXT")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.JOIN")
    @js.native
    def JOIN: typings.reduxSagaCore.reduxSagaCoreStrings.JOIN = js.native
    inline def JOIN_=(x: JOIN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JOIN")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.PUT")
    @js.native
    def PUT: typings.reduxSagaCore.reduxSagaCoreStrings.PUT = js.native
    inline def PUT_=(x: PUT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PUT")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.RACE")
    @js.native
    def RACE: typings.reduxSagaCore.reduxSagaCoreStrings.RACE = js.native
    inline def RACE_=(x: RACE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RACE")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.SELECT")
    @js.native
    def SELECT: typings.reduxSagaCore.reduxSagaCoreStrings.SELECT = js.native
    inline def SELECT_=(x: SELECT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECT")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.SET_CONTEXT")
    @js.native
    def SET_CONTEXT: typings.reduxSagaCore.reduxSagaCoreStrings.SET_CONTEXT = js.native
    inline def SET_CONTEXT_=(x: SET_CONTEXT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SET_CONTEXT")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/effects/effects", "effectTypes.TAKE")
    @js.native
    def TAKE: typings.reduxSagaCore.reduxSagaCoreStrings.TAKE = js.native
    inline def TAKE_=(x: TAKE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAKE")(x.asInstanceOf[js.Any])
  }
  
  inline def flush[T](channel: FlushableChannel[T]): FlushEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")(channel.asInstanceOf[js.Any]).asInstanceOf[FlushEffect[T]]
  
  inline def fork[Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def fork[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ fork_ & TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def fork[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ fork_ & TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def fork[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, js.Any] */](
    ctxAndFn: ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def fork_CtxFn_ThisFunction1CtxAnyAny[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, js.Any] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def getContext(prop: String): GetContextEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")(prop.asInstanceOf[js.Any]).asInstanceOf[GetContextEffect]
  
  inline def join(
    task: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ js.Any
  ): JoinEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(task.asInstanceOf[js.Any]).asInstanceOf[JoinEffect]
  inline def join(
    tasks: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ js.Any
    ]
  ): JoinEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(tasks.asInstanceOf[js.Any]).asInstanceOf[JoinEffect]
  
  inline def put[A /* <: Action[js.Any] */](action: A): PutEffect[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(action.asInstanceOf[js.Any]).asInstanceOf[PutEffect[A]]
  inline def put[T](channel: PuttableChannel[T], action: T): ChannelPutEffect[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(channel.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[ChannelPutEffect[T]]
  inline def put[T](
    channel: PuttableChannel[T],
    action: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify END */ js.Any
  ): ChannelPutEffect[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(channel.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[ChannelPutEffect[T]]
  
  inline def putResolve[A /* <: Action[js.Any] */](action: A): PutEffect[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("putResolve")(action.asInstanceOf[js.Any]).asInstanceOf[PutEffect[A]]
  
  inline def race[T](effects: js.Array[T]): RaceEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(effects.asInstanceOf[js.Any]).asInstanceOf[RaceEffect[T]]
  inline def race[T](effects: StringDictionary[T]): RaceEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(effects.asInstanceOf[js.Any]).asInstanceOf[RaceEffect[T]]
  
  inline def retry[Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    maxTries: Double,
    delayLength: Double,
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(maxTries.asInstanceOf[js.Any], delayLength.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  
  inline def select(): SelectEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("select")().asInstanceOf[SelectEffect]
  inline def select[Fn /* <: js.Function2[/* state */ js.Any, /* repeated */ js.Any, js.Any] */](
    selector: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Tail<Parameters<Fn>> is not an array type */ args: Tail[Parameters[Fn]]
  ): SelectEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[SelectEffect]
  
  inline def setContext[C /* <: js.Object */](props: C): SetContextEffect[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(props.asInstanceOf[js.Any]).asInstanceOf[SetContextEffect[C]]
  
  inline def spawn[Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def spawn[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ typings.reduxSagaCore.reduxSagaCoreStrings.spawn & TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def spawn[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ typings.reduxSagaCore.reduxSagaCoreStrings.spawn & TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def spawn[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, js.Any] */](
    ctxAndFn: ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def spawn_CtxFn_ThisFunction1CtxAnyAny[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, js.Any] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def take(): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("take")().asInstanceOf[TakeEffect]
  inline def take(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
  ): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(pattern.asInstanceOf[js.Any]).asInstanceOf[TakeEffect]
  inline def take[T](channel: TakeableChannel[T]): ChannelTakeEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(channel.asInstanceOf[js.Any]).asInstanceOf[ChannelTakeEffect[T]]
  inline def take[T](
    channel: TakeableChannel[T],
    multicastPattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pattern<T> */ js.Any
  ): ChannelTakeEffect[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("take")(channel.asInstanceOf[js.Any], multicastPattern.asInstanceOf[js.Any])).asInstanceOf[ChannelTakeEffect[T]]
  
  inline def takeEvery[T](channel: TakeableChannel[T], worker: js.Function1[/* item */ T, js.Any]): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeEvery")(channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeEvery[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeEvery")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeEvery[A /* <: Action[js.Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, js.Any]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeEvery")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeEvery[T, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeEvery")(channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeEvery[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ js.Any, 
      Fn
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeEvery")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeEvery[A /* <: Action[js.Any] */, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeEvery")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def takeLatest[T](channel: TakeableChannel[T], worker: js.Function1[/* item */ T, js.Any]): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLatest")(channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeLatest[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLatest")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeLatest[A /* <: Action[js.Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, js.Any]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLatest")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeLatest[T, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLatest")(channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeLatest[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ js.Any, 
      Fn
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLatest")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeLatest[A /* <: Action[js.Any] */, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLatest")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def takeLeading[T](channel: TakeableChannel[T], worker: js.Function1[/* item */ T, js.Any]): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLeading")(channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeLeading[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLeading")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeLeading[A /* <: Action[js.Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, js.Any]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLeading")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeLeading[T, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLeading")(channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeLeading[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ js.Any, 
      Fn
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLeading")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def takeLeading[A /* <: Action[js.Any] */, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLeading")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  inline def takeMaybe(): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("takeMaybe")().asInstanceOf[TakeEffect]
  inline def takeMaybe(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
  ): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("takeMaybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[TakeEffect]
  inline def takeMaybe[T](channel: TakeableChannel[T]): ChannelTakeEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeMaybe")(channel.asInstanceOf[js.Any]).asInstanceOf[ChannelTakeEffect[T]]
  inline def takeMaybe[T](
    channel: TakeableChannel[T],
    multicastPattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pattern<T> */ js.Any
  ): ChannelTakeEffect[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeMaybe")(channel.asInstanceOf[js.Any], multicastPattern.asInstanceOf[js.Any])).asInstanceOf[ChannelTakeEffect[T]]
  
  inline def takeMaybe_A_ActionAny[A /* <: Action[js.Any] */](): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("takeMaybe")().asInstanceOf[TakeEffect]
  inline def takeMaybe_A_ActionAny[A /* <: Action[js.Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any
  ): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("takeMaybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[TakeEffect]
  
  inline def take_A_ActionAny[A /* <: Action[js.Any] */](): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("take")().asInstanceOf[TakeEffect]
  inline def take_A_ActionAny[A /* <: Action[js.Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any
  ): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(pattern.asInstanceOf[js.Any]).asInstanceOf[TakeEffect]
  
  inline def throttle[T](ms: Double, channel: TakeableChannel[T], worker: js.Function1[/* item */ T, js.Any]): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(ms.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def throttle[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    ms: Double,
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def throttle[A /* <: Action[js.Any] */](
    ms: Double,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, js.Any]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def throttle[T, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    ms: Double,
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(ms.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def throttle[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    ms: Double,
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ js.Any, 
      Fn
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  inline def throttle[A /* <: Action[js.Any] */, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    ms: Double,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
}
