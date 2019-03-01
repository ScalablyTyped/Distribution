package typings
package reactDashMdLib.libDataTablesTableCardHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCardHeaderProps
  extends reactDashMdLib.libMod.Props
     with // for the `component` prop until refactored out
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var actions: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement[_] | js.Array[reactLib.reactMod.ReactNs.ReactElement[_]]
  ] = js.undefined
  var children: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement[_] | js.Array[reactLib.reactMod.ReactNs.ReactElement[_]]
  ] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var contextualChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var contextualTitle: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var contextualTitleId: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var leftChildren: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement[_] | js.Array[reactLib.reactMod.ReactNs.ReactElement[_]]
  ] = js.undefined
  var noActionsAdjust: js.UndefOr[scala.Boolean] = js.undefined
  var noChildrenAdjust: js.UndefOr[scala.Boolean] = js.undefined
  var noLeftChildrenCline: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var transitionEnterTimeout: js.UndefOr[scala.Double] = js.undefined
  var transitionLeaveTimeout: js.UndefOr[scala.Double] = js.undefined
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
  var visible: scala.Boolean
}

object TableCardHeaderProps {
  @scala.inline
  def apply(
    visible: scala.Boolean,
    StringDictionary: // for the `component` prop until refactored out
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    actions: reactLib.reactMod.ReactNs.ReactElement[_] | js.Array[reactLib.reactMod.ReactNs.ReactElement[_]] = null,
    children: reactLib.reactMod.ReactNs.ReactElement[_] | js.Array[reactLib.reactMod.ReactNs.ReactElement[_]] = null,
    className: java.lang.String = null,
    component: reactLib.reactMod.ReactNs.ReactType[_] = null,
    contextualChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    contextualTitle: reactLib.reactMod.ReactNs.ReactNode = null,
    contextualTitleId: reactDashMdLib.libMod.IdPropType = null,
    leftChildren: reactLib.reactMod.ReactNs.ReactElement[_] | js.Array[reactLib.reactMod.ReactNs.ReactElement[_]] = null,
    noActionsAdjust: js.UndefOr[scala.Boolean] = js.undefined,
    noChildrenAdjust: js.UndefOr[scala.Boolean] = js.undefined,
    noLeftChildrenCline: js.UndefOr[scala.Boolean] = js.undefined,
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
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    title: reactLib.reactMod.ReactNs.ReactNode = null,
    transitionEnterTimeout: scala.Int | scala.Double = null,
    transitionLeaveTimeout: scala.Int | scala.Double = null,
    transitionName: java.lang.String = null
  ): TableCardHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("visible")(visible)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (contextualChildren != null) __obj.updateDynamic("contextualChildren")(contextualChildren.asInstanceOf[js.Any])
    if (contextualTitle != null) __obj.updateDynamic("contextualTitle")(contextualTitle.asInstanceOf[js.Any])
    if (contextualTitleId != null) __obj.updateDynamic("contextualTitleId")(contextualTitleId.asInstanceOf[js.Any])
    if (leftChildren != null) __obj.updateDynamic("leftChildren")(leftChildren.asInstanceOf[js.Any])
    if (!js.isUndefined(noActionsAdjust)) __obj.updateDynamic("noActionsAdjust")(noActionsAdjust)
    if (!js.isUndefined(noChildrenAdjust)) __obj.updateDynamic("noChildrenAdjust")(noChildrenAdjust)
    if (!js.isUndefined(noLeftChildrenCline)) __obj.updateDynamic("noLeftChildrenCline")(noLeftChildrenCline)
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
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionEnterTimeout != null) __obj.updateDynamic("transitionEnterTimeout")(transitionEnterTimeout.asInstanceOf[js.Any])
    if (transitionLeaveTimeout != null) __obj.updateDynamic("transitionLeaveTimeout")(transitionLeaveTimeout.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    __obj.asInstanceOf[TableCardHeaderProps]
  }
}

