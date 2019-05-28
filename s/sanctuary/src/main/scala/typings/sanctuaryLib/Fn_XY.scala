package typings
package sanctuaryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_XY[A, B, C, D] extends js.Object {
  def apply(x: sanctuaryLib.sanctuaryMod.Apply[A]): js.Function1[
    /* y */ sanctuaryLib.sanctuaryMod.Apply[B], 
    js.Function1[/* z */ sanctuaryLib.sanctuaryMod.Apply[C], sanctuaryLib.sanctuaryMod.Apply[D]]
  ] = js.native
  def apply[X](x: sanctuaryLib.sanctuaryMod.Fn[X, A]): js.Function1[
    /* y */ sanctuaryLib.sanctuaryMod.Fn[X, B], 
    js.Function1[/* z */ sanctuaryLib.sanctuaryMod.Fn[X, C], sanctuaryLib.sanctuaryMod.Fn[X, D]]
  ] = js.native
}

