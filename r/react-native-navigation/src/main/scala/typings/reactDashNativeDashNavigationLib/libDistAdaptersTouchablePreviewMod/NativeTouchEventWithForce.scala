package typings
package reactDashNativeDashNavigationLib.libDistAdaptersTouchablePreviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeTouchEventWithForce
  extends reactDashNativeLib.reactDashNativeMod.NativeTouchEvent {
  var force: scala.Double
}

object NativeTouchEventWithForce {
  @scala.inline
  def apply(
    changedTouches: js.Array[reactDashNativeLib.reactDashNativeMod.NativeTouchEvent],
    force: scala.Double,
    identifier: java.lang.String,
    locationX: scala.Double,
    locationY: scala.Double,
    pageX: scala.Double,
    pageY: scala.Double,
    target: java.lang.String,
    timestamp: scala.Double,
    touches: js.Array[reactDashNativeLib.reactDashNativeMod.NativeTouchEvent]
  ): NativeTouchEventWithForce = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches, force = force, identifier = identifier, locationX = locationX, locationY = locationY, pageX = pageX, pageY = pageY, target = target, timestamp = timestamp, touches = touches)
  
    __obj.asInstanceOf[NativeTouchEventWithForce]
  }
}

