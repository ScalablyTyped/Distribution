package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IEnumerator[T] extends js.Object {
  def get_current(): T = js.native
  def moveNext(): Boolean = js.native
  def reset(): Unit = js.native
}

object IEnumerator {
  @scala.inline
  def apply[T](get_current: () => T, moveNext: () => Boolean, reset: () => Unit): IEnumerator[T] = {
    val __obj = js.Dynamic.literal(get_current = js.Any.fromFunction0(get_current), moveNext = js.Any.fromFunction0(moveNext), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[IEnumerator[T]]
  }
  @scala.inline
  implicit class IEnumeratorOps[Self <: IEnumerator[_], T] (val x: Self with IEnumerator[T]) extends AnyVal {
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
    def setGet_current(value: () => T): Self = this.set("get_current", js.Any.fromFunction0(value))
    @scala.inline
    def setMoveNext(value: () => Boolean): Self = this.set("moveNext", js.Any.fromFunction0(value))
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
  }
  
}

