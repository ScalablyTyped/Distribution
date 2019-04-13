package typings
package reactDashGridDashLayoutLib.reactDashGridDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout extends js.Object {
  /**
    * Height in grid units.
    */
  var h: scala.Double
  /**
    * A string corresponding to the component key.
    * Uses the index of components instead if not provided.
    */
  var i: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If false, will not be draggable. Overrides `static`.
    */
  var isDraggable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If false, will not be resizable. Overrides `static`.
    */
  var isResizable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Maximum height in grid units.
    */
  var maxH: js.UndefOr[scala.Double] = js.undefined
  /**
    * Maximum width in grid units.
    */
  var maxW: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum height in grid units.
    */
  var minH: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum width in grid units.
    */
  var minW: js.UndefOr[scala.Double] = js.undefined
  /**
    * set by DragEvents (onDragStart, onDrag, onDragStop) and ResizeEvents (onResizeStart, onResize, onResizeStop)
    */
  var moved: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, equal to `isDraggable: false` and `isResizable: false`.
    */
  var static: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Width in grid units.
    */
  var w: scala.Double
  /**
    * X position in grid units.
    */
  var x: scala.Double
  /**
    * Y position in grid units.
    */
  var y: scala.Double
}

object Layout {
  @scala.inline
  def apply(
    h: scala.Double,
    w: scala.Double,
    x: scala.Double,
    y: scala.Double,
    i: java.lang.String = null,
    isDraggable: js.UndefOr[scala.Boolean] = js.undefined,
    isResizable: js.UndefOr[scala.Boolean] = js.undefined,
    maxH: scala.Int | scala.Double = null,
    maxW: scala.Int | scala.Double = null,
    minH: scala.Int | scala.Double = null,
    minW: scala.Int | scala.Double = null,
    moved: js.UndefOr[scala.Boolean] = js.undefined,
    static: js.UndefOr[scala.Boolean] = js.undefined
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

