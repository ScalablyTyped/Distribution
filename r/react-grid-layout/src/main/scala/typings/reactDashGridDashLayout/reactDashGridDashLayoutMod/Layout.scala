package typings.reactDashGridDashLayout.reactDashGridDashLayoutMod

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
  var i: js.UndefOr[String] = js.undefined
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
    w: Double,
    x: Double,
    y: Double,
    i: String = null,
    isDraggable: js.UndefOr[Boolean] = js.undefined,
    isResizable: js.UndefOr[Boolean] = js.undefined,
    maxH: Int | Double = null,
    maxW: Int | Double = null,
    minH: Int | Double = null,
    minW: Int | Double = null,
    moved: js.UndefOr[Boolean] = js.undefined,
    static: js.UndefOr[Boolean] = js.undefined
  ): Layout = {
    val __obj = js.Dynamic.literal(h = h, w = w, x = x, y = y)
    if (i != null) __obj.updateDynamic("i")(i)
    if (!js.isUndefined(isDraggable)) __obj.updateDynamic("isDraggable")(isDraggable)
    if (!js.isUndefined(isResizable)) __obj.updateDynamic("isResizable")(isResizable)
    if (maxH != null) __obj.updateDynamic("maxH")(maxH.asInstanceOf[js.Any])
    if (maxW != null) __obj.updateDynamic("maxW")(maxW.asInstanceOf[js.Any])
    if (minH != null) __obj.updateDynamic("minH")(minH.asInstanceOf[js.Any])
    if (minW != null) __obj.updateDynamic("minW")(minW.asInstanceOf[js.Any])
    if (!js.isUndefined(moved)) __obj.updateDynamic("moved")(moved)
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static)
    __obj.asInstanceOf[Layout]
  }
}

