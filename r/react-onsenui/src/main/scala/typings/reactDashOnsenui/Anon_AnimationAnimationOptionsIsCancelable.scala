package typings.reactDashOnsenui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationAnimationOptionsIsCancelable extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var animationOptions: js.UndefOr[js.Object] = js.undefined
  var isCancelable: js.UndefOr[Boolean] = js.undefined
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var maskColor: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDeviceBackButton: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPostHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPostShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPreHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPreShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Anon_AnimationAnimationOptionsIsCancelable {
  @scala.inline
  def apply(
    animation: String = null,
    animationOptions: js.Object = null,
    isCancelable: js.UndefOr[Boolean] = js.undefined,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    maskColor: String = null,
    modifier: String = null,
    onCancel: () => Unit = null,
    onDeviceBackButton: () => Unit = null,
    onPostHide: () => Unit = null,
    onPostShow: () => Unit = null,
    onPreHide: () => Unit = null,
    onPreShow: () => Unit = null,
    title: String = null
  ): Anon_AnimationAnimationOptionsIsCancelable = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions)
    if (!js.isUndefined(isCancelable)) __obj.updateDynamic("isCancelable")(isCancelable)
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (maskColor != null) __obj.updateDynamic("maskColor")(maskColor)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction0(onCancel))
    if (onDeviceBackButton != null) __obj.updateDynamic("onDeviceBackButton")(js.Any.fromFunction0(onDeviceBackButton))
    if (onPostHide != null) __obj.updateDynamic("onPostHide")(js.Any.fromFunction0(onPostHide))
    if (onPostShow != null) __obj.updateDynamic("onPostShow")(js.Any.fromFunction0(onPostShow))
    if (onPreHide != null) __obj.updateDynamic("onPreHide")(js.Any.fromFunction0(onPreHide))
    if (onPreShow != null) __obj.updateDynamic("onPreShow")(js.Any.fromFunction0(onPreShow))
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_AnimationAnimationOptionsIsCancelable]
  }
}

