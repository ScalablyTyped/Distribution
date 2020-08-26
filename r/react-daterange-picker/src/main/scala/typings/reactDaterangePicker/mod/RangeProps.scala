package typings.reactDaterangePicker.mod

import typings.reactDaterangePicker.reactDaterangePickerStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeProps[T]
  extends BaseProps[T]
     with Props[T] {
  var onSelect: js.UndefOr[js.Function1[/* value */ OnSelectCallbackParam, Unit]] = js.native
  var selectionType: js.UndefOr[range] = js.native
}

object RangeProps {
  @scala.inline
  def apply[T](): RangeProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeProps[T]]
  }
  @scala.inline
  implicit class RangePropsOps[Self <: RangeProps[_], T] (val x: Self with RangeProps[T]) extends AnyVal {
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
    def setOnSelect(value: /* value */ OnSelectCallbackParam => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setSelectionType(value: range): Self = this.set("selectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionType: Self = this.set("selectionType", js.undefined)
  }
  
}

