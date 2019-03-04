package typings
package reactDashMdLib.libExpansionPanelsExpansionPanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpansionPanelProps
  extends reactDashMdLib.libMod.Props
     with // for the `component` prop until refactored out
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var animateContent: js.UndefOr[scala.Boolean] = js.undefined
  var cancelLabel: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var cancelPrimary: js.UndefOr[scala.Boolean] = js.undefined
  var cancelProps: js.UndefOr[js.Object] = js.undefined
  var cancelSecondary: js.UndefOr[scala.Boolean] = js.undefined
  var cancelType: js.UndefOr[reactDashMdLib.libButtonsButtonMod.ButtonTypes] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var closeOnCancel: js.UndefOr[scala.Boolean] = js.undefined
  var closeOnSave: js.UndefOr[scala.Boolean] = js.undefined
  var columnWidths: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var contentClassName: js.UndefOr[java.lang.String] = js.undefined
  var contentStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var defaultExpanded: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated
    */
  var expandIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var expandIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
  var expandedSecondaryLabel: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var expanderIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var focused: js.UndefOr[scala.Boolean] = js.undefined
  var footer: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var footerClassName: js.UndefOr[java.lang.String] = js.undefined
  var footerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var headerClassName: js.UndefOr[java.lang.String] = js.undefined
  var headerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var label: reactLib.reactMod.ReactNs.ReactNode
  var onCancel: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onExpandToggle: js.UndefOr[js.Function1[/* expanded */ scala.Boolean, scala.Unit]] = js.undefined
  var onSave: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var saveLabel: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var savePrimary: js.UndefOr[scala.Boolean] = js.undefined
  var saveProps: js.UndefOr[js.Object] = js.undefined
  var saveSecondary: js.UndefOr[scala.Boolean] = js.undefined
  var saveType: js.UndefOr[reactDashMdLib.libButtonsButtonMod.ButtonTypes] = js.undefined
  var secondaryLabel: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
}

object ExpansionPanelProps {
  @scala.inline
  def apply(
    label: reactLib.reactMod.ReactNs.ReactNode,
    StringDictionary: // for the `component` prop until refactored out
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    animateContent: js.UndefOr[scala.Boolean] = js.undefined,
    cancelLabel: reactLib.reactMod.ReactNs.ReactNode = null,
    cancelPrimary: js.UndefOr[scala.Boolean] = js.undefined,
    cancelProps: js.Object = null,
    cancelSecondary: js.UndefOr[scala.Boolean] = js.undefined,
    cancelType: reactDashMdLib.libButtonsButtonMod.ButtonTypes = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    closeOnCancel: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnSave: js.UndefOr[scala.Boolean] = js.undefined,
    columnWidths: js.Array[scala.Double] = null,
    component: reactLib.reactMod.ReactNs.ReactType[_] = null,
    contentClassName: java.lang.String = null,
    contentStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    defaultExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    expandIconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    expandIconClassName: java.lang.String = null,
    expanded: js.UndefOr[scala.Boolean] = js.undefined,
    expandedSecondaryLabel: reactLib.reactMod.ReactNs.ReactNode = null,
    expanderIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    focused: js.UndefOr[scala.Boolean] = js.undefined,
    footer: reactLib.reactMod.ReactNs.ReactNode = null,
    footerClassName: java.lang.String = null,
    footerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    headerClassName: java.lang.String = null,
    headerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    onBlur: js.Function1[/* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement], scala.Unit] = null,
    onCancel: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
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
    onExpandToggle: js.Function1[/* expanded */ scala.Boolean, scala.Unit] = null,
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
    onSave: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onTouchCancel: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchEnd: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchMove: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchStart: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    saveLabel: reactLib.reactMod.ReactNs.ReactNode = null,
    savePrimary: js.UndefOr[scala.Boolean] = js.undefined,
    saveProps: js.Object = null,
    saveSecondary: js.UndefOr[scala.Boolean] = js.undefined,
    saveType: reactDashMdLib.libButtonsButtonMod.ButtonTypes = null,
    secondaryLabel: reactLib.reactMod.ReactNs.ReactNode = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null
  ): ExpansionPanelProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(animateContent)) __obj.updateDynamic("animateContent")(animateContent)
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelPrimary)) __obj.updateDynamic("cancelPrimary")(cancelPrimary)
    if (cancelProps != null) __obj.updateDynamic("cancelProps")(cancelProps)
    if (!js.isUndefined(cancelSecondary)) __obj.updateDynamic("cancelSecondary")(cancelSecondary)
    if (cancelType != null) __obj.updateDynamic("cancelType")(cancelType)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closeOnCancel)) __obj.updateDynamic("closeOnCancel")(closeOnCancel)
    if (!js.isUndefined(closeOnSave)) __obj.updateDynamic("closeOnSave")(closeOnSave)
    if (columnWidths != null) __obj.updateDynamic("columnWidths")(columnWidths)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName)
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle)
    if (!js.isUndefined(defaultExpanded)) __obj.updateDynamic("defaultExpanded")(defaultExpanded)
    if (expandIconChildren != null) __obj.updateDynamic("expandIconChildren")(expandIconChildren.asInstanceOf[js.Any])
    if (expandIconClassName != null) __obj.updateDynamic("expandIconClassName")(expandIconClassName)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (expandedSecondaryLabel != null) __obj.updateDynamic("expandedSecondaryLabel")(expandedSecondaryLabel.asInstanceOf[js.Any])
    if (expanderIcon != null) __obj.updateDynamic("expanderIcon")(expanderIcon)
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused)
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (footerClassName != null) __obj.updateDynamic("footerClassName")(footerClassName)
    if (footerStyle != null) __obj.updateDynamic("footerStyle")(footerStyle)
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName)
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onCancel != null) __obj.updateDynamic("onCancel")(onCancel)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit)
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onExpandToggle != null) __obj.updateDynamic("onExpandToggle")(onExpandToggle)
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
    if (onSave != null) __obj.updateDynamic("onSave")(onSave)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (saveLabel != null) __obj.updateDynamic("saveLabel")(saveLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(savePrimary)) __obj.updateDynamic("savePrimary")(savePrimary)
    if (saveProps != null) __obj.updateDynamic("saveProps")(saveProps)
    if (!js.isUndefined(saveSecondary)) __obj.updateDynamic("saveSecondary")(saveSecondary)
    if (saveType != null) __obj.updateDynamic("saveType")(saveType)
    if (secondaryLabel != null) __obj.updateDynamic("secondaryLabel")(secondaryLabel.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpansionPanelProps]
  }
}

