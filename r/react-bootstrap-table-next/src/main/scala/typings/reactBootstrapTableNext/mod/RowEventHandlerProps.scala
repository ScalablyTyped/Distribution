package typings.reactBootstrapTableNext.mod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  onClick :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>,   onDoubleClick :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>,   onMouseEnter :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>,   onMouseLeave :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>,   onContextMenu :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>}> */
@js.native
trait RowEventHandlerProps[T] extends js.Object {
  var onClick: js.UndefOr[RowEventHandler[T]] = js.native
  var onContextMenu: js.UndefOr[RowEventHandler[T]] = js.native
  var onDoubleClick: js.UndefOr[RowEventHandler[T]] = js.native
  var onMouseEnter: js.UndefOr[RowEventHandler[T]] = js.native
  var onMouseLeave: js.UndefOr[RowEventHandler[T]] = js.native
}

object RowEventHandlerProps {
  @scala.inline
  def apply[T](): RowEventHandlerProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowEventHandlerProps[T]]
  }
  @scala.inline
  implicit class RowEventHandlerPropsOps[Self <: RowEventHandlerProps[_], T] (val x: Self with RowEventHandlerProps[T]) extends AnyVal {
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
    def setOnClick(value: (/* e */ SyntheticEvent[Element, Event], T, /* rowIndex */ Double) => Unit): Self = this.set("onClick", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnContextMenu(value: (/* e */ SyntheticEvent[Element, Event], T, /* rowIndex */ Double) => Unit): Self = this.set("onContextMenu", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    @scala.inline
    def setOnDoubleClick(value: (/* e */ SyntheticEvent[Element, Event], T, /* rowIndex */ Double) => Unit): Self = this.set("onDoubleClick", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: (/* e */ SyntheticEvent[Element, Event], T, /* rowIndex */ Double) => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: (/* e */ SyntheticEvent[Element, Event], T, /* rowIndex */ Double) => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
  }
  
}

