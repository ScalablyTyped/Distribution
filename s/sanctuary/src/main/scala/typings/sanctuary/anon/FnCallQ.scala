package typings.sanctuary.anon

import typings.sanctuary.mod.Bifunctor
import typings.sanctuary.mod.Either
import typings.sanctuary.mod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallQ[B] extends js.Object {
  def apply[A, C](q: Bifunctor[A, C]): Bifunctor[B, C] = js.native
  def apply[A, C](q: Either[A, C]): Either[B, C] = js.native
  def apply[A, C](q: Pair[A, C]): Pair[B, C] = js.native
}

