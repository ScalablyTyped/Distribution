package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableControlProps extends BaseControlProps {
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var onDrag: js.UndefOr[js.Function1[/* event */ DragEvent, scala.Unit]] = js.undefined
  var onDragEnd: js.UndefOr[js.Function1[/* event */ DragEvent, scala.Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* event */ DragEvent, scala.Unit]] = js.undefined
}

object DraggableControlProps {
  @scala.inline
  def apply(
    captureClick: js.UndefOr[scala.Boolean] = js.undefined,
    captureDoubleClick: js.UndefOr[scala.Boolean] = js.undefined,
    captureDrag: js.UndefOr[scala.Boolean] = js.undefined,
    captureScroll: js.UndefOr[scala.Boolean] = js.undefined,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    onDrag: js.Function1[/* event */ DragEvent, scala.Unit] = null,
    onDragEnd: js.Function1[/* event */ DragEvent, scala.Unit] = null,
    onDragStart: js.Function1[/* event */ DragEvent, scala.Unit] = null
  ): DraggableControlProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(captureClick)) __obj.updateDynamic("captureClick")(captureClick)
    if (!js.isUndefined(captureDoubleClick)) __obj.updateDynamic("captureDoubleClick")(captureDoubleClick)
    if (!js.isUndefined(captureDrag)) __obj.updateDynamic("captureDrag")(captureDrag)
    if (!js.isUndefined(captureScroll)) __obj.updateDynamic("captureScroll")(captureScroll)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    __obj.asInstanceOf[DraggableControlProps]
  }
}

