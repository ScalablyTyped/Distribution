package typings.atReduxDashSagaCore.typesMod

import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@redux-saga/core/types", "runSaga")
@js.native
object runSaga extends js.Object {
  def apply[Action, State, S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Saga */ js.Any */](
    options: RunSagaOptions[Action, State],
    saga: S,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<S> is not an array type */ args: Parameters[S]
  ): js.Any = js.native
}

