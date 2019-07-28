package typings.sanctuary

import typings.sanctuary.sanctuaryMod.Applicative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Xs[A] extends js.Object {
  def apply(xs: js.Array[A]): js.Array[A] = js.native
  def apply(xs: Applicative[A]): Applicative[A] = js.native
}

