package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationAnimationOptionsAscend extends js.Object {
  var animation: js.UndefOr[
    reactDashOnsenuiLib.reactDashOnsenuiLibStrings.default | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.ascend | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.lift | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.fall | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.fade | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.none
  ] = js.undefined
  var animationOptions: js.UndefOr[reactDashOnsenuiLib.reactDashOnsenuiMod.AnimationOptions] = js.undefined
  var isOpen: scala.Boolean
  var modifier: js.UndefOr[java.lang.String] = js.undefined
  var onDeviceBackButton: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPostHide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPostShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPreHide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPreShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Anon_AnimationAnimationOptionsAscend {
  @scala.inline
  def apply(
    isOpen: scala.Boolean,
    animation: reactDashOnsenuiLib.reactDashOnsenuiLibStrings.default | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.ascend | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.lift | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.fall | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.fade | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.none = null,
    animationOptions: reactDashOnsenuiLib.reactDashOnsenuiMod.AnimationOptions = null,
    modifier: java.lang.String = null,
    onDeviceBackButton: () => scala.Unit = null,
    onPostHide: () => scala.Unit = null,
    onPostShow: () => scala.Unit = null,
    onPreHide: () => scala.Unit = null,
    onPreShow: () => scala.Unit = null
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

