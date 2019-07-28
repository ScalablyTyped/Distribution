package typings.rmcDashDialog.libIDialogPropTypesMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogPropTypes extends js.Object {
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var animation: js.UndefOr[js.Any] = js.undefined
  var bodyStyle: js.UndefOr[js.Object] = js.undefined
  var children: js.UndefOr[js.Any] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var closable: js.UndefOr[Boolean] = js.undefined
  var footer: js.UndefOr[ReactNode] = js.undefined
  var mask: js.UndefOr[Boolean] = js.undefined
  var maskAnimation: js.UndefOr[js.Any] = js.undefined
  var maskClosable: js.UndefOr[Boolean] = js.undefined
  var maskProps: js.UndefOr[js.Any] = js.undefined
  var maskStyle: js.UndefOr[js.Object] = js.undefined
  var maskTransitionName: js.UndefOr[String] = js.undefined
  var onAnimateLeave: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var wrapClassName: js.UndefOr[String] = js.undefined
  var wrapProps: js.UndefOr[js.Any] = js.undefined
  var wrapStyle: js.UndefOr[js.Object] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object IDialogPropTypes {
  @scala.inline
  def apply(
    afterClose: () => Unit = null,
    animation: js.Any = null,
    bodyStyle: js.Object = null,
    children: js.Any = null,
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    footer: ReactNode = null,
    mask: js.UndefOr[Boolean] = js.undefined,
    maskAnimation: js.Any = null,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskProps: js.Any = null,
    maskStyle: js.Object = null,
    maskTransitionName: String = null,
    onAnimateLeave: () => Unit = null,
    onClose: /* e */ js.Any => Unit = null,
    prefixCls: String = null,
    style: js.Object = null,
    title: ReactNode = null,
    transitionName: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    wrapClassName: String = null,
    wrapProps: js.Any = null,
    wrapStyle: js.Object = null,
    zIndex: Int | Double = null
  ): IDialogPropTypes = {
    val __obj = js.Dynamic.literal()
    if (afterClose != null) __obj.updateDynamic("afterClose")(js.Any.fromFunction0(afterClose))
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle)
    if (children != null) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask)
    if (maskAnimation != null) __obj.updateDynamic("maskAnimation")(maskAnimation)
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable)
    if (maskProps != null) __obj.updateDynamic("maskProps")(maskProps)
    if (maskStyle != null) __obj.updateDynamic("maskStyle")(maskStyle)
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName)
    if (onAnimateLeave != null) __obj.updateDynamic("onAnimateLeave")(js.Any.fromFunction0(onAnimateLeave))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (wrapClassName != null) __obj.updateDynamic("wrapClassName")(wrapClassName)
    if (wrapProps != null) __obj.updateDynamic("wrapProps")(wrapProps)
    if (wrapStyle != null) __obj.updateDynamic("wrapStyle")(wrapStyle)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogPropTypes]
  }
}

