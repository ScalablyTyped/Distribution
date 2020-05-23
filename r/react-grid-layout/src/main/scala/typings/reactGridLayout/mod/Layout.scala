package typings.reactGridLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout extends js.Object {
  /**
    * Height in grid units.
    */
  var h: Double
  /**
    * A string corresponding to the component key.
    * Uses the index of components instead if not provided.
    */
  var i: String
  /**
    * If false, will not be draggable. Overrides `static`.
    */
  var isDraggable: js.UndefOr[Boolean] = js.undefined
  /**
    * If false, will not be resizable. Overrides `static`.
    */
  var isResizable: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum height in grid units.
    */
  var maxH: js.UndefOr[Double] = js.undefined
  /**
    * Maximum width in grid units.
    */
  var maxW: js.UndefOr[Double] = js.undefined
  /**
    * Minimum height in grid units.
    */
  var minH: js.UndefOr[Double] = js.undefined
  /**
    * Minimum width in grid units.
    */
  var minW: js.UndefOr[Double] = js.undefined
  /**
    * set by DragEvents (onDragStart, onDrag, onDragStop) and ResizeEvents (onResizeStart, onResize, onResizeStop)
    */
  var moved: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, equal to `isDraggable: false` and `isResizable: false`.
    */
  var static: js.UndefOr[Boolean] = js.undefined
  /**
    * Width in grid units.
    */
  var w: Double
  /**
    * X position in grid units.
    */
  var x: Double
  /**
    * Y position in grid units.
    */
  var y: Double
}

object Layout {
  @scala.inline
  def apply(
    h: Double,
    i: String,
    w: Double,
    x: Double,
    y: Double,
    isDraggable: js.UndefOr[Boolean] = js.undefined,
    isResizable: js.UndefOr[Boolean] = js.undefined,
    maxH: js.UndefOr[Double] = js.undefined,
    maxW: js.UndefOr[Double] = js.undefined,
    minH: js.UndefOr[Double] = js.undefined,
    minW: js.UndefOr[Double] = js.undefined,
    moved: js.UndefOr[Boolean] = js.undefined,
    static: js.UndefOr[Boolean] = js.undefined
  ): Layout = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(isDraggable)) __obj.updateDynamic("isDraggable")(isDraggable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isResizable)) __obj.updateDynamic("isResizable")(isResizable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxH)) __obj.updateDynamic("maxH")(maxH.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxW)) __obj.updateDynamic("maxW")(maxW.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minH)) __obj.updateDynamic("minH")(minH.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minW)) __obj.updateDynamic("minW")(minW.get.asInstanceOf[js.Any])
    if (!js.isUndefined(moved)) __obj.updateDynamic("moved")(moved.get.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
}

