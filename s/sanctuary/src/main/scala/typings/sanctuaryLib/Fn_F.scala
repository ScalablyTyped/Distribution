package typings
package sanctuaryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_F extends js.Object {
  def apply[A, B](
    f: sanctuaryLib.sanctuaryMod.Fn[A, sanctuaryLib.sanctuaryMod.ChainRec[sanctuaryLib.sanctuaryMod.Either[A, B]]]
  ): js.Function1[/* x */ A, sanctuaryLib.sanctuaryMod.ChainRec[B]] = js.native
}

