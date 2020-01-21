package typings.reactNativeFlipCard.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlipCardProps extends js.Object {
  var alignHeight: js.UndefOr[Boolean] = js.undefined
  var alignWidth: js.UndefOr[Boolean] = js.undefined
  var clickable: js.UndefOr[Boolean] = js.undefined
  var flip: js.UndefOr[Boolean] = js.undefined
  var flipHorizontal: js.UndefOr[Boolean] = js.undefined
  var flipVertical: js.UndefOr[Boolean] = js.undefined
  var friction: js.UndefOr[Double] = js.undefined
  var onFlipEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFlipStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var perspective: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
}

object FlipCardProps {
  @scala.inline
  def apply(
    alignHeight: js.UndefOr[Boolean] = js.undefined,
    alignWidth: js.UndefOr[Boolean] = js.undefined,
    clickable: js.UndefOr[Boolean] = js.undefined,
    flip: js.UndefOr[Boolean] = js.undefined,
    flipHorizontal: js.UndefOr[Boolean] = js.undefined,
    flipVertical: js.UndefOr[Boolean] = js.undefined,
    friction: Int | Double = null,
    onFlipEnd: () => Unit = null,
    onFlipStart: () => Unit = null,
    perspective: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined
  ): FlipCardProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignHeight)) __obj.updateDynamic("alignHeight")(alignHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(alignWidth)) __obj.updateDynamic("alignWidth")(alignWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (!js.isUndefined(flipHorizontal)) __obj.updateDynamic("flipHorizontal")(flipHorizontal.asInstanceOf[js.Any])
    if (!js.isUndefined(flipVertical)) __obj.updateDynamic("flipVertical")(flipVertical.asInstanceOf[js.Any])
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (onFlipEnd != null) __obj.updateDynamic("onFlipEnd")(js.Any.fromFunction0(onFlipEnd))
    if (onFlipStart != null) __obj.updateDynamic("onFlipStart")(js.Any.fromFunction0(onFlipStart))
    if (perspective != null) __obj.updateDynamic("perspective")(perspective.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlipCardProps]
  }
}

