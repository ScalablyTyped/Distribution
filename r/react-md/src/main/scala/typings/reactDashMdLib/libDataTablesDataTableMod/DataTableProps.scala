package typings
package reactDashMdLib.libDataTablesDataTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableProps
  extends reactDashMdLib.libMod.Props {
  var baseId: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var checkboxHeaderLabel: js.UndefOr[java.lang.String] = js.undefined
  var checkboxLabelTemplate: js.UndefOr[java.lang.String | template] = js.undefined
  var checkedIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var checkedIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var checkedIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var defaultSelectedRows: js.UndefOr[js.Array[scala.Boolean]] = js.undefined
  var fixedDividers: js.UndefOr[scala.Boolean | reactDashMdLib.Anon_Footer] = js.undefined
  var fixedFooter: js.UndefOr[scala.Boolean] = js.undefined
  var fixedHeader: js.UndefOr[scala.Boolean] = js.undefined
  var fixedHeight: js.UndefOr[scala.Double] = js.undefined
  var fixedScrollWrapperClassName: js.UndefOr[java.lang.String] = js.undefined
  var fixedScrollWrapperStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var fixedWidth: js.UndefOr[scala.Double] = js.undefined
  var fixedWrapperClassName: js.UndefOr[java.lang.String] = js.undefined
  var fixedWrapperStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var footerHeight: js.UndefOr[scala.Double] = js.undefined
  var fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  var headerHeight: js.UndefOr[scala.Double] = js.undefined
  var indeterminate: js.UndefOr[scala.Boolean] = js.undefined
  var indeterminateIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var indeterminateIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var indeterminateIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var onRowToggle: js.UndefOr[
    js.Function4[
      /* rowId */ scala.Double, 
      /* checked */ scala.Boolean, 
      /* selectedCount */ scala.Double, 
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var plain: js.UndefOr[scala.Boolean] = js.undefined
  var responsive: js.UndefOr[scala.Boolean] = js.undefined
  var selectableRows: js.UndefOr[scala.Boolean] = js.undefined
  var tableClassName: js.UndefOr[java.lang.String] = js.undefined
  var tableStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var uncheckedIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var uncheckedIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var uncheckedIconClassName: js.UndefOr[java.lang.String] = js.undefined
}

object DataTableProps {
  @scala.inline
  def apply(
    baseId: reactDashMdLib.libMod.IdPropType = null,
    checkboxHeaderLabel: java.lang.String = null,
    checkboxLabelTemplate: java.lang.String | template = null,
    checkedIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    checkedIconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    checkedIconClassName: java.lang.String = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    defaultSelectedRows: js.Array[scala.Boolean] = null,
    fixedDividers: scala.Boolean | reactDashMdLib.Anon_Footer = null,
    fixedFooter: js.UndefOr[scala.Boolean] = js.undefined,
    fixedHeader: js.UndefOr[scala.Boolean] = js.undefined,
    fixedHeight: scala.Int | scala.Double = null,
    fixedScrollWrapperClassName: java.lang.String = null,
    fixedScrollWrapperStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    fixedWidth: scala.Int | scala.Double = null,
    fixedWrapperClassName: java.lang.String = null,
    fixedWrapperStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    footerHeight: scala.Int | scala.Double = null,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined,
    headerHeight: scala.Int | scala.Double = null,
    indeterminate: js.UndefOr[scala.Boolean] = js.undefined,
    indeterminateIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    indeterminateIconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    indeterminateIconClassName: java.lang.String = null,
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
    onRowToggle: (/* rowId */ scala.Double, /* checked */ scala.Boolean, /* selectedCount */ scala.Double, /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onTouchCancel: /* event */ reactLib.reactMod.ReactNs.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchEnd: /* event */ reactLib.reactMod.ReactNs.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchMove: /* event */ reactLib.reactMod.ReactNs.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchStart: /* event */ reactLib.reactMod.ReactNs.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    plain: js.UndefOr[scala.Boolean] = js.undefined,
    responsive: js.UndefOr[scala.Boolean] = js.undefined,
    selectableRows: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tableClassName: java.lang.String = null,
    tableStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    uncheckedIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    uncheckedIconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    uncheckedIconClassName: java.lang.String = null
  ): DataTableProps = {
    val __obj = js.Dynamic.literal()
    if (baseId != null) __obj.updateDynamic("baseId")(baseId.asInstanceOf[js.Any])
    if (checkboxHeaderLabel != null) __obj.updateDynamic("checkboxHeaderLabel")(checkboxHeaderLabel)
    if (checkboxLabelTemplate != null) __obj.updateDynamic("checkboxLabelTemplate")(checkboxLabelTemplate.asInstanceOf[js.Any])
    if (checkedIcon != null) __obj.updateDynamic("checkedIcon")(checkedIcon)
    if (checkedIconChildren != null) __obj.updateDynamic("checkedIconChildren")(checkedIconChildren.asInstanceOf[js.Any])
    if (checkedIconClassName != null) __obj.updateDynamic("checkedIconClassName")(checkedIconClassName)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultSelectedRows != null) __obj.updateDynamic("defaultSelectedRows")(defaultSelectedRows)
    if (fixedDividers != null) __obj.updateDynamic("fixedDividers")(fixedDividers.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedFooter)) __obj.updateDynamic("fixedFooter")(fixedFooter)
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader)
    if (fixedHeight != null) __obj.updateDynamic("fixedHeight")(fixedHeight.asInstanceOf[js.Any])
    if (fixedScrollWrapperClassName != null) __obj.updateDynamic("fixedScrollWrapperClassName")(fixedScrollWrapperClassName)
    if (fixedScrollWrapperStyle != null) __obj.updateDynamic("fixedScrollWrapperStyle")(fixedScrollWrapperStyle)
    if (fixedWidth != null) __obj.updateDynamic("fixedWidth")(fixedWidth.asInstanceOf[js.Any])
    if (fixedWrapperClassName != null) __obj.updateDynamic("fixedWrapperClassName")(fixedWrapperClassName)
    if (fixedWrapperStyle != null) __obj.updateDynamic("fixedWrapperStyle")(fixedWrapperStyle)
    if (footerHeight != null) __obj.updateDynamic("footerHeight")(footerHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (headerHeight != null) __obj.updateDynamic("headerHeight")(headerHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate)
    if (indeterminateIcon != null) __obj.updateDynamic("indeterminateIcon")(indeterminateIcon)
    if (indeterminateIconChildren != null) __obj.updateDynamic("indeterminateIconChildren")(indeterminateIconChildren.asInstanceOf[js.Any])
    if (indeterminateIconClassName != null) __obj.updateDynamic("indeterminateIconClassName")(indeterminateIconClassName)
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
    if (onRowToggle != null) __obj.updateDynamic("onRowToggle")(js.Any.fromFunction4(onRowToggle))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    if (!js.isUndefined(selectableRows)) __obj.updateDynamic("selectableRows")(selectableRows)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tableClassName != null) __obj.updateDynamic("tableClassName")(tableClassName)
    if (tableStyle != null) __obj.updateDynamic("tableStyle")(tableStyle)
    if (uncheckedIcon != null) __obj.updateDynamic("uncheckedIcon")(uncheckedIcon)
    if (uncheckedIconChildren != null) __obj.updateDynamic("uncheckedIconChildren")(uncheckedIconChildren.asInstanceOf[js.Any])
    if (uncheckedIconClassName != null) __obj.updateDynamic("uncheckedIconClassName")(uncheckedIconClassName)
    __obj.asInstanceOf[DataTableProps]
  }
}

