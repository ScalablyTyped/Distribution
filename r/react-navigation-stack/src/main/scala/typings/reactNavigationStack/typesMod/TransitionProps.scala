package typings.reactNavigationStack.typesMod

import typings.reactNative.mod.Animated.Value
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionProps extends js.Object {
  var index: Double
  var layout: TransitionerLayout
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]
  var position: Value
  var scene: Scene
  var scenes: js.Array[Scene]
}

object TransitionProps {
  @scala.inline
  def apply(
    index: Double,
    layout: TransitionerLayout,
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    position: Value,
    scene: Scene,
    scenes: js.Array[Scene]
  ): TransitionProps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransitionProps]
  }
}

