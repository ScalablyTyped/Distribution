package typings.reactAsync.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FulfilledProps[T] extends js.Object {
  var children: js.UndefOr[FulfilledChildren[T]] = js.native
  var persist: js.UndefOr[Boolean] = js.native
}

object FulfilledProps {
  @scala.inline
  def apply[T](): FulfilledProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FulfilledProps[T]]
  }
  @scala.inline
  implicit class FulfilledPropsOps[Self <: FulfilledProps[_], T] (val x: Self with FulfilledProps[T]) extends AnyVal {
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
    def setChildrenFunction2(value: (T, /* state */ AsyncFulfilled[T, AbstractState[T]]) => ReactNode): Self = this.set("children", js.Any.fromFunction2(value))
    @scala.inline
    def setChildren(value: FulfilledChildren[T]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setPersist(value: Boolean): Self = this.set("persist", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersist: Self = this.set("persist", js.undefined)
  }
  
}

