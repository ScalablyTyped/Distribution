package typings
package reactDashNativeDashFlipDashCardLib.reactDashNativeDashFlipDashCardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlipCardProps extends js.Object {
  var alignHeight: js.UndefOr[scala.Boolean] = js.undefined
  var alignWidth: js.UndefOr[scala.Boolean] = js.undefined
  var clickable: js.UndefOr[scala.Boolean] = js.undefined
  var flip: js.UndefOr[scala.Boolean] = js.undefined
  var flipHorizontal: js.UndefOr[scala.Boolean] = js.undefined
  var flipVertical: js.UndefOr[scala.Boolean] = js.undefined
  var friction: js.UndefOr[scala.Double] = js.undefined
  var onFlipEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onFlipStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var perspective: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined
}

object FlipCardProps {
  @scala.inline
  def apply(
    alignHeight: js.UndefOr[scala.Boolean] = js.undefined,
    alignWidth: js.UndefOr[scala.Boolean] = js.undefined,
    clickable: js.UndefOr[scala.Boolean] = js.undefined,
    flip: js.UndefOr[scala.Boolean] = js.undefined,
    flipHorizontal: js.UndefOr[scala.Boolean] = js.undefined,
    flipVertical: js.UndefOr[scala.Boolean] = js.undefined,
    friction: scala.Int | scala.Double = null,
    onFlipEnd: () => scala.Unit = null,
    onFlipStart: () => scala.Unit = null,
    perspective: scala.Int | scala.Double = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined
  ): FlipCardProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignHeight)) __obj.updateDynamic("alignHeight")(alignHeight)
    if (!js.isUndefined(alignWidth)) __obj.updateDynamic("alignWidth")(alignWidth)
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip)
    if (!js.isUndefined(flipHorizontal)) __obj.updateDynamic("flipHorizontal")(flipHorizontal)
    if (!js.isUndefined(flipVertical)) __obj.updateDynamic("flipVertical")(flipVertical)
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (onFlipEnd != null) __obj.updateDynamic("onFlipEnd")(js.Any.fromFunction0(onFlipEnd))
    if (onFlipStart != null) __obj.updateDynamic("onFlipStart")(js.Any.fromFunction0(onFlipStart))
    if (perspective != null) __obj.updateDynamic("perspective")(perspective.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver)
    __obj.asInstanceOf[FlipCardProps]
  }
}

