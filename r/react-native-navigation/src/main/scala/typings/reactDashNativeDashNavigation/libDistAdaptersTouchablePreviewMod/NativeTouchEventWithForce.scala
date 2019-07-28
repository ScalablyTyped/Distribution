package typings.reactDashNativeDashNavigation.libDistAdaptersTouchablePreviewMod

import typings.reactDashNative.reactDashNativeMod.NativeTouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeTouchEventWithForce extends NativeTouchEvent {
  var force: Double
}

object NativeTouchEventWithForce {
  @scala.inline
  def apply(
    changedTouches: js.Array[NativeTouchEvent],
    force: Double,
    identifier: String,
    locationX: Double,
    locationY: Double,
    pageX: Double,
    pageY: Double,
    target: String,
    timestamp: Double,
    touches: js.Array[NativeTouchEvent]
  ): NativeTouchEventWithForce = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches, force = force, identifier = identifier, locationX = locationX, locationY = locationY, pageX = pageX, pageY = pageY, target = target, timestamp = timestamp, touches = touches)
  
    __obj.asInstanceOf[NativeTouchEventWithForce]
  }
}

