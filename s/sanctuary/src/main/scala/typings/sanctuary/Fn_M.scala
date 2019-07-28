package typings.sanctuary

import typings.sanctuary.sanctuaryMod.Foldable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_M[A] extends js.Object {
  def apply(m: js.Array[A]): js.Array[A] = js.native
  def apply(m: Foldable[A]): Foldable[A] = js.native
}

