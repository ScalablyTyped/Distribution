package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardEvent extends js.Object {
  var duration: Double
  var easing: KeyboardEventEasing
  var endCoordinates: ScreenRect
  var isEventFromThisApp: Boolean
  var startCoordinates: ScreenRect
}

object KeyboardEvent {
  @scala.inline
  def apply(
    duration: Double,
    easing: KeyboardEventEasing,
    endCoordinates: ScreenRect,
    isEventFromThisApp: Boolean,
    startCoordinates: ScreenRect
  ): KeyboardEvent = {
    val __obj = js.Dynamic.literal(duration = duration, easing = easing, endCoordinates = endCoordinates, isEventFromThisApp = isEventFromThisApp, startCoordinates = startCoordinates)
  
    __obj.asInstanceOf[KeyboardEvent]
  }
}

