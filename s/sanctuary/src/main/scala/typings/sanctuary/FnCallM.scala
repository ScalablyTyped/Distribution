package typings.sanctuary

import typings.sanctuary.mod.Foldable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallM[A] extends js.Object {
  def apply(m: js.Array[A]): js.Array[A] = js.native
  def apply(m: Foldable[A]): Foldable[A] = js.native
}

