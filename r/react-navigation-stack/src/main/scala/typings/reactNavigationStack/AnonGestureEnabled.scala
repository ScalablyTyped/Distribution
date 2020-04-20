package typings.reactNavigationStack

import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGestureEnabled extends js.Object {
  var gestureEnabled: Boolean
  var gestureVelocityImpact: Double
  var overlayEnabled: Boolean
  var shadowEnabled: Boolean
  def overlay(hasStyle: AnonStyle): Element | Null
}

object AnonGestureEnabled {
  @scala.inline
  def apply(
    gestureEnabled: Boolean,
    gestureVelocityImpact: Double,
    overlay: AnonStyle => Element | Null,
    overlayEnabled: Boolean,
    shadowEnabled: Boolean
  ): AnonGestureEnabled = {
    val __obj = js.Dynamic.literal(gestureEnabled = gestureEnabled.asInstanceOf[js.Any], gestureVelocityImpact = gestureVelocityImpact.asInstanceOf[js.Any], overlay = js.Any.fromFunction1(overlay), overlayEnabled = overlayEnabled.asInstanceOf[js.Any], shadowEnabled = shadowEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGestureEnabled]
  }
}

