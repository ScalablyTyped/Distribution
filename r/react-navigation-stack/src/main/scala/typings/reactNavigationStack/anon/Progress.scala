package typings.reactNavigationStack.anon

import typings.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress extends js.Object {
  /**
    * Animated node representing the progress value of the next screen.
    */
  var progress: AnimatedInterpolation
}

object Progress {
  @scala.inline
  def apply(progress: AnimatedInterpolation): Progress = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
}

