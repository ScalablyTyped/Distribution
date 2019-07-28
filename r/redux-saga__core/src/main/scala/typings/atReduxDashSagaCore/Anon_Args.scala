package typings.atReduxDashSagaCore

import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.Saga
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Args extends js.Object {
  var args: js.Array[_] = js.native
  var effectId: Double = js.native
  @JSName("saga")
  var saga_Original: Saga[js.Array[_]] = js.native
  def saga(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Args is not an array type */ args: js.Array[_]
  ): IterableIterator[_] = js.native
}

