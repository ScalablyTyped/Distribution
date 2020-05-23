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
    friction: js.UndefOr[Double] = js.undefined,
    onFlipEnd: () => Unit = null,
    onFlipStart: () => Unit = null,
    perspective: js.UndefOr[Double] = js.undefined,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined
  ): FlipCardProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignHeight)) __obj.updateDynamic("alignHeight")(alignHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(alignWidth)) __obj.updateDynamic("alignWidth")(alignWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flipHorizontal)) __obj.updateDynamic("flipHorizontal")(flipHorizontal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flipVertical)) __obj.updateDynamic("flipVertical")(flipVertical.get.asInstanceOf[js.Any])
    if (!js.isUndefined(friction)) __obj.updateDynamic("friction")(friction.get.asInstanceOf[js.Any])
    if (onFlipEnd != null) __obj.updateDynamic("onFlipEnd")(js.Any.fromFunction0(onFlipEnd))
    if (onFlipStart != null) __obj.updateDynamic("onFlipStart")(js.Any.fromFunction0(onFlipStart))
    if (!js.isUndefined(perspective)) __obj.updateDynamic("perspective")(perspective.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlipCardProps]
  }
}

