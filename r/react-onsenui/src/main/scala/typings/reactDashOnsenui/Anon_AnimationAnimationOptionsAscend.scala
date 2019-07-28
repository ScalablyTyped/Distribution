package typings.reactDashOnsenui

import typings.reactDashOnsenui.reactDashOnsenuiMod.AnimationOptions
import typings.reactDashOnsenui.reactDashOnsenuiStrings.ascend
import typings.reactDashOnsenui.reactDashOnsenuiStrings.default
import typings.reactDashOnsenui.reactDashOnsenuiStrings.fade
import typings.reactDashOnsenui.reactDashOnsenuiStrings.fall
import typings.reactDashOnsenui.reactDashOnsenuiStrings.lift
import typings.reactDashOnsenui.reactDashOnsenuiStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationAnimationOptionsAscend extends js.Object {
  var animation: js.UndefOr[default | ascend | lift | fall | fade | none] = js.undefined
  var animationOptions: js.UndefOr[AnimationOptions] = js.undefined
  var isOpen: Boolean
  var modifier: js.UndefOr[String] = js.undefined
  var onDeviceBackButton: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPostHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPostShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPreHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPreShow: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Anon_AnimationAnimationOptionsAscend {
  @scala.inline
  def apply(
    isOpen: Boolean,
    animation: default | ascend | lift | fall | fade | none = null,
    animationOptions: AnimationOptions = null,
    modifier: String = null,
    onDeviceBackButton: () => Unit = null,
    onPostHide: () => Unit = null,
    onPostShow: () => Unit = null,
    onPreHide: () => Unit = null,
    onPreShow: () => Unit = null
  ): Anon_AnimationAnimationOptionsAscend = {
    val __obj = js.Dynamic.literal(isOpen = isOpen)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (onDeviceBackButton != null) __obj.updateDynamic("onDeviceBackButton")(js.Any.fromFunction0(onDeviceBackButton))
    if (onPostHide != null) __obj.updateDynamic("onPostHide")(js.Any.fromFunction0(onPostHide))
    if (onPostShow != null) __obj.updateDynamic("onPostShow")(js.Any.fromFunction0(onPostShow))
    if (onPreHide != null) __obj.updateDynamic("onPreHide")(js.Any.fromFunction0(onPreHide))
    if (onPreShow != null) __obj.updateDynamic("onPreShow")(js.Any.fromFunction0(onPreShow))
    __obj.asInstanceOf[Anon_AnimationAnimationOptionsAscend]
  }
}

