package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

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
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
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
  var waitForRender: js.UndefOr[scala.Boolean] = js.undefined
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
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    rotation: OptionsAnimationPropertyConfig = null,
    rotationX: OptionsAnimationPropertyConfig = null,
    rotationY: OptionsAnimationPropertyConfig = null,
    scaleX: OptionsAnimationPropertyConfig = null,
    scaleY: OptionsAnimationPropertyConfig = null,
    waitForRender: js.UndefOr[scala.Boolean] = js.undefined,
    x: OptionsAnimationPropertyConfig = null,
    y: OptionsAnimationPropertyConfig = null
  ): ScreenAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation)
    if (rotationX != null) __obj.updateDynamic("rotationX")(rotationX)
    if (rotationY != null) __obj.updateDynamic("rotationY")(rotationY)
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX)
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY)
    if (!js.isUndefined(waitForRender)) __obj.updateDynamic("waitForRender")(waitForRender)
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[ScreenAnimationOptions]
  }
}

