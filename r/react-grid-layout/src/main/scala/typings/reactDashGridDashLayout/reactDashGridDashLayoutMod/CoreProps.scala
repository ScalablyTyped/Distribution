package typings.reactDashGridDashLayout.reactDashGridDashLayoutMod

import typings.react.reactMod.CSSProperties
import typings.reactDashGridDashLayout.Anon_E
import typings.reactDashGridDashLayout.Anon_H
import typings.reactDashGridDashLayout.reactDashGridDashLayoutStrings.horizontal
import typings.reactDashGridDashLayout.reactDashGridDashLayoutStrings.vertical
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoreProps extends js.Object {
  /**
    * If true, the container height swells and contracts to fit contents.
    */
  var autoSize: js.UndefOr[Boolean] = js.undefined
  /**
    * The classname to add to the root element.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Compaction type.
    */
  var compactType: js.UndefOr[vertical | horizontal | Null] = js.undefined
  /**
    * A CSS selector for tags that will not be draggable.
    *
    * For example: `draggableCancel: '.MyNonDraggableAreaClassName'`
    *
    * If you forget the leading. it will not work.
    */
  var draggableCancel: js.UndefOr[String] = js.undefined
  /**
    * A CSS selector for tags that will act as the draggable handle.
    *
    * For example: `draggableHandle: '.MyDragHandleClassName'`
    *
    * If you forget the leading . it will not work.
    */
  var draggableHandle: js.UndefOr[String] = js.undefined
  /**
    * Configuration of a dropping element. Dropping element is a "virtual" element
    * which appears when you drag over some element from outside.
    */
  var droppingItem: js.UndefOr[Anon_H] = js.undefined
  /**
    * If set to false it will disable dragging on all children.
    */
  var isDraggable: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to false it will not call `onDrop()` callback.
    */
  var isDroppable: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to false it will disable resizing on all children.
    */
  var isResizable: js.UndefOr[Boolean] = js.undefined
  /**
    * Default Infinity, but you can specify a max here if you like.
    * Note that this isn't fully fleshed out and won't error if you specify a layout that
    * extends beyond the row capacity. It will, however, not allow users to drag/resize
    * an item past the barrier. They can push items beyond the barrier, though.
    * Intentionally not documented for this reason.
    */
  var maxRows: js.UndefOr[Double] = js.undefined
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
    * Calls when some element has been dropped
    */
  var onDrop: js.UndefOr[js.Function1[/* elemParams */ Anon_E, Unit]] = js.undefined
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
  var preventCollision: js.UndefOr[Boolean] = js.undefined
  /**
    * Rows have a static height, but you can change this based on breakpoints if you like.
    */
  var rowHeight: js.UndefOr[Double] = js.undefined
  /**
    * Inline-style object to pass to the root element.
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Scale coefficient for CSS3 `transform: scale()`
    */
  var transformScale: js.UndefOr[Double] = js.undefined
  /**
    * Uses CSS3 `translate()` instead of position top/left.
    * This makes about 6x faster paint performance.
    */
  var useCSSTransforms: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the layout will compact vertically.
    */
  var verticalCompact: js.UndefOr[Boolean] = js.undefined
  /**
    * This allows setting the initial width on the server side.
    * This is required unless using the HOC <WidthProvider> or similar.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CoreProps {
  @scala.inline
  def apply(
    autoSize: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    compactType: vertical | horizontal = null,
    draggableCancel: String = null,
    draggableHandle: String = null,
    droppingItem: Anon_H = null,
    isDraggable: js.UndefOr[Boolean] = js.undefined,
    isDroppable: js.UndefOr[Boolean] = js.undefined,
    isResizable: js.UndefOr[Boolean] = js.undefined,
    maxRows: Int | Double = null,
    onDrag: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onDragStart: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onDragStop: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onDrop: /* elemParams */ Anon_E => Unit = null,
    onResize: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onResizeStart: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onResizeStop: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    preventCollision: js.UndefOr[Boolean] = js.undefined,
    rowHeight: Int | Double = null,
    style: CSSProperties = null,
    transformScale: Int | Double = null,
    useCSSTransforms: js.UndefOr[Boolean] = js.undefined,
    verticalCompact: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): CoreProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSize)) __obj.updateDynamic("autoSize")(autoSize.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (compactType != null) __obj.updateDynamic("compactType")(compactType.asInstanceOf[js.Any])
    if (draggableCancel != null) __obj.updateDynamic("draggableCancel")(draggableCancel.asInstanceOf[js.Any])
    if (draggableHandle != null) __obj.updateDynamic("draggableHandle")(draggableHandle.asInstanceOf[js.Any])
    if (droppingItem != null) __obj.updateDynamic("droppingItem")(droppingItem.asInstanceOf[js.Any])
    if (!js.isUndefined(isDraggable)) __obj.updateDynamic("isDraggable")(isDraggable.asInstanceOf[js.Any])
    if (!js.isUndefined(isDroppable)) __obj.updateDynamic("isDroppable")(isDroppable.asInstanceOf[js.Any])
    if (!js.isUndefined(isResizable)) __obj.updateDynamic("isResizable")(isResizable.asInstanceOf[js.Any])
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction6(onDrag))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction6(onDragStart))
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(js.Any.fromFunction6(onDragStop))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction6(onResize))
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(js.Any.fromFunction6(onResizeStart))
    if (onResizeStop != null) __obj.updateDynamic("onResizeStop")(js.Any.fromFunction6(onResizeStop))
    if (!js.isUndefined(preventCollision)) __obj.updateDynamic("preventCollision")(preventCollision.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transformScale != null) __obj.updateDynamic("transformScale")(transformScale.asInstanceOf[js.Any])
    if (!js.isUndefined(useCSSTransforms)) __obj.updateDynamic("useCSSTransforms")(useCSSTransforms.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalCompact)) __obj.updateDynamic("verticalCompact")(verticalCompact.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreProps]
  }
}

