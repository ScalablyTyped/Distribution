package typings.reduxSagaCore.effectsMod

import org.scalablytyped.runtime.TopLevel
import typings.reduxSagaCore.AnonContextCtx
import typings.reduxSagaCore.AnonContextFn
import typings.reduxSagaCore.reduxSagaCoreStrings.cps_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@redux-saga/core/types/effects", "cps")
@js.native
object cps extends js.Object {
  def apply[Fn /* <: js.Function1[/* cb */ CpsCallback[_], _] */](fn: Fn): CpsEffect = js.native
  def apply[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = js.native
  def apply[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): void}
    */ cps_ with TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: AnonContextFn[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Ctx[Name]> is not an array type */ args: CpsFunctionParameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CpsEffect = js.native
  def apply[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, Unit] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = js.native
  def apply[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, Unit] */](
    ctxAndFn: AnonContextCtx[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CpsFunctionParameters<Fn> is not an array type */ args: CpsFunctionParameters[Fn]
  ): CpsEffect = js.native
}

