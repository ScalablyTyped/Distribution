package typings.reactAsync.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingProps[T] extends js.Object {
  var children: js.UndefOr[PendingChildren[T]] = js.native
  var initial: js.UndefOr[Boolean] = js.native
}

object PendingProps {
  @scala.inline
  def apply[T](): PendingProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingProps[T]]
  }
  @scala.inline
  implicit class PendingPropsOps[Self <: PendingProps[_], T] (val x: Self with PendingProps[T]) extends AnyVal {
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
    def setChildrenFunction1(value: /* state */ AsyncPending[T, AbstractState[T]] => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setChildren(value: PendingChildren[T]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setInitial(value: Boolean): Self = this.set("initial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitial: Self = this.set("initial", js.undefined)
  }
  
}

