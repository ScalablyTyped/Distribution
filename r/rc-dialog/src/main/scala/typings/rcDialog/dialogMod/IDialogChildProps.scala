package typings.rcDialog.dialogMod

import typings.rcDialog.anon.X
import typings.rcDialog.idialogproptypesMod.IDialogPropTypes
import typings.rcDialog.idialogproptypesMod.IStringOrHtmlElement
import typings.rcDialog.rcDialogBooleans.`false`
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogChildProps extends IDialogPropTypes {
  var switchScrollingEffect: js.UndefOr[js.Function0[Unit]] = js.undefined
  def getOpenCount(): Double
}

object IDialogChildProps {
  @scala.inline
  def apply(
    getOpenCount: () => Double,
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
    height: js.UndefOr[Double] = js.undefined,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    mask: js.UndefOr[Boolean] = js.undefined,
    maskAnimation: js.Any = null,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskProps: js.Any = null,
    maskStyle: js.Object = null,
    maskTransitionName: String = null,
    mousePosition: X = null,
    onClose: /* e */ SyntheticEvent[HTMLDivElement, Event] => _ = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    switchScrollingEffect: () => Unit = null,
    title: ReactNode = null,
    transitionName: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    wrapClassName: String = null,
    wrapProps: js.Any = null,
    wrapStyle: js.Object = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): IDialogChildProps = {
    val __obj = js.Dynamic.literal(getOpenCount = js.Any.fromFunction0(getOpenCount))
    if (afterClose != null) __obj.updateDynamic("afterClose")(js.Any.fromFunction0(afterClose))
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (bodyProps != null) __obj.updateDynamic("bodyProps")(bodyProps.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.get.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyOnClose)) __obj.updateDynamic("destroyOnClose")(destroyOnClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focusTriggerAfterClose)) __obj.updateDynamic("focusTriggerAfterClose")(focusTriggerAfterClose.get.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender.get.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(getContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.get.asInstanceOf[js.Any])
    if (maskAnimation != null) __obj.updateDynamic("maskAnimation")(maskAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.get.asInstanceOf[js.Any])
    if (maskProps != null) __obj.updateDynamic("maskProps")(maskProps.asInstanceOf[js.Any])
    if (maskStyle != null) __obj.updateDynamic("maskStyle")(maskStyle.asInstanceOf[js.Any])
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName.asInstanceOf[js.Any])
    if (mousePosition != null) __obj.updateDynamic("mousePosition")(mousePosition.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (switchScrollingEffect != null) __obj.updateDynamic("switchScrollingEffect")(js.Any.fromFunction0(switchScrollingEffect))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (wrapClassName != null) __obj.updateDynamic("wrapClassName")(wrapClassName.asInstanceOf[js.Any])
    if (wrapProps != null) __obj.updateDynamic("wrapProps")(wrapProps.asInstanceOf[js.Any])
    if (wrapStyle != null) __obj.updateDynamic("wrapStyle")(wrapStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogChildProps]
  }
}

