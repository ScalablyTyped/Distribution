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

trait ReactGridLayoutProps extends CoreProps {
  /**
    * Number of columns in this layout.
    */
  var cols: js.UndefOr[Double] = js.undefined
  /**
    * Padding inside the container `[x, y]` in px.
    */
  var containerPadding: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  /**
    * Layout is an array of object with the format:
    *
    * `{x: number, y: number, w: number, h: number}`
    *
    * The index into the layout must match the key used on each item component.
    * If you choose to use custom keys, you can specify that key in the layout
    * array objects like so:
    *
    * `{i: string, x: number, y: number, w: number, h: number}`
    *
    * If not provided, use data-grid props on children.
    */
  var layout: js.UndefOr[js.Array[Layout]] = js.undefined
  /**
    * Margin between items `[x, y]` in px.
    */
  var margin: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  /**
    * Callback so you can save the layout.
    * Calls back with (currentLayout) after every drag or resize stop.
    */
  var onLayoutChange: js.UndefOr[js.Function1[/* layout */ js.Array[Layout], Unit]] = js.undefined
}

object ReactGridLayoutProps {
  @scala.inline
  def apply(
    autoSize: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    cols: Int | Double = null,
    compactType: vertical | horizontal = null,
    containerPadding: js.Tuple2[Double, Double] = null,
    draggableCancel: String = null,
    draggableHandle: String = null,
    droppingItem: Anon_H = null,
    isDraggable: js.UndefOr[Boolean] = js.undefined,
    isDroppable: js.UndefOr[Boolean] = js.undefined,
    isResizable: js.UndefOr[Boolean] = js.undefined,
    layout: js.Array[Layout] = null,
    margin: js.Tuple2[Double, Double] = null,
    maxRows: Int | Double = null,
    onDrag: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onDragStart: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onDragStop: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onDrop: /* elemParams */ Anon_E => Unit = null,
    onLayoutChange: /* layout */ js.Array[Layout] => Unit = null,
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
  ): ReactGridLayoutProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSize)) __obj.updateDynamic("autoSize")(autoSize.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (compactType != null) __obj.updateDynamic("compactType")(compactType.asInstanceOf[js.Any])
    if (containerPadding != null) __obj.updateDynamic("containerPadding")(containerPadding.asInstanceOf[js.Any])
    if (draggableCancel != null) __obj.updateDynamic("draggableCancel")(draggableCancel.asInstanceOf[js.Any])
    if (draggableHandle != null) __obj.updateDynamic("draggableHandle")(draggableHandle.asInstanceOf[js.Any])
    if (droppingItem != null) __obj.updateDynamic("droppingItem")(droppingItem.asInstanceOf[js.Any])
    if (!js.isUndefined(isDraggable)) __obj.updateDynamic("isDraggable")(isDraggable.asInstanceOf[js.Any])
    if (!js.isUndefined(isDroppable)) __obj.updateDynamic("isDroppable")(isDroppable.asInstanceOf[js.Any])
    if (!js.isUndefined(isResizable)) __obj.updateDynamic("isResizable")(isResizable.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction6(onDrag))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction6(onDragStart))
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(js.Any.fromFunction6(onDragStop))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onLayoutChange != null) __obj.updateDynamic("onLayoutChange")(js.Any.fromFunction1(onLayoutChange))
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
    __obj.asInstanceOf[ReactGridLayoutProps]
  }
}

