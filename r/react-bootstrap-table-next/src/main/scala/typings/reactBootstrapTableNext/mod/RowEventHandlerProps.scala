package typings.reactBootstrapTableNext.mod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  onClick  :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>,   onDoubleClick  :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>,   onMouseEnter  :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>,   onMouseLeave  :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>,   onContextMenu  :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>}> */
trait RowEventHandlerProps[T] extends js.Object {
  var onClick: js.UndefOr[RowEventHandler[T]] = js.undefined
  var onContextMenu: js.UndefOr[RowEventHandler[T]] = js.undefined
  var onDoubleClick: js.UndefOr[RowEventHandler[T]] = js.undefined
  var onMouseEnter: js.UndefOr[RowEventHandler[T]] = js.undefined
  var onMouseLeave: js.UndefOr[RowEventHandler[T]] = js.undefined
}

object RowEventHandlerProps {
  @scala.inline
  def apply[T](
    onClick: (/* e */ SyntheticEvent[Element, Event], T, /* rowIndex */ Double) => Unit = null,
    onContextMenu: (/* e */ SyntheticEvent[Element, Event], T, /* rowIndex */ Double) => Unit = null,
    onDoubleClick: (/* e */ SyntheticEvent[Element, Event], T, /* rowIndex */ Double) => Unit = null,
    onMouseEnter: (/* e */ SyntheticEvent[Element, Event], T, /* rowIndex */ Double) => Unit = null,
    onMouseLeave: (/* e */ SyntheticEvent[Element, Event], T, /* rowIndex */ Double) => Unit = null
  ): RowEventHandlerProps[T] = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction3(onClick))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction3(onContextMenu))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction3(onDoubleClick))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction3(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction3(onMouseLeave))
    __obj.asInstanceOf[RowEventHandlerProps[T]]
  }
}

