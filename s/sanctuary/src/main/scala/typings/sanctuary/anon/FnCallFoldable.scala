package typings.sanctuary.anon

import typings.sanctuary.mod.Foldable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallFoldable[A] extends js.Object {
  def apply(foldable: js.Array[A]): js.Array[A] = js.native
  def apply(foldable: Foldable[A]): Foldable[A] = js.native
}

