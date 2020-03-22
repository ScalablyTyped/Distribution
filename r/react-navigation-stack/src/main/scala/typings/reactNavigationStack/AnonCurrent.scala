package typings.reactNavigationStack

import typings.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrent extends js.Object {
  /**
    * Progress value of the current screen.
    */
  var current: AnimatedInterpolation
  /**
    * Progress value for the screen after this one in the stack.
    * This can be `undefined` in case the screen animating is the last one.
    */
  var next: js.UndefOr[AnimatedInterpolation] = js.undefined
  /**
    * Progress value for the screen before this one in the stack.
    * This can be `undefined` in case the screen animating is the first one.
    */
  var previous: js.UndefOr[AnimatedInterpolation] = js.undefined
}

object AnonCurrent {
  @scala.inline
  def apply(
    current: AnimatedInterpolation,
    next: AnimatedInterpolation = null,
    previous: AnimatedInterpolation = null
  ): AnonCurrent = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrent]
  }
}

