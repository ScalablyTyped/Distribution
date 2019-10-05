package typings.atReduxDashSagaCore.typesEffectsMod

import typings.atReduxDashSagaCore.Anon_Context
import typings.atReduxDashSagaCore.Anon_ContextFn
import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@redux-saga/core/types/effects", "fork")
@js.native
object fork extends js.Object {
  def apply[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = js.native
  def apply[Ctx /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.fork with js.Any */, Name /* <: String */](
    ctxAndFnName: Anon_Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[/* import warning: ImportType.apply Failed type conversion: Ctx[Name] */ js.Any]
  ): ForkEffect = js.native
  def apply[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = js.native
  def apply[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: Anon_ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): ForkEffect = js.native
}

