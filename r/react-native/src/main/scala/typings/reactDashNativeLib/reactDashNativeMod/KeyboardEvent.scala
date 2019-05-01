package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardEvent extends js.Object {
  var duration: scala.Double
  var easing: KeyboardEventEasing
  var endCoordinates: ScreenRect
  var isEventFromThisApp: scala.Boolean
  var startCoordinates: ScreenRect
}

object KeyboardEvent {
  @scala.inline
  def apply(
    duration: scala.Double,
    easing: KeyboardEventEasing,
    endCoordinates: ScreenRect,
    isEventFromThisApp: scala.Boolean,
    startCoordinates: ScreenRect
  ): KeyboardEvent = {
    val __obj = js.Dynamic.literal(duration = duration, easing = easing, endCoordinates = endCoordinates, isEventFromThisApp = isEventFromThisApp, startCoordinates = startCoordinates)
  
    __obj.asInstanceOf[KeyboardEvent]
  }
}

