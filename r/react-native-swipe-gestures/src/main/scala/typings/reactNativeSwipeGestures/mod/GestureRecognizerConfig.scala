package typings.reactNativeSwipeGestures.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureRecognizerConfig extends js.Object {
  /**
    * Absolute offset that shouldn't be breached for swipe to be triggered (dy for horizontal swipe, dx for vertical swipe)
    * @default 80
    */
  var directionalOffsetThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Absolute distance that should be breached for the gesture to not be considered a click (dx or dy properties of gestureState)
    * @default 5
    */
  var gestureIsClickThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Velocity that has to be breached in order for swipe to be triggered (vx and vy properties of gestureState)
    * @default 0.3
    */
  var velocityThreshold: js.UndefOr[Double] = js.undefined
}

object GestureRecognizerConfig {
  @scala.inline
  def apply(
    directionalOffsetThreshold: Int | Double = null,
    gestureIsClickThreshold: Int | Double = null,
    velocityThreshold: Int | Double = null
  ): GestureRecognizerConfig = {
    val __obj = js.Dynamic.literal()
    if (directionalOffsetThreshold != null) __obj.updateDynamic("directionalOffsetThreshold")(directionalOffsetThreshold.asInstanceOf[js.Any])
    if (gestureIsClickThreshold != null) __obj.updateDynamic("gestureIsClickThreshold")(gestureIsClickThreshold.asInstanceOf[js.Any])
    if (velocityThreshold != null) __obj.updateDynamic("velocityThreshold")(velocityThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureRecognizerConfig]
  }
}

