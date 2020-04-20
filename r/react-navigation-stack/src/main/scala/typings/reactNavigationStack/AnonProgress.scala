package typings.reactNavigationStack

import typings.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProgress extends js.Object {
  /**
    * Animated node representing the progress value of the next screen.
    */
  var progress: AnimatedInterpolation
}

object AnonProgress {
  @scala.inline
  def apply(progress: AnimatedInterpolation): AnonProgress = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProgress]
  }
}

