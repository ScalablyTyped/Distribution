package typings
package sanctuaryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Q[A, B] extends js.Object {
  def apply(q: js.Array[A]): js.Array[B] = js.native
  def apply(q: sanctuaryLib.sanctuaryMod.Functor[A]): sanctuaryLib.sanctuaryMod.Functor[B] = js.native
  def apply(q: sanctuaryLib.sanctuaryMod.StrMap[A]): sanctuaryLib.sanctuaryMod.StrMap[B] = js.native
  def apply[C](q: Fn[C, A]): Fn[C, B] = js.native
}

