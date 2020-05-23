package typings.reactNativeIndicators.mod

import typings.reactNative.mod.EasingFunction
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseIndicatorProps extends js.Object {
  /**
    * Animation toggle
    * @default true
    */
  var animating: js.UndefOr[Boolean] = js.undefined
  /**
    * Animation duration in ms
    * @default 1200
    */
  var animationDuration: js.UndefOr[Double] = js.undefined
  /**
    * Animation easing function
    * @default Easing.linear
    */
  var animationEasing: js.UndefOr[EasingFunction] = js.undefined
  /**
    * Hide when not animating
    * @default true
    */
  var hidesWhenStopped: js.UndefOr[Boolean] = js.undefined
  /**
    * Animation is interaction
    * @default true
    */
  var interaction: js.UndefOr[Boolean] = js.undefined
  /**
    * Style is proxied to the underlying View
    * @default undefined
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object BaseIndicatorProps {
  @scala.inline
  def apply(
    animating: js.UndefOr[Boolean] = js.undefined,
    animationDuration: js.UndefOr[Double] = js.undefined,
    animationEasing: /* value */ Double => Double = null,
    hidesWhenStopped: js.UndefOr[Boolean] = js.undefined,
    interaction: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined
  ): BaseIndicatorProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(js.Any.fromFunction1(animationEasing))
    if (!js.isUndefined(hidesWhenStopped)) __obj.updateDynamic("hidesWhenStopped")(hidesWhenStopped.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interaction)) __obj.updateDynamic("interaction")(interaction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseIndicatorProps]
  }
}

