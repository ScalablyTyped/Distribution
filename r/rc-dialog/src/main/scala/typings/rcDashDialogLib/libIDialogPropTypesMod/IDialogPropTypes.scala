package typings
package rcDashDialogLib.libIDialogPropTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogPropTypes extends js.Object {
  var afterClose: js.UndefOr[js.Function0[_]] = js.undefined
  var animation: js.UndefOr[js.Any] = js.undefined
  var bodyProps: js.UndefOr[js.Any] = js.undefined
  var bodyStyle: js.UndefOr[js.Object] = js.undefined
  var children: js.UndefOr[js.Any] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  var closeIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var destroyOnClose: js.UndefOr[scala.Boolean] = js.undefined
  var footer: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var forceRender: js.UndefOr[scala.Boolean] = js.undefined
  var getContainer: js.UndefOr[js.Function0[stdLib.HTMLElement]] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  var mask: js.UndefOr[scala.Boolean] = js.undefined
  var maskAnimation: js.UndefOr[js.Any] = js.undefined
  var maskClosable: js.UndefOr[scala.Boolean] = js.undefined
  var maskProps: js.UndefOr[js.Any] = js.undefined
  var maskStyle: js.UndefOr[js.Object] = js.undefined
  var maskTransitionName: js.UndefOr[java.lang.String] = js.undefined
  var mousePosition: js.UndefOr[rcDashDialogLib.Anon_X] = js.undefined
  var onClose: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.ReactNs.SyntheticEvent[stdLib.HTMLDivElement, reactLib.Event], 
      _
    ]
  ] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var wrapClassName: js.UndefOr[java.lang.String] = js.undefined
  var wrapProps: js.UndefOr[js.Any] = js.undefined
  var wrapStyle: js.UndefOr[js.Object] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object IDialogPropTypes {
  @scala.inline
  def apply(
    afterClose: () => _ = null,
    animation: js.Any = null,
    bodyProps: js.Any = null,
    bodyStyle: js.Object = null,
    children: js.Any = null,
    className: java.lang.String = null,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    closeIcon: reactLib.reactMod.ReactNs.ReactNode = null,
    destroyOnClose: js.UndefOr[scala.Boolean] = js.undefined,
    footer: reactLib.reactMod.ReactNs.ReactNode = null,
    forceRender: js.UndefOr[scala.Boolean] = js.undefined,
    getContainer: () => stdLib.HTMLElement = null,
    height: scala.Int | scala.Double = null,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    mask: js.UndefOr[scala.Boolean] = js.undefined,
    maskAnimation: js.Any = null,
    maskClosable: js.UndefOr[scala.Boolean] = js.undefined,
    maskProps: js.Any = null,
    maskStyle: js.Object = null,
    maskTransitionName: java.lang.String = null,
    mousePosition: rcDashDialogLib.Anon_X = null,
    onClose: /* e */ reactLib.reactMod.ReactNs.SyntheticEvent[stdLib.HTMLDivElement, reactLib.Event] => _ = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    title: reactLib.reactMod.ReactNs.ReactNode = null,
    transitionName: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null,
    wrapClassName: java.lang.String = null,
    wrapProps: js.Any = null,
    wrapStyle: js.Object = null,
    zIndex: scala.Int | scala.Double = null
  ): IDialogPropTypes = {
    val __obj = js.Dynamic.literal()
    if (afterClose != null) __obj.updateDynamic("afterClose")(js.Any.fromFunction0(afterClose))
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (bodyProps != null) __obj.updateDynamic("bodyProps")(bodyProps)
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle)
    if (children != null) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyOnClose)) __obj.updateDynamic("destroyOnClose")(destroyOnClose)
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender)
    if (getContainer != null) __obj.updateDynamic("getContainer")(js.Any.fromFunction0(getContainer))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask)
    if (maskAnimation != null) __obj.updateDynamic("maskAnimation")(maskAnimation)
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable)
    if (maskProps != null) __obj.updateDynamic("maskProps")(maskProps)
    if (maskStyle != null) __obj.updateDynamic("maskStyle")(maskStyle)
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName)
    if (mousePosition != null) __obj.updateDynamic("mousePosition")(mousePosition)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrapClassName != null) __obj.updateDynamic("wrapClassName")(wrapClassName)
    if (wrapProps != null) __obj.updateDynamic("wrapProps")(wrapProps)
    if (wrapStyle != null) __obj.updateDynamic("wrapStyle")(wrapStyle)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogPropTypes]
  }
}

