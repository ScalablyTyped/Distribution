package typings.recompose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observer[T] extends js.Object {
  def complete(): Unit = js.native
  def next(props: T): Unit = js.native
}

object Observer {
  @scala.inline
  def apply[T](complete: () => Unit, next: T => Unit): Observer[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[Observer[T]]
  }
  @scala.inline
  implicit class ObserverOps[Self <: Observer[_], T] (val x: Self with Observer[T]) extends AnyVal {
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def setNext(value: T => Unit): Self = this.set("next", js.Any.fromFunction1(value))
  }
  
}

