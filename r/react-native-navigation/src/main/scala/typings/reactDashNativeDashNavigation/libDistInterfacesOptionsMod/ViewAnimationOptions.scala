package typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewAnimationOptions extends ScreenAnimationOptions {
  /**
    * ID of the Top Bar we want to animate
    */
  var id: js.UndefOr[String] = js.undefined
}

object ViewAnimationOptions {
  @scala.inline
  def apply(
    alpha: OptionsAnimationPropertyConfig = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    rotation: OptionsAnimationPropertyConfig = null,
    rotationX: OptionsAnimationPropertyConfig = null,
    rotationY: OptionsAnimationPropertyConfig = null,
    scaleX: OptionsAnimationPropertyConfig = null,
    scaleY: OptionsAnimationPropertyConfig = null,
    waitForRender: js.UndefOr[Boolean] = js.undefined,
    x: OptionsAnimationPropertyConfig = null,
    y: OptionsAnimationPropertyConfig = null
  ): ViewAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation)
    if (rotationX != null) __obj.updateDynamic("rotationX")(rotationX)
    if (rotationY != null) __obj.updateDynamic("rotationY")(rotationY)
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX)
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY)
    if (!js.isUndefined(waitForRender)) __obj.updateDynamic("waitForRender")(waitForRender)
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[ViewAnimationOptions]
  }
}

