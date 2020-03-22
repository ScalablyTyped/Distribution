package typings.sanctuary

import typings.sanctuary.mod.Applicative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallXs[A] extends js.Object {
  def apply(xs: js.Array[A]): js.Array[A] = js.native
  def apply(xs: Applicative[A]): Applicative[A] = js.native
}

