package typings
package sanctuaryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Contravariant[A, B] extends js.Object {
  def apply(contravariant: sanctuaryLib.sanctuaryMod.Contravariant[A]): sanctuaryLib.sanctuaryMod.Contravariant[B] = js.native
  def apply[X](contravariant: Fn[A, X]): Fn[B, X] = js.native
}

