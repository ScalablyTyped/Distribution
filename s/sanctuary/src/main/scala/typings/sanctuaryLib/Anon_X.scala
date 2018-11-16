package typings
package sanctuaryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_X[A, B, C, D] extends js.Object {
  def apply(x: sanctuaryLib.sanctuaryMod.Apply[A]): js.Function1[
    /* y */ sanctuaryLib.sanctuaryMod.Apply[B], 
    js.Function1[/* z */ sanctuaryLib.sanctuaryMod.Apply[C], sanctuaryLib.sanctuaryMod.Apply[D]]
  ] = js.native
  def apply[X](x: Fn[X, A]): js.Function1[/* y */ Fn[X, B], js.Function1[/* z */ Fn[X, C], Fn[X, D]]] = js.native
}

