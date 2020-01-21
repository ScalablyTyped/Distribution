package typings.reactNavigationStack.typesMod

import typings.reactNative.mod.Animated.AnimatedInterpolation
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneInterpolatorProps extends js.Object {
  var cardOverlayEnabled: js.UndefOr[Boolean] = js.undefined
  var layout: TransitionerLayout
  var mode: js.UndefOr[HeaderMode] = js.undefined
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]
  var position: AnimatedInterpolation
  var scene: Scene
  var scenes: js.Array[Scene]
  var shadowEnabled: js.UndefOr[Boolean] = js.undefined
}

object SceneInterpolatorProps {
  @scala.inline
  def apply(
    layout: TransitionerLayout,
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    position: AnimatedInterpolation,
    scene: Scene,
    scenes: js.Array[Scene],
    cardOverlayEnabled: js.UndefOr[Boolean] = js.undefined,
    mode: HeaderMode = null,
    shadowEnabled: js.UndefOr[Boolean] = js.undefined
  ): SceneInterpolatorProps = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any])
    if (!js.isUndefined(cardOverlayEnabled)) __obj.updateDynamic("cardOverlayEnabled")(cardOverlayEnabled.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowEnabled)) __obj.updateDynamic("shadowEnabled")(shadowEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneInterpolatorProps]
  }
}

