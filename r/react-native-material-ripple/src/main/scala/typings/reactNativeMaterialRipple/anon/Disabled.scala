package typings.reactNativeMaterialRipple.anon

import typings.reactNative.mod.Animated.CompositeAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disabled extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onRippleAnimation: js.UndefOr[
    js.Function2[/* animation */ CompositeAnimation, /* callback */ js.Function0[Unit], Unit]
  ] = js.undefined
  var rippleCentered: js.UndefOr[Boolean] = js.undefined
  var rippleColor: js.UndefOr[String] = js.undefined
  var rippleContainerBorderRadius: js.UndefOr[Double] = js.undefined
  var rippleDuration: js.UndefOr[Double] = js.undefined
  var rippleFades: js.UndefOr[Boolean] = js.undefined
  var rippleOpacity: js.UndefOr[Double] = js.undefined
  var rippleSequential: js.UndefOr[Boolean] = js.undefined
  var rippleSize: js.UndefOr[Double] = js.undefined
}

object Disabled {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    onRippleAnimation: (/* animation */ CompositeAnimation, /* callback */ js.Function0[Unit]) => Unit = null,
    rippleCentered: js.UndefOr[Boolean] = js.undefined,
    rippleColor: String = null,
    rippleContainerBorderRadius: js.UndefOr[Double] = js.undefined,
    rippleDuration: js.UndefOr[Double] = js.undefined,
    rippleFades: js.UndefOr[Boolean] = js.undefined,
    rippleOpacity: js.UndefOr[Double] = js.undefined,
    rippleSequential: js.UndefOr[Boolean] = js.undefined,
    rippleSize: js.UndefOr[Double] = js.undefined
  ): Disabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (onRippleAnimation != null) __obj.updateDynamic("onRippleAnimation")(js.Any.fromFunction2(onRippleAnimation))
    if (!js.isUndefined(rippleCentered)) __obj.updateDynamic("rippleCentered")(rippleCentered.get.asInstanceOf[js.Any])
    if (rippleColor != null) __obj.updateDynamic("rippleColor")(rippleColor.asInstanceOf[js.Any])
    if (!js.isUndefined(rippleContainerBorderRadius)) __obj.updateDynamic("rippleContainerBorderRadius")(rippleContainerBorderRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rippleDuration)) __obj.updateDynamic("rippleDuration")(rippleDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rippleFades)) __obj.updateDynamic("rippleFades")(rippleFades.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rippleOpacity)) __obj.updateDynamic("rippleOpacity")(rippleOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rippleSequential)) __obj.updateDynamic("rippleSequential")(rippleSequential.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rippleSize)) __obj.updateDynamic("rippleSize")(rippleSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
}

