package typings
package reactDashGridDashLayoutLib.reactDashGridDashLayoutMod.ReactGridLayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CoreProps extends js.Object {
  /**
           * If true, the container height swells and contracts to fit contents.
           */
  var autoSize: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The classname to add to the root element.
           */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Compaction type.
           */
  var compactType: js.UndefOr[
    reactDashGridDashLayoutLib.reactDashGridDashLayoutLibStrings.vertical | reactDashGridDashLayoutLib.reactDashGridDashLayoutLibStrings.horizontal | scala.Null
  ] = js.undefined
  /**
           * Padding inside the container `[x, y]` in px.
           */
  var containerPadding: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  /**
           * A CSS selector for tags that will not be draggable.
           *
           * For example: `draggableCancel: '.MyNonDraggableAreaClassName'`
           *
           * If you forget the leading. it will not work.
           */
  var draggableCancel: js.UndefOr[java.lang.String] = js.undefined
  /**
           * A CSS selector for tags that will act as the draggable handle.
           *
           * For example: `draggableHandle: '.MyDragHandleClassName'`
           *
           * If you forget the leading . it will not work.
           */
  var draggableHandle: js.UndefOr[java.lang.String] = js.undefined
  /**
           * If set to false it will disable dragging on all children.
           */
  var isDraggable: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Enable or disable grid rearrangement when dragging/resizing an element.
           */
  var isRearrangeable: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * If set to false it will disable resizing on all children.
           */
  var isResizable: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Margin between items `[x, y]` in px.
           */
  var margin: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  /**
           * Default Infinity, but you can specify a max here if you like.
           * Note that this isn't fully fleshed out and won't error if you specify a layout that
           * extends beyond the row capacity. It will, however, not allow users to drag/resize
           * an item past the barrier. They can push items beyond the barrier, though.
           * Intentionally not documented for this reason.
           */
  var maxRows: js.UndefOr[scala.Double] = js.undefined
  /**
           * Calls on each drag movement.
           */
  var onDrag: js.UndefOr[ItemCallback] = js.undefined
  /**
           * Calls when drag starts.
           */
  var onDragStart: js.UndefOr[ItemCallback] = js.undefined
  /**
           * Calls when drag is complete.
           */
  var onDragStop: js.UndefOr[ItemCallback] = js.undefined
  /**
           * Calls when resize movement happens.
           */
  var onResize: js.UndefOr[ItemCallback] = js.undefined
  /**
           * Calls when resize starts.
           */
  var onResizeStart: js.UndefOr[ItemCallback] = js.undefined
  /**
           * Calls when resize is complete.
           */
  var onResizeStop: js.UndefOr[ItemCallback] = js.undefined
  /**
           * If true, grid items won't change position when being dragged over.
           */
  var preventCollision: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Rows have a static height, but you can change this based on breakpoints if you like.
           */
  var rowHeight: js.UndefOr[scala.Double] = js.undefined
  /**
           * Inline-style object to pass to the root element.
           */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
           * Uses CSS3 `translate()` instead of position top/left.
           * This makes about 6x faster paint performance.
           */
  var useCSSTransforms: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * If true, the layout will compact vertically.
           */
  var verticalCompact: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * This allows setting the initial width on the server side.
           * This is required unless using the HOC <WidthProvider> or similar.
           */
  var width: js.UndefOr[scala.Double] = js.undefined
}

