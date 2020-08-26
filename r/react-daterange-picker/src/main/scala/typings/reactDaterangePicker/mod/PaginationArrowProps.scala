package typings.reactDaterangePicker.mod

import typings.reactDaterangePicker.reactDaterangePickerStrings.next
import typings.reactDaterangePicker.reactDaterangePickerStrings.previous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationArrowProps[T]
  extends typings.react.mod.Props[T] {
  var direction: js.UndefOr[next | previous] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var onTrigger: js.UndefOr[js.Function0[Unit]] = js.native
}

object PaginationArrowProps {
  @scala.inline
  def apply[T](): PaginationArrowProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationArrowProps[T]]
  }
  @scala.inline
  implicit class PaginationArrowPropsOps[Self <: PaginationArrowProps[_], T] (val x: Self with PaginationArrowProps[T]) extends AnyVal {
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
    def setDirection(value: next | previous): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setOnTrigger(value: () => Unit): Self = this.set("onTrigger", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnTrigger: Self = this.set("onTrigger", js.undefined)
  }
  
}

