package typings.reactDashNavigationDashStack.libTypescriptViewsTransitionerMod

import typings.reactDashNative.reactDashNativeMod.Animated.Value
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.Scene
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionerLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var layout: TransitionerLayout
  var nextScenes: js.UndefOr[js.Array[Scene]] = js.undefined
  var position: Value
  var scenes: js.Array[Scene]
}

object State {
  @scala.inline
  def apply(
    layout: TransitionerLayout,
    position: Value,
    scenes: js.Array[Scene],
    nextScenes: js.Array[Scene] = null
  ): State = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any])
    if (nextScenes != null) __obj.updateDynamic("nextScenes")(nextScenes.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

