package typings.rmcDialog.modalMod

import typings.reactNative.mod.ViewStyle
import typings.rmcDialog.rmcDialogStrings.`slide-down`
import typings.rmcDialog.rmcDialogStrings.`slide-up`
import typings.rmcDialog.rmcDialogStrings.fade
import typings.rmcDialog.rmcDialogStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModalPropTypes extends js.Object {
  var animateAppear: js.UndefOr[Boolean] = js.undefined
  var animationDuration: js.UndefOr[Double] = js.undefined
  var animationType: none | fade | `slide-up` | `slide-down`
  var maskClosable: js.UndefOr[Boolean] = js.undefined
  var maskStyle: js.UndefOr[ViewStyle] = js.undefined
  var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var visible: Boolean
  var wrapStyle: js.UndefOr[ViewStyle] = js.undefined
}

object IModalPropTypes {
  @scala.inline
  def apply(
    animationType: none | fade | `slide-up` | `slide-down`,
    visible: Boolean,
    animateAppear: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskStyle: ViewStyle = null,
    onAnimationEnd: /* visible */ Boolean => Unit = null,
    onClose: () => Unit = null,
    style: js.Object = null,
    wrapStyle: ViewStyle = null
  ): IModalPropTypes = {
    val __obj = js.Dynamic.literal(animationType = animationType.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    if (!js.isUndefined(animateAppear)) __obj.updateDynamic("animateAppear")(animateAppear.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.asInstanceOf[js.Any])
    if (maskStyle != null) __obj.updateDynamic("maskStyle")(maskStyle.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (wrapStyle != null) __obj.updateDynamic("wrapStyle")(wrapStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModalPropTypes]
  }
}

