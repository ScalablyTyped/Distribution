package typings.sanctuary

import typings.sanctuary.mod.Apply
import typings.sanctuary.mod.Fn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnXY[A, B, C, D] extends js.Object {
  def apply(x: Apply[A]): js.Function1[/* y */ Apply[B], js.Function1[/* z */ Apply[C], Apply[D]]] = js.native
  def apply[X](x: Fn[X, A]): js.Function1[/* y */ Fn[X, B], js.Function1[/* z */ Fn[X, C], Fn[X, D]]] = js.native
}

