package typings.reactNativeNavigation.optionsMod

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
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (rotationX != null) __obj.updateDynamic("rotationX")(rotationX.asInstanceOf[js.Any])
    if (rotationY != null) __obj.updateDynamic("rotationY")(rotationY.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForRender)) __obj.updateDynamic("waitForRender")(waitForRender.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewAnimationOptions]
  }
}

