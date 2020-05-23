package typings.reactDnd.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragPreviewOptions extends js.Object {
  /**
    * Optional. A number between 0 and 1. By default, 0.5. Specifies how the offset relative to the drag source node is translated
    * into the horizontal offset of the drag preview when their sizes don't match. 0 means “dock the preview to the left”, 0.5 means
    * “interpolate linearly” and 1 means “dock the preview to the right”.
    */
  var anchorX: js.UndefOr[Double] = js.undefined
  /**
    * Optional. A number between 0 and 1. By default, 0.5. Specifies how the offset relative to the drag source node is translated into
    * the vertical offset of the drag preview when their sizes don't match. 0 means “dock the preview to the top, 0.5 means “interpolate
    * linearly” and 1 means “dock the preview to the bottom.
    */
  var anchorY: js.UndefOr[Double] = js.undefined
  /**
    * Optional. A boolean. By default, false. If true, the component will learn that it is being dragged immediately as the drag
    * starts instead of the next tick. This means that the screenshotting would occur with monitor.isDragging() already being true,
    * and if you apply any styling like a decreased opacity to the dragged element, this styling will also be reflected on the
    * screenshot. This is rarely desirable, so false is a sensible default. However, you might want to set it to true in rare cases,
    * such as if you want to make the custom drag layers work in IE and you need to hide the original element without resorting to
    * an empty drag preview which IE doesn't support.
    */
  var captureDraggingState: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional. A number or null if not needed. By default, null. Specifies the vertical offset between the cursor and the drag preview
    * element. If offsetX has a value, anchorX won't be used.
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  /**
    *  Optional. A number or null if not needed. By default, null. Specifies the vertical offset between the cursor and the drag
    *  preview element. If offsetY has a value, anchorY won't be used.
    */
  var offsetY: js.UndefOr[Double] = js.undefined
}

object DragPreviewOptions {
  @scala.inline
  def apply(
    anchorX: js.UndefOr[Double] = js.undefined,
    anchorY: js.UndefOr[Double] = js.undefined,
    captureDraggingState: js.UndefOr[Boolean] = js.undefined,
    offsetX: js.UndefOr[Double] = js.undefined,
    offsetY: js.UndefOr[Double] = js.undefined
  ): DragPreviewOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anchorX)) __obj.updateDynamic("anchorX")(anchorX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(anchorY)) __obj.updateDynamic("anchorY")(anchorY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDraggingState)) __obj.updateDynamic("captureDraggingState")(captureDraggingState.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetX)) __obj.updateDynamic("offsetX")(offsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetY)) __obj.updateDynamic("offsetY")(offsetY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragPreviewOptions]
  }
}

