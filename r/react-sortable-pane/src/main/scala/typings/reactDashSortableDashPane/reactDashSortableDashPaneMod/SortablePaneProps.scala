package typings.reactDashSortableDashPane.reactDashSortableDashPaneMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod.ReactElement
import typings.react.reactMod.TouchEvent
import typings.reactDashMotion.reactDashMotionMod.SpringHelperConfig
import typings.reactDashSortableDashPane.reactDashSortableDashPaneStrings.horizontal
import typings.reactDashSortableDashPane.reactDashSortableDashPaneStrings.vertical
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortablePaneProps extends js.Object {
  var children: js.Array[ReactElement]
  var className: js.UndefOr[String] = js.undefined
  var defaultOrder: js.UndefOr[js.Array[String]] = js.undefined
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
  var disableEffect: js.UndefOr[Boolean] = js.undefined
  var dragHandleClassName: js.UndefOr[String] = js.undefined
  var isSortable: js.UndefOr[Boolean] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  var onDragStart: js.UndefOr[
    js.Function3[
      /* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], 
      /* key */ PaneKey, 
      /* elementRef */ HTMLElement, 
      Unit
    ]
  ] = js.undefined
  var onDragStop: js.UndefOr[
    js.Function4[
      /* e */ typings.std.MouseEvent | typings.std.TouchEvent, 
      /* key */ PaneKey, 
      /* elementRef */ HTMLElement, 
      /* order */ js.Array[String], 
      Unit
    ]
  ] = js.undefined
  var onOrderChange: js.UndefOr[js.Function1[/* order */ js.Array[String], Unit]] = js.undefined
  var onResize: js.UndefOr[
    js.Function5[
      /* e */ typings.std.MouseEvent | typings.std.TouchEvent, 
      /* key */ PaneKey, 
      /* dir */ PaneResizeDirection, 
      /* elementRef */ HTMLElement, 
      /* delta */ PaneSize, 
      Unit
    ]
  ] = js.undefined
  var onResizeStart: js.UndefOr[
    js.Function3[
      /* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], 
      /* key */ PaneKey, 
      /* dir */ PaneResizeDirection, 
      Unit
    ]
  ] = js.undefined
  var onResizeStop: js.UndefOr[
    js.Function5[
      /* e */ typings.std.MouseEvent | typings.std.TouchEvent, 
      /* key */ PaneKey, 
      /* dir */ PaneResizeDirection, 
      /* elementRef */ HTMLElement, 
      /* delta */ PaneSize, 
      Unit
    ]
  ] = js.undefined
  var order: js.UndefOr[js.Array[String]] = js.undefined
  var springConfig: js.UndefOr[SpringHelperConfig] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SortablePaneProps {
  @scala.inline
  def apply(
    children: js.Array[ReactElement],
    className: String = null,
    defaultOrder: js.Array[String] = null,
    direction: horizontal | vertical = null,
    disableEffect: js.UndefOr[Boolean] = js.undefined,
    dragHandleClassName: String = null,
    isSortable: js.UndefOr[Boolean] = js.undefined,
    margin: Int | Double = null,
    onDragStart: (/* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], /* key */ PaneKey, /* elementRef */ HTMLElement) => Unit = null,
    onDragStop: (/* e */ typings.std.MouseEvent | typings.std.TouchEvent, /* key */ PaneKey, /* elementRef */ HTMLElement, /* order */ js.Array[String]) => Unit = null,
    onOrderChange: /* order */ js.Array[String] => Unit = null,
    onResize: (/* e */ typings.std.MouseEvent | typings.std.TouchEvent, /* key */ PaneKey, /* dir */ PaneResizeDirection, /* elementRef */ HTMLElement, /* delta */ PaneSize) => Unit = null,
    onResizeStart: (/* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], /* key */ PaneKey, /* dir */ PaneResizeDirection) => Unit = null,
    onResizeStop: (/* e */ typings.std.MouseEvent | typings.std.TouchEvent, /* key */ PaneKey, /* dir */ PaneResizeDirection, /* elementRef */ HTMLElement, /* delta */ PaneSize) => Unit = null,
    order: js.Array[String] = null,
    springConfig: SpringHelperConfig = null,
    style: CSSProperties = null
  ): SortablePaneProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultOrder != null) __obj.updateDynamic("defaultOrder")(defaultOrder.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEffect)) __obj.updateDynamic("disableEffect")(disableEffect.asInstanceOf[js.Any])
    if (dragHandleClassName != null) __obj.updateDynamic("dragHandleClassName")(dragHandleClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(isSortable)) __obj.updateDynamic("isSortable")(isSortable.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction3(onDragStart))
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(js.Any.fromFunction4(onDragStop))
    if (onOrderChange != null) __obj.updateDynamic("onOrderChange")(js.Any.fromFunction1(onOrderChange))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction5(onResize))
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(js.Any.fromFunction3(onResizeStart))
    if (onResizeStop != null) __obj.updateDynamic("onResizeStop")(js.Any.fromFunction5(onResizeStop))
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (springConfig != null) __obj.updateDynamic("springConfig")(springConfig.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortablePaneProps]
  }
}

