package typings.sanctuary

import typings.sanctuary.sanctuaryMod.Apply
import typings.sanctuary.sanctuaryMod.Fn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_X[A, B, C] extends js.Object {
  def apply(x: Apply[A]): js.Function1[/* y */ Apply[B], Apply[C]] = js.native
  def apply[X](x: Fn[X, A]): js.Function1[/* y */ Fn[X, B], Fn[X, C]] = js.native
}

