package typings.rcDashDialog.libIDialogPropTypesMod

import typings.rcDashDialog.Anon_X
import typings.rcDashDialog.rcDashDialogBooleans.`false`
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.react.reactMod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogPropTypes extends js.Object {
  var afterClose: js.UndefOr[js.Function0[_]] = js.undefined
  var animation: js.UndefOr[js.Any] = js.undefined
  var bodyProps: js.UndefOr[js.Any] = js.undefined
  var bodyStyle: js.UndefOr[js.Object] = js.undefined
  var children: js.UndefOr[js.Any] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var closable: js.UndefOr[Boolean] = js.undefined
  var closeIcon: js.UndefOr[ReactNode] = js.undefined
  var destroyOnClose: js.UndefOr[Boolean] = js.undefined
  var focusTriggerAfterClose: js.UndefOr[Boolean] = js.undefined
  var footer: js.UndefOr[ReactNode] = js.undefined
  var forceRender: js.UndefOr[Boolean] = js.undefined
  var getContainer: js.UndefOr[IStringOrHtmlElement | js.Function0[IStringOrHtmlElement] | `false`] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var mask: js.UndefOr[Boolean] = js.undefined
  var maskAnimation: js.UndefOr[js.Any] = js.undefined
  var maskClosable: js.UndefOr[Boolean] = js.undefined
  var maskProps: js.UndefOr[js.Any] = js.undefined
  var maskStyle: js.UndefOr[js.Object] = js.undefined
  var maskTransitionName: js.UndefOr[String] = js.undefined
  var mousePosition: js.UndefOr[Anon_X] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* e */ SyntheticEvent[HTMLDivElement, Event], _]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var wrapClassName: js.UndefOr[String] = js.undefined
  var wrapProps: js.UndefOr[js.Any] = js.undefined
  var wrapStyle: js.UndefOr[js.Object] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object IDialogPropTypes {
  @scala.inline
  def apply(
    afterClose: () => _ = null,
    animation: js.Any = null,
    bodyProps: js.Any = null,
    bodyStyle: js.Object = null,
    children: js.Any = null,
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    closeIcon: ReactNode = null,
    destroyOnClose: js.UndefOr[Boolean] = js.undefined,
    focusTriggerAfterClose: js.UndefOr[Boolean] = js.undefined,
    footer: ReactNode = null,
    forceRender: js.UndefOr[Boolean] = js.undefined,
    getContainer: IStringOrHtmlElement | js.Function0[IStringOrHtmlElement] | `false` = null,
    height: Int | Double = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    mask: js.UndefOr[Boolean] = js.undefined,
    maskAnimation: js.Any = null,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskProps: js.Any = null,
    maskStyle: js.Object = null,
    maskTransitionName: String = null,
    mousePosition: Anon_X = null,
    onClose: /* e */ SyntheticEvent[HTMLDivElement, Event] => _ = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    title: ReactNode = null,
    transitionName: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    wrapClassName: String = null,
    wrapProps: js.Any = null,
    wrapStyle: js.Object = null,
    zIndex: Int | Double = null
  ): IDialogPropTypes = {
    val __obj = js.Dynamic.literal()
    if (afterClose != null) __obj.updateDynamic("afterClose")(js.Any.fromFunction0(afterClose))
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (bodyProps != null) __obj.updateDynamic("bodyProps")(bodyProps.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyOnClose)) __obj.updateDynamic("destroyOnClose")(destroyOnClose.asInstanceOf[js.Any])
    if (!js.isUndefined(focusTriggerAfterClose)) __obj.updateDynamic("focusTriggerAfterClose")(focusTriggerAfterClose.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(getContainer.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskAnimation != null) __obj.updateDynamic("maskAnimation")(maskAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.asInstanceOf[js.Any])
    if (maskProps != null) __obj.updateDynamic("maskProps")(maskProps.asInstanceOf[js.Any])
    if (maskStyle != null) __obj.updateDynamic("maskStyle")(maskStyle.asInstanceOf[js.Any])
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName.asInstanceOf[js.Any])
    if (mousePosition != null) __obj.updateDynamic("mousePosition")(mousePosition.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrapClassName != null) __obj.updateDynamic("wrapClassName")(wrapClassName.asInstanceOf[js.Any])
    if (wrapProps != null) __obj.updateDynamic("wrapProps")(wrapProps.asInstanceOf[js.Any])
    if (wrapStyle != null) __obj.updateDynamic("wrapStyle")(wrapStyle.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogPropTypes]
  }
}

