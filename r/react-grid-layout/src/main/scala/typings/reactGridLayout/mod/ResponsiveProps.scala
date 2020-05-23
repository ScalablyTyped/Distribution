package typings.reactGridLayout.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.reactGridLayout.anon.E
import typings.reactGridLayout.anon.H
import typings.reactGridLayout.reactGridLayoutStrings.horizontal
import typings.reactGridLayout.reactGridLayoutStrings.vertical
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveProps extends CoreProps {
  /**
    * `{name: pxVal}, e.g. {lg: 1200, md: 996, sm: 768, xs: 480}`
    *
    * Breakpoint names are arbitrary but must match in the cols and layouts objects.
    */
  var breakpoints: js.UndefOr[StringDictionary[Double]] = js.undefined
  /**
    * Number of cols. This is a breakpoint -> cols map, e.g. `{lg: 12, md: 10, ...}`.
    */
  var cols: js.UndefOr[StringDictionary[Double]] = js.undefined
  /**
    * Padding inside the container in px and formatt [x, y] or { breakpoint: [x, y] }.
    */
  var containerPadding: js.UndefOr[(js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]])] = js.undefined
  /**
    * layouts is an object mapping breakpoints to layouts.
    *
    * e.g. `{lg: Layout[], md: Layout[], ...}`
    */
  var layouts: js.UndefOr[Layouts] = js.undefined
  /**
    * Margin between items in px and formatt [x, y] or { breakpoint: [x, y] }.
    */
  var margin: js.UndefOr[(js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]])] = js.undefined
  /**
    * Calls back with breakpoint and new number pf cols.
    */
  var onBreakpointChange: js.UndefOr[js.Function2[/* newBreakpoint */ String, /* newCols */ Double, Unit]] = js.undefined
  /**
    * Callback so you can save the layout.
    */
  var onLayoutChange: js.UndefOr[
    js.Function2[/* currentLayout */ js.Array[Layout], /* allLayouts */ Layouts, Unit]
  ] = js.undefined
  /**
    * Callback when the width changes, so you can modify the layout as needed.
    */
  var onWidthChange: js.UndefOr[
    js.Function4[
      /* containerWidth */ Double, 
      /* margin */ js.Tuple2[Double, Double], 
      /* cols */ Double, 
      /* containerPadding */ js.Tuple2[Double, Double], 
      Unit
    ]
  ] = js.undefined
}

object ResponsiveProps {
  @scala.inline
  def apply(
    autoSize: js.UndefOr[Boolean] = js.undefined,
    breakpoints: StringDictionary[Double] = null,
    className: String = null,
    cols: StringDictionary[Double] = null,
    compactType: js.UndefOr[Null | vertical | horizontal] = js.undefined,
    containerPadding: (js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]]) = null,
    draggableCancel: String = null,
    draggableHandle: String = null,
    droppingItem: H = null,
    isDraggable: js.UndefOr[Boolean] = js.undefined,
    isDroppable: js.UndefOr[Boolean] = js.undefined,
    isResizable: js.UndefOr[Boolean] = js.undefined,
    layouts: Layouts = null,
    margin: (js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]]) = null,
    maxRows: js.UndefOr[Double] = js.undefined,
    onBreakpointChange: (/* newBreakpoint */ String, /* newCols */ Double) => Unit = null,
    onDrag: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onDragStart: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onDragStop: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onDrop: /* elemParams */ E => Unit = null,
    onLayoutChange: (/* currentLayout */ js.Array[Layout], /* allLayouts */ Layouts) => Unit = null,
    onResize: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onResizeStart: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onResizeStop: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onWidthChange: (/* containerWidth */ Double, /* margin */ js.Tuple2[Double, Double], /* cols */ Double, /* containerPadding */ js.Tuple2[Double, Double]) => Unit = null,
    preventCollision: js.UndefOr[Boolean] = js.undefined,
    rowHeight: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null,
    transformScale: js.UndefOr[Double] = js.undefined,
    useCSSTransforms: js.UndefOr[Boolean] = js.undefined,
    verticalCompact: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): ResponsiveProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSize)) __obj.updateDynamic("autoSize")(autoSize.get.asInstanceOf[js.Any])
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (!js.isUndefined(compactType)) __obj.updateDynamic("compactType")(compactType.asInstanceOf[js.Any])
    if (containerPadding != null) __obj.updateDynamic("containerPadding")(containerPadding.asInstanceOf[js.Any])
    if (draggableCancel != null) __obj.updateDynamic("draggableCancel")(draggableCancel.asInstanceOf[js.Any])
    if (draggableHandle != null) __obj.updateDynamic("draggableHandle")(draggableHandle.asInstanceOf[js.Any])
    if (droppingItem != null) __obj.updateDynamic("droppingItem")(droppingItem.asInstanceOf[js.Any])
    if (!js.isUndefined(isDraggable)) __obj.updateDynamic("isDraggable")(isDraggable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDroppable)) __obj.updateDynamic("isDroppable")(isDroppable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isResizable)) __obj.updateDynamic("isResizable")(isResizable.get.asInstanceOf[js.Any])
    if (layouts != null) __obj.updateDynamic("layouts")(layouts.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRows)) __obj.updateDynamic("maxRows")(maxRows.get.asInstanceOf[js.Any])
    if (onBreakpointChange != null) __obj.updateDynamic("onBreakpointChange")(js.Any.fromFunction2(onBreakpointChange))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction6(onDrag))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction6(onDragStart))
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(js.Any.fromFunction6(onDragStop))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onLayoutChange != null) __obj.updateDynamic("onLayoutChange")(js.Any.fromFunction2(onLayoutChange))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction6(onResize))
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(js.Any.fromFunction6(onResizeStart))
    if (onResizeStop != null) __obj.updateDynamic("onResizeStop")(js.Any.fromFunction6(onResizeStop))
    if (onWidthChange != null) __obj.updateDynamic("onWidthChange")(js.Any.fromFunction4(onWidthChange))
    if (!js.isUndefined(preventCollision)) __obj.updateDynamic("preventCollision")(preventCollision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowHeight)) __obj.updateDynamic("rowHeight")(rowHeight.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(transformScale)) __obj.updateDynamic("transformScale")(transformScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useCSSTransforms)) __obj.updateDynamic("useCSSTransforms")(useCSSTransforms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalCompact)) __obj.updateDynamic("verticalCompact")(verticalCompact.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveProps]
  }
}

