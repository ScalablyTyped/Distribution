package typings
package reactDashMdLib.libDataTablesTablePaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TablePaginationProps
  extends reactDashMdLib.libMod.Props {
  var decrementIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var decrementIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var decrementIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var decrementId: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var defaultPage: js.UndefOr[scala.Double] = js.undefined
  var defaultRowsPerPage: js.UndefOr[scala.Double] = js.undefined
  var id: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var incrementIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var incrementIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var incrementIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var incrementId: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var rows: scala.Double
  var rowsPerPage: js.UndefOr[scala.Double] = js.undefined
  var rowsPerPageItems: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var rowsPerPageLabel: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var selectFieldClassName: js.UndefOr[java.lang.String] = js.undefined
  var selectFieldInputClassName: js.UndefOr[java.lang.String] = js.undefined
  var selectFieldInputStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var selectFieldStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var simplifiedMenu: js.UndefOr[scala.Boolean] = js.undefined
  def onPagination(startIndex: scala.Double, rowsPerPage: scala.Double, currentPage: scala.Double): scala.Unit
}

object TablePaginationProps {
  @scala.inline
  def apply(
    onPagination: (scala.Double, scala.Double, scala.Double) => scala.Unit,
    rows: scala.Double,
    className: java.lang.String = null,
    decrementIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    decrementIconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    decrementIconClassName: java.lang.String = null,
    decrementId: reactDashMdLib.libMod.IdPropType = null,
    defaultPage: scala.Int | scala.Double = null,
    defaultRowsPerPage: scala.Int | scala.Double = null,
    id: reactDashMdLib.libMod.IdPropType = null,
    incrementIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    incrementIconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    incrementIconClassName: java.lang.String = null,
    incrementId: reactDashMdLib.libMod.IdPropType = null,
    onBlur: /* event */ reactLib.reactMod.ReactNs.FocusEvent[stdLib.HTMLElement] => scala.Unit = null,
    onClick: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onDrag: /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragEnd: /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragEnter: /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragExit: /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragLeave: /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragOver: /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragStart: /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDrop: /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onFocus: /* event */ reactLib.reactMod.ReactNs.FocusEvent[stdLib.HTMLElement] => scala.Unit = null,
    onKeyDown: /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[stdLib.HTMLElement] => scala.Unit = null,
    onKeyUp: /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[stdLib.HTMLElement] => scala.Unit = null,
    onMouseDown: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseEnter: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseLeave: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseMove: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseOut: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseOver: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseUp: /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onTouchCancel: /* event */ reactLib.reactMod.ReactNs.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchEnd: /* event */ reactLib.reactMod.ReactNs.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchMove: /* event */ reactLib.reactMod.ReactNs.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchStart: /* event */ reactLib.reactMod.ReactNs.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    page: scala.Int | scala.Double = null,
    rowsPerPage: scala.Int | scala.Double = null,
    rowsPerPageItems: js.Array[scala.Double] = null,
    rowsPerPageLabel: reactLib.reactMod.ReactNs.ReactNode = null,
    selectFieldClassName: java.lang.String = null,
    selectFieldInputClassName: java.lang.String = null,
    selectFieldInputStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    selectFieldStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    simplifiedMenu: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): TablePaginationProps = {
    val __obj = js.Dynamic.literal(onPagination = js.Any.fromFunction3(onPagination), rows = rows)
    if (className != null) __obj.updateDynamic("className")(className)
    if (decrementIcon != null) __obj.updateDynamic("decrementIcon")(decrementIcon)
    if (decrementIconChildren != null) __obj.updateDynamic("decrementIconChildren")(decrementIconChildren.asInstanceOf[js.Any])
    if (decrementIconClassName != null) __obj.updateDynamic("decrementIconClassName")(decrementIconClassName)
    if (decrementId != null) __obj.updateDynamic("decrementId")(decrementId.asInstanceOf[js.Any])
    if (defaultPage != null) __obj.updateDynamic("defaultPage")(defaultPage.asInstanceOf[js.Any])
    if (defaultRowsPerPage != null) __obj.updateDynamic("defaultRowsPerPage")(defaultRowsPerPage.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (incrementIcon != null) __obj.updateDynamic("incrementIcon")(incrementIcon)
    if (incrementIconChildren != null) __obj.updateDynamic("incrementIconChildren")(incrementIconChildren.asInstanceOf[js.Any])
    if (incrementIconClassName != null) __obj.updateDynamic("incrementIconClassName")(incrementIconClassName)
    if (incrementId != null) __obj.updateDynamic("incrementId")(incrementId.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (rowsPerPage != null) __obj.updateDynamic("rowsPerPage")(rowsPerPage.asInstanceOf[js.Any])
    if (rowsPerPageItems != null) __obj.updateDynamic("rowsPerPageItems")(rowsPerPageItems)
    if (rowsPerPageLabel != null) __obj.updateDynamic("rowsPerPageLabel")(rowsPerPageLabel.asInstanceOf[js.Any])
    if (selectFieldClassName != null) __obj.updateDynamic("selectFieldClassName")(selectFieldClassName)
    if (selectFieldInputClassName != null) __obj.updateDynamic("selectFieldInputClassName")(selectFieldInputClassName)
    if (selectFieldInputStyle != null) __obj.updateDynamic("selectFieldInputStyle")(selectFieldInputStyle)
    if (selectFieldStyle != null) __obj.updateDynamic("selectFieldStyle")(selectFieldStyle)
    if (!js.isUndefined(simplifiedMenu)) __obj.updateDynamic("simplifiedMenu")(simplifiedMenu)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TablePaginationProps]
  }
}

