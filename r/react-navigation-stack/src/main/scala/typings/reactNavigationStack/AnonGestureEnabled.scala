package typings.reactNavigationStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGestureEnabled extends js.Object {
  var gestureEnabled: Boolean
  var gestureVelocityImpact: Double
  var overlayEnabled: Boolean
  var shadowEnabled: Boolean
}

object AnonGestureEnabled {
  @scala.inline
  def apply(
    gestureEnabled: Boolean,
    gestureVelocityImpact: Double,
    overlayEnabled: Boolean,
    shadowEnabled: Boolean
  ): AnonGestureEnabled = {
    val __obj = js.Dynamic.literal(gestureEnabled = gestureEnabled.asInstanceOf[js.Any], gestureVelocityImpact = gestureVelocityImpact.asInstanceOf[js.Any], overlayEnabled = overlayEnabled.asInstanceOf[js.Any], shadowEnabled = shadowEnabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGestureEnabled]
  }
}

