package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionerState extends js.Object {
  var layout: NavigationLayout
  var position: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value
  var progress: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value
  var scenes: js.Array[NavigationScene]
}

object TransitionerState {
  @scala.inline
  def apply(
    layout: NavigationLayout,
    position: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value,
    progress: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value,
    scenes: js.Array[NavigationScene]
  ): TransitionerState = {
    val __obj = js.Dynamic.literal(layout = layout, position = position, progress = progress, scenes = scenes)
  
    __obj.asInstanceOf[TransitionerState]
  }
}

