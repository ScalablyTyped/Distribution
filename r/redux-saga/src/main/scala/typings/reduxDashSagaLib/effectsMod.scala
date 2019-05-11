package typings
package reduxDashSagaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-saga/effects", JSImport.Namespace)
@js.native
object effectsMod extends js.Object {
  def actionChannel(
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[reduxLib.reduxMod.Action[_]]
  ): atReduxDashSagaCoreLib.effectsMod.ActionChannelEffect = js.native
  def actionChannel(
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[reduxLib.reduxMod.Action[_]],
    buffer: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Buffer[reduxLib.reduxMod.Action[_]]
  ): atReduxDashSagaCoreLib.effectsMod.ActionChannelEffect = js.native
  def all[T](effects: js.Array[T]): atReduxDashSagaCoreLib.effectsMod.AllEffect[T] = js.native
  def all[T](effects: org.scalablytyped.runtime.StringDictionary[T]): atReduxDashSagaCoreLib.effectsMod.AllEffect[T] = js.native
  @JSName("apply")
  def apply[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](ctx: Ctx, fn: Fn, args: stdLib.Parameters[Fn]): atReduxDashSagaCoreLib.effectsMod.CallEffect = js.native
  @JSName("apply")
  def `apply_Ctx<intersection>NameString`[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ reduxDashSagaLib.reduxDashSagaLibStrings.apply with js.Any */, Name /* <: java.lang.String */](
    ctx: Ctx,
    fnName: Name,
    args: stdLib.Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): atReduxDashSagaCoreLib.effectsMod.CallEffect = js.native
  def call[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: stdLib.Parameters[Fn]
  ): atReduxDashSagaCoreLib.effectsMod.CallEffect = js.native
  def call[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ reduxDashSagaLib.reduxDashSagaLibStrings.call with js.Any */, Name /* <: java.lang.String */](
    ctxAndFnName: atReduxDashSagaCoreLib.Anon_Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: stdLib.Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): atReduxDashSagaCoreLib.effectsMod.CallEffect = js.native
  def call[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ reduxDashSagaLib.reduxDashSagaLibStrings.call with js.Any */, Name /* <: java.lang.String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: stdLib.Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): atReduxDashSagaCoreLib.effectsMod.CallEffect = js.native
  def call[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: atReduxDashSagaCoreLib.Anon_ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: stdLib.Parameters[Fn]
  ): atReduxDashSagaCoreLib.effectsMod.CallEffect = js.native
  @JSName("call")
  def call_CtxFnThisFunction1[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: stdLib.Parameters[Fn]
  ): atReduxDashSagaCoreLib.effectsMod.CallEffect = js.native
  def cancel(): atReduxDashSagaCoreLib.effectsMod.CancelEffect = js.native
  def cancel(task: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Task): atReduxDashSagaCoreLib.effectsMod.CancelEffect = js.native
  def cancel(tasks: js.Array[atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Task]): atReduxDashSagaCoreLib.effectsMod.CancelEffect = js.native
  def cancelled(): atReduxDashSagaCoreLib.effectsMod.CancelledEffect = js.native
  def cps[Fn /* <: js.Function1[/* cb */ atReduxDashSagaCoreLib.effectsMod.CpsCallback[_], _] */](fn: Fn): atReduxDashSagaCoreLib.effectsMod.CpsEffect = js.native
  def cps[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.CpsFunctionParameters[Fn]
  ): atReduxDashSagaCoreLib.effectsMod.CpsEffect = js.native
  def cps[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): void}
    */ reduxDashSagaLib.reduxDashSagaLibStrings.cps with js.Any */, Name /* <: java.lang.String */](
    ctxAndFnName: atReduxDashSagaCoreLib.Anon_ContextFnCtx[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type CpsFunctionParameters<Ctx[Name]> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.CpsFunctionParameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): atReduxDashSagaCoreLib.effectsMod.CpsEffect = js.native
  def cps[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, scala.Unit] */](
    ctxAndFn: atReduxDashSagaCoreLib.Anon_ContextFnCtx_735312900[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.CpsFunctionParameters[Fn]
  ): atReduxDashSagaCoreLib.effectsMod.CpsEffect = js.native
  def cps[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, scala.Unit] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.CpsFunctionParameters[Fn]
  ): atReduxDashSagaCoreLib.effectsMod.CpsEffect = js.native
  @JSName("cps")
  def `cps_Ctx<intersection>NameString`[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): void}
    */ reduxDashSagaLib.reduxDashSagaLibStrings.cps with js.Any */, Name /* <: java.lang.String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type CpsFunctionParameters<Ctx[Name]> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.CpsFunctionParameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): atReduxDashSagaCoreLib.effectsMod.CpsEffect = js.native
  def debounce(
    ms: scala.Double,
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.StringableActionCreator[reduxLib.reduxMod.Action[_]],
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[
        atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.StringableActionCreator[reduxLib.reduxMod.Action[_]]
      ], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def debounce(
    ms: scala.Double,
    pattern: java.lang.String,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[java.lang.String], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def debounce(
    ms: scala.Double,
    pattern: js.Array[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionSubPattern[reduxLib.reduxMod.Action[_]]
    ],
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[
        js.Array[
          atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionSubPattern[reduxLib.reduxMod.Action[_]]
        ]
      ], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def debounce(
    ms: scala.Double,
    pattern: js.Symbol,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[js.Symbol], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def debounce(
    ms: scala.Double,
    pattern: scala.Double,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[scala.Double], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def debounce[T](
    ms: scala.Double,
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    worker: js.Function1[/* item */ T, _]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def debounce[P /* <: js.Function1[
    /* arg */ reduxLib.reduxMod.Action[_], 
    /* is redux.redux.Action<any> */ scala.Boolean
  ] */](
    ms: scala.Double,
    pattern: P,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[P], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def debounce[A /* <: reduxLib.reduxMod.Action[_] */](
    ms: scala.Double,
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[A],
    worker: js.Function1[/* action */ A, _]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def debounce[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: scala.Double,
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.StringableActionCreator[reduxLib.reduxMod.Action[_]],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[
        atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.StringableActionCreator[reduxLib.reduxMod.Action[_]]
      ], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def debounce[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: scala.Double,
    pattern: java.lang.String,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[java.lang.String], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def debounce[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: scala.Double,
    pattern: js.Array[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionSubPattern[reduxLib.reduxMod.Action[_]]
    ],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[
        js.Array[
          atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionSubPattern[reduxLib.reduxMod.Action[_]]
        ]
      ], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def debounce[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: scala.Double,
    pattern: js.Symbol,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[js.Symbol], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def debounce[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: scala.Double,
    pattern: scala.Double,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[scala.Double], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def debounce[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: scala.Double,
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[T, Fn]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def debounce[P /* <: js.Function1[
    /* arg */ reduxLib.reduxMod.Action[_], 
    /* is redux.redux.Action<any> */ scala.Boolean
  ] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: scala.Double,
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[P], Fn]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def debounce[A /* <: reduxLib.reduxMod.Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: scala.Double,
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[A],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[A, Fn]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def delay[T](ms: scala.Double): atReduxDashSagaCoreLib.effectsMod.CallEffect = js.native
  def delay[T](ms: scala.Double, `val`: T): atReduxDashSagaCoreLib.effectsMod.CallEffect = js.native
  def flush[T](channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.FlushableChannel[T]): atReduxDashSagaCoreLib.effectsMod.FlushEffect[T] = js.native
  def fork[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: stdLib.Parameters[Fn]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def fork[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ reduxDashSagaLib.reduxDashSagaLibStrings.fork with js.Any */, Name /* <: java.lang.String */](
    ctxAndFnName: atReduxDashSagaCoreLib.Anon_Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: stdLib.Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def fork[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: atReduxDashSagaCoreLib.Anon_ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: stdLib.Parameters[Fn]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def fork[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: stdLib.Parameters[Fn]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  @JSName("fork")
  def `fork_Ctx<intersection>NameString`[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ reduxDashSagaLib.reduxDashSagaLibStrings.fork with js.Any */, Name /* <: java.lang.String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: stdLib.Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def getContext(prop: java.lang.String): atReduxDashSagaCoreLib.effectsMod.GetContextEffect = js.native
  def join(task: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Task): atReduxDashSagaCoreLib.effectsMod.JoinEffect = js.native
  def join(tasks: js.Array[atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Task]): atReduxDashSagaCoreLib.effectsMod.JoinEffect = js.native
  def put[A /* <: reduxLib.reduxMod.Action[_] */](action: A): atReduxDashSagaCoreLib.effectsMod.PutEffect[A] = js.native
  def put[T](channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.PuttableChannel[T], action: T): atReduxDashSagaCoreLib.effectsMod.ChannelPutEffect[T] = js.native
  def put[T](
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.PuttableChannel[T],
    action: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.END
  ): atReduxDashSagaCoreLib.effectsMod.ChannelPutEffect[T] = js.native
  def putResolve[A /* <: reduxLib.reduxMod.Action[_] */](action: A): atReduxDashSagaCoreLib.effectsMod.PutEffect[A] = js.native
  def race[T](effects: js.Array[T]): atReduxDashSagaCoreLib.effectsMod.RaceEffect[T] = js.native
  def race[T](effects: org.scalablytyped.runtime.StringDictionary[T]): atReduxDashSagaCoreLib.effectsMod.RaceEffect[T] = js.native
  def retry[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    maxTries: scala.Double,
    delayLength: scala.Double,
    fn: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: stdLib.Parameters[Fn]
  ): atReduxDashSagaCoreLib.effectsMod.CallEffect = js.native
  def select(): atReduxDashSagaCoreLib.effectsMod.SelectEffect = js.native
  def select[Fn /* <: js.Function2[/* state */ js.Any, /* repeated */ js.Any, _] */](
    selector: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Tail<Parameters<Fn>> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.Tail[stdLib.Parameters[Fn]]
  ): atReduxDashSagaCoreLib.effectsMod.SelectEffect = js.native
  def setContext[C /* <: js.Object */](props: C): atReduxDashSagaCoreLib.effectsMod.SetContextEffect[C] = js.native
  def spawn[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: stdLib.Parameters[Fn]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def spawn[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ reduxDashSagaLib.reduxDashSagaLibStrings.spawn with js.Any */, Name /* <: java.lang.String */](
    ctxAndFnName: atReduxDashSagaCoreLib.Anon_Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: stdLib.Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def spawn[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ reduxDashSagaLib.reduxDashSagaLibStrings.spawn with js.Any */, Name /* <: java.lang.String */](
    ctxAndFnName: js.Tuple2[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: stdLib.Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def spawn[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: atReduxDashSagaCoreLib.Anon_ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: stdLib.Parameters[Fn]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  @JSName("spawn")
  def spawn_CtxFnThisFunction1[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: stdLib.Parameters[Fn]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def take(): atReduxDashSagaCoreLib.effectsMod.TakeEffect = js.native
  def take(
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[reduxLib.reduxMod.Action[_]]
  ): atReduxDashSagaCoreLib.effectsMod.TakeEffect = js.native
  def take[T](channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T]): atReduxDashSagaCoreLib.effectsMod.ChannelTakeEffect[T] = js.native
  def take[T](
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    multicastPattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Pattern[T]
  ): atReduxDashSagaCoreLib.effectsMod.ChannelTakeEffect[T] = js.native
  def takeEvery(
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.StringableActionCreator[reduxLib.reduxMod.Action[_]],
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[
        atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.StringableActionCreator[reduxLib.reduxMod.Action[_]]
      ], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeEvery(
    pattern: java.lang.String,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[java.lang.String], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeEvery(
    pattern: js.Array[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionSubPattern[reduxLib.reduxMod.Action[_]]
    ],
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[
        js.Array[
          atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionSubPattern[reduxLib.reduxMod.Action[_]]
        ]
      ], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeEvery(
    pattern: js.Symbol,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[js.Symbol], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeEvery(
    pattern: scala.Double,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[scala.Double], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeEvery[T](
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    worker: js.Function1[/* item */ T, _]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeEvery[P /* <: js.Function1[
    /* arg */ reduxLib.reduxMod.Action[_], 
    /* is redux.redux.Action<any> */ scala.Boolean
  ] */](
    pattern: P,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[P], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeEvery[A /* <: reduxLib.reduxMod.Action[_] */](
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[A],
    worker: js.Function1[/* action */ A, _]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeEvery[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.StringableActionCreator[reduxLib.reduxMod.Action[_]],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[
        atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.StringableActionCreator[reduxLib.reduxMod.Action[_]]
      ], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeEvery[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: java.lang.String,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[java.lang.String], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeEvery[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: js.Array[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionSubPattern[reduxLib.reduxMod.Action[_]]
    ],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[
        js.Array[
          atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionSubPattern[reduxLib.reduxMod.Action[_]]
        ]
      ], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeEvery[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: js.Symbol,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[js.Symbol], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeEvery[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: scala.Double,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[scala.Double], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeEvery[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[T, Fn]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeEvery[P /* <: js.Function1[
    /* arg */ reduxLib.reduxMod.Action[_], 
    /* is redux.redux.Action<any> */ scala.Boolean
  ] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[P], Fn]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeEvery[A /* <: reduxLib.reduxMod.Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[A],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[A, Fn]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLatest(
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.StringableActionCreator[reduxLib.reduxMod.Action[_]],
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[
        atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.StringableActionCreator[reduxLib.reduxMod.Action[_]]
      ], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLatest(
    pattern: java.lang.String,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[java.lang.String], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLatest(
    pattern: js.Array[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionSubPattern[reduxLib.reduxMod.Action[_]]
    ],
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[
        js.Array[
          atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionSubPattern[reduxLib.reduxMod.Action[_]]
        ]
      ], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLatest(
    pattern: js.Symbol,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[js.Symbol], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLatest(
    pattern: scala.Double,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[scala.Double], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLatest[T](
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    worker: js.Function1[/* item */ T, _]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLatest[P /* <: js.Function1[
    /* arg */ reduxLib.reduxMod.Action[_], 
    /* is redux.redux.Action<any> */ scala.Boolean
  ] */](
    pattern: P,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[P], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLatest[A /* <: reduxLib.reduxMod.Action[_] */](
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[A],
    worker: js.Function1[/* action */ A, _]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLatest[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.StringableActionCreator[reduxLib.reduxMod.Action[_]],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[
        atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.StringableActionCreator[reduxLib.reduxMod.Action[_]]
      ], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLatest[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: java.lang.String,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[java.lang.String], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLatest[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: js.Array[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionSubPattern[reduxLib.reduxMod.Action[_]]
    ],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[
        js.Array[
          atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionSubPattern[reduxLib.reduxMod.Action[_]]
        ]
      ], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLatest[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: js.Symbol,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[js.Symbol], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLatest[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: scala.Double,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[scala.Double], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLatest[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[T, Fn]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLatest[P /* <: js.Function1[
    /* arg */ reduxLib.reduxMod.Action[_], 
    /* is redux.redux.Action<any> */ scala.Boolean
  ] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[P], Fn]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLatest[A /* <: reduxLib.reduxMod.Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[A],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[A, Fn]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLeading(
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.StringableActionCreator[reduxLib.reduxMod.Action[_]],
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[
        atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.StringableActionCreator[reduxLib.reduxMod.Action[_]]
      ], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLeading(
    pattern: java.lang.String,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[java.lang.String], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLeading(
    pattern: js.Array[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionSubPattern[reduxLib.reduxMod.Action[_]]
    ],
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[
        js.Array[
          atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionSubPattern[reduxLib.reduxMod.Action[_]]
        ]
      ], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLeading(
    pattern: js.Symbol,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[js.Symbol], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLeading(
    pattern: scala.Double,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[scala.Double], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLeading[T](
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    worker: js.Function1[/* item */ T, _]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLeading[P /* <: js.Function1[
    /* arg */ reduxLib.reduxMod.Action[_], 
    /* is redux.redux.Action<any> */ scala.Boolean
  ] */](
    pattern: P,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[P], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLeading[A /* <: reduxLib.reduxMod.Action[_] */](
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[A],
    worker: js.Function1[/* action */ A, _]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLeading[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.StringableActionCreator[reduxLib.reduxMod.Action[_]],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[
        atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.StringableActionCreator[reduxLib.reduxMod.Action[_]]
      ], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLeading[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: java.lang.String,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[java.lang.String], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLeading[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: js.Array[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionSubPattern[reduxLib.reduxMod.Action[_]]
    ],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[
        js.Array[
          atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionSubPattern[reduxLib.reduxMod.Action[_]]
        ]
      ], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLeading[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: js.Symbol,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[js.Symbol], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLeading[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: scala.Double,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[scala.Double], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLeading[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[T, Fn]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLeading[P /* <: js.Function1[
    /* arg */ reduxLib.reduxMod.Action[_], 
    /* is redux.redux.Action<any> */ scala.Boolean
  ] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[P], Fn]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeLeading[A /* <: reduxLib.reduxMod.Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[A],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[A, Fn]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def takeMaybe(): atReduxDashSagaCoreLib.effectsMod.TakeEffect = js.native
  def takeMaybe(
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[reduxLib.reduxMod.Action[_]]
  ): atReduxDashSagaCoreLib.effectsMod.TakeEffect = js.native
  def takeMaybe[T](channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T]): atReduxDashSagaCoreLib.effectsMod.ChannelTakeEffect[T] = js.native
  def takeMaybe[T](
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    multicastPattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Pattern[T]
  ): atReduxDashSagaCoreLib.effectsMod.ChannelTakeEffect[T] = js.native
  @JSName("takeMaybe")
  def takeMaybe_AAction[A /* <: reduxLib.reduxMod.Action[_] */](): atReduxDashSagaCoreLib.effectsMod.TakeEffect = js.native
  @JSName("takeMaybe")
  def takeMaybe_AAction[A /* <: reduxLib.reduxMod.Action[_] */](pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[A]): atReduxDashSagaCoreLib.effectsMod.TakeEffect = js.native
  @JSName("take")
  def take_AAction[A /* <: reduxLib.reduxMod.Action[_] */](): atReduxDashSagaCoreLib.effectsMod.TakeEffect = js.native
  @JSName("take")
  def take_AAction[A /* <: reduxLib.reduxMod.Action[_] */](pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[A]): atReduxDashSagaCoreLib.effectsMod.TakeEffect = js.native
  def throttle(
    ms: scala.Double,
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.StringableActionCreator[reduxLib.reduxMod.Action[_]],
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[
        atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.StringableActionCreator[reduxLib.reduxMod.Action[_]]
      ], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def throttle(
    ms: scala.Double,
    pattern: java.lang.String,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[java.lang.String], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def throttle(
    ms: scala.Double,
    pattern: js.Array[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionSubPattern[reduxLib.reduxMod.Action[_]]
    ],
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[
        js.Array[
          atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionSubPattern[reduxLib.reduxMod.Action[_]]
        ]
      ], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def throttle(
    ms: scala.Double,
    pattern: js.Symbol,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[js.Symbol], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def throttle(
    ms: scala.Double,
    pattern: scala.Double,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[scala.Double], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def throttle[T](
    ms: scala.Double,
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    worker: js.Function1[/* item */ T, _]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def throttle[P /* <: js.Function1[
    /* arg */ reduxLib.reduxMod.Action[_], 
    /* is redux.redux.Action<any> */ scala.Boolean
  ] */](
    ms: scala.Double,
    pattern: P,
    worker: js.Function1[
      /* action */ atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[P], 
      _
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */](
    ms: scala.Double,
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[A],
    worker: js.Function1[/* action */ A, _]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def throttle[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: scala.Double,
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.StringableActionCreator[reduxLib.reduxMod.Action[_]],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[
        atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.StringableActionCreator[reduxLib.reduxMod.Action[_]]
      ], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def throttle[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: scala.Double,
    pattern: java.lang.String,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[java.lang.String], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def throttle[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: scala.Double,
    pattern: js.Array[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionSubPattern[reduxLib.reduxMod.Action[_]]
    ],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[
        js.Array[
          atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionSubPattern[reduxLib.reduxMod.Action[_]]
        ]
      ], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def throttle[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: scala.Double,
    pattern: js.Symbol,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[js.Symbol], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def throttle[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: scala.Double,
    pattern: scala.Double,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[
      atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[scala.Double], 
      Fn
    ]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def throttle[T, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: scala.Double,
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<T, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[T, Fn]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def throttle[P /* <: js.Function1[
    /* arg */ reduxLib.reduxMod.Action[_], 
    /* is redux.redux.Action<any> */ scala.Boolean
  ] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: scala.Double,
    pattern: P,
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<ActionMatchingPattern<P>, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionMatchingPattern[P], Fn]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def throttle[A /* <: reduxLib.reduxMod.Action[_] */, Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    ms: scala.Double,
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[A],
    worker: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type HelperWorkerParameters<A, Fn> is not an array type */ args: atReduxDashSagaCoreLib.effectsMod.HelperWorkerParameters[A, Fn]
  ): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  @js.native
  object effectTypes extends js.Object {
    var ACTION_CHANNEL: reduxDashSagaLib.reduxDashSagaLibStrings.ACTION_CHANNEL = js.native
    var ALL: reduxDashSagaLib.reduxDashSagaLibStrings.ALL = js.native
    var CALL: reduxDashSagaLib.reduxDashSagaLibStrings.CALL = js.native
    var CANCEL: reduxDashSagaLib.reduxDashSagaLibStrings.CANCEL = js.native
    var CANCELLED: reduxDashSagaLib.reduxDashSagaLibStrings.CANCELLED = js.native
    var CPS: reduxDashSagaLib.reduxDashSagaLibStrings.CPS = js.native
    var FLUSH: reduxDashSagaLib.reduxDashSagaLibStrings.FLUSH = js.native
    var FORK: reduxDashSagaLib.reduxDashSagaLibStrings.FORK = js.native
    var GET_CONTEXT: reduxDashSagaLib.reduxDashSagaLibStrings.GET_CONTEXT = js.native
    var JOIN: reduxDashSagaLib.reduxDashSagaLibStrings.JOIN = js.native
    var PUT: reduxDashSagaLib.reduxDashSagaLibStrings.PUT = js.native
    var RACE: reduxDashSagaLib.reduxDashSagaLibStrings.RACE = js.native
    var SELECT: reduxDashSagaLib.reduxDashSagaLibStrings.SELECT = js.native
    var SET_CONTEXT: reduxDashSagaLib.reduxDashSagaLibStrings.SET_CONTEXT = js.native
    var TAKE: reduxDashSagaLib.reduxDashSagaLibStrings.TAKE = js.native
  }
  
}

