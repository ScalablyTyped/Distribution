package typings.sanctuary

import typings.sanctuary.sanctuaryMod.Fn
import typings.sanctuary.sanctuaryMod.Functor
import typings.sanctuary.sanctuaryMod.StrMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Q[A, B] extends js.Object {
  def apply(q: js.Array[A]): js.Array[B] = js.native
  def apply(q: Functor[A]): Functor[B] = js.native
  def apply(q: StrMap[A]): StrMap[B] = js.native
  def apply[C](q: Fn[C, A]): Fn[C, B] = js.native
}

