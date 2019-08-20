package typings.rafDashSchd.rafDashSchdMod

import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schedule[T /* <: js.Function1[/* repeated */ js.Any, Unit] */] extends js.Object {
  def apply(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<T> is not an array type */ args: Parameters[T]
  ): Unit = js.native
  def cancel(): Unit = js.native
}

