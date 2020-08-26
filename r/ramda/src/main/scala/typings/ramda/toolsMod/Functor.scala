package typings.ramda.toolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Functor[A] extends js.Object {
  def map[U](fn: js.Function1[/* a */ A, U]): Functor[U] = js.native
}

object Functor {
  @scala.inline
  def apply[A](map: js.Function1[/* a */ A, js.Any] => Functor[js.Any]): Functor[A] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map))
    __obj.asInstanceOf[Functor[A]]
  }
  @scala.inline
  implicit class FunctorOps[Self <: Functor[_], A] (val x: Self with Functor[A]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMap(value: js.Function1[/* a */ A, js.Any] => Functor[js.Any]): Self = this.set("map", js.Any.fromFunction1(value))
  }
  
}

