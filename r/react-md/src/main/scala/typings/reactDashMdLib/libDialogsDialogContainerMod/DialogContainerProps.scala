package typings
package reactDashMdLib.libDialogsDialogContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogContainerProps
  extends reactDashMdLib.libDialogsDialogMod.DialogProps
     with // for the `component` prop until refactored out
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var activeElementFocus: js.UndefOr[scala.Boolean] = js.undefined
  var closeOnEsc: js.UndefOr[scala.Boolean] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var defaultVisibleTransitionable: js.UndefOr[scala.Boolean] = js.undefined
  var dialogClassName: js.UndefOr[java.lang.String] = js.undefined
  var dialogStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var lastChild: js.UndefOr[scala.Boolean] = js.undefined
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  var onHide: js.UndefOr[js.Function] = js.undefined
  var onShow: js.UndefOr[js.Function] = js.undefined
  var pageX: js.UndefOr[scala.Double] = js.undefined
  var pageY: js.UndefOr[scala.Double] = js.undefined
  var portal: js.UndefOr[scala.Boolean] = js.undefined
  var renderNode: js.UndefOr[js.Object] = js.undefined
  var transitionEnterTimeout: js.UndefOr[scala.Double] = js.undefined
  var transitionLeaveTimeout: js.UndefOr[scala.Double] = js.undefined
  var visible: scala.Boolean
}

object DialogContainerProps {
  @scala.inline
  def apply(
    id: reactDashMdLib.libMod.IdPropType,
    visible: scala.Boolean,
    StringDictionary: // for the `component` prop until refactored out
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    actions: reactLib.reactMod.ReactNs.ReactElement[_] | reactDashMdLib.libButtonsButtonMod.ButtonProps | (js.Array[
      reactLib.reactMod.ReactNs.ReactElement[_] | reactDashMdLib.libButtonsButtonMod.ButtonProps
    ]) = null,
    activeElementFocus: js.UndefOr[scala.Boolean] = js.undefined,
    additionalFocusKeys: js.Array[scala.Double] = null,
    `aria-describedby`: reactDashMdLib.libMod.IdPropType = null,
    `aria-label`: java.lang.String = null,
    `aria-labelledby`: reactDashMdLib.libMod.IdPropType = null,
    autopadContent: js.UndefOr[scala.Boolean] = js.undefined,
    autosizeContent: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    closeOnEsc: js.UndefOr[scala.Boolean] = js.undefined,
    component: reactLib.reactMod.ReactNs.ReactType[_] = null,
    containFocus: js.UndefOr[scala.Boolean] = js.undefined,
    contentClassName: java.lang.String = null,
    contentComponent: reactLib.reactMod.ReactNs.ReactType[_] = null,
    contentProps: js.Object = null,
    contentStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    defaultVisibleTransitionable: js.UndefOr[scala.Boolean] = js.undefined,
    dialogClassName: java.lang.String = null,
    dialogStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    focusOnMount: js.UndefOr[scala.Boolean] = js.undefined,
    footerClassName: java.lang.String = null,
    footerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    fullPage: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Double | java.lang.String = null,
    initialFocus: java.lang.String = null,
    lastChild: js.UndefOr[scala.Boolean] = js.undefined,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
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
    onHide: js.Function = null,
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
    onShow: js.Function = null,
    onTouchCancel: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchEnd: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchMove: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    onTouchStart: js.Function1[/* event */ reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], scala.Unit] = null,
    paddedContent: js.UndefOr[scala.Boolean] = js.undefined,
    pageX: scala.Int | scala.Double = null,
    pageY: scala.Int | scala.Double = null,
    portal: js.UndefOr[scala.Boolean] = js.undefined,
    renderNode: js.Object = null,
    stackedActions: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    title: reactLib.reactMod.ReactNs.ReactNode = null,
    titleClassName: java.lang.String = null,
    titleStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    transitionEnterTimeout: scala.Int | scala.Double = null,
    transitionLeaveTimeout: scala.Int | scala.Double = null,
    width: scala.Double | java.lang.String = null
  ): DialogContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.updateDynamic("visible")(visible)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (!js.isUndefined(activeElementFocus)) __obj.updateDynamic("activeElementFocus")(activeElementFocus)
    if (additionalFocusKeys != null) __obj.updateDynamic("additionalFocusKeys")(additionalFocusKeys)
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (!js.isUndefined(autopadContent)) __obj.updateDynamic("autopadContent")(autopadContent)
    if (!js.isUndefined(autosizeContent)) __obj.updateDynamic("autosizeContent")(autosizeContent)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(containFocus)) __obj.updateDynamic("containFocus")(containFocus)
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName)
    if (contentComponent != null) __obj.updateDynamic("contentComponent")(contentComponent.asInstanceOf[js.Any])
    if (contentProps != null) __obj.updateDynamic("contentProps")(contentProps)
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle)
    if (!js.isUndefined(defaultVisibleTransitionable)) __obj.updateDynamic("defaultVisibleTransitionable")(defaultVisibleTransitionable)
    if (dialogClassName != null) __obj.updateDynamic("dialogClassName")(dialogClassName)
    if (dialogStyle != null) __obj.updateDynamic("dialogStyle")(dialogStyle)
    if (!js.isUndefined(focusOnMount)) __obj.updateDynamic("focusOnMount")(focusOnMount)
    if (footerClassName != null) __obj.updateDynamic("footerClassName")(footerClassName)
    if (footerStyle != null) __obj.updateDynamic("footerStyle")(footerStyle)
    if (!js.isUndefined(fullPage)) __obj.updateDynamic("fullPage")(fullPage)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (initialFocus != null) __obj.updateDynamic("initialFocus")(initialFocus)
    if (!js.isUndefined(lastChild)) __obj.updateDynamic("lastChild")(lastChild)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
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
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (!js.isUndefined(paddedContent)) __obj.updateDynamic("paddedContent")(paddedContent)
    if (pageX != null) __obj.updateDynamic("pageX")(pageX.asInstanceOf[js.Any])
    if (pageY != null) __obj.updateDynamic("pageY")(pageY.asInstanceOf[js.Any])
    if (!js.isUndefined(portal)) __obj.updateDynamic("portal")(portal)
    if (renderNode != null) __obj.updateDynamic("renderNode")(renderNode)
    if (!js.isUndefined(stackedActions)) __obj.updateDynamic("stackedActions")(stackedActions)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleClassName != null) __obj.updateDynamic("titleClassName")(titleClassName)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle)
    if (transitionEnterTimeout != null) __obj.updateDynamic("transitionEnterTimeout")(transitionEnterTimeout.asInstanceOf[js.Any])
    if (transitionLeaveTimeout != null) __obj.updateDynamic("transitionLeaveTimeout")(transitionLeaveTimeout.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogContainerProps]
  }
}

