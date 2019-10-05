package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNative.reactDashNativeMod.Animated.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionerState extends js.Object {
  var layout: NavigationLayout
  var position: Value
  var progress: Value
  var scenes: js.Array[NavigationScene]
}

object TransitionerState {
  @scala.inline
  def apply(layout: NavigationLayout, position: Value, progress: Value, scenes: js.Array[NavigationScene]): TransitionerState = {
    val __obj = js.Dynamic.literal(layout = layout, position = position, progress = progress, scenes = scenes)
  
    __obj.asInstanceOf[TransitionerState]
  }
}

