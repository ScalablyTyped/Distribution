package typings.reduxSagaCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.node.Buffer
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
import typings.reduxSagaCore.reduxSagaCoreStrings.call_
import typings.reduxSagaCore.reduxSagaCoreStrings.cps_
import typings.reduxSagaCore.reduxSagaCoreStrings.fork_
import typings.reduxSagaCore.typesMod.FlushableChannel
import typings.reduxSagaCore.typesMod.PuttableChannel
import typings.reduxSagaCore.typesMod.TakeableChannel
import typings.std.Parameters
import typings.typescriptTuple.libMod.Reverse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object effectsMod {
  
  @JSImport("@redux-saga/core/types/effects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def actionChannel(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
  ): ActionChannelEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("actionChannel")(pattern.asInstanceOf[js.Any]).asInstanceOf[ActionChannelEffect]
  @scala.inline
  def actionChannel(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any,
    buffer: Buffer
  ): ActionChannelEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("actionChannel")(pattern.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[ActionChannelEffect]
  
  @scala.inline
  def all[T](effects: js.Array[T]): AllEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(effects.asInstanceOf[js.Any]).asInstanceOf[AllEffect[T]]
  @scala.inline
  def all[T](effects: StringDictionary[T]): AllEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(effects.asInstanceOf[js.Any]).asInstanceOf[AllEffect[T]]
  
  @scala.inline
  def apply[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ typings.reduxSagaCore.reduxSagaCoreStrings.apply & TopLevel[js.Any] */, Name /* <: String */](
    ctx: Ctx,
    fnName: Name,
    args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(ctx.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  
  @scala.inline
  def apply_CtxFn_ThisFunction1CtxAnyAny[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, js.Any] */](ctx: Ctx, fn: Fn, args: Parameters[Fn]): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(ctx.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  
  @scala.inline
  def call[Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  @scala.inline
  def call[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ call_ & TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  @scala.inline
  def call[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ call_ & TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  @scala.inline
  def call[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, js.Any] */](
    ctxAndFn: ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  
  @scala.inline
  def call_CtxFn_ThisFunction1CtxAnyAny[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, js.Any] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  
  @scala.inline
  def cancel(): CancelEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")().asInstanceOf[CancelEffect]
  @scala.inline
  def cancel(
    task: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ js.Any
  ): CancelEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(task.asInstanceOf[js.Any]).asInstanceOf[CancelEffect]
  @scala.inline
  def cancel(
    tasks: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ js.Any
    ]
  ): CancelEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(tasks.asInstanceOf[js.Any]).asInstanceOf[CancelEffect]
  
  @scala.inline
  def cancelled(): CancelledEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelled")().asInstanceOf[CancelledEffect]
  
  @scala.inline
  def cps[Fn /* <: js.Function1[/* cb */ CpsCallback[js.Any], js.Any] */](fn: Fn): CpsEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("cps")(fn.asInstanceOf[js.Any]).asInstanceOf[CpsEffect]
  @scala.inline
  def cps[Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("cps")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CpsEffect]
  @scala.inline
  def cps[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): void}
    */ cps_ & TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: Fn[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Ctx[Name]> is not an array type */ args: CpsFunctionParameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CpsEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("cps")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CpsEffect]
  @scala.inline
  def cps[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, Unit] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("cps")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CpsEffect]
  @scala.inline
  def cps[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, Unit] */](
    ctxAndFn: ContextCtx[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("cps")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CpsEffect]
  
  @scala.inline
  def cps_Ctx_Intersectioncps_TopLevelAnyName_String[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): void}
    */ cps_ & TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Ctx[Name]> is not an array type */ args: CpsFunctionParameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CpsEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("cps")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CpsEffect]
  
  @scala.inline
  def debounce[T](ms: Double, channel: TakeableChannel[T], worker: js.Function1[/* item */ T, js.Any]): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(ms.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def debounce[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    ms: Double,
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def debounce[A /* <: Action[js.Any] */](
    ms: Double,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, js.Any]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def debounce[T, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    ms: Double,
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(ms.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def debounce[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    ms: Double,
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ js.Any, 
      Fn
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def debounce[A /* <: Action[js.Any] */, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    ms: Double,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  @scala.inline
  def delay[T](ms: Double): CallEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(ms.asInstanceOf[js.Any]).asInstanceOf[CallEffect]
  @scala.inline
  def delay[T](ms: Double, `val`: T): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(ms.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  
  object effectTypes {
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.ACTION_CHANNEL")
    @js.native
    def ACTION_CHANNEL: typings.reduxSagaCore.reduxSagaCoreStrings.ACTION_CHANNEL = js.native
    @scala.inline
    def ACTION_CHANNEL_=(x: ACTION_CHANNEL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTION_CHANNEL")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.ALL")
    @js.native
    def ALL: typings.reduxSagaCore.reduxSagaCoreStrings.ALL = js.native
    @scala.inline
    def ALL_=(x: ALL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.CALL")
    @js.native
    def CALL: typings.reduxSagaCore.reduxSagaCoreStrings.CALL = js.native
    @scala.inline
    def CALL_=(x: CALL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CALL")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.CANCEL")
    @js.native
    def CANCEL: typings.reduxSagaCore.reduxSagaCoreStrings.CANCEL = js.native
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.CANCELLED")
    @js.native
    def CANCELLED: typings.reduxSagaCore.reduxSagaCoreStrings.CANCELLED = js.native
    @scala.inline
    def CANCELLED_=(x: CANCELLED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELLED")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def CANCEL_=(x: CANCEL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCEL")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.CPS")
    @js.native
    def CPS: typings.reduxSagaCore.reduxSagaCoreStrings.CPS = js.native
    @scala.inline
    def CPS_=(x: CPS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CPS")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.FLUSH")
    @js.native
    def FLUSH: typings.reduxSagaCore.reduxSagaCoreStrings.FLUSH = js.native
    @scala.inline
    def FLUSH_=(x: FLUSH): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLUSH")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.FORK")
    @js.native
    def FORK: typings.reduxSagaCore.reduxSagaCoreStrings.FORK = js.native
    @scala.inline
    def FORK_=(x: FORK): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORK")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.GET_CONTEXT")
    @js.native
    def GET_CONTEXT: typings.reduxSagaCore.reduxSagaCoreStrings.GET_CONTEXT = js.native
    @scala.inline
    def GET_CONTEXT_=(x: GET_CONTEXT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GET_CONTEXT")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.JOIN")
    @js.native
    def JOIN: typings.reduxSagaCore.reduxSagaCoreStrings.JOIN = js.native
    @scala.inline
    def JOIN_=(x: JOIN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JOIN")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.PUT")
    @js.native
    def PUT: typings.reduxSagaCore.reduxSagaCoreStrings.PUT = js.native
    @scala.inline
    def PUT_=(x: PUT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PUT")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.RACE")
    @js.native
    def RACE: typings.reduxSagaCore.reduxSagaCoreStrings.RACE = js.native
    @scala.inline
    def RACE_=(x: RACE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RACE")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.SELECT")
    @js.native
    def SELECT: typings.reduxSagaCore.reduxSagaCoreStrings.SELECT = js.native
    @scala.inline
    def SELECT_=(x: SELECT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECT")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.SET_CONTEXT")
    @js.native
    def SET_CONTEXT: typings.reduxSagaCore.reduxSagaCoreStrings.SET_CONTEXT = js.native
    @scala.inline
    def SET_CONTEXT_=(x: SET_CONTEXT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SET_CONTEXT")(x.asInstanceOf[js.Any])
    
    @JSImport("@redux-saga/core/types/effects", "effectTypes.TAKE")
    @js.native
    def TAKE: typings.reduxSagaCore.reduxSagaCoreStrings.TAKE = js.native
    @scala.inline
    def TAKE_=(x: TAKE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAKE")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def flush[T](channel: FlushableChannel[T]): FlushEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")(channel.asInstanceOf[js.Any]).asInstanceOf[FlushEffect[T]]
  
  @scala.inline
  def fork[Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def fork[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ fork_ & TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def fork[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ fork_ & TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def fork[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, js.Any] */](
    ctxAndFn: ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  @scala.inline
  def fork_CtxFn_ThisFunction1CtxAnyAny[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, js.Any] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  @scala.inline
  def getContext(prop: String): GetContextEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")(prop.asInstanceOf[js.Any]).asInstanceOf[GetContextEffect]
  
  @scala.inline
  def join(
    task: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ js.Any
  ): JoinEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(task.asInstanceOf[js.Any]).asInstanceOf[JoinEffect]
  @scala.inline
  def join(
    tasks: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ js.Any
    ]
  ): JoinEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(tasks.asInstanceOf[js.Any]).asInstanceOf[JoinEffect]
  
  @scala.inline
  def put[A /* <: Action[js.Any] */](action: A): PutEffect[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(action.asInstanceOf[js.Any]).asInstanceOf[PutEffect[A]]
  @scala.inline
  def put[T](channel: PuttableChannel[T], action: T): ChannelPutEffect[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(channel.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[ChannelPutEffect[T]]
  @scala.inline
  def put[T](
    channel: PuttableChannel[T],
    action: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify END */ js.Any
  ): ChannelPutEffect[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(channel.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[ChannelPutEffect[T]]
  
  @scala.inline
  def putResolve[A /* <: Action[js.Any] */](action: A): PutEffect[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("putResolve")(action.asInstanceOf[js.Any]).asInstanceOf[PutEffect[A]]
  
  @scala.inline
  def race[T](effects: js.Array[T]): RaceEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(effects.asInstanceOf[js.Any]).asInstanceOf[RaceEffect[T]]
  @scala.inline
  def race[T](effects: StringDictionary[T]): RaceEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(effects.asInstanceOf[js.Any]).asInstanceOf[RaceEffect[T]]
  
  @scala.inline
  def retry[Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    maxTries: Double,
    delayLength: Double,
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(maxTries.asInstanceOf[js.Any], delayLength.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallEffect]
  
  @scala.inline
  def select(): SelectEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("select")().asInstanceOf[SelectEffect]
  @scala.inline
  def select[Fn /* <: js.Function2[/* state */ js.Any, /* repeated */ js.Any, js.Any] */](
    selector: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Tail<Parameters<Fn>> is not an array type */ args: Tail[Parameters[Fn]]
  ): SelectEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[SelectEffect]
  
  @scala.inline
  def setContext[C /* <: js.Object */](props: C): SetContextEffect[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(props.asInstanceOf[js.Any]).asInstanceOf[SetContextEffect[C]]
  
  @scala.inline
  def spawn[Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def spawn[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ typings.reduxSagaCore.reduxSagaCoreStrings.spawn & TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def spawn[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ typings.reduxSagaCore.reduxSagaCoreStrings.spawn & TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(ctxAndFnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def spawn[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, js.Any] */](
    ctxAndFn: ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  @scala.inline
  def spawn_CtxFn_ThisFunction1CtxAnyAny[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, js.Any] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(ctxAndFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  @scala.inline
  def take(): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("take")().asInstanceOf[TakeEffect]
  @scala.inline
  def take(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
  ): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(pattern.asInstanceOf[js.Any]).asInstanceOf[TakeEffect]
  @scala.inline
  def take[T](channel: TakeableChannel[T]): ChannelTakeEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(channel.asInstanceOf[js.Any]).asInstanceOf[ChannelTakeEffect[T]]
  @scala.inline
  def take[T](
    channel: TakeableChannel[T],
    multicastPattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pattern<T> */ js.Any
  ): ChannelTakeEffect[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("take")(channel.asInstanceOf[js.Any], multicastPattern.asInstanceOf[js.Any])).asInstanceOf[ChannelTakeEffect[T]]
  
  @scala.inline
  def takeEvery[T](channel: TakeableChannel[T], worker: js.Function1[/* item */ T, js.Any]): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeEvery")(channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def takeEvery[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeEvery")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def takeEvery[A /* <: Action[js.Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, js.Any]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeEvery")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def takeEvery[T, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeEvery")(channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def takeEvery[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ js.Any, 
      Fn
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeEvery")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def takeEvery[A /* <: Action[js.Any] */, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeEvery")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  @scala.inline
  def takeLatest[T](channel: TakeableChannel[T], worker: js.Function1[/* item */ T, js.Any]): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLatest")(channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def takeLatest[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLatest")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def takeLatest[A /* <: Action[js.Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, js.Any]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLatest")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def takeLatest[T, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLatest")(channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def takeLatest[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ js.Any, 
      Fn
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLatest")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def takeLatest[A /* <: Action[js.Any] */, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLatest")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  @scala.inline
  def takeLeading[T](channel: TakeableChannel[T], worker: js.Function1[/* item */ T, js.Any]): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLeading")(channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def takeLeading[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLeading")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def takeLeading[A /* <: Action[js.Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, js.Any]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLeading")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def takeLeading[T, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLeading")(channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def takeLeading[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ js.Any, 
      Fn
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLeading")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def takeLeading[A /* <: Action[js.Any] */, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("takeLeading")(pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  @scala.inline
  def takeMaybe(): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("takeMaybe")().asInstanceOf[TakeEffect]
  @scala.inline
  def takeMaybe(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
  ): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("takeMaybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[TakeEffect]
  @scala.inline
  def takeMaybe[T](channel: TakeableChannel[T]): ChannelTakeEffect[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeMaybe")(channel.asInstanceOf[js.Any]).asInstanceOf[ChannelTakeEffect[T]]
  @scala.inline
  def takeMaybe[T](
    channel: TakeableChannel[T],
    multicastPattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pattern<T> */ js.Any
  ): ChannelTakeEffect[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeMaybe")(channel.asInstanceOf[js.Any], multicastPattern.asInstanceOf[js.Any])).asInstanceOf[ChannelTakeEffect[T]]
  
  @scala.inline
  def takeMaybe_A_ActionAny[A /* <: Action[js.Any] */](): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("takeMaybe")().asInstanceOf[TakeEffect]
  @scala.inline
  def takeMaybe_A_ActionAny[A /* <: Action[js.Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any
  ): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("takeMaybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[TakeEffect]
  
  @scala.inline
  def take_A_ActionAny[A /* <: Action[js.Any] */](): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("take")().asInstanceOf[TakeEffect]
  @scala.inline
  def take_A_ActionAny[A /* <: Action[js.Any] */](
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any
  ): TakeEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(pattern.asInstanceOf[js.Any]).asInstanceOf[TakeEffect]
  
  @scala.inline
  def throttle[T](ms: Double, channel: TakeableChannel[T], worker: js.Function1[/* item */ T, js.Any]): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(ms.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def throttle[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */](
    ms: Double,
    pattern: P,
    worker: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ /* action */ js.Any, 
      js.Any
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def throttle[A /* <: Action[js.Any] */](
    ms: Double,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: js.Function1[/* action */ A, js.Any]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def throttle[T, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    ms: Double,
    channel: TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: HelperWorkerParameters[T, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(ms.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def throttle[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any */, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    ms: Double,
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: HelperWorkerParameters[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionMatchingPattern<P> */ js.Any, 
      Fn
    ]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  @scala.inline
  def throttle[A /* <: Action[js.Any] */, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */](
    ms: Double,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern<A> */ js.Any,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: HelperWorkerParameters[A, Fn]
  ): ForkEffect = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(ms.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], worker.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ForkEffect]
  
  type ActionChannelEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'ACTION_CHANNEL', ActionChannelEffectDescriptor> */ js.Any
  
  trait ActionChannelEffectDescriptor extends StObject {
    
    var buffer: js.UndefOr[Buffer] = js.undefined
    
    var pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
  }
  object ActionChannelEffectDescriptor {
    
    @scala.inline
    def apply(
      pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
    ): ActionChannelEffectDescriptor = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionChannelEffectDescriptor]
    }
    
    @scala.inline
    implicit class ActionChannelEffectDescriptorMutableBuilder[Self <: ActionChannelEffectDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setPattern(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
      ): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
  
  type AllButLast[L /* <: js.Array[js.Any] */] = Reverse[Tail[Reverse[L]]]
  
  type AllEffect[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CombinatorEffect<'ALL', T> */ js.Any
  
  type AllEffectDescriptor[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CombinatorEffectDescriptor<T> */ js.Any
  
  type CallEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'CALL', CallEffectDescriptor> */ js.Any
  
  trait CallEffectDescriptor extends StObject {
    
    var args: js.Array[js.Any]
    
    var context: js.Any
    
    var fn: js.Function
  }
  object CallEffectDescriptor {
    
    @scala.inline
    def apply(args: js.Array[js.Any], context: js.Any, fn: js.Function): CallEffectDescriptor = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallEffectDescriptor]
    }
    
    @scala.inline
    implicit class CallEffectDescriptorMutableBuilder[Self <: CallEffectDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFn(value: js.Function): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    }
  }
  
  type CancelEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'CANCEL', CancelEffectDescriptor> */ js.Any
  
  type CancelEffectDescriptor = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ js.Any) | (js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ js.Any
  ]) | SELF_CANCELLATION
  
  type CancelledEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'CANCELLED', CancelledEffectDescriptor> */ js.Any
  
  type CancelledEffectDescriptor = js.Object
  
  type ChannelPutEffect[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'PUT', ChannelPutEffectDescriptor<T>> */ js.Any
  
  trait ChannelPutEffectDescriptor[T] extends StObject {
    
    var action: T
    
    var channel: PuttableChannel[T]
  }
  object ChannelPutEffectDescriptor {
    
    @scala.inline
    def apply[T](action: T, channel: PuttableChannel[T]): ChannelPutEffectDescriptor[T] = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelPutEffectDescriptor[T]]
    }
    
    @scala.inline
    implicit class ChannelPutEffectDescriptorMutableBuilder[Self <: ChannelPutEffectDescriptor[?], T] (val x: Self & ChannelPutEffectDescriptor[T]) extends AnyVal {
      
      @scala.inline
      def setAction(value: T): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannel(value: PuttableChannel[T]): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    }
  }
  
  type ChannelTakeEffect[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'TAKE', ChannelTakeEffectDescriptor<T>> */ js.Any
  
  trait ChannelTakeEffectDescriptor[T] extends StObject {
    
    var channel: TakeableChannel[T]
    
    var maybe: js.UndefOr[Boolean] = js.undefined
    
    var pattern: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pattern<T> */ js.Any
      ] = js.undefined
  }
  object ChannelTakeEffectDescriptor {
    
    @scala.inline
    def apply[T](channel: TakeableChannel[T]): ChannelTakeEffectDescriptor[T] = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelTakeEffectDescriptor[T]]
    }
    
    @scala.inline
    implicit class ChannelTakeEffectDescriptorMutableBuilder[Self <: ChannelTakeEffectDescriptor[?], T] (val x: Self & ChannelTakeEffectDescriptor[T]) extends AnyVal {
      
      @scala.inline
      def setChannel(value: TakeableChannel[T]): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaybe(value: Boolean): Self = StObject.set(x, "maybe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaybeUndefined: Self = StObject.set(x, "maybe", js.undefined)
      
      @scala.inline
      def setPattern(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pattern<T> */ js.Any
      ): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    }
  }
  
  @js.native
  trait CpsCallback[R] extends StObject {
    
    def apply(error: js.Any, result: R): Unit = js.native
    
    var cancel: js.UndefOr[js.Function0[Unit]] = js.native
  }
  
  type CpsEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'CPS', CallEffectDescriptor> */ js.Any
  
  type CpsFunctionParameters[Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */] = AllButLast[Parameters[Fn]]
  
  type FlushEffect[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'FLUSH', FlushEffectDescriptor<T>> */ js.Any
  
  type FlushEffectDescriptor[T] = FlushableChannel[T]
  
  type ForkEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'FORK', ForkEffectDescriptor> */ js.Any
  
  trait ForkEffectDescriptor
    extends StObject
       with CallEffectDescriptor {
    
    var detached: js.UndefOr[Boolean] = js.undefined
  }
  object ForkEffectDescriptor {
    
    @scala.inline
    def apply(args: js.Array[js.Any], context: js.Any, fn: js.Function): ForkEffectDescriptor = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForkEffectDescriptor]
    }
    
    @scala.inline
    implicit class ForkEffectDescriptorMutableBuilder[Self <: ForkEffectDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    }
  }
  
  type GetContextEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'GET_CONTEXT', GetContextEffectDescriptor> */ js.Any
  
  type GetContextEffectDescriptor = String
  
  type HelperWorkerParameters[T, Fn /* <: js.Function1[/* repeated */ js.Any, js.Any] */] = Parameters[Fn] | AllButLast[Parameters[Fn]]
  
  type JoinEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'JOIN', JoinEffectDescriptor> */ js.Any
  
  type JoinEffectDescriptor = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ js.Any) | (js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task */ js.Any
  ])
  
  type PutEffect[A /* <: Action[js.Any] */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'PUT', PutEffectDescriptor<A>> */ js.Any
  
  trait PutEffectDescriptor[A /* <: Action[js.Any] */] extends StObject {
    
    var action: A
    
    var channel: Null
    
    var resolve: js.UndefOr[Boolean] = js.undefined
  }
  object PutEffectDescriptor {
    
    @scala.inline
    def apply[A /* <: Action[js.Any] */](action: A, channel: Null): PutEffectDescriptor[A] = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutEffectDescriptor[A]]
    }
    
    @scala.inline
    implicit class PutEffectDescriptorMutableBuilder[Self <: PutEffectDescriptor[?], A /* <: Action[js.Any] */] (val x: Self & PutEffectDescriptor[A]) extends AnyVal {
      
      @scala.inline
      def setAction(value: A): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannel(value: Null): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolve(value: Boolean): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    }
  }
  
  type RaceEffect[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CombinatorEffect<'RACE', T> */ js.Any
  
  type RaceEffectDescriptor[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CombinatorEffectDescriptor<T> */ js.Any
  
  type SELF_CANCELLATION = `@@redux-sagaSlashSELF_CANCELLATION`
  
  type SelectEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'SELECT', SelectEffectDescriptor> */ js.Any
  
  trait SelectEffectDescriptor extends StObject {
    
    var args: js.Array[js.Any]
    
    def selector(state: js.Any, args: js.Any*): js.Any
  }
  object SelectEffectDescriptor {
    
    @scala.inline
    def apply(args: js.Array[js.Any], selector: (js.Any, /* repeated */ js.Any) => js.Any): SelectEffectDescriptor = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], selector = js.Any.fromFunction2(selector))
      __obj.asInstanceOf[SelectEffectDescriptor]
    }
    
    @scala.inline
    implicit class SelectEffectDescriptorMutableBuilder[Self <: SelectEffectDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setSelector(value: (js.Any, /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "selector", js.Any.fromFunction2(value))
    }
  }
  
  type SetContextEffect[C /* <: js.Object */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'SET_CONTEXT', SetContextEffectDescriptor<C>> */ js.Any
  
  type SetContextEffectDescriptor[C /* <: js.Object */] = C
  
  type Tail[L /* <: js.Array[js.Any] */] = js.Any
  
  type TakeEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'TAKE', TakeEffectDescriptor> */ js.Any
  
  trait TakeEffectDescriptor extends StObject {
    
    var maybe: js.UndefOr[Boolean] = js.undefined
    
    var pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
  }
  object TakeEffectDescriptor {
    
    @scala.inline
    def apply(
      pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
    ): TakeEffectDescriptor = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[TakeEffectDescriptor]
    }
    
    @scala.inline
    implicit class TakeEffectDescriptorMutableBuilder[Self <: TakeEffectDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaybe(value: Boolean): Self = StObject.set(x, "maybe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaybeUndefined: Self = StObject.set(x, "maybe", js.undefined)
      
      @scala.inline
      def setPattern(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
      ): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
}
