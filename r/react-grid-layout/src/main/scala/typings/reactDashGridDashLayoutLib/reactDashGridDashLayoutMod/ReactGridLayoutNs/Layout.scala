package typings
package reactDashGridDashLayoutLib.reactDashGridDashLayoutMod.ReactGridLayoutNs

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

