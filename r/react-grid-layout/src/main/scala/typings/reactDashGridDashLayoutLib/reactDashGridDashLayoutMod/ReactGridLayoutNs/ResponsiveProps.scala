package typings
package reactDashGridDashLayoutLib.reactDashGridDashLayoutMod.ReactGridLayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveProps extends CoreProps {
  /**
    * `{name: pxVal}, e.g. {lg: 1200, md: 996, sm: 768, xs: 480}`
    *
    * Breakpoint names are arbitrary but must match in the cols and layouts objects.
    */
  var breakpoints: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
  /**
    * Number of cols. This is a breakpoint -> cols map, e.g. `{lg: 12, md: 10, ...}`.
    */
  var cols: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
  /**
    * layouts is an object mapping breakpoints to layouts.
    *
    * e.g. `{lg: Layout[], md: Layout[], ...}`
    */
  var layouts: js.UndefOr[Layouts] = js.undefined
  /**
    * Calls back with breakpoint and new number pf cols.
    */
  var onBreakpointChange: js.UndefOr[
    js.Function2[/* newBreakpoint */ java.lang.String, /* newCols */ scala.Double, scala.Unit]
  ] = js.undefined
  /**
    * Callback so you can save the layout.
    */
  var onLayoutChange: js.UndefOr[
    js.Function2[/* currentLayout */ js.Array[Layout], /* allLayouts */ Layouts, scala.Unit]
  ] = js.undefined
  /**
    * Callback when the width changes, so you can modify the layout as needed.
    */
  var onWidthChange: js.UndefOr[
    js.Function4[
      /* containerWidth */ scala.Double, 
      /* margin */ js.Tuple2[scala.Double, scala.Double], 
      /* cols */ scala.Double, 
      /* containerPadding */ js.Tuple2[scala.Double, scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
}

object ResponsiveProps {
  @scala.inline
  def apply(
    autoSize: js.UndefOr[scala.Boolean] = js.undefined,
    breakpoints: org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    className: java.lang.String = null,
    cols: org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    compactType: reactDashGridDashLayoutLib.reactDashGridDashLayoutLibStrings.vertical | reactDashGridDashLayoutLib.reactDashGridDashLayoutLibStrings.horizontal = null,
    containerPadding: js.Tuple2[scala.Double, scala.Double] = null,
    draggableCancel: java.lang.String = null,
    draggableHandle: java.lang.String = null,
    isDraggable: js.UndefOr[scala.Boolean] = js.undefined,
    isRearrangeable: js.UndefOr[scala.Boolean] = js.undefined,
    isResizable: js.UndefOr[scala.Boolean] = js.undefined,
    layouts: Layouts = null,
    margin: js.Tuple2[scala.Double, scala.Double] = null,
    maxRows: scala.Int | scala.Double = null,
    onBreakpointChange: (/* newBreakpoint */ java.lang.String, /* newCols */ scala.Double) => scala.Unit = null,
    onDrag: ItemCallback = null,
    onDragStart: ItemCallback = null,
    onDragStop: ItemCallback = null,
    onLayoutChange: (/* currentLayout */ js.Array[Layout], /* allLayouts */ Layouts) => scala.Unit = null,
    onResize: ItemCallback = null,
    onResizeStart: ItemCallback = null,
    onResizeStop: ItemCallback = null,
    onWidthChange: (/* containerWidth */ scala.Double, /* margin */ js.Tuple2[scala.Double, scala.Double], /* cols */ scala.Double, /* containerPadding */ js.Tuple2[scala.Double, scala.Double]) => scala.Unit = null,
    preventCollision: js.UndefOr[scala.Boolean] = js.undefined,
    rowHeight: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    useCSSTransforms: js.UndefOr[scala.Boolean] = js.undefined,
    verticalCompact: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): ResponsiveProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSize)) __obj.updateDynamic("autoSize")(autoSize)
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cols != null) __obj.updateDynamic("cols")(cols)
    if (compactType != null) __obj.updateDynamic("compactType")(compactType.asInstanceOf[js.Any])
    if (containerPadding != null) __obj.updateDynamic("containerPadding")(containerPadding)
    if (draggableCancel != null) __obj.updateDynamic("draggableCancel")(draggableCancel)
    if (draggableHandle != null) __obj.updateDynamic("draggableHandle")(draggableHandle)
    if (!js.isUndefined(isDraggable)) __obj.updateDynamic("isDraggable")(isDraggable)
    if (!js.isUndefined(isRearrangeable)) __obj.updateDynamic("isRearrangeable")(isRearrangeable)
    if (!js.isUndefined(isResizable)) __obj.updateDynamic("isResizable")(isResizable)
    if (layouts != null) __obj.updateDynamic("layouts")(layouts)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (onBreakpointChange != null) __obj.updateDynamic("onBreakpointChange")(js.Any.fromFunction2(onBreakpointChange))
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(onDragStop)
    if (onLayoutChange != null) __obj.updateDynamic("onLayoutChange")(js.Any.fromFunction2(onLayoutChange))
    if (onResize != null) __obj.updateDynamic("onResize")(onResize)
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(onResizeStart)
    if (onResizeStop != null) __obj.updateDynamic("onResizeStop")(onResizeStop)
    if (onWidthChange != null) __obj.updateDynamic("onWidthChange")(js.Any.fromFunction4(onWidthChange))
    if (!js.isUndefined(preventCollision)) __obj.updateDynamic("preventCollision")(preventCollision)
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(useCSSTransforms)) __obj.updateDynamic("useCSSTransforms")(useCSSTransforms)
    if (!js.isUndefined(verticalCompact)) __obj.updateDynamic("verticalCompact")(verticalCompact)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveProps]
  }
}

