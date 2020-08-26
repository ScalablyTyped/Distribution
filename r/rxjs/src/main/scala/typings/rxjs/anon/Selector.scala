package typings.rxjs.anon

import typings.rxjs.typesMod.ObservableInput
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Selector[T] extends js.Object {
  def selector(response: Response): ObservableInput[T] = js.native
}

object Selector {
  @scala.inline
  def apply[T](selector: Response => ObservableInput[T]): Selector[T] = {
    val __obj = js.Dynamic.literal(selector = js.Any.fromFunction1(selector))
    __obj.asInstanceOf[Selector[T]]
  }
  @scala.inline
  implicit class SelectorOps[Self <: Selector[_], T] (val x: Self with Selector[T]) extends AnyVal {
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
    def setSelector(value: Response => ObservableInput[T]): Self = this.set("selector", js.Any.fromFunction1(value))
  }
  
}

