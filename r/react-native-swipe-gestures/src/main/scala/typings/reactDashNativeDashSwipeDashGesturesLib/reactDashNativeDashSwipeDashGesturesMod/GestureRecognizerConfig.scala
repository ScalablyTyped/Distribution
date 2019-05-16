package typings
package reactDashNativeDashSwipeDashGesturesLib.reactDashNativeDashSwipeDashGesturesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureRecognizerConfig extends js.Object {
  var directionalOffsetThreshold: js.UndefOr[scala.Double] = js.undefined
  var gestureIsClickThreshold: js.UndefOr[scala.Double] = js.undefined
  var velocityThreshold: js.UndefOr[scala.Double] = js.undefined
}

object GestureRecognizerConfig {
  @scala.inline
  def apply(
    directionalOffsetThreshold: scala.Int | scala.Double = null,
    gestureIsClickThreshold: scala.Int | scala.Double = null,
    velocityThreshold: scala.Int | scala.Double = null
  ): GestureRecognizerConfig = {
    val __obj = js.Dynamic.literal()
    if (directionalOffsetThreshold != null) __obj.updateDynamic("directionalOffsetThreshold")(directionalOffsetThreshold.asInstanceOf[js.Any])
    if (gestureIsClickThreshold != null) __obj.updateDynamic("gestureIsClickThreshold")(gestureIsClickThreshold.asInstanceOf[js.Any])
    if (velocityThreshold != null) __obj.updateDynamic("velocityThreshold")(velocityThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureRecognizerConfig]
  }
}

