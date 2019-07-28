package typings.reactDashMapDashGl.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableControlProps extends BaseControlProps {
  var draggable: js.UndefOr[Boolean] = js.undefined
  var onDrag: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragEnd: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
}

object DraggableControlProps {
  @scala.inline
  def apply(
    captureClick: js.UndefOr[Boolean] = js.undefined,
    captureDoubleClick: js.UndefOr[Boolean] = js.undefined,
    captureDrag: js.UndefOr[Boolean] = js.undefined,
    captureScroll: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    onDrag: /* event */ DragEvent => Unit = null,
    onDragEnd: /* event */ DragEvent => Unit = null,
    onDragStart: /* event */ DragEvent => Unit = null
  ): DraggableControlProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(captureClick)) __obj.updateDynamic("captureClick")(captureClick)
    if (!js.isUndefined(captureDoubleClick)) __obj.updateDynamic("captureDoubleClick")(captureDoubleClick)
    if (!js.isUndefined(captureDrag)) __obj.updateDynamic("captureDrag")(captureDrag)
    if (!js.isUndefined(captureScroll)) __obj.updateDynamic("captureScroll")(captureScroll)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    __obj.asInstanceOf[DraggableControlProps]
  }
}

