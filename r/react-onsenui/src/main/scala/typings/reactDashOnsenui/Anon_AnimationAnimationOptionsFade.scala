package typings.reactDashOnsenui

import typings.reactDashOnsenui.reactDashOnsenuiMod.AnimationOptions
import typings.reactDashOnsenui.reactDashOnsenuiStrings.fade
import typings.reactDashOnsenui.reactDashOnsenuiStrings.lift
import typings.reactDashOnsenui.reactDashOnsenuiStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationAnimationOptionsFade extends js.Object {
  var animation: js.UndefOr[fade | lift | none] = js.undefined
  var animationOptions: js.UndefOr[AnimationOptions] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var onDeviceBackButton: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPostHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPostShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPreHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPreShow: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Anon_AnimationAnimationOptionsFade {
  @scala.inline
  def apply(
    animation: fade | lift | none = null,
    animationOptions: AnimationOptions = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    onDeviceBackButton: () => Unit = null,
    onPostHide: () => Unit = null,
    onPostShow: () => Unit = null,
    onPreHide: () => Unit = null,
    onPreShow: () => Unit = null
  ): Anon_AnimationAnimationOptionsFade = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (onDeviceBackButton != null) __obj.updateDynamic("onDeviceBackButton")(js.Any.fromFunction0(onDeviceBackButton))
    if (onPostHide != null) __obj.updateDynamic("onPostHide")(js.Any.fromFunction0(onPostHide))
    if (onPostShow != null) __obj.updateDynamic("onPostShow")(js.Any.fromFunction0(onPostShow))
    if (onPreHide != null) __obj.updateDynamic("onPreHide")(js.Any.fromFunction0(onPreHide))
    if (onPreShow != null) __obj.updateDynamic("onPreShow")(js.Any.fromFunction0(onPreShow))
    __obj.asInstanceOf[Anon_AnimationAnimationOptionsFade]
  }
}

