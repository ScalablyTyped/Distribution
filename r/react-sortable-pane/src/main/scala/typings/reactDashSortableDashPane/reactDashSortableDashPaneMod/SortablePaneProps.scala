package typings.reactDashSortableDashPane.reactDashSortableDashPaneMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.TouchEvent
import typings.reactDashSortableDashPane.reactDashSortableDashPaneStrings.horizontal
import typings.reactDashSortableDashPane.reactDashSortableDashPaneStrings.vertical
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortablePaneProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
  var disableEffect: js.UndefOr[Boolean] = js.undefined
  var dragHandleClassName: js.UndefOr[String] = js.undefined
  var grid: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var isSortable: js.UndefOr[Boolean] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  var onDragStart: js.UndefOr[
    js.Function3[
      /* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], 
      /* id */ PaneId, 
      /* panes */ js.Array[PaneProperty], 
      Unit
    ]
  ] = js.undefined
  var onDragStop: js.UndefOr[
    js.Function3[
      /* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], 
      /* id */ PaneId, 
      /* panes */ js.Array[PaneProperty], 
      Unit
    ]
  ] = js.undefined
  var onOrderChange: js.UndefOr[
    js.Function2[/* oldPanes */ js.Array[PaneProperty], /* newPanes */ js.Array[PaneProperty], Unit]
  ] = js.undefined
  var onResize: js.UndefOr[
    js.Function4[
      /* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], 
      /* id */ PaneId, 
      /* panes */ js.Array[PaneProperty], 
      /* data */ PaneResizeData, 
      Unit
    ]
  ] = js.undefined
  var onResizeStart: js.UndefOr[
    js.Function3[
      /* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], 
      /* id */ PaneId, 
      /* panes */ js.Array[PaneProperty], 
      Unit
    ]
  ] = js.undefined
  var onResizeStop: js.UndefOr[
    js.Function4[
      /* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], 
      /* id */ PaneId, 
      /* panes */ js.Array[PaneProperty], 
      /* data */ PaneResizeData, 
      Unit
    ]
  ] = js.undefined
  var style: js.UndefOr[HTMLAttributes[HTMLElement]] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object SortablePaneProps {
  @scala.inline
  def apply(
    className: String = null,
    direction: horizontal | vertical = null,
    disableEffect: js.UndefOr[Boolean] = js.undefined,
    dragHandleClassName: String = null,
    grid: js.Tuple2[Double, Double] = null,
    isSortable: js.UndefOr[Boolean] = js.undefined,
    margin: Int | Double = null,
    onDragStart: (/* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], /* id */ PaneId, /* panes */ js.Array[PaneProperty]) => Unit = null,
    onDragStop: (/* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], /* id */ PaneId, /* panes */ js.Array[PaneProperty]) => Unit = null,
    onOrderChange: (/* oldPanes */ js.Array[PaneProperty], /* newPanes */ js.Array[PaneProperty]) => Unit = null,
    onResize: (/* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], /* id */ PaneId, /* panes */ js.Array[PaneProperty], /* data */ PaneResizeData) => Unit = null,
    onResizeStart: (/* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], /* id */ PaneId, /* panes */ js.Array[PaneProperty]) => Unit = null,
    onResizeStop: (/* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], /* id */ PaneId, /* panes */ js.Array[PaneProperty], /* data */ PaneResizeData) => Unit = null,
    style: HTMLAttributes[HTMLElement] = null,
    zIndex: Int | Double = null
  ): SortablePaneProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEffect)) __obj.updateDynamic("disableEffect")(disableEffect)
    if (dragHandleClassName != null) __obj.updateDynamic("dragHandleClassName")(dragHandleClassName)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (!js.isUndefined(isSortable)) __obj.updateDynamic("isSortable")(isSortable)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction3(onDragStart))
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(js.Any.fromFunction3(onDragStop))
    if (onOrderChange != null) __obj.updateDynamic("onOrderChange")(js.Any.fromFunction2(onOrderChange))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction4(onResize))
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(js.Any.fromFunction3(onResizeStart))
    if (onResizeStop != null) __obj.updateDynamic("onResizeStop")(js.Any.fromFunction4(onResizeStop))
    if (style != null) __obj.updateDynamic("style")(style)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortablePaneProps]
  }
}

