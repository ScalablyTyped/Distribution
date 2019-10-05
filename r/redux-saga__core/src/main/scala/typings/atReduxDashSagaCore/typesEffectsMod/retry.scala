package typings.atReduxDashSagaCore.typesEffectsMod

import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@redux-saga/core/types/effects", "retry")
@js.native
object retry extends js.Object {
  def apply[Fn /* <: js.Function1[/* repeated */ js.Any, _] */](
    maxTries: Double,
    delayLength: Double,
    fn: Fn,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Fn> is not an array type */ args: Parameters[Fn]
  ): CallEffect = js.native
}

