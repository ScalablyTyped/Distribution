package typings
package reactDashBeautifulDashDndLib.reactDashBeautifulDashDndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragDropContextProps extends js.Object {
  var onBeforeDragStart: js.UndefOr[js.Function1[/* initial */ DragStart, scala.Unit]] = js.undefined
  var onDragStart: js.UndefOr[
    js.Function2[/* initial */ DragStart, /* provided */ ResponderProvided, scala.Unit]
  ] = js.undefined
  var onDragUpdate: js.UndefOr[
    js.Function2[/* initial */ DragUpdate, /* provided */ ResponderProvided, scala.Unit]
  ] = js.undefined
  def onDragEnd(result: DropResult, provided: ResponderProvided): scala.Unit
}

object DragDropContextProps {
  @scala.inline
  def apply(
    onDragEnd: (DropResult, ResponderProvided) => scala.Unit,
    onBeforeDragStart: /* initial */ DragStart => scala.Unit = null,
    onDragStart: (/* initial */ DragStart, /* provided */ ResponderProvided) => scala.Unit = null,
    onDragUpdate: (/* initial */ DragUpdate, /* provided */ ResponderProvided) => scala.Unit = null
  ): DragDropContextProps = {
    val __obj = js.Dynamic.literal(onDragEnd = js.Any.fromFunction2(onDragEnd))
    if (onBeforeDragStart != null) __obj.updateDynamic("onBeforeDragStart")(js.Any.fromFunction1(onBeforeDragStart))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction2(onDragStart))
    if (onDragUpdate != null) __obj.updateDynamic("onDragUpdate")(js.Any.fromFunction2(onDragUpdate))
    __obj.asInstanceOf[DragDropContextProps]
  }
}

