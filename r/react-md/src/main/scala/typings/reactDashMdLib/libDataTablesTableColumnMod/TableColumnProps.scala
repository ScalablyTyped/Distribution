package typings
package reactDashMdLib.libDataTablesTableColumnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableColumnProps
  extends reactDashMdLib.libMod.Props
     with reactDashMdLib.libTooltipsInjectTooltipMod.InjectedTooltipProps {
  var adjusted: js.UndefOr[scala.Boolean] = js.undefined
  var cellIndex: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var colSpan: js.UndefOr[scala.Double] = js.undefined
  var fixedClassName: js.UndefOr[java.lang.String] = js.undefined
  var fixedStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var grow: js.UndefOr[scala.Boolean] = js.undefined
  var header: js.UndefOr[scala.Boolean] = js.undefined
  var numeric: js.UndefOr[scala.Boolean] = js.undefined
  var plain: js.UndefOr[scala.Boolean] = js.undefined
  var rowSpan: js.UndefOr[scala.Double] = js.undefined
  var scope: js.UndefOr[
    reactDashMdLib.reactDashMdLibStrings.row | reactDashMdLib.reactDashMdLibStrings.col
  ] = js.undefined
  var selectColumnHeader: js.UndefOr[scala.Boolean] = js.undefined
  var sortIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var sortIconBefore: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated
    */
  var sortIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var sortIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var sorted: js.UndefOr[scala.Boolean] = js.undefined
}

object TableColumnProps {
  @scala.inline
  def apply(
    adjusted: js.UndefOr[scala.Boolean] = js.undefined,
    cellIndex: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    colSpan: scala.Int | scala.Double = null,
    fixedClassName: java.lang.String = null,
    fixedStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    grow: js.UndefOr[scala.Boolean] = js.undefined,
    header: js.UndefOr[scala.Boolean] = js.undefined,
    numeric: js.UndefOr[scala.Boolean] = js.undefined,
    onBlur: js.Function1[/* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement], scala.Unit] = null,
    onClick: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onDrag: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragEnd: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragEnter: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragExit: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragLeave: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragOver: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDragStart: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onDrop: js.Function1[/* event */ reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLElement], scala.Unit] = null,
    onFocus: js.Function1[/* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement], scala.Unit] = null,
    onKeyDown: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement], 
      scala.Unit
    ] = null,
    onKeyUp: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement], 
      scala.Unit
    ] = null,
    onMouseDown: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseEnter: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseLeave: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseMove: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseOut: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseOver: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onMouseUp: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onTouchCancel: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchEnd: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchMove: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchStart: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    plain: js.UndefOr[scala.Boolean] = js.undefined,
    rowSpan: scala.Int | scala.Double = null,
    scope: reactDashMdLib.reactDashMdLibStrings.row | reactDashMdLib.reactDashMdLibStrings.col = null,
    selectColumnHeader: js.UndefOr[scala.Boolean] = js.undefined,
    sortIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    sortIconBefore: js.UndefOr[scala.Boolean] = js.undefined,
    sortIconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    sortIconClassName: java.lang.String = null,
    sorted: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tooltipClassName: java.lang.String = null,
    tooltipContainerClassName: java.lang.String = null,
    tooltipContainerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    tooltipDelay: scala.Int | scala.Double = null,
    tooltipLabel: reactLib.reactMod.ReactNs.ReactNode = null,
    tooltipPosition: reactDashMdLib.libTooltipsInjectTooltipMod.Positions = null,
    tooltipStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    tooltipTransitionEnterTimeout: scala.Int | scala.Double = null,
    tooltipTransitionLeaveTimeout: scala.Int | scala.Double = null
  ): TableColumnProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjusted)) __obj.updateDynamic("adjusted")(adjusted)
    if (!js.isUndefined(cellIndex)) __obj.updateDynamic("cellIndex")(cellIndex)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (fixedClassName != null) __obj.updateDynamic("fixedClassName")(fixedClassName)
    if (fixedStyle != null) __obj.updateDynamic("fixedStyle")(fixedStyle)
    if (!js.isUndefined(grow)) __obj.updateDynamic("grow")(grow)
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header)
    if (!js.isUndefined(numeric)) __obj.updateDynamic("numeric")(numeric)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit)
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(selectColumnHeader)) __obj.updateDynamic("selectColumnHeader")(selectColumnHeader)
    if (sortIcon != null) __obj.updateDynamic("sortIcon")(sortIcon)
    if (!js.isUndefined(sortIconBefore)) __obj.updateDynamic("sortIconBefore")(sortIconBefore)
    if (sortIconChildren != null) __obj.updateDynamic("sortIconChildren")(sortIconChildren.asInstanceOf[js.Any])
    if (sortIconClassName != null) __obj.updateDynamic("sortIconClassName")(sortIconClassName)
    if (!js.isUndefined(sorted)) __obj.updateDynamic("sorted")(sorted)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tooltipClassName != null) __obj.updateDynamic("tooltipClassName")(tooltipClassName)
    if (tooltipContainerClassName != null) __obj.updateDynamic("tooltipContainerClassName")(tooltipContainerClassName)
    if (tooltipContainerStyle != null) __obj.updateDynamic("tooltipContainerStyle")(tooltipContainerStyle)
    if (tooltipDelay != null) __obj.updateDynamic("tooltipDelay")(tooltipDelay.asInstanceOf[js.Any])
    if (tooltipLabel != null) __obj.updateDynamic("tooltipLabel")(tooltipLabel.asInstanceOf[js.Any])
    if (tooltipPosition != null) __obj.updateDynamic("tooltipPosition")(tooltipPosition)
    if (tooltipStyle != null) __obj.updateDynamic("tooltipStyle")(tooltipStyle)
    if (tooltipTransitionEnterTimeout != null) __obj.updateDynamic("tooltipTransitionEnterTimeout")(tooltipTransitionEnterTimeout.asInstanceOf[js.Any])
    if (tooltipTransitionLeaveTimeout != null) __obj.updateDynamic("tooltipTransitionLeaveTimeout")(tooltipTransitionLeaveTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableColumnProps]
  }
}

