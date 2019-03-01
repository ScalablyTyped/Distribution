package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardEvent extends js.Object {
  var duration: scala.Double
  var easing: KeyboardEventEasing
  var endCoordinates: reactDashNativeLib.ScreenRect
  var isEventFromThisApp: scala.Boolean
  var startCoordinates: reactDashNativeLib.ScreenRect
}

object KeyboardEvent {
  @scala.inline
  def apply(
    duration: scala.Double,
    easing: KeyboardEventEasing,
    endCoordinates: reactDashNativeLib.ScreenRect,
    isEventFromThisApp: scala.Boolean,
    startCoordinates: reactDashNativeLib.ScreenRect
  ): KeyboardEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("easing")(easing)
    __obj.updateDynamic("endCoordinates")(endCoordinates)
    __obj.updateDynamic("isEventFromThisApp")(isEventFromThisApp)
    __obj.updateDynamic("startCoordinates")(startCoordinates)
    __obj.asInstanceOf[KeyboardEvent]
  }
}

