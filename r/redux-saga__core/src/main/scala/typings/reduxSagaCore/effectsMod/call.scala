package typings.reduxSagaCore.effectsMod

import org.scalablytyped.runtime.TopLevel
import typings.reduxSagaCore.anon.Context
import typings.reduxSagaCore.anon.ContextFn
import typings.reduxSagaCore.reduxSagaCoreStrings.call_
import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@redux-saga/core/types/effects", "call")
@js.native
object call extends js.Object {
  def apply[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    fn: Fn,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = js.native
  def apply[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): any}
    */ call_ with TopLevel[js.Any] */, Name /* <: String */](
    ctxAndFnName: Context[Ctx, Name],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Ctx[Name]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Ctx[Name] */ js.Any
    ]
  ): CallEffect = js.native
  def apply[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: js.Tuple2[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = js.native
  def apply[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */](
    ctxAndFn: ContextFn[Ctx, Fn],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = js.native
}

