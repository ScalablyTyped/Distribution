package typings.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragDropContextProps extends js.Object {
  var onBeforeCapture: js.UndefOr[js.Function1[/* before */ BeforeCapture, Unit]] = js.undefined
  var onBeforeDragStart: js.UndefOr[js.Function1[/* initial */ DragStart, Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function2[/* initial */ DragStart, /* provided */ ResponderProvided, Unit]] = js.undefined
  var onDragUpdate: js.UndefOr[js.Function2[/* initial */ DragUpdate, /* provided */ ResponderProvided, Unit]] = js.undefined
  def onDragEnd(result: DropResult, provided: ResponderProvided): Unit
}

object DragDropContextProps {
  @scala.inline
  def apply(
    onDragEnd: (DropResult, ResponderProvided) => Unit,
    onBeforeCapture: /* before */ BeforeCapture => Unit = null,
    onBeforeDragStart: /* initial */ DragStart => Unit = null,
    onDragStart: (/* initial */ DragStart, /* provided */ ResponderProvided) => Unit = null,
    onDragUpdate: (/* initial */ DragUpdate, /* provided */ ResponderProvided) => Unit = null
  ): DragDropContextProps = {
    val __obj = js.Dynamic.literal(onDragEnd = js.Any.fromFunction2(onDragEnd))
    if (onBeforeCapture != null) __obj.updateDynamic("onBeforeCapture")(js.Any.fromFunction1(onBeforeCapture))
    if (onBeforeDragStart != null) __obj.updateDynamic("onBeforeDragStart")(js.Any.fromFunction1(onBeforeDragStart))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction2(onDragStart))
    if (onDragUpdate != null) __obj.updateDynamic("onDragUpdate")(js.Any.fromFunction2(onDragUpdate))
    __obj.asInstanceOf[DragDropContextProps]
  }
}

