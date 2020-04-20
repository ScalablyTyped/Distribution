package typings.reactNativeNavigation.touchablePreviewMod

import typings.reactNative.mod.NativeTouchEvent
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
    val __obj = js.Dynamic.literal(changedTouches = changedTouches.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], locationX = locationX.asInstanceOf[js.Any], locationY = locationY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeTouchEventWithForce]
  }
}

