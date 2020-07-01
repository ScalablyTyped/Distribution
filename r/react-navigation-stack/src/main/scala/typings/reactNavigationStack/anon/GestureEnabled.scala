package typings.reactNavigationStack.anon

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureEnabled extends js.Object {
  var gestureEnabled: Boolean
  var gestureVelocityImpact: Double
  var overlayEnabled: Boolean
  var shadowEnabled: Boolean
  def overlay(hasStyle: StyleWithAnimatedValue): Element | Null
}

object GestureEnabled {
  @scala.inline
  def apply(
    gestureEnabled: Boolean,
    gestureVelocityImpact: Double,
    overlay: StyleWithAnimatedValue => Element | Null,
    overlayEnabled: Boolean,
    shadowEnabled: Boolean
  ): GestureEnabled = {
    val __obj = js.Dynamic.literal(gestureEnabled = gestureEnabled.asInstanceOf[js.Any], gestureVelocityImpact = gestureVelocityImpact.asInstanceOf[js.Any], overlay = js.Any.fromFunction1(overlay), overlayEnabled = overlayEnabled.asInstanceOf[js.Any], shadowEnabled = shadowEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureEnabled]
  }
}

