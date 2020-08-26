package typings.reactNativeNavigation.touchablePreviewMod

import typings.reactNative.mod.NativeTouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeTouchEventWithForce extends NativeTouchEvent {
  var force: Double = js.native
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
  @scala.inline
  implicit class NativeTouchEventWithForceOps[Self <: NativeTouchEventWithForce] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setForce(value: Double): Self = this.set("force", value.asInstanceOf[js.Any])
  }
  
}

