package typings.ramda.toolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Functor[A] extends js.Object {
  def map[U](fn: js.Function1[/* a */ A, U]): Functor[U]
}

object Functor {
  @scala.inline
  def apply[A](map: js.Function1[/* a */ A, js.Any] => Functor[js.Any]): Functor[A] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map))
    __obj.asInstanceOf[Functor[A]]
  }
}

