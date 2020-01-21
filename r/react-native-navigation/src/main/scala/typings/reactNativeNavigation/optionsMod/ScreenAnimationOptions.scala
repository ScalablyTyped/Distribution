package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenAnimationOptions extends js.Object {
  /**
    * Animate the element over opacity
    */
  var alpha: js.UndefOr[OptionsAnimationPropertyConfig] = js.undefined
  /**
    * Enable or disable the animation
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Animate the element over rotation
    */
  var rotation: js.UndefOr[OptionsAnimationPropertyConfig] = js.undefined
  /**
    * Animate the element over rotationX
    */
  var rotationX: js.UndefOr[OptionsAnimationPropertyConfig] = js.undefined
  /**
    * Animate the element over rotationY
    */
  var rotationY: js.UndefOr[OptionsAnimationPropertyConfig] = js.undefined
  /**
    * Animate the element over scaleX
    */
  var scaleX: js.UndefOr[OptionsAnimationPropertyConfig] = js.undefined
  /**
    * Animate the element over scaleY
    */
  var scaleY: js.UndefOr[OptionsAnimationPropertyConfig] = js.undefined
  /**
    * Wait for the root view to render before start animation
    */
  var waitForRender: js.UndefOr[Boolean] = js.undefined
  /**
    * Animate the element over translateX
    */
  var x: js.UndefOr[OptionsAnimationPropertyConfig] = js.undefined
  /**
    * Animate the element over translateY
    */
  var y: js.UndefOr[OptionsAnimationPropertyConfig] = js.undefined
}

object ScreenAnimationOptions {
  @scala.inline
  def apply(
    alpha: OptionsAnimationPropertyConfig = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    rotation: OptionsAnimationPropertyConfig = null,
    rotationX: OptionsAnimationPropertyConfig = null,
    rotationY: OptionsAnimationPropertyConfig = null,
    scaleX: OptionsAnimationPropertyConfig = null,
    scaleY: OptionsAnimationPropertyConfig = null,
    waitForRender: js.UndefOr[Boolean] = js.undefined,
    x: OptionsAnimationPropertyConfig = null,
    y: OptionsAnimationPropertyConfig = null
  ): ScreenAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (rotationX != null) __obj.updateDynamic("rotationX")(rotationX.asInstanceOf[js.Any])
    if (rotationY != null) __obj.updateDynamic("rotationY")(rotationY.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForRender)) __obj.updateDynamic("waitForRender")(waitForRender.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenAnimationOptions]
  }
}

