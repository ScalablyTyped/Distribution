package typings
package sanctuaryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Q[A, B] extends js.Object {
  def apply(q: js.Array[A]): js.Array[B] = js.native
  def apply(q: sanctuaryLib.sanctuaryMod.Functor[A]): sanctuaryLib.sanctuaryMod.Functor[B] = js.native
  def apply(q: sanctuaryLib.sanctuaryMod.StrMap[A]): sanctuaryLib.sanctuaryMod.StrMap[B] = js.native
  def apply[C](q: sanctuaryLib.sanctuaryMod.Fn[C, A]): sanctuaryLib.sanctuaryMod.Fn[C, B] = js.native
}

