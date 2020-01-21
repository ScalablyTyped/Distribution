package typings.rmcTrigger.popupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPopupProps extends js.Object {
  var align: js.UndefOr[js.Any] = js.undefined
  var animation: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var destroyPopupOnHide: js.UndefOr[Boolean] = js.undefined
  var getClassNameFromAlign: js.UndefOr[js.Function] = js.undefined
  var getRootDomNode: js.UndefOr[js.Function] = js.undefined
  var mask: js.UndefOr[Boolean] = js.undefined
  var maskAnimation: js.UndefOr[String] = js.undefined
  var maskTransitionName: js.UndefOr[String | js.Object] = js.undefined
  var onAlign: js.UndefOr[js.Function] = js.undefined
  var onAnimateLeave: js.UndefOr[js.Function] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var transitionName: js.UndefOr[String | js.Object] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object IPopupProps {
  @scala.inline
  def apply(
    align: js.Any = null,
    animation: String = null,
    className: String = null,
    destroyPopupOnHide: js.UndefOr[Boolean] = js.undefined,
    getClassNameFromAlign: js.Function = null,
    getRootDomNode: js.Function = null,
    mask: js.UndefOr[Boolean] = js.undefined,
    maskAnimation: String = null,
    maskTransitionName: String | js.Object = null,
    onAlign: js.Function = null,
    onAnimateLeave: js.Function = null,
    prefixCls: String = null,
    style: js.Any = null,
    transitionName: String | js.Object = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): IPopupProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyPopupOnHide)) __obj.updateDynamic("destroyPopupOnHide")(destroyPopupOnHide.asInstanceOf[js.Any])
    if (getClassNameFromAlign != null) __obj.updateDynamic("getClassNameFromAlign")(getClassNameFromAlign.asInstanceOf[js.Any])
    if (getRootDomNode != null) __obj.updateDynamic("getRootDomNode")(getRootDomNode.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskAnimation != null) __obj.updateDynamic("maskAnimation")(maskAnimation.asInstanceOf[js.Any])
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName.asInstanceOf[js.Any])
    if (onAlign != null) __obj.updateDynamic("onAlign")(onAlign.asInstanceOf[js.Any])
    if (onAnimateLeave != null) __obj.updateDynamic("onAnimateLeave")(onAnimateLeave.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPopupProps]
  }
}

