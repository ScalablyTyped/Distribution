package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationAnimationOptionsDefault extends js.Object {
  var animation: js.UndefOr[
    reactDashOnsenuiLib.reactDashOnsenuiLibStrings.none | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.default
  ] = js.undefined
  var animationOptions: js.UndefOr[reactDashOnsenuiLib.reactDashOnsenuiMod.AnimationOptions] = js.undefined
  var isCancelable: js.UndefOr[scala.Boolean] = js.undefined
  var isDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  var maskColor: js.UndefOr[java.lang.String] = js.undefined
  var modifier: js.UndefOr[java.lang.String] = js.undefined
  var onCancel: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPostHide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPostShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPreHide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPreShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Anon_AnimationAnimationOptionsDefault {
  @scala.inline
  def apply(
    animation: reactDashOnsenuiLib.reactDashOnsenuiLibStrings.none | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.default = null,
    animationOptions: reactDashOnsenuiLib.reactDashOnsenuiMod.AnimationOptions = null,
    isCancelable: js.UndefOr[scala.Boolean] = js.undefined,
    isDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    maskColor: java.lang.String = null,
    modifier: java.lang.String = null,
    onCancel: js.Function0[scala.Unit] = null,
    onPostHide: js.Function0[scala.Unit] = null,
    onPostShow: js.Function0[scala.Unit] = null,
    onPreHide: js.Function0[scala.Unit] = null,
    onPreShow: js.Function0[scala.Unit] = null
  ): Anon_AnimationAnimationOptionsDefault = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions)
    if (!js.isUndefined(isCancelable)) __obj.updateDynamic("isCancelable")(isCancelable)
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (maskColor != null) __obj.updateDynamic("maskColor")(maskColor)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (onCancel != null) __obj.updateDynamic("onCancel")(onCancel)
    if (onPostHide != null) __obj.updateDynamic("onPostHide")(onPostHide)
    if (onPostShow != null) __obj.updateDynamic("onPostShow")(onPostShow)
    if (onPreHide != null) __obj.updateDynamic("onPreHide")(onPreHide)
    if (onPreShow != null) __obj.updateDynamic("onPreShow")(onPreShow)
    __obj.asInstanceOf[Anon_AnimationAnimationOptionsDefault]
  }
}

