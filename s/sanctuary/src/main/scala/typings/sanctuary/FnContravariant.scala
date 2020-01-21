package typings.sanctuary

import typings.sanctuary.mod.Contravariant
import typings.sanctuary.mod.Fn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnContravariant[A, B] extends js.Object {
  def apply(contravariant: Contravariant[A]): Contravariant[B] = js.native
  def apply[X](contravariant: Fn[A, X]): Fn[B, X] = js.native
}

