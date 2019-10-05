package typings.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Responders extends js.Object {
  var onBeforeDragStart: js.UndefOr[OnBeforeDragStartResponder] = js.undefined
  var onDragEnd: OnDragEndResponder
  var onDragStart: js.UndefOr[OnDragStartResponder] = js.undefined
  var onDragUpdate: js.UndefOr[OnDragUpdateResponder] = js.undefined
}

object Responders {
  @scala.inline
  def apply(
    onDragEnd: (/* result */ DropResult, /* provided */ ResponderProvided) => Unit,
    onBeforeDragStart: /* start */ DragStart => Unit = null,
    onDragStart: (/* start */ DragStart, /* provided */ ResponderProvided) => Unit = null,
    onDragUpdate: (/* update */ DragUpdate, /* provided */ ResponderProvided) => Unit = null
  ): Responders = {
    val __obj = js.Dynamic.literal(onDragEnd = js.Any.fromFunction2(onDragEnd))
    if (onBeforeDragStart != null) __obj.updateDynamic("onBeforeDragStart")(js.Any.fromFunction1(onBeforeDragStart))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction2(onDragStart))
    if (onDragUpdate != null) __obj.updateDynamic("onDragUpdate")(js.Any.fromFunction2(onDragUpdate))
    __obj.asInstanceOf[Responders]
  }
}

